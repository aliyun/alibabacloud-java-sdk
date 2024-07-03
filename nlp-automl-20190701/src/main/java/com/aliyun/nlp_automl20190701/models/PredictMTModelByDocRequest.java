// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class PredictMTModelByDocRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[base64 encode content]</p>
     */
    @NameInMap("FileContent")
    public String fileContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>docx</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ModelId")
    public Integer modelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedXLIFF")
    public Boolean needXLIFF;

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

    public PredictMTModelByDocRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public PredictMTModelByDocRequest setNeedXLIFF(Boolean needXLIFF) {
        this.needXLIFF = needXLIFF;
        return this;
    }
    public Boolean getNeedXLIFF() {
        return this.needXLIFF;
    }

}
