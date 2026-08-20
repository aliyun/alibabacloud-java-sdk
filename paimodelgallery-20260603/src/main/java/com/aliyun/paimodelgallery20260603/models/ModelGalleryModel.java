// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class ModelGalleryModel extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>QuickStart</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Compressible")
    public Boolean compressible;

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
     * <p>{}</p>
     */
    @NameInMap("ExtraInfo")
    public java.util.Map<String, ?> extraInfo;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FunctionCall")
    public Boolean functionCall;

    /**
     * <strong>example:</strong>
     * <p>2026-04-03T05:54:02.000Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2025-12-03T07:21:28.000Z</p>
     */
    @NameInMap("GmtLatestVersionModified")
    public String gmtLatestVersionModified;

    /**
     * <strong>example:</strong>
     * <p>2026-04-03T05:54:02.000Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("LatestVersionName")
    public String latestVersionName;

    /**
     * <strong>example:</strong>
     * <p>大语言模型。</p>
     */
    @NameInMap("ModelDescription")
    public String modelDescription;

    /**
     * <strong>example:</strong>
     * <p><a href="http://pai-quickstart-test.com">http://pai-quickstart-test.com</a></p>
     */
    @NameInMap("ModelDoc")
    public String modelDoc;

    /**
     * <strong>example:</strong>
     * <p>model-gj5mifpeol92kx619y</p>
     */
    @NameInMap("ModelId")
    public String modelId;

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
     * <p>1</p>
     */
    @NameInMap("OrderNumber")
    public Long orderNumber;

    /**
     * <strong>example:</strong>
     * <p>PAI</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("ParameterSize")
    public Long parameterSize;

    /**
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("SearchWords")
    public String searchWords;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;Methods&quot;: [{
     *     &quot;Method&quot;: &quot;Quantization&quot;,
     *     &quot;SubMethod&quot;: &quot;MinMax-8Bit&quot;,
     *     &quot;Resource&quot;: &quot;GPU&quot;
     *   }]
     * }</p>
     */
    @NameInMap("SupportedCompressionMethods")
    public java.util.Map<String, ?> supportedCompressionMethods;

    /**
     * <strong>example:</strong>
     * <p>GPU,GP7V</p>
     */
    @NameInMap("SupportedCompressionResources")
    public String supportedCompressionResources;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;Methods&quot;: [{
     *     &quot;Method&quot;: &quot;EasyDistill&quot;,
     *     &quot;SubMethod&quot;: &quot;DataSynthesis&quot;,
     *     &quot;Resource&quot;: &quot;GPU&quot;
     *   }]
     * }</p>
     */
    @NameInMap("SupportedDistillationMethods")
    public java.util.Map<String, ?> supportedDistillationMethods;

    /**
     * <strong>example:</strong>
     * <p>GPU,GP7V</p>
     */
    @NameInMap("SupportedDistillationResources")
    public String supportedDistillationResources;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;Methods&quot;: [{
     *     &quot;Method&quot;: &quot;Single-Node-Standard&quot;,
     *     &quot;Resource&quot;: &quot;GPU&quot;
     *   }]
     * }</p>
     */
    @NameInMap("SupportedEvaluationMethods")
    public java.util.Map<String, ?> supportedEvaluationMethods;

    /**
     * <strong>example:</strong>
     * <p>GPU,GP7V</p>
     */
    @NameInMap("SupportedEvaluationResources")
    public String supportedEvaluationResources;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;Methods&quot;: [{
     *     &quot;framework&quot;: &quot;blade&quot;,
     *     &quot;scenario&quot;: &quot;nvidia-standard&quot;,
     *     &quot;Resource&quot;: &quot;GPU&quot;
     *   }]
     * }</p>
     */
    @NameInMap("SupportedInferenceMethods")
    public java.util.Map<String, ?> supportedInferenceMethods;

    /**
     * <strong>example:</strong>
     * <p>GPU,GP7V</p>
     */
    @NameInMap("SupportedInferenceResources")
    public String supportedInferenceResources;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;Methods&quot;: [{
     *     &quot;Method&quot;: &quot;SFT&quot;,
     *     &quot;SubMethod&quot;: &quot;LoRA_LLM&quot;,
     *     &quot;Resource&quot;: &quot;GPU&quot;
     *   }]
     * }</p>
     */
    @NameInMap("SupportedTrainingMethods")
    public java.util.Map<String, ?> supportedTrainingMethods;

    /**
     * <strong>example:</strong>
     * <p>GPU,GP7V</p>
     */
    @NameInMap("SupportedTrainingResources")
    public String supportedTrainingResources;

    @NameInMap("Tags")
    public ModelGalleryModelTags tags;

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

    public static ModelGalleryModel build(java.util.Map<String, ?> map) throws Exception {
        ModelGalleryModel self = new ModelGalleryModel();
        return TeaModel.build(map, self);
    }

    public ModelGalleryModel setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public ModelGalleryModel setCompressible(Boolean compressible) {
        this.compressible = compressible;
        return this;
    }
    public Boolean getCompressible() {
        return this.compressible;
    }

    public ModelGalleryModel setDeepThink(Boolean deepThink) {
        this.deepThink = deepThink;
        return this;
    }
    public Boolean getDeepThink() {
        return this.deepThink;
    }

    public ModelGalleryModel setDemonstrable(Boolean demonstrable) {
        this.demonstrable = demonstrable;
        return this;
    }
    public Boolean getDemonstrable() {
        return this.demonstrable;
    }

    public ModelGalleryModel setDeployable(Boolean deployable) {
        this.deployable = deployable;
        return this;
    }
    public Boolean getDeployable() {
        return this.deployable;
    }

    public ModelGalleryModel setDistillable(Boolean distillable) {
        this.distillable = distillable;
        return this;
    }
    public Boolean getDistillable() {
        return this.distillable;
    }

    public ModelGalleryModel setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModelGalleryModel setEvaluable(Boolean evaluable) {
        this.evaluable = evaluable;
        return this;
    }
    public Boolean getEvaluable() {
        return this.evaluable;
    }

    public ModelGalleryModel setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public ModelGalleryModel setFunctionCall(Boolean functionCall) {
        this.functionCall = functionCall;
        return this;
    }
    public Boolean getFunctionCall() {
        return this.functionCall;
    }

    public ModelGalleryModel setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public ModelGalleryModel setGmtLatestVersionModified(String gmtLatestVersionModified) {
        this.gmtLatestVersionModified = gmtLatestVersionModified;
        return this;
    }
    public String getGmtLatestVersionModified() {
        return this.gmtLatestVersionModified;
    }

    public ModelGalleryModel setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public ModelGalleryModel setLatestVersionName(String latestVersionName) {
        this.latestVersionName = latestVersionName;
        return this;
    }
    public String getLatestVersionName() {
        return this.latestVersionName;
    }

    public ModelGalleryModel setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }
    public String getModelDescription() {
        return this.modelDescription;
    }

    public ModelGalleryModel setModelDoc(String modelDoc) {
        this.modelDoc = modelDoc;
        return this;
    }
    public String getModelDoc() {
        return this.modelDoc;
    }

    public ModelGalleryModel setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ModelGalleryModel setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModelGalleryModel setModelSeries(String modelSeries) {
        this.modelSeries = modelSeries;
        return this;
    }
    public String getModelSeries() {
        return this.modelSeries;
    }

    public ModelGalleryModel setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModelGalleryModel setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    public ModelGalleryModel setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ModelGalleryModel setParameterSize(Long parameterSize) {
        this.parameterSize = parameterSize;
        return this;
    }
    public Long getParameterSize() {
        return this.parameterSize;
    }

    public ModelGalleryModel setSearchWords(String searchWords) {
        this.searchWords = searchWords;
        return this;
    }
    public String getSearchWords() {
        return this.searchWords;
    }

    public ModelGalleryModel setSupportedCompressionMethods(java.util.Map<String, ?> supportedCompressionMethods) {
        this.supportedCompressionMethods = supportedCompressionMethods;
        return this;
    }
    public java.util.Map<String, ?> getSupportedCompressionMethods() {
        return this.supportedCompressionMethods;
    }

    public ModelGalleryModel setSupportedCompressionResources(String supportedCompressionResources) {
        this.supportedCompressionResources = supportedCompressionResources;
        return this;
    }
    public String getSupportedCompressionResources() {
        return this.supportedCompressionResources;
    }

    public ModelGalleryModel setSupportedDistillationMethods(java.util.Map<String, ?> supportedDistillationMethods) {
        this.supportedDistillationMethods = supportedDistillationMethods;
        return this;
    }
    public java.util.Map<String, ?> getSupportedDistillationMethods() {
        return this.supportedDistillationMethods;
    }

    public ModelGalleryModel setSupportedDistillationResources(String supportedDistillationResources) {
        this.supportedDistillationResources = supportedDistillationResources;
        return this;
    }
    public String getSupportedDistillationResources() {
        return this.supportedDistillationResources;
    }

    public ModelGalleryModel setSupportedEvaluationMethods(java.util.Map<String, ?> supportedEvaluationMethods) {
        this.supportedEvaluationMethods = supportedEvaluationMethods;
        return this;
    }
    public java.util.Map<String, ?> getSupportedEvaluationMethods() {
        return this.supportedEvaluationMethods;
    }

    public ModelGalleryModel setSupportedEvaluationResources(String supportedEvaluationResources) {
        this.supportedEvaluationResources = supportedEvaluationResources;
        return this;
    }
    public String getSupportedEvaluationResources() {
        return this.supportedEvaluationResources;
    }

    public ModelGalleryModel setSupportedInferenceMethods(java.util.Map<String, ?> supportedInferenceMethods) {
        this.supportedInferenceMethods = supportedInferenceMethods;
        return this;
    }
    public java.util.Map<String, ?> getSupportedInferenceMethods() {
        return this.supportedInferenceMethods;
    }

    public ModelGalleryModel setSupportedInferenceResources(String supportedInferenceResources) {
        this.supportedInferenceResources = supportedInferenceResources;
        return this;
    }
    public String getSupportedInferenceResources() {
        return this.supportedInferenceResources;
    }

    public ModelGalleryModel setSupportedTrainingMethods(java.util.Map<String, ?> supportedTrainingMethods) {
        this.supportedTrainingMethods = supportedTrainingMethods;
        return this;
    }
    public java.util.Map<String, ?> getSupportedTrainingMethods() {
        return this.supportedTrainingMethods;
    }

    public ModelGalleryModel setSupportedTrainingResources(String supportedTrainingResources) {
        this.supportedTrainingResources = supportedTrainingResources;
        return this;
    }
    public String getSupportedTrainingResources() {
        return this.supportedTrainingResources;
    }

    public ModelGalleryModel setTags(ModelGalleryModelTags tags) {
        this.tags = tags;
        return this;
    }
    public ModelGalleryModelTags getTags() {
        return this.tags;
    }

    public ModelGalleryModel setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public ModelGalleryModel setTrainable(Boolean trainable) {
        this.trainable = trainable;
        return this;
    }
    public Boolean getTrainable() {
        return this.trainable;
    }

    public static class ModelGalleryModelTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModelGalleryModelTags build(java.util.Map<String, ?> map) throws Exception {
            ModelGalleryModelTags self = new ModelGalleryModelTags();
            return TeaModel.build(map, self);
        }

        public ModelGalleryModelTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModelGalleryModelTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
