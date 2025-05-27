// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseVocAnalysisTaskShrinkRequest extends TeaModel {
    @NameInMap("apiKey")
    public String apiKey;

    @NameInMap("contents")
    public String contentsShrink;

    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <strong>example:</strong>
     * <p>oss://default/aimiaobi-service-prod/aimiaobi/temp/public/government_service_experience_feedback_summary.txt</p>
     */
    @NameInMap("fileKey")
    public String fileKey;

    @NameInMap("filterTags")
    public String filterTagsShrink;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    @NameInMap("outputFormat")
    public String outputFormat;

    @NameInMap("sourceTrace")
    public Boolean sourceTrace;

    @NameInMap("tags")
    public String tagsShrink;

    @NameInMap("taskDescription")
    public String taskDescription;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxxx.txt">http://www.example.com/xxxx.txt</a></p>
     */
    @NameInMap("url")
    public String url;

    public static SubmitEnterpriseVocAnalysisTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEnterpriseVocAnalysisTaskShrinkRequest self = new SubmitEnterpriseVocAnalysisTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setContentsShrink(String contentsShrink) {
        this.contentsShrink = contentsShrink;
        return this;
    }
    public String getContentsShrink() {
        return this.contentsShrink;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setFilterTagsShrink(String filterTagsShrink) {
        this.filterTagsShrink = filterTagsShrink;
        return this;
    }
    public String getFilterTagsShrink() {
        return this.filterTagsShrink;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setSourceTrace(Boolean sourceTrace) {
        this.sourceTrace = sourceTrace;
        return this;
    }
    public Boolean getSourceTrace() {
        return this.sourceTrace;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
