package com.example.demo.service;

import com.example.demo.kv.Ukv;

import java.util.List;
import java.util.Optional;

/**
 * @DateTime: 2020/5/27 - 16:47
 * @Description:
 */

public interface DemoService {
    Ukv instanceId(String instanceId);
    /*根据实例ID查询密钥对*/
    Ukv findById(String id);
    /*添加次数*/
    Ukv updateById(String instanceId, String addCount);
    /*消费API（扣减次数）*/
    Ukv updateById(String instanceId);
}
