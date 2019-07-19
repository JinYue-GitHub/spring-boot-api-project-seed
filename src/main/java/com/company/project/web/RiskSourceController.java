package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RiskSource;
import com.company.project.service.RiskSourceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/07/19.
*/
@RestController
@RequestMapping("/risk/source")
public class RiskSourceController {
    @Resource
    private RiskSourceService riskSourceService;

    @PostMapping("/add")
    public Result add(RiskSource riskSource) {
        riskSourceService.save(riskSource);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(Integer id) {
        riskSourceService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RiskSource riskSource) {
        riskSourceService.update(riskSource);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(Integer id) {
        RiskSource riskSource = riskSourceService.findById(id);
        return ResultGenerator.genSuccessResult(riskSource);
    }

    @PostMapping("/list")
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<RiskSource> list = riskSourceService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
