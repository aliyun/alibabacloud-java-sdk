// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunMarketingInformationWritingRequest extends TeaModel {
    @NameInMap("customPrompt")
    public String customPrompt;

    /**
     * <strong>example:</strong>
     * <p>qwen-max
     * qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    @NameInMap("sourceMaterial")
    public String sourceMaterial;

    @NameInMap("writingType")
    public String writingType;

    public static RunMarketingInformationWritingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMarketingInformationWritingRequest self = new RunMarketingInformationWritingRequest();
        return TeaModel.build(map, self);
    }

    public RunMarketingInformationWritingRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public RunMarketingInformationWritingRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunMarketingInformationWritingRequest setSourceMaterial(String sourceMaterial) {
        this.sourceMaterial = sourceMaterial;
        return this;
    }
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    public RunMarketingInformationWritingRequest setWritingType(String writingType) {
        this.writingType = writingType;
        return this;
    }
    public String getWritingType() {
        return this.writingType;
    }

}
