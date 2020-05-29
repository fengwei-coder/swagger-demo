package com.example.demo.controller;

import com.example.demo.kv.Ukv;
import com.example.demo.service.DemoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @DateTime: 2020/5/27 - 16:45
 * @Description:
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    /*根据示例ID生成密钥对*/
    @ApiOperation("根据示例ID生成密钥对")
    @PostMapping("/secreKey/{instanceId}")
    public Ukv instanceId(@PathVariable String instanceId){
        return demoService.instanceId(instanceId);
    }

    /*根据实例ID查询密钥对*/
    @ApiOperation("")
    @GetMapping("/secreKey/{instanceId}")
    public Ukv findById(@PathVariable String instanceId){
        return demoService.findById(instanceId);
    }

    /*订购API（添加次数）*/
    @ApiOperation("订购API（添加次数）")
    @PostMapping("/apiService/{instanceId}/{addCount}")
    public Ukv updataById(@PathVariable String instanceId,@PathVariable String addCount){
        Ukv ukv = demoService.updateById(instanceId,addCount);
        return ukv;
    }

    /*消费API（扣减次数）*/
    @ApiOperation("消费API（扣减次数）")
    @PutMapping("/apiService/{instanceId}")
    public Ukv updataById(@PathVariable String instanceId){
        Ukv ukv = demoService.updateById(instanceId);
        return ukv;
    }

}
