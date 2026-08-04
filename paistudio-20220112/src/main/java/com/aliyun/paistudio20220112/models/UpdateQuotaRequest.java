// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateQuotaRequest extends TeaModel {
    /**
     * <p>The description of the resource quota.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test quota</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of user-defined labels. This is a full update.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("PropagateDefaultGPUDriver")
    public Boolean propagateDefaultGPUDriver;

    /**
     * <p>The queuing strategy for jobs in the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>PaiStrategyIntelligent</p>
     */
    @NameInMap("QueueStrategy")
    public String queueStrategy;

    /**
     * <p>The resource quota configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("QuotaConfig")
    public QuotaConfig quotaConfig;

    /**
     * <p>The resource quota name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    public static UpdateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaRequest self = new UpdateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateQuotaRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public UpdateQuotaRequest setPropagateDefaultGPUDriver(Boolean propagateDefaultGPUDriver) {
        this.propagateDefaultGPUDriver = propagateDefaultGPUDriver;
        return this;
    }
    public Boolean getPropagateDefaultGPUDriver() {
        return this.propagateDefaultGPUDriver;
    }

    public UpdateQuotaRequest setQueueStrategy(String queueStrategy) {
        this.queueStrategy = queueStrategy;
        return this;
    }
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    public UpdateQuotaRequest setQuotaConfig(QuotaConfig quotaConfig) {
        this.quotaConfig = quotaConfig;
        return this;
    }
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
    }

    public UpdateQuotaRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

}
