// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class SyncResourceOperationRequest extends TeaModel {
    // 资源所属账号Id
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OperationTimestamp")
    public Long operationTimestamp;

    // 操作类型
    @NameInMap("OperationType")
    public String operationType;

    // 地域Id
    @NameInMap("RegionId")
    public String regionId;

    // 目标资源组
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // 资源Id
    @NameInMap("ResourceId")
    public String resourceId;

    // 资源类型
    @NameInMap("ResourceType")
    public String resourceType;

    // 云产品服务Code
    @NameInMap("Service")
    public String service;

    public static SyncResourceOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncResourceOperationRequest self = new SyncResourceOperationRequest();
        return TeaModel.build(map, self);
    }

    public SyncResourceOperationRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SyncResourceOperationRequest setOperationTimestamp(Long operationTimestamp) {
        this.operationTimestamp = operationTimestamp;
        return this;
    }
    public Long getOperationTimestamp() {
        return this.operationTimestamp;
    }

    public SyncResourceOperationRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SyncResourceOperationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SyncResourceOperationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SyncResourceOperationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public SyncResourceOperationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public SyncResourceOperationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
