// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListModelGalleryModelsShrinkRequest extends TeaModel {
    @NameInMap("Collections")
    public String collections;

    @NameInMap("Compressible")
    public Boolean compressible;

    @NameInMap("Conditions")
    public String conditionsShrink;

    @NameInMap("DeepThink")
    public Boolean deepThink;

    @NameInMap("Demonstrable")
    public Boolean demonstrable;

    @NameInMap("Deployable")
    public Boolean deployable;

    @NameInMap("Distillable")
    public Boolean distillable;

    /**
     * <strong>example:</strong>
     * <p>Distillation</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Evaluable")
    public Boolean evaluable;

    @NameInMap("FunctionCall")
    public Boolean functionCall;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("ModelSeries")
    public String modelSeries;

    @NameInMap("ModelType")
    public String modelType;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

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

    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SupportedCompressionResource")
    public String supportedCompressionResource;

    @NameInMap("SupportedDistillationResource")
    public String supportedDistillationResource;

    @NameInMap("SupportedEvaluationResource")
    public String supportedEvaluationResource;

    @NameInMap("SupportedInferenceResource")
    public String supportedInferenceResource;

    @NameInMap("SupportedTrainingResource")
    public String supportedTrainingResource;

    @NameInMap("Tag")
    public String tagShrink;

    @NameInMap("Task")
    public String task;

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
