package com.example.demo.mapper;

import com.example.demo.kv.Ukv;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @DateTime: 2020/5/28 - 15:33
 * @Description:
 */
@Component
public interface SecrekvMapper {
    void insert(@Param("id") String id, @Param("secretKey") String secretKey,
                @Param("secretValue") String secretValue, @Param("expires") String expires, @Param("useAgeCount") String useAgeCount);

    Ukv select(String id);

    Ukv findById(String id);

    void updateById(@Param("instanceId") String instanceId, @Param("addCount") String addCount );

    void updateById1(@Param("instanceId") String instanceId);

}
