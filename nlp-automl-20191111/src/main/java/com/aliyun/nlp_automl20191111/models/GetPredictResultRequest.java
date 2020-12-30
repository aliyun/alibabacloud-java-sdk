// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class GetPredictResultRequest extends TeaModel {
    @NameInMap("ModelId")
    public Integer modelId;

    @NameInMap("Content")
    public String content;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("DetailTag")
    public String detailTag;

    @NameInMap("TopK")
    public Integer topK;

    @NameInMap("Product")
    public String product;

    public static GetPredictResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPredictResultRequest self = new GetPredictResultRequest();
        return TeaModel.build(map, self);
    }

    public GetPredictResultRequest setModelId(Integer modelId) {
        this.modelId = modelId;
        return this;
    }
    public Integer getModelId() {
        return this.modelId;
    }

    public GetPredictResultRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetPredictResultRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public GetPredictResultRequest setDetailTag(String detailTag) {
        this.detailTag = detailTag;
        return this;
    }
    public String getDetailTag() {
        return this.detailTag;
    }

    public GetPredictResultRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public GetPredictResultRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
