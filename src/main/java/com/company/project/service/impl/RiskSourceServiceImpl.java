package com.company.project.service.impl;

import com.company.project.dao.RiskSourceMapper;
import com.company.project.model.RiskSource;
import com.company.project.service.RiskSourceService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/07/19.
 */
@Service
@Transactional
public class RiskSourceServiceImpl extends AbstractService<RiskSource> implements RiskSourceService {
    @Resource
    private RiskSourceMapper riskSourceMapper;

}
