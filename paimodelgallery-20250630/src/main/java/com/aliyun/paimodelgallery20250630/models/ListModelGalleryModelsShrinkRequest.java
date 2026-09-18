// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListModelGalleryModelsShrinkRequest extends TeaModel {
    /**
     * <p>The collection to which the model belongs. The collection for ModelGallery models is QuickStart.</p>
     * 
     * <strong>example:</strong>
     * <p>QuickStart</p>
     */
    @NameInMap("Collections")
    public String collections;

    /**
     * <p>Specifies whether model compression is supported.</p>
     */
    @NameInMap("Compressible")
    public Boolean compressible;

    /**
     * <p>The list of conditions.</p>
     */
    @NameInMap("Conditions")
    public String conditionsShrink;

    /**
     * <p>Specifies whether deep thinking is supported.</p>
     */
    @NameInMap("DeepThink")
    public Boolean deepThink;

    /**
     * <p>Specifies whether online experience is supported.</p>
     */
    @NameInMap("Demonstrable")
    public Boolean demonstrable;

    /**
     * <p>Specifies whether deployment is supported.</p>
     */
    @NameInMap("Deployable")
    public Boolean deployable;

    /**
     * <p>Specifies whether distillation is supported.</p>
     */
    @NameInMap("Distillable")
    public Boolean distillable;

    /**
     * <p>The domain used to filter the model list. For example, aigc (generative AI), nlp (natural language processing), or cv (computer vision).</p>
     * 
     * <strong>example:</strong>
     * <p>aigc</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Specifies whether evaluation is supported.</p>
     */
    @NameInMap("Evaluable")
    public Boolean evaluable;

    /**
     * <p>Specifies whether FunctionCall is supported.</p>
     */
    @NameInMap("FunctionCall")
    public Boolean functionCall;

    /**
     * <p>The model name. By default, fuzzy match is used to filter the model list. Enclose the name in double quotation marks for exact match. For example, &quot;DeepSeek-V3.2&quot; exactly matches the model DeepSeek-V3.2.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-235B-A22B-Thinking-2507</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model series. For example, PAI Optimized Model, Qwen, Wan-AI, GLM, Baichuan, DeepSeek, Kimi, MiniMax, Yi, InternLM, InternVL, OpenAI, NVIDIA, Gemma, Phi, dots_vlm, Llama, Mistral, Stable Diffusion, FLUX, Byte Dance, StepFun AI, ERNIE Bot, Tencent Hunyuan, or YOLO.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen</p>
     */
    @NameInMap("ModelSeries")
    public String modelSeries;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>Endpoint</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The sort order for the specified sort field in a paged query. Default value: ASC.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ASC: ascending order.</li>
     * <li>DESC: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The model source used to filter models that belong to a specific community or organization. For example, ModelScope, PAI, or NIM.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelScope</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The page number of the model list. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of models to display on each page in a paged query. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query condition. Fuzzy match is performed across multiple fields such as ModelName, Domain, and Task.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The sort field for a paged query. Currently, the GmtCreateTime field is used for sorting. Valid values:</p>
     * <ul>
     * <li><p>GmtCreateTime: the model creation time.</p>
     * </li>
     * <li><p>GmtLatestVersionModified: the time when the latest model version was updated.</p>
     * </li>
     * <li><p>OrderNumber: the ordinal number.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The supported compression resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support compression on GP7V resources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedCompressionResource")
    public String supportedCompressionResource;

    /**
     * <p>The supported distillation resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support distillation on GP7V resources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedDistillationResource")
    public String supportedDistillationResource;

    /**
     * <p>The supported evaluation resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support evaluation on GP7V resources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedEvaluationResource")
    public String supportedEvaluationResource;

    /**
     * <p>The supported deployment resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support deployment on GP7V resources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedInferenceResource")
    public String supportedInferenceResource;

    /**
     * <p>The supported training resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support training on GP7V resources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedTrainingResource")
    public String supportedTrainingResource;

    /**
     * <p>The list of labels.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>The task. For example, large-language-model (large language model), image-classification (image classification), or embedding.</p>
     * 
     * <strong>example:</strong>
     * <p>large-language-model</p>
     */
    @NameInMap("Task")
    public String task;

    /**
     * <p>Specifies whether training is supported.</p>
     */
    @NameInMap("Trainable")
    public Boolean trainable;

    public static ListModelGalleryModelsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelGalleryModelsShrinkRequest self = new ListModelGalleryModelsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListModelGalleryModelsShrinkRequest setCollections(String collections) {
        this.collections = collections;
        return this;
    }
    public String getCollections() {
        return this.collections;
    }

    public ListModelGalleryModelsShrinkRequest setCompressible(Boolean compressible) {
        this.compressible = compressible;
        return this;
    }
    public Boolean getCompressible() {
        return this.compressible;
    }

    public ListModelGalleryModelsShrinkRequest setConditionsShrink(String conditionsShrink) {
        this.conditionsShrink = conditionsShrink;
        return this;
    }
    public String getConditionsShrink() {
        return this.conditionsShrink;
    }

    public ListModelGalleryModelsShrinkRequest setDeepThink(Boolean deepThink) {
        this.deepThink = deepThink;
        return this;
    }
    public Boolean getDeepThink() {
        return this.deepThink;
    }

    public ListModelGalleryModelsShrinkRequest setDemonstrable(Boolean demonstrable) {
        this.demonstrable = demonstrable;
        return this;
    }
    public Boolean getDemonstrable() {
        return this.demonstrable;
    }

    public ListModelGalleryModelsShrinkRequest setDeployable(Boolean deployable) {
        this.deployable = deployable;
        return this;
    }
    public Boolean getDeployable() {
        return this.deployable;
    }

    public ListModelGalleryModelsShrinkRequest setDistillable(Boolean distillable) {
        this.distillable = distillable;
        return this;
    }
    public Boolean getDistillable() {
        return this.distillable;
    }

    public ListModelGalleryModelsShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListModelGalleryModelsShrinkRequest setEvaluable(Boolean evaluable) {
        this.evaluable = evaluable;
        return this;
    }
    public Boolean getEvaluable() {
        return this.evaluable;
    }

    public ListModelGalleryModelsShrinkRequest setFunctionCall(Boolean functionCall) {
        this.functionCall = functionCall;
        return this;
    }
    public Boolean getFunctionCall() {
        return this.functionCall;
    }

    public ListModelGalleryModelsShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListModelGalleryModelsShrinkRequest setModelSeries(String modelSeries) {
        this.modelSeries = modelSeries;
        return this;
    }
    public String getModelSeries() {
        return this.modelSeries;
    }

    public ListModelGalleryModelsShrinkRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListModelGalleryModelsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelGalleryModelsShrinkRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ListModelGalleryModelsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelGalleryModelsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelGalleryModelsShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListModelGalleryModelsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListModelGalleryModelsShrinkRequest setSupportedCompressionResource(String supportedCompressionResource) {
        this.supportedCompressionResource = supportedCompressionResource;
        return this;
    }
    public String getSupportedCompressionResource() {
        return this.supportedCompressionResource;
    }

    public ListModelGalleryModelsShrinkRequest setSupportedDistillationResource(String supportedDistillationResource) {
        this.supportedDistillationResource = supportedDistillationResource;
        return this;
    }
    public String getSupportedDistillationResource() {
        return this.supportedDistillationResource;
    }

    public ListModelGalleryModelsShrinkRequest setSupportedEvaluationResource(String supportedEvaluationResource) {
        this.supportedEvaluationResource = supportedEvaluationResource;
        return this;
    }
    public String getSupportedEvaluationResource() {
        return this.supportedEvaluationResource;
    }

    public ListModelGalleryModelsShrinkRequest setSupportedInferenceResource(String supportedInferenceResource) {
        this.supportedInferenceResource = supportedInferenceResource;
        return this;
    }
    public String getSupportedInferenceResource() {
        return this.supportedInferenceResource;
    }

    public ListModelGalleryModelsShrinkRequest setSupportedTrainingResource(String supportedTrainingResource) {
        this.supportedTrainingResource = supportedTrainingResource;
        return this;
    }
    public String getSupportedTrainingResource() {
        return this.supportedTrainingResource;
    }

    public ListModelGalleryModelsShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public ListModelGalleryModelsShrinkRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public ListModelGalleryModelsShrinkRequest setTrainable(Boolean trainable) {
        this.trainable = trainable;
        return this;
    }
    public Boolean getTrainable() {
        return this.trainable;
    }

}
