// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunMarketingInformationWritingShrinkRequest extends TeaModel {
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>标题长度不超过30个字符</p>
     */
    @NameInMap("customLimitation")
    public String customLimitation;

    /**
     * <strong>example:</strong>
     * <p>请根据商品特点生成吸引人的标题</p>
     */
    @NameInMap("customPrompt")
    public String customPrompt;

    /**
     * <strong>example:</strong>
     * <p>{
     *               &quot;minWordLength&quot;: &quot;10&quot;,
     *               &quot;maxWordLength&quot;: &quot;50&quot;,
     *               &quot;enableThinking&quot;: &quot;true&quot;,
     *               &quot;thinkingBudget&quot;: &quot;2000&quot;
     *             }</p>
     */
    @NameInMap("extParameters")
    public String extParametersShrink;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("generateCount")
    public String generateCount;

    /**
     * <strong>example:</strong>
     * <p>商品特点：透气、减震、舒适</p>
     */
    @NameInMap("inputExample")
    public String inputExample;

    /**
     * <strong>example:</strong>
     * <p>运动鞋 透气 减震 跑步</p>
     */
    @NameInMap("keywords")
    public String keywords;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>qwen-max
     * qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>要求标题简洁有力，突出产品特点</p>
     */
    @NameInMap("otherRequirements")
    public String otherRequirements;

    /**
     * <strong>example:</strong>
     * <p>透气减震运动鞋，舒适跑步首选</p>
     */
    @NameInMap("outputExample")
    public String outputExample;

    /**
     * <strong>example:</strong>
     * <p>请根据关键词生成吸引人的商品标题</p>
     */
    @NameInMap("prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>时尚休闲运动鞋</p>
     */
    @NameInMap("sourceMaterial")
    public String sourceMaterial;

    /**
     * <strong>example:</strong>
     * <p>10-20</p>
     */
    @NameInMap("wordCountRange")
    public String wordCountRange;

    /**
     * <strong>example:</strong>
     * <p>generateProductTitle</p>
     */
    @NameInMap("writingType")
    public String writingType;

    public static RunMarketingInformationWritingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMarketingInformationWritingShrinkRequest self = new RunMarketingInformationWritingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunMarketingInformationWritingShrinkRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public RunMarketingInformationWritingShrinkRequest setCustomLimitation(String customLimitation) {
        this.customLimitation = customLimitation;
        return this;
    }
    public String getCustomLimitation() {
        return this.customLimitation;
    }

    public RunMarketingInformationWritingShrinkRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public RunMarketingInformationWritingShrinkRequest setExtParametersShrink(String extParametersShrink) {
        this.extParametersShrink = extParametersShrink;
        return this;
    }
    public String getExtParametersShrink() {
        return this.extParametersShrink;
    }

    public RunMarketingInformationWritingShrinkRequest setGenerateCount(String generateCount) {
        this.generateCount = generateCount;
        return this;
    }
    public String getGenerateCount() {
        return this.generateCount;
    }

    public RunMarketingInformationWritingShrinkRequest setInputExample(String inputExample) {
        this.inputExample = inputExample;
        return this;
    }
    public String getInputExample() {
        return this.inputExample;
    }

    public RunMarketingInformationWritingShrinkRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public RunMarketingInformationWritingShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RunMarketingInformationWritingShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunMarketingInformationWritingShrinkRequest setOtherRequirements(String otherRequirements) {
        this.otherRequirements = otherRequirements;
        return this;
    }
    public String getOtherRequirements() {
        return this.otherRequirements;
    }

    public RunMarketingInformationWritingShrinkRequest setOutputExample(String outputExample) {
        this.outputExample = outputExample;
        return this;
    }
    public String getOutputExample() {
        return this.outputExample;
    }

    public RunMarketingInformationWritingShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunMarketingInformationWritingShrinkRequest setSourceMaterial(String sourceMaterial) {
        this.sourceMaterial = sourceMaterial;
        return this;
    }
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    public RunMarketingInformationWritingShrinkRequest setWordCountRange(String wordCountRange) {
        this.wordCountRange = wordCountRange;
        return this;
    }
    public String getWordCountRange() {
        return this.wordCountRange;
    }

    public RunMarketingInformationWritingShrinkRequest setWritingType(String writingType) {
        this.writingType = writingType;
        return this;
    }
    public String getWritingType() {
        return this.writingType;
    }

}
