// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class Policy extends TeaModel {
    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("outerBizNo")
    public String outerBizNo;

    @NameInMap("speed")
    public Integer speed;

    @NameInMap("startTime")
    public String startTime;

    public static Policy build(java.util.Map<String, ?> map) throws Exception {
        Policy self = new Policy();
        return TeaModel.build(map, self);
    }

    public Policy setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public Policy setOuterBizNo(String outerBizNo) {
        this.outerBizNo = outerBizNo;
        return this;
    }
    public String getOuterBizNo() {
        return this.outerBizNo;
    }

    public Policy setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public Policy setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
