// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeRequestGraphRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    public static DescribeRequestGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestGraphRequest self = new DescribeRequestGraphRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRequestGraphRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRequestGraphRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeRequestGraphRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeRequestGraphRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeRequestGraphRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeRequestGraphRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeRequestGraphRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeRequestGraphRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
