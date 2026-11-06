// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKVCacheInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The endpoint of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>172.168.0.1</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The time when the instance was created, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The time when the instance expires, in ISO 8601 format. An empty character string is returned for pay-as-you-go instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-12-31T00:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether the instance has expired.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The KVCache instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pkv-123456</p>
     */
    @NameInMap("KVCacheInstanceId")
    public String KVCacheInstanceId;

    /**
     * <p>The KVCache instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("KVCacheInstanceStatus")
    public String KVCacheInstanceStatus;

    /**
     * <p>The storage capacity of the KVCache instance.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("KVCacheSpace")
    public String KVCacheSpace;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAID</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The port.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-123</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-123</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeKVCacheInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKVCacheInstanceAttributeResponseBody self = new DescribeKVCacheInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKVCacheInstanceAttributeResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setKVCacheInstanceId(String KVCacheInstanceId) {
        this.KVCacheInstanceId = KVCacheInstanceId;
        return this;
    }
    public String getKVCacheInstanceId() {
        return this.KVCacheInstanceId;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setKVCacheInstanceStatus(String KVCacheInstanceStatus) {
        this.KVCacheInstanceStatus = KVCacheInstanceStatus;
        return this;
    }
    public String getKVCacheInstanceStatus() {
        return this.KVCacheInstanceStatus;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setKVCacheSpace(String KVCacheSpace) {
        this.KVCacheSpace = KVCacheSpace;
        return this;
    }
    public String getKVCacheSpace() {
        return this.KVCacheSpace;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeKVCacheInstanceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
