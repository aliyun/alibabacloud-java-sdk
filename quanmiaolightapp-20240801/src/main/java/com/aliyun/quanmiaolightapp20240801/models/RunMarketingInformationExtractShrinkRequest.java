// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunMarketingInformationExtractShrinkRequest extends TeaModel {
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
    public String sourceMaterialsShrink;

    public static RunMarketingInformationExtractShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMarketingInformationExtractShrinkRequest self = new RunMarketingInformationExtractShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunMarketingInformationExtractShrinkRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public RunMarketingInformationExtractShrinkRequest setExtractType(String extractType) {
        this.extractType = extractType;
        return this;
    }
    public String getExtractType() {
        return this.extractType;
    }

    public RunMarketingInformationExtractShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunMarketingInformationExtractShrinkRequest setSourceMaterialsShrink(String sourceMaterialsShrink) {
        this.sourceMaterialsShrink = sourceMaterialsShrink;
        return this;
    }
    public String getSourceMaterialsShrink() {
        return this.sourceMaterialsShrink;
    }

}
