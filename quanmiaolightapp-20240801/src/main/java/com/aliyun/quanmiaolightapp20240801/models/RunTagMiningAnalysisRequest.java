// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunTagMiningAnalysisRequest extends TeaModel {
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>clueMining</p>
     */
    @NameInMap("businessType")
    public String businessType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>待分析文本</p>
     */
    @NameInMap("content")
    public String content;

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
    public java.util.List<RunTagMiningAnalysisRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>给你一条待分析文本数据，请你按照标签体系来对数据进行打标。</p>
     */
    @NameInMap("taskDescription")
    public String taskDescription;

    public static RunTagMiningAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTagMiningAnalysisRequest self = new RunTagMiningAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunTagMiningAnalysisRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public RunTagMiningAnalysisRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public RunTagMiningAnalysisRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RunTagMiningAnalysisRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RunTagMiningAnalysisRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunTagMiningAnalysisRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public RunTagMiningAnalysisRequest setTags(java.util.List<RunTagMiningAnalysisRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<RunTagMiningAnalysisRequestTags> getTags() {
        return this.tags;
    }

    public RunTagMiningAnalysisRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public static class RunTagMiningAnalysisRequestTags extends TeaModel {
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

        public static RunTagMiningAnalysisRequestTags build(java.util.Map<String, ?> map) throws Exception {
            RunTagMiningAnalysisRequestTags self = new RunTagMiningAnalysisRequestTags();
            return TeaModel.build(map, self);
        }

        public RunTagMiningAnalysisRequestTags setTagDefinePrompt(String tagDefinePrompt) {
            this.tagDefinePrompt = tagDefinePrompt;
            return this;
        }
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        public RunTagMiningAnalysisRequestTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
