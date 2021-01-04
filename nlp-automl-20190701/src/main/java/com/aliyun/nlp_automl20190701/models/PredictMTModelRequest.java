// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class PredictMTModelRequest extends TeaModel {
    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("Content")
    public String content;

    @NameInMap("Product")
    public String product;

    public static PredictMTModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictMTModelRequest self = new PredictMTModelRequest();
        return TeaModel.build(map, self);
    }

    public PredictMTModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public PredictMTModelRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public PredictMTModelRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PredictMTModelRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
