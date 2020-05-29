package com.example.demo.kv;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @DateTime: 2020/5/28 - 9:55
 * @Description:
 */
//@Document("secrekv")
@ApiModel("实体类")
@Component
public class Ukv {

    @ApiModelProperty("要加密的id")
    @Getter
    private String id;
    @ApiModelProperty("为id生成的key")
    @Getter
    private String secretKey;
    @ApiModelProperty("key对应的value")
    @Getter
    private String secretValue;
    //@Value("2020-06-01T00:00:00.268Z")
    @ApiModelProperty("期限")
    @Setter
    @Getter
    private String expires;
    //@Value("10")
    @ApiModelProperty("可使用的次数")
    @Setter
    @Getter
    private String useAgeCount;


    public Ukv setUkvId(String id){
        this.id = id;
        setSecretKey(id);
        setSecretValue(id);
        return this;
    }

    public void setSecretKey(String id){
        this.secretKey = id+"key";
        this.secretKey = UUID.nameUUIDFromBytes((this.secretKey).getBytes()).toString();
    }
    public void setSecretValue(String id) {
        this.secretValue = id+"value";
        this.secretValue = UUID.nameUUIDFromBytes((this.secretValue).getBytes()).toString();
    }



}