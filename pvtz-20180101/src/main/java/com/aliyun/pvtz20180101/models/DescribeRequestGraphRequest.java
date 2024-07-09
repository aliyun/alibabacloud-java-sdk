// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeRequestGraphRequest extends TeaModel {
    /**
     * <p>The business ID. BizId is specified together with BizType.</p>
     * <ul>
     * <li>If you set BizType to AUTH_ZONE, set BizId to a zone ID.</li>
     * <li>If you set BizType to RESOLVER_RULE, set BizId to the ID of a forwarding rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>b9c93a8954c4098731e863c04302f45a</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The business type. Valid values:</p>
     * <ul>
     * <li>AUTH_ZONE: authoritative zone</li>
     * <li>RESOLVER_RULE: forwarding rule</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTH_ZONE</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The end of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1571673600000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The beginning of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1571587200000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-1111</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The global ID of the zone. To query the number of DNS requests for a zone, you can specify ZoneId or BizType and BizId.</p>
     * 
     * <strong>example:</strong>
     * <p>29c752a01cd281a20ddcfaecef</p>
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
