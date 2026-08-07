// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class ListModelGalleryModelsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>QuickStart</p>
     */
    @NameInMap("Collections")
    public String collections;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Compressible")
    public Boolean compressible;

    @NameInMap("Conditions")
    public String conditionsShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeepThink")
    public Boolean deepThink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Demonstrable")
    public Boolean demonstrable;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Deployable")
    public Boolean deployable;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Distillable")
    public Boolean distillable;

    /**
     * <strong>example:</strong>
     * <p>aigc</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Evaluable")
    public Boolean evaluable;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FunctionCall")
    public Boolean functionCall;

    /**
     * <strong>example:</strong>
     * <p>Qwen3-235B-A22B-Thinking-2507</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <strong>example:</strong>
     * <p>Qwen</p>
     */
    @NameInMap("ModelSeries")
    public String modelSeries;

    /**
     * <strong>example:</strong>
     * <p>LoRA</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>ModelScope</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>Qwen</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedCompressionResource")
    public String supportedCompressionResource;

    /**
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedDistillationResource")
    public String supportedDistillationResource;

    /**
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedEvaluationResource")
    public String supportedEvaluationResource;

    /**
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedInferenceResource")
    public String supportedInferenceResource;

    /**
     * <strong>example:</strong>
     * <p>GP7V</p>
     */
    @NameInMap("SupportedTrainingResource")
    public String supportedTrainingResource;

    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <strong>example:</strong>
     * <p>large-language-model</p>
     */
    @NameInMap("Task")
    public String task;

    /**
     * <strong>example:</strong>
     * <p>true</p>
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
