// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetQuotaResponseBody extends TeaModel {
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

    /**
     * <p>Quota Id</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("QuotaName")
    public String quotaName;

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("RequestId")
    public String requestId;

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

    public static GetQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaResponseBody self = new GetQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaResponseBody setAllocateStrategy(String allocateStrategy) {
        this.allocateStrategy = allocateStrategy;
        return this;
    }
    public String getAllocateStrategy() {
        return this.allocateStrategy;
    }

    public GetQuotaResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public GetQuotaResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetQuotaResponseBody setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public GetQuotaResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetQuotaResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public GetQuotaResponseBody setLatestOperationId(String latestOperationId) {
        this.latestOperationId = latestOperationId;
        return this;
    }
    public String getLatestOperationId() {
        return this.latestOperationId;
    }

    public GetQuotaResponseBody setMin(ResourceSpec min) {
        this.min = min;
        return this;
    }
    public ResourceSpec getMin() {
        return this.min;
    }

    public GetQuotaResponseBody setParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
        return this;
    }
    public String getParentQuotaId() {
        return this.parentQuotaId;
    }

    public GetQuotaResponseBody setQueueStrategy(String queueStrategy) {
        this.queueStrategy = queueStrategy;
        return this;
    }
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    public GetQuotaResponseBody setQuotaConfig(QuotaConfig quotaConfig) {
        this.quotaConfig = quotaConfig;
        return this;
    }
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
    }

    public GetQuotaResponseBody setQuotaDetails(QuotaDetails quotaDetails) {
        this.quotaDetails = quotaDetails;
        return this;
    }
    public QuotaDetails getQuotaDetails() {
        return this.quotaDetails;
    }

    public GetQuotaResponseBody setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public GetQuotaResponseBody setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public GetQuotaResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetQuotaResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaResponseBody setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public GetQuotaResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetQuotaResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetQuotaResponseBody setSubQuotas(java.util.List<QuotaIdName> subQuotas) {
        this.subQuotas = subQuotas;
        return this;
    }
    public java.util.List<QuotaIdName> getSubQuotas() {
        return this.subQuotas;
    }

    public GetQuotaResponseBody setWorkspaces(java.util.List<WorkspaceIdName> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<WorkspaceIdName> getWorkspaces() {
        return this.workspaces;
    }

}
