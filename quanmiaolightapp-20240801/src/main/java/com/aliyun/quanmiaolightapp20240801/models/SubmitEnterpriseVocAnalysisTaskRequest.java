// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseVocAnalysisTaskRequest extends TeaModel {
    @NameInMap("contents")
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestContents> contents;

    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <strong>example:</strong>
     * <p>oss://default/aimiaobi-service-prod/aimiaobi/temp/public/government_service_experience_feedback_summary.txt</p>
     */
    @NameInMap("fileKey")
    public String fileKey;

    @NameInMap("filterTags")
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestFilterTags> filterTags;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    @NameInMap("outputFormat")
    public String outputFormat;

    @NameInMap("tags")
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestTags> tags;

    @NameInMap("taskDescription")
    public String taskDescription;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxxx.txt">http://www.example.com/xxxx.txt</a></p>
     */
    @NameInMap("url")
    public String url;

    public static SubmitEnterpriseVocAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEnterpriseVocAnalysisTaskRequest self = new SubmitEnterpriseVocAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setContents(java.util.List<SubmitEnterpriseVocAnalysisTaskRequestContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestContents> getContents() {
        return this.contents;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setFilterTags(java.util.List<SubmitEnterpriseVocAnalysisTaskRequestFilterTags> filterTags) {
        this.filterTags = filterTags;
        return this;
    }
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestFilterTags> getFilterTags() {
        return this.filterTags;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setTags(java.util.List<SubmitEnterpriseVocAnalysisTaskRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestTags> getTags() {
        return this.tags;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class SubmitEnterpriseVocAnalysisTaskRequestContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>id-xxxxx</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("text")
        public String text;

        public static SubmitEnterpriseVocAnalysisTaskRequestContents build(java.util.Map<String, ?> map) throws Exception {
            SubmitEnterpriseVocAnalysisTaskRequestContents self = new SubmitEnterpriseVocAnalysisTaskRequestContents();
            return TeaModel.build(map, self);
        }

        public SubmitEnterpriseVocAnalysisTaskRequestContents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestContents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class SubmitEnterpriseVocAnalysisTaskRequestFilterTags extends TeaModel {
        @NameInMap("tagDefinePrompt")
        public String tagDefinePrompt;

        @NameInMap("tagName")
        public String tagName;

        public static SubmitEnterpriseVocAnalysisTaskRequestFilterTags build(java.util.Map<String, ?> map) throws Exception {
            SubmitEnterpriseVocAnalysisTaskRequestFilterTags self = new SubmitEnterpriseVocAnalysisTaskRequestFilterTags();
            return TeaModel.build(map, self);
        }

        public SubmitEnterpriseVocAnalysisTaskRequestFilterTags setTagDefinePrompt(String tagDefinePrompt) {
            this.tagDefinePrompt = tagDefinePrompt;
            return this;
        }
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestFilterTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class SubmitEnterpriseVocAnalysisTaskRequestTags extends TeaModel {
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

        public static SubmitEnterpriseVocAnalysisTaskRequestTags build(java.util.Map<String, ?> map) throws Exception {
            SubmitEnterpriseVocAnalysisTaskRequestTags self = new SubmitEnterpriseVocAnalysisTaskRequestTags();
            return TeaModel.build(map, self);
        }

        public SubmitEnterpriseVocAnalysisTaskRequestTags setTagDefinePrompt(String tagDefinePrompt) {
            this.tagDefinePrompt = tagDefinePrompt;
            return this;
        }
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
