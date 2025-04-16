// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunEnterpriseVocAnalysisShrinkRequest extends TeaModel {
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
    public String filterTagsShrink;

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

    /**
     * <p>业务标签体系，用于对文本内容进行分类和分析。</p>
     */
    @NameInMap("tags")
    public String tagsShrink;

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

    public static RunEnterpriseVocAnalysisShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunEnterpriseVocAnalysisShrinkRequest self = new RunEnterpriseVocAnalysisShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunEnterpriseVocAnalysisShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RunEnterpriseVocAnalysisShrinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RunEnterpriseVocAnalysisShrinkRequest setFilterTagsShrink(String filterTagsShrink) {
        this.filterTagsShrink = filterTagsShrink;
        return this;
    }
    public String getFilterTagsShrink() {
        return this.filterTagsShrink;
    }

    public RunEnterpriseVocAnalysisShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunEnterpriseVocAnalysisShrinkRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public RunEnterpriseVocAnalysisShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public RunEnterpriseVocAnalysisShrinkRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

}
