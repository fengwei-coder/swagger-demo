package com.example.demo.service;

import com.example.demo.kv.Ukv;
import com.example.demo.mapper.SecrekvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @DateTime: 2020/5/27 - 16:47
 * @Description:
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private Ukv ukv;

    @Autowired
    SecrekvMapper secrekvMapper;

    @Override
    public Ukv instanceId(String id) {
        if(secrekvMapper.select(id) == null){
            ukv.setUkvId(id);
            String secretKey = ukv.getSecretKey();
            String secretValue = ukv.getSecretValue();
            String expires = "2020-06-01 09:57:34";
            String useAgeCount = "10";
            secrekvMapper.insert(id, secretKey, secretValue, expires, useAgeCount);
        }
        return secrekvMapper.select(id);
    }

    /*根据实例ID查询密钥对*/
    @Override
    public Ukv findById(String id) {
        return secrekvMapper.findById(id);
    }

    /*添加次数*/
    @Override
    public Ukv updateById(String instanceId, String addCount) {
        secrekvMapper.updateById(instanceId, addCount);
        return secrekvMapper.findById(instanceId);
    }
    /*消费API（扣减次数）*/
    @Override
    public Ukv updateById(String instanceId) {
        secrekvMapper.updateById1(instanceId);
        return secrekvMapper.findById(instanceId);
    }
//    @Autowired
//    private IUkv iUkv;

//    /*增*/
//    @Override
//    public Ukv instanceId(String instanceId) {
//        Ukv u = ukv.setUkvId(instanceId);
//        iUkv.save(ukv);
//        return u;
//    }
//
//    /*删*/
//
//    /*根据实例ID查询密钥对*/
//    public Optional<Ukv> findById(String id) {
//        return iUkv.findById(id);
//    }
//
//    @Override
//    public Ukv updataById(String instanceId) {
//        return null;
//    }
//
//    /*查所有*/
//    public List<Ukv> find() {
//        return iUkv.findAll();
//    }
}
