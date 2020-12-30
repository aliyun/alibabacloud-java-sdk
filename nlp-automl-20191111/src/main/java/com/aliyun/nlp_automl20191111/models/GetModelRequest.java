// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class GetModelRequest extends TeaModel {
    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("Product")
    public String product;

    public static GetModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelRequest self = new GetModelRequest();
        return TeaModel.build(map, self);
    }

    public GetModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public GetModelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetModelRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public GetModelRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
