// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateQuotaRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("QueueStrategy")
    public String queueStrategy;

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

    public UpdateQuotaRequest setQueueStrategy(String queueStrategy) {
        this.queueStrategy = queueStrategy;
        return this;
    }
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

}
