// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class DeployModelRequest extends TeaModel {
    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("OptType")
    public String optType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("Product")
    public String product;

    public static DeployModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployModelRequest self = new DeployModelRequest();
        return TeaModel.build(map, self);
    }

    public DeployModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public DeployModelRequest setOptType(String optType) {
        this.optType = optType;
        return this;
    }
    public String getOptType() {
        return this.optType;
    }

    public DeployModelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeployModelRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public DeployModelRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
