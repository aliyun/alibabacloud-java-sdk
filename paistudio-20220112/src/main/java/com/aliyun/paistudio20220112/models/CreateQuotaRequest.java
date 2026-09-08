// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateQuotaRequest extends TeaModel {
    /**
     * <p>The quota allocation strategy. Currently, only ByNodeSpecs is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ByNodeSpecs</p>
     */
    @NameInMap("AllocateStrategy")
    public String allocateStrategy;

    /**
     * <p>The specifications of the native cluster for the resource quota.</p>
     */
    @NameInMap("ClusterSpec")
    public ClusterSpec clusterSpec;

    /**
     * <p>The quota description.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test quota</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The quota labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The minimum quota configuration. Valid options:</p>
     * <ul>
     * <li>ResourceAmount: specifies CPU, memory, or GPU details.</li>
     * <li>NodeSpecs: specifies the instance type and quantity.</li>
     * </ul>
     * <p>Constraints:</p>
     * <ul>
     * <li>If the quota allocates resources from a dedicated resource group, only the NodeSpecs strategy is allowed.</li>
     * <li>If the quota allocates resources from a parent quota, both strategies are allowed, but all child quotas must use the same strategy.</li>
     * <li>All GPU specifications within a quota must use the same GPU type.</li>
     * <li>Resource quotas with the ECS or Lingjun resource type can only use the NodeSpecs strategy.</li>
     * </ul>
     */
    @NameInMap("Min")
    public ResourceSpec min;

    /**
     * <p>The parent QuotaId:</p>
     * <ul>
     * <li>If ParentQuotaId is empty, a root quota is created and machines are allocated from the dedicated resource group.</li>
     * <li>If ParentQuotaId is not empty, a child quota is created and resources are allocated from the nodes bound to the root quota.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>quota1ci8g793pgm</p>
     */
    @NameInMap("ParentQuotaId")
    public String parentQuotaId;

    /**
     * <p>Four queuing policies are supported for quotas.</p>
     * <ul>
     * <li>PaiStrategyIntelligent: intelligent policies.</li>
     * <li>PaiStrategyBalance: balanced policy.</li>
     * <li>PaiStrategyRoundRobin: resource-priority policy.</li>
     * <li>PaiStrategyStrictFIFO: FIFO policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PaiStrategyIntelligent</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("QueueStrategy")
    public String queueStrategy;

    /**
     * <p>QuotaConfig configuration constraints:</p>
     * <ul>
     * <li>This configuration does not take effect when the ECS or Lingjun resource type is used.</li>
     * <li>When the ACS resource type is used, the user VPC information and ACS configuration take effect.</li>
     * </ul>
     */
    @NameInMap("QuotaConfig")
    public QuotaConfig quotaConfig;

    /**
     * <p>The quota name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-quota</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    /**
     * <p>The list of dedicated resource groups. Constraints:</p>
     * <ul>
     * <li>Only root quotas (where ParentQuotaId is empty) can allocate machines from resource groups.</li>
     * <li>The VPC configurations in the specified resource groups must be consistent.</li>
     * </ul>
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    /**
     * <p>The quota resource type (Lingjun/ECS/ACS). Default value: ECS.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static CreateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaRequest self = new CreateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaRequest setAllocateStrategy(String allocateStrategy) {
        this.allocateStrategy = allocateStrategy;
        return this;
    }
    public String getAllocateStrategy() {
        return this.allocateStrategy;
    }

    public CreateQuotaRequest setClusterSpec(ClusterSpec clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public ClusterSpec getClusterSpec() {
        return this.clusterSpec;
    }

    public CreateQuotaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateQuotaRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateQuotaRequest setMin(ResourceSpec min) {
        this.min = min;
        return this;
    }
    public ResourceSpec getMin() {
        return this.min;
    }

    public CreateQuotaRequest setParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
        return this;
    }
    public String getParentQuotaId() {
        return this.parentQuotaId;
    }

    public CreateQuotaRequest setQueueStrategy(String queueStrategy) {
        this.queueStrategy = queueStrategy;
        return this;
    }
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    public CreateQuotaRequest setQuotaConfig(QuotaConfig quotaConfig) {
        this.quotaConfig = quotaConfig;
        return this;
    }
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
    }

    public CreateQuotaRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public CreateQuotaRequest setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public CreateQuotaRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
