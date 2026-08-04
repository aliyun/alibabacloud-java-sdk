// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Quota extends TeaModel {
    /**
     * <p>The resource allocation strategy. Currently, only <code>ByNodeSpec</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ByNodeSpec</p>
     */
    @NameInMap("AllocateStrategy")
    public String allocateStrategy;

    /**
     * <p>The ID of the user who created the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>1884692****</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The quota description.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test quota</p>
     */
    @NameInMap("Description")
    public String description;

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

    @NameInMap("HyperZones")
    public java.util.List<String> hyperZones;

    /**
     * <p>The quota labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The ID of the most recent operation on the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>operation****</p>
     */
    @NameInMap("LatestOperationId")
    public String latestOperationId;

    /**
     * <p>The guaranteed resources.</p>
     */
    @NameInMap("Min")
    public ResourceSpec min;

    /**
     * <p>The parent quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ParentQuotaId")
    public String parentQuotaId;

    /**
     * <p>The queuing strategy. Valid values:</p>
     * <ul>
     * <li><p><code>PaiStrategyIntelligent</code>: intelligent strategy.</p>
     * </li>
     * <li><p><code>PaiStrategyBalance</code>: balanced strategy.</p>
     * </li>
     * <li><p><code>PaiStrategyRoundRobin</code>: round-robin strategy.</p>
     * </li>
     * <li><p><code>PaiStrategyStrictFIFO</code>: FIFO strategy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PaiStrategyIntelligent</p>
     */
    @NameInMap("QueueStrategy")
    public String queueStrategy;

    @NameInMap("QuotaCluster")
    public QuotaCluster quotaCluster;

    /**
     * <p>The quota configuration.</p>
     */
    @NameInMap("QuotaConfig")
    public QuotaConfig quotaConfig;

    /**
     * <p>The quota details.</p>
     */
    @NameInMap("QuotaDetails")
    public QuotaDetails quotaDetails;

    /**
     * <p>The quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>quota12345</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The quota name.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-quota</p>
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
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>A list of resource group IDs.</p>
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p><code>Lingjun</code></p>
     * </li>
     * <li><p><code>ECS</code> (default)</p>
     * </li>
     * <li><p><code>ACS</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The quota status.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A list of sub-quotas.</p>
     */
    @NameInMap("SubQuotas")
    public java.util.List<QuotaIdName> subQuotas;

    /**
     * <p>The version.</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>The workspaces that are associated with the quota.</p>
     */
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

    public Quota setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
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

    public Quota setHyperZones(java.util.List<String> hyperZones) {
        this.hyperZones = hyperZones;
        return this;
    }
    public java.util.List<String> getHyperZones() {
        return this.hyperZones;
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

    public Quota setQuotaCluster(QuotaCluster quotaCluster) {
        this.quotaCluster = quotaCluster;
        return this;
    }
    public QuotaCluster getQuotaCluster() {
        return this.quotaCluster;
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

    public Quota setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public Quota setWorkspaces(java.util.List<WorkspaceIdName> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<WorkspaceIdName> getWorkspaces() {
        return this.workspaces;
    }

}
