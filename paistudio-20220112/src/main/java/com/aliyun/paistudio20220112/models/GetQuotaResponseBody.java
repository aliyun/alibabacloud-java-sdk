// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetQuotaResponseBody extends TeaModel {
    /**
     * <p>The resource allocation strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>ByNodeSpec</p>
     */
    @NameInMap("AllocateStrategy")
    public String allocateStrategy;

    /**
     * <p>The ID of the quota creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1884692****</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The description of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test quota</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The GPU type.</p>
     * 
     * <strong>example:</strong>
     * <p>L20</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>The time when the quota was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    /**
     * <p>The time when the quota was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The list of high-performance network zones.</p>
     */
    @NameInMap("HyperZones")
    public java.util.List<String> hyperZones;

    /**
     * <p>The labels of the quota.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The ID of the latest quota operation.</p>
     * 
     * <strong>example:</strong>
     * <p>operation****</p>
     */
    @NameInMap("LatestOperationId")
    public String latestOperationId;

    /**
     * <p>The minimum quota configuration.</p>
     */
    @NameInMap("Min")
    public ResourceSpec min;

    /**
     * <p>The ID of the parent quota.</p>
     * 
     * <strong>example:</strong>
     * <p>quota1ci8g79****</p>
     */
    @NameInMap("ParentQuotaId")
    public String parentQuotaId;

    /**
     * <p>The queuing strategy for tasks in the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>PaiStrategyIntelligent</p>
     */
    @NameInMap("QueueStrategy")
    public String queueStrategy;

    /**
     * <p>The cluster specifications and status composed of resources in the quota.</p>
     */
    @NameInMap("QuotaCluster")
    public QuotaCluster quotaCluster;

    /**
     * <p>The quota configuration:</p>
     * <ul>
     * <li><p>VPC information</p>
     * </li>
     * <li><p>Whether RDMA is supported</p>
     * </li>
     * <li><p>ACS configuration (takes effect when the resource type is ACS)</p>
     * </li>
     * </ul>
     */
    @NameInMap("QuotaConfig")
    public QuotaConfig quotaConfig;

    /**
     * <p>The details of the quota.</p>
     */
    @NameInMap("QuotaDetails")
    public QuotaDetails quotaDetails;

    /**
     * <p>The resource quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>quotajradxh4****</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The name of the resource quota.</p>
     * 
     * <strong>example:</strong>
     * <p>test-quota</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <p>The error reason.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18D5A1C6-14B8-545E-8408-0A7DDB4C6B5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group information associated with the resource quota.</p>
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    /**
     * <p>The resource type of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The status of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of sub-quotas under the quota.</p>
     */
    @NameInMap("SubQuotas")
    public java.util.List<QuotaIdName> subQuotas;

    /**
     * <p>The version information. Takes effect when the resource type is ECS.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>The workspaces associated with the quota.</p>
     */
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

    public GetQuotaResponseBody setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
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

    public GetQuotaResponseBody setHyperZones(java.util.List<String> hyperZones) {
        this.hyperZones = hyperZones;
        return this;
    }
    public java.util.List<String> getHyperZones() {
        return this.hyperZones;
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

    public GetQuotaResponseBody setQuotaCluster(QuotaCluster quotaCluster) {
        this.quotaCluster = quotaCluster;
        return this;
    }
    public QuotaCluster getQuotaCluster() {
        return this.quotaCluster;
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

    public GetQuotaResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetQuotaResponseBody setWorkspaces(java.util.List<WorkspaceIdName> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<WorkspaceIdName> getWorkspaces() {
        return this.workspaces;
    }

}
