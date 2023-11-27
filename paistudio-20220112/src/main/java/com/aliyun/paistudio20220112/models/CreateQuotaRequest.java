// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateQuotaRequest extends TeaModel {
    @NameInMap("AllocateStrategy")
    public String allocateStrategy;

    @NameInMap("Description")
    public String description;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("Min")
    public ResourceSpec min;

    @NameInMap("ParentQuotaId")
    public String parentQuotaId;

    @NameInMap("QueueStrategy")
    public String queueStrategy;

    @NameInMap("QuotaConfig")
    public QuotaConfig quotaConfig;

    @NameInMap("QuotaName")
    public String quotaName;

    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

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
