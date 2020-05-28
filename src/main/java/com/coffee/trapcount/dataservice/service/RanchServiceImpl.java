package com.coffee.trapcount.dataservice.service;

import com.coffee.trapcount.dataservice.domain.repository.RanchRepository;
import com.coffee.trapcount.dataservice.domain.repository.model.RanchEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class RanchServiceImpl implements RanchService{


    private final RanchRepository ranchRepository;

    @Override
    public RanchEntity getRanchByName(String ranchName) {

        List<RanchEntity> resultRanchEntities = ranchRepository.findByName(ranchName);

        return resultRanchEntities.stream()
                .findFirst().orElseThrow(() -> new RuntimeException("Not Found the ranch for: " + ranchName));
    }

    @Override
    public List<RanchEntity> findRanchesLikeDescription(String description) {
        return ranchRepository.findByDescriptionLikeIgnoreCase(formatValue(description));
    }

    @Override
    public List<RanchEntity> findRanchesLikeName(String name) {
        return ranchRepository.findByNameLikeIgnoreCase(formatValue(name));
    }

    private String formatValue(String value) {
        return "%" + value + "%";
    }
}
