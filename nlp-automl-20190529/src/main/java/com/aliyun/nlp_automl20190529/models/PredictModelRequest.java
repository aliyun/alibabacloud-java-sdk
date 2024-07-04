// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190529.models;

import com.aliyun.tea.*;

public class PredictModelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelId")
    public Long modelId;

    public static PredictModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictModelRequest self = new PredictModelRequest();
        return TeaModel.build(map, self);
    }

    public PredictModelRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PredictModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

}
