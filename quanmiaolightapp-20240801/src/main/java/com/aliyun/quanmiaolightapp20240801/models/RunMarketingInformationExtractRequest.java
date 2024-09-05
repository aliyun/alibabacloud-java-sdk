// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunMarketingInformationExtractRequest extends TeaModel {
    @NameInMap("customPrompt")
    public String customPrompt;

    @NameInMap("extractType")
    public String extractType;

    /**
     * <strong>example:</strong>
     * <p>qwen-max
     * qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    @NameInMap("sourceMaterials")
    public java.util.List<String> sourceMaterials;

    public static RunMarketingInformationExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMarketingInformationExtractRequest self = new RunMarketingInformationExtractRequest();
        return TeaModel.build(map, self);
    }

    public RunMarketingInformationExtractRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public RunMarketingInformationExtractRequest setExtractType(String extractType) {
        this.extractType = extractType;
        return this;
    }
    public String getExtractType() {
        return this.extractType;
    }

    public RunMarketingInformationExtractRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunMarketingInformationExtractRequest setSourceMaterials(java.util.List<String> sourceMaterials) {
        this.sourceMaterials = sourceMaterials;
        return this;
    }
    public java.util.List<String> getSourceMaterials() {
        return this.sourceMaterials;
    }

}
