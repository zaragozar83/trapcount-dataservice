package com.coffee.trapcount.dataservice.service;

import com.coffee.trapcount.dataservice.domain.repository.model.RanchEntity;

import java.util.List;

public interface RanchService {

    RanchEntity getRanchByName(String ranchName);
    List<RanchEntity> findRanchesLikeDescription(String description);
    List<RanchEntity> findRanchesLikeName(String name);
}
