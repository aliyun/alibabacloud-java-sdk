// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-20T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;extend\&quot;:{\&quot;workers\&quot;:\&quot;avg_dispatchers\&quot;}}</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tc-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-05T08:49:27Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest self = new DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
