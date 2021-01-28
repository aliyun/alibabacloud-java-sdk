// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryMonitorValuesRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IntervalForHistory")
    public String intervalForHistory;

    @NameInMap("MonitorKeys")
    public String monitorKeys;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("AccessType")
    public String accessType;

    @NameInMap("Product")
    public String product;

    @NameInMap("Category")
    public String category;

    @NameInMap("ReplicatorJobId")
    public String replicatorJobId;

    public static DescribeHistoryMonitorValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryMonitorValuesRequest self = new DescribeHistoryMonitorValuesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryMonitorValuesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeHistoryMonitorValuesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeHistoryMonitorValuesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHistoryMonitorValuesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeHistoryMonitorValuesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeHistoryMonitorValuesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHistoryMonitorValuesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeHistoryMonitorValuesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeHistoryMonitorValuesRequest setIntervalForHistory(String intervalForHistory) {
        this.intervalForHistory = intervalForHistory;
        return this;
    }
    public String getIntervalForHistory() {
        return this.intervalForHistory;
    }

    public DescribeHistoryMonitorValuesRequest setMonitorKeys(String monitorKeys) {
        this.monitorKeys = monitorKeys;
        return this;
    }
    public String getMonitorKeys() {
        return this.monitorKeys;
    }

    public DescribeHistoryMonitorValuesRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeHistoryMonitorValuesRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public DescribeHistoryMonitorValuesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeHistoryMonitorValuesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeHistoryMonitorValuesRequest setReplicatorJobId(String replicatorJobId) {
        this.replicatorJobId = replicatorJobId;
        return this;
    }
    public String getReplicatorJobId() {
        return this.replicatorJobId;
    }

}
