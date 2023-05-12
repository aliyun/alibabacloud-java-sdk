// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeRequestGraphRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>VPC ID</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>zone ID</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeRequestGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestGraphRequest self = new DescribeRequestGraphRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRequestGraphRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeRequestGraphRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeRequestGraphRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeRequestGraphRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRequestGraphRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeRequestGraphRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeRequestGraphRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeRequestGraphRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
