// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class PredictMTModelByDocRequest extends TeaModel {
    @NameInMap("FileContent")
    public String fileContent;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("ModelId")
    public Integer modelId;

    @NameInMap("NeedXLIFF")
    public Boolean needXLIFF;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("Product")
    public String product;

    public static PredictMTModelByDocRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictMTModelByDocRequest self = new PredictMTModelByDocRequest();
        return TeaModel.build(map, self);
    }

    public PredictMTModelByDocRequest setFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }
    public String getFileContent() {
        return this.fileContent;
    }

    public PredictMTModelByDocRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public PredictMTModelByDocRequest setModelId(Integer modelId) {
        this.modelId = modelId;
        return this;
    }
    public Integer getModelId() {
        return this.modelId;
    }

    public PredictMTModelByDocRequest setNeedXLIFF(Boolean needXLIFF) {
        this.needXLIFF = needXLIFF;
        return this;
    }
    public Boolean getNeedXLIFF() {
        return this.needXLIFF;
    }

    public PredictMTModelByDocRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public PredictMTModelByDocRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
