// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitTagMiningAnalysisTaskShrinkRequest extends TeaModel {
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>clueMining</p>
     */
    @NameInMap("businessType")
    public String businessType;

    @NameInMap("contents")
    public String contentsShrink;

    /**
     * <strong>example:</strong>
     * <p>额外信息</p>
     */
    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>请返回如下JSON格式，{&quot;key1&quot;:&quot;&quot;,&quot;key2&quot;:&quot;&quot;}</p>
     */
    @NameInMap("outputFormat")
    public String outputFormat;

    @NameInMap("tags")
    public String tagsShrink;

    /**
     * <strong>example:</strong>
     * <p>给你一条待分析文本数据，请你按照标签体系来对数据进行打标。</p>
     */
    @NameInMap("taskDescription")
    public String taskDescription;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxxx.txt">http://www.example.com/xxxx.txt</a></p>
     */
    @NameInMap("url")
    public String url;

    public static SubmitTagMiningAnalysisTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTagMiningAnalysisTaskShrinkRequest self = new SubmitTagMiningAnalysisTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTagMiningAnalysisTaskShrinkRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public SubmitTagMiningAnalysisTaskShrinkRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public SubmitTagMiningAnalysisTaskShrinkRequest setContentsShrink(String contentsShrink) {
        this.contentsShrink = contentsShrink;
        return this;
    }
    public String getContentsShrink() {
        return this.contentsShrink;
    }

    public SubmitTagMiningAnalysisTaskShrinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SubmitTagMiningAnalysisTaskShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitTagMiningAnalysisTaskShrinkRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public SubmitTagMiningAnalysisTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public SubmitTagMiningAnalysisTaskShrinkRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public SubmitTagMiningAnalysisTaskShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
