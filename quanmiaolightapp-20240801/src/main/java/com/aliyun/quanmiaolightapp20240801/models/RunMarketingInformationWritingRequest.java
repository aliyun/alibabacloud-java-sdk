// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunMarketingInformationWritingRequest extends TeaModel {
    @NameInMap("apiKey")
    public String apiKey;

    @NameInMap("customLimitation")
    public String customLimitation;

    @NameInMap("customPrompt")
    public String customPrompt;

    @NameInMap("inputExample")
    public String inputExample;

    /**
     * <strong>example:</strong>
     * <p>qwen-max
     * qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    @NameInMap("outputExample")
    public String outputExample;

    @NameInMap("sourceMaterial")
    public String sourceMaterial;

    @NameInMap("writingType")
    public String writingType;

    public static RunMarketingInformationWritingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMarketingInformationWritingRequest self = new RunMarketingInformationWritingRequest();
        return TeaModel.build(map, self);
    }

    public RunMarketingInformationWritingRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public RunMarketingInformationWritingRequest setCustomLimitation(String customLimitation) {
        this.customLimitation = customLimitation;
        return this;
    }
    public String getCustomLimitation() {
        return this.customLimitation;
    }

    public RunMarketingInformationWritingRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public RunMarketingInformationWritingRequest setInputExample(String inputExample) {
        this.inputExample = inputExample;
        return this;
    }
    public String getInputExample() {
        return this.inputExample;
    }

    public RunMarketingInformationWritingRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunMarketingInformationWritingRequest setOutputExample(String outputExample) {
        this.outputExample = outputExample;
        return this;
    }
    public String getOutputExample() {
        return this.outputExample;
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
