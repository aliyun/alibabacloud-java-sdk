// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Quota extends TeaModel {
    @NameInMap("AllocateStrategy")
    public String allocateStrategy;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("LatestOperationId")
    public String latestOperationId;

    @NameInMap("Min")
    public ResourceSpec min;

    @NameInMap("ParentQuotaId")
    public String parentQuotaId;

    @NameInMap("QueueStrategy")
    public String queueStrategy;

    @NameInMap("QuotaConfig")
    public QuotaConfig quotaConfig;

    @NameInMap("QuotaDetails")
    public QuotaDetails quotaDetails;

    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("QuotaName")
    public String quotaName;

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubQuotas")
    public java.util.List<QuotaIdName> subQuotas;

    @NameInMap("Workspaces")
    public java.util.List<WorkspaceIdName> workspaces;

    public static Quota build(java.util.Map<String, ?> map) throws Exception {
        Quota self = new Quota();
        return TeaModel.build(map, self);
    }

    public Quota setAllocateStrategy(String allocateStrategy) {
        this.allocateStrategy = allocateStrategy;
        return this;
    }
    public String getAllocateStrategy() {
        return this.allocateStrategy;
    }

    public Quota setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public Quota setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Quota setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public Quota setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Quota setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public Quota setLatestOperationId(String latestOperationId) {
        this.latestOperationId = latestOperationId;
        return this;
    }
    public String getLatestOperationId() {
        return this.latestOperationId;
    }

    public Quota setMin(ResourceSpec min) {
        this.min = min;
        return this;
    }
    public ResourceSpec getMin() {
        return this.min;
    }

    public Quota setParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
        return this;
    }
    public String getParentQuotaId() {
        return this.parentQuotaId;
    }

    public Quota setQueueStrategy(String queueStrategy) {
        this.queueStrategy = queueStrategy;
        return this;
    }
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    public Quota setQuotaConfig(QuotaConfig quotaConfig) {
        this.quotaConfig = quotaConfig;
        return this;
    }
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
    }

    public Quota setQuotaDetails(QuotaDetails quotaDetails) {
        this.quotaDetails = quotaDetails;
        return this;
    }
    public QuotaDetails getQuotaDetails() {
        return this.quotaDetails;
    }

    public Quota setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public Quota setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public Quota setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public Quota setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public Quota setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public Quota setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public Quota setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Quota setSubQuotas(java.util.List<QuotaIdName> subQuotas) {
        this.subQuotas = subQuotas;
        return this;
    }
    public java.util.List<QuotaIdName> getSubQuotas() {
        return this.subQuotas;
    }

    public Quota setWorkspaces(java.util.List<WorkspaceIdName> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<WorkspaceIdName> getWorkspaces() {
        return this.workspaces;
    }

}
