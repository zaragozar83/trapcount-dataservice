package com.coffee.trapcount.dataservice.controller;

import com.coffee.trapcount.dataservice.domain.repository.model.RanchEntity;
import com.coffee.trapcount.dataservice.service.RanchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/ranches-data")
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class RanchDataController {

    private final RanchService ranchService;

    @GetMapping("/{name}")
    public RanchEntity getRanchByName(@PathVariable String name) {

        return ranchService.getRanchByName(name);
    }

    @GetMapping("/{description}/description")
    public List<RanchEntity> findRanchesByDescriotion(@PathVariable String description) {

        return ranchService.findRanchesLikeDescription(description);
    }


}
