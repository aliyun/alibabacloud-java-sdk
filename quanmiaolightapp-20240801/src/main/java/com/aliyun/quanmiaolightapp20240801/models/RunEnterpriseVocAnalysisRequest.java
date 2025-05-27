// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunEnterpriseVocAnalysisRequest extends TeaModel {
    @NameInMap("akProxy")
    public String akProxy;

    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>需要进行VOC分析的文本内容（content、contents、url、fileKey 四选一。优先级从小到大）</p>
     * 
     * <strong>example:</strong>
     * <p>这是一段需要分析的文本内容</p>
     */
    @NameInMap("content")
    public String content;

    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <p>过滤标签，用于筛选符合条件的内容。</p>
     */
    @NameInMap("filterTags")
    public java.util.List<RunEnterpriseVocAnalysisRequestFilterTags> filterTags;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>指定返回结果的格式，支持json或text</p>
     * 
     * <strong>example:</strong>
     * <p>按照如下格式输出：{&quot;text1&quot;: &quot;xxxx&quot;, &quot;text2&quot;: &quot;xxxx&quot;}</p>
     */
    @NameInMap("outputFormat")
    public String outputFormat;

    @NameInMap("sourceTrace")
    public Boolean sourceTrace;

    /**
     * <p>业务标签体系，用于对文本内容进行分类和分析。</p>
     */
    @NameInMap("tags")
    public java.util.List<RunEnterpriseVocAnalysisRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>你是一名经验丰富的数据分析师，擅长从文本评论中提取结构化信息。你需要从用户评论列表中识别和提取出与以下四个维度相关的关键词和短语：</p>
     * <pre><code>        索引：输入评论JSON数组中的索引（从零开始）表示针对该条索引抽取的维度。
     *         购买动机：描述用户购买产品的原因、需求或驱动力的关键词或短语。
     *         未满足需求点：用户在使用产品过程中提到的未满足需求或问题的关键词或短语。
     *         使用场景：用户提到的具体使用场景、使用方式或环境的关键词或短语。
     *         正负面观点：明确表示用户对产品或服务的正面或负面看法的关键词或短语。
     * </code></pre>
     */
    @NameInMap("taskDescription")
    public String taskDescription;

    public static RunEnterpriseVocAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunEnterpriseVocAnalysisRequest self = new RunEnterpriseVocAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunEnterpriseVocAnalysisRequest setAkProxy(String akProxy) {
        this.akProxy = akProxy;
        return this;
    }
    public String getAkProxy() {
        return this.akProxy;
    }

    public RunEnterpriseVocAnalysisRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public RunEnterpriseVocAnalysisRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RunEnterpriseVocAnalysisRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RunEnterpriseVocAnalysisRequest setFilterTags(java.util.List<RunEnterpriseVocAnalysisRequestFilterTags> filterTags) {
        this.filterTags = filterTags;
        return this;
    }
    public java.util.List<RunEnterpriseVocAnalysisRequestFilterTags> getFilterTags() {
        return this.filterTags;
    }

    public RunEnterpriseVocAnalysisRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunEnterpriseVocAnalysisRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public RunEnterpriseVocAnalysisRequest setSourceTrace(Boolean sourceTrace) {
        this.sourceTrace = sourceTrace;
        return this;
    }
    public Boolean getSourceTrace() {
        return this.sourceTrace;
    }

    public RunEnterpriseVocAnalysisRequest setTags(java.util.List<RunEnterpriseVocAnalysisRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<RunEnterpriseVocAnalysisRequestTags> getTags() {
        return this.tags;
    }

    public RunEnterpriseVocAnalysisRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public static class RunEnterpriseVocAnalysisRequestFilterTags extends TeaModel {
        /**
         * <p>标签定义提示词</p>
         * 
         * <strong>example:</strong>
         * <p>标签定义提示词</p>
         */
        @NameInMap("tagDefinePrompt")
        public String tagDefinePrompt;

        /**
         * <p>标签名称</p>
         * 
         * <strong>example:</strong>
         * <p>标签名称</p>
         */
        @NameInMap("tagName")
        public String tagName;

        public static RunEnterpriseVocAnalysisRequestFilterTags build(java.util.Map<String, ?> map) throws Exception {
            RunEnterpriseVocAnalysisRequestFilterTags self = new RunEnterpriseVocAnalysisRequestFilterTags();
            return TeaModel.build(map, self);
        }

        public RunEnterpriseVocAnalysisRequestFilterTags setTagDefinePrompt(String tagDefinePrompt) {
            this.tagDefinePrompt = tagDefinePrompt;
            return this;
        }
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        public RunEnterpriseVocAnalysisRequestFilterTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class RunEnterpriseVocAnalysisRequestTags extends TeaModel {
        /**
         * <p>标签定义提示词</p>
         * 
         * <strong>example:</strong>
         * <p>标签定义提示词</p>
         */
        @NameInMap("tagDefinePrompt")
        public String tagDefinePrompt;

        /**
         * <p>标签名称</p>
         * 
         * <strong>example:</strong>
         * <p>标签名称</p>
         */
        @NameInMap("tagName")
        public String tagName;

        public static RunEnterpriseVocAnalysisRequestTags build(java.util.Map<String, ?> map) throws Exception {
            RunEnterpriseVocAnalysisRequestTags self = new RunEnterpriseVocAnalysisRequestTags();
            return TeaModel.build(map, self);
        }

        public RunEnterpriseVocAnalysisRequestTags setTagDefinePrompt(String tagDefinePrompt) {
            this.tagDefinePrompt = tagDefinePrompt;
            return this;
        }
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        public RunEnterpriseVocAnalysisRequestTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
