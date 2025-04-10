// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitTagMiningAnalysisTaskRequest extends TeaModel {
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>clueMining</p>
     */
    @NameInMap("businessType")
    public String businessType;

    @NameInMap("contents")
    public java.util.List<String> contents;

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
    public java.util.List<SubmitTagMiningAnalysisTaskRequestTags> tags;

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

    public static SubmitTagMiningAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTagMiningAnalysisTaskRequest self = new SubmitTagMiningAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTagMiningAnalysisTaskRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public SubmitTagMiningAnalysisTaskRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public SubmitTagMiningAnalysisTaskRequest setContents(java.util.List<String> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<String> getContents() {
        return this.contents;
    }

    public SubmitTagMiningAnalysisTaskRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SubmitTagMiningAnalysisTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitTagMiningAnalysisTaskRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public SubmitTagMiningAnalysisTaskRequest setTags(java.util.List<SubmitTagMiningAnalysisTaskRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SubmitTagMiningAnalysisTaskRequestTags> getTags() {
        return this.tags;
    }

    public SubmitTagMiningAnalysisTaskRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public SubmitTagMiningAnalysisTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class SubmitTagMiningAnalysisTaskRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("tagDefinePrompt")
        public String tagDefinePrompt;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("tagName")
        public String tagName;

        public static SubmitTagMiningAnalysisTaskRequestTags build(java.util.Map<String, ?> map) throws Exception {
            SubmitTagMiningAnalysisTaskRequestTags self = new SubmitTagMiningAnalysisTaskRequestTags();
            return TeaModel.build(map, self);
        }

        public SubmitTagMiningAnalysisTaskRequestTags setTagDefinePrompt(String tagDefinePrompt) {
            this.tagDefinePrompt = tagDefinePrompt;
            return this;
        }
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        public SubmitTagMiningAnalysisTaskRequestTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
