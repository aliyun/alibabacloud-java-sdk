// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateQuotaRequest extends TeaModel {
    /**
     * <p>The allocation strategy for the quota. Only <code>ByNodeSpecs</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ByNodeSpecs</p>
     */
    @NameInMap("AllocateStrategy")
    public String allocateStrategy;

    /**
     * <p>The native cluster specification for the quota.</p>
     */
    @NameInMap("ClusterSpec")
    public ClusterSpec clusterSpec;

    /**
     * <p>The description of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test quota</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The tags for the quota.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The minimum resources for the quota. You can define this in one of the following ways:</p>
     * <ul>
     * <li><p><code>ResourceAmount</code>: Specifies the CPU, memory, and GPU details.</p>
     * </li>
     * <li><p><code>NodeSpecs</code>: Specifies the node specification and the number of nodes.</p>
     * </li>
     * </ul>
     * <p>Constraints:</p>
     * <ul>
     * <li><p>If this quota allocates resources from a dedicated resource group, you must use the <code>NodeSpecs</code> method.</p>
     * </li>
     * <li><p>If this quota allocates resources from a parent quota, both methods are allowed. However, all its child quotas must use the same method.</p>
     * </li>
     * <li><p>All GPU specifications within the quota must have the same GPU type.</p>
     * </li>
     * <li><p>For quotas with the resource type set to ECS or Lingjun, only the <code>NodeSpecs</code> method can be used.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Min")
    public ResourceSpec min;

    /**
     * <p>The ID of the parent quota.</p>
     * <ul>
     * <li><p>If you do not specify this parameter, a root quota is created. Resources are allocated from a dedicated resource group.</p>
     * </li>
     * <li><p>If you specify this parameter, a child quota is created. Resources are allocated from the nodes that are bound to the root quota.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>quota1ci8g793pgm</p>
     */
    @NameInMap("ParentQuotaId")
    public String parentQuotaId;

    /**
     * <p>The queuing strategy for the quota. Four strategies are supported:</p>
     * <ul>
     * <li><p><code>PaiStrategyIntelligent</code>: The intelligent strategy.</p>
     * </li>
     * <li><p><code>PaiStrategyBalance</code>: The balance strategy.</p>
     * </li>
     * <li><p><code>PaiStrategyRoundRobin</code>: The round-robin strategy.</p>
     * </li>
     * <li><p><code>PaiStrategyStrictFIFO</code>: The FIFO strategy.</p>
     * </li>
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
     * <p>Constraints for the <code>QuotaConfig</code> parameter:</p>
     * <ul>
     * <li><p>This parameter is ignored if the resource type is ECS or Lingjun.</p>
     * </li>
     * <li><p>If the resource type is ACS, the specified VPC and ACS configurations are applied.</p>
     * </li>
     * </ul>
     */
    @NameInMap("QuotaConfig")
    public QuotaConfig quotaConfig;

    /**
     * <p>The name of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>test-quota</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    /**
     * <p>The IDs of the dedicated resource groups. The following constraints apply:</p>
     * <ul>
     * <li><p>Only a root quota, for which <code>ParentQuotaId</code> is empty, can allocate nodes from a resource group.</p>
     * </li>
     * <li><p>The VPC configurations of the specified resource groups must be the same.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    /**
     * <p>The resource type of the quota. Valid values: Lingjun, ECS, and ACS. Default value: ECS.</p>
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
