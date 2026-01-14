// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class ModelUsage extends TeaModel {
    @NameInMap("inputTokens")
    public Long inputTokens;

    @NameInMap("outputTokens")
    public Long outputTokens;

    @NameInMap("totalTokens")
    public Long totalTokens;

    public static ModelUsage build(java.util.Map<String, ?> map) throws Exception {
        ModelUsage self = new ModelUsage();
        return TeaModel.build(map, self);
    }

    public ModelUsage setInputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public Long getInputTokens() {
        return this.inputTokens;
    }

    public ModelUsage setOutputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public Long getOutputTokens() {
        return this.outputTokens;
    }

    public ModelUsage setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Long getTotalTokens() {
        return this.totalTokens;
    }

}
