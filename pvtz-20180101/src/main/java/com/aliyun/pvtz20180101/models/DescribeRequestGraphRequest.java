// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeRequestGraphRequest extends TeaModel {
    /**
     * <p>The data ID. This parameter is used with BizType.</p>
     * <ul>
     * <li><p>If BizType is set to AUTH_ZONE, set this parameter to the zone ID.</p>
     * </li>
     * <li><p>If BizType is set to RESOLVER_RULE, set this parameter to the forwarding rule ID.</p>
     * </li>
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
     * <li><p>AUTH_ZONE: An authoritative zone.</p>
     * </li>
     * <li><p>RESOLVER_RULE: A forwarding rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTH_ZONE</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The end of the time range to query. This is a UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1721723624000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The start of the time range to query. This is a UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1721036404000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The user\&quot;s IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The ID of the Virtual Private Cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-f8zvrvr1payllgz38****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p>To query the number of requests for a zone, specify either ZoneId or both BizType and BizId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>29c752a01cd281a20ddcfa****</p>
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
