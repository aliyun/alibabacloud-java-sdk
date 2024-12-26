// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GenerateOutputFormatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>clueMining</p>
     */
    @NameInMap("businessType")
    public String businessType;

    /**
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
     * <p>This parameter is required.</p>
     */
    @NameInMap("tags")
    public java.util.List<GenerateOutputFormatRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>给你一条待分析文本数据，请你按照标签体系来对数据进行打标。</p>
     */
    @NameInMap("taskDescription")
    public String taskDescription;

    public static GenerateOutputFormatRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOutputFormatRequest self = new GenerateOutputFormatRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOutputFormatRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GenerateOutputFormatRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GenerateOutputFormatRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public GenerateOutputFormatRequest setTags(java.util.List<GenerateOutputFormatRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GenerateOutputFormatRequestTags> getTags() {
        return this.tags;
    }

    public GenerateOutputFormatRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public static class GenerateOutputFormatRequestTags extends TeaModel {
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

        public static GenerateOutputFormatRequestTags build(java.util.Map<String, ?> map) throws Exception {
            GenerateOutputFormatRequestTags self = new GenerateOutputFormatRequestTags();
            return TeaModel.build(map, self);
        }

        public GenerateOutputFormatRequestTags setTagDefinePrompt(String tagDefinePrompt) {
            this.tagDefinePrompt = tagDefinePrompt;
            return this;
        }
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        public GenerateOutputFormatRequestTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
