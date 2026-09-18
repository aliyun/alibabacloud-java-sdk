// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListModelGalleryModelsRequest extends TeaModel {
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
    public java.util.List<ListModelGalleryModelsRequestConditions> conditions;

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
    public java.util.List<ListModelGalleryModelsRequestTag> tag;

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

    public static ListModelGalleryModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelGalleryModelsRequest self = new ListModelGalleryModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelGalleryModelsRequest setCollections(String collections) {
        this.collections = collections;
        return this;
    }
    public String getCollections() {
        return this.collections;
    }

    public ListModelGalleryModelsRequest setCompressible(Boolean compressible) {
        this.compressible = compressible;
        return this;
    }
    public Boolean getCompressible() {
        return this.compressible;
    }

    public ListModelGalleryModelsRequest setConditions(java.util.List<ListModelGalleryModelsRequestConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<ListModelGalleryModelsRequestConditions> getConditions() {
        return this.conditions;
    }

    public ListModelGalleryModelsRequest setDeepThink(Boolean deepThink) {
        this.deepThink = deepThink;
        return this;
    }
    public Boolean getDeepThink() {
        return this.deepThink;
    }

    public ListModelGalleryModelsRequest setDemonstrable(Boolean demonstrable) {
        this.demonstrable = demonstrable;
        return this;
    }
    public Boolean getDemonstrable() {
        return this.demonstrable;
    }

    public ListModelGalleryModelsRequest setDeployable(Boolean deployable) {
        this.deployable = deployable;
        return this;
    }
    public Boolean getDeployable() {
        return this.deployable;
    }

    public ListModelGalleryModelsRequest setDistillable(Boolean distillable) {
        this.distillable = distillable;
        return this;
    }
    public Boolean getDistillable() {
        return this.distillable;
    }

    public ListModelGalleryModelsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListModelGalleryModelsRequest setEvaluable(Boolean evaluable) {
        this.evaluable = evaluable;
        return this;
    }
    public Boolean getEvaluable() {
        return this.evaluable;
    }

    public ListModelGalleryModelsRequest setFunctionCall(Boolean functionCall) {
        this.functionCall = functionCall;
        return this;
    }
    public Boolean getFunctionCall() {
        return this.functionCall;
    }

    public ListModelGalleryModelsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListModelGalleryModelsRequest setModelSeries(String modelSeries) {
        this.modelSeries = modelSeries;
        return this;
    }
    public String getModelSeries() {
        return this.modelSeries;
    }

    public ListModelGalleryModelsRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListModelGalleryModelsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelGalleryModelsRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ListModelGalleryModelsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelGalleryModelsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelGalleryModelsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListModelGalleryModelsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListModelGalleryModelsRequest setSupportedCompressionResource(String supportedCompressionResource) {
        this.supportedCompressionResource = supportedCompressionResource;
        return this;
    }
    public String getSupportedCompressionResource() {
        return this.supportedCompressionResource;
    }

    public ListModelGalleryModelsRequest setSupportedDistillationResource(String supportedDistillationResource) {
        this.supportedDistillationResource = supportedDistillationResource;
        return this;
    }
    public String getSupportedDistillationResource() {
        return this.supportedDistillationResource;
    }

    public ListModelGalleryModelsRequest setSupportedEvaluationResource(String supportedEvaluationResource) {
        this.supportedEvaluationResource = supportedEvaluationResource;
        return this;
    }
    public String getSupportedEvaluationResource() {
        return this.supportedEvaluationResource;
    }

    public ListModelGalleryModelsRequest setSupportedInferenceResource(String supportedInferenceResource) {
        this.supportedInferenceResource = supportedInferenceResource;
        return this;
    }
    public String getSupportedInferenceResource() {
        return this.supportedInferenceResource;
    }

    public ListModelGalleryModelsRequest setSupportedTrainingResource(String supportedTrainingResource) {
        this.supportedTrainingResource = supportedTrainingResource;
        return this;
    }
    public String getSupportedTrainingResource() {
        return this.supportedTrainingResource;
    }

    public ListModelGalleryModelsRequest setTag(java.util.List<ListModelGalleryModelsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListModelGalleryModelsRequestTag> getTag() {
        return this.tag;
    }

    public ListModelGalleryModelsRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public ListModelGalleryModelsRequest setTrainable(Boolean trainable) {
        this.trainable = trainable;
        return this;
    }
    public Boolean getTrainable() {
        return this.trainable;
    }

    public static class ListModelGalleryModelsRequestConditions extends TeaModel {
        /**
         * <p>The parameter name. ParameterSize is supported. Unit: M.</p>
         * 
         * <strong>example:</strong>
         * <p>ParameterSize</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The operator. For example, LessThan.</p>
         * 
         * <strong>example:</strong>
         * <p>LessThan</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value. If Column is set to ParameterSize, the value is an integer. Unit: M.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListModelGalleryModelsRequestConditions build(java.util.Map<String, ?> map) throws Exception {
            ListModelGalleryModelsRequestConditions self = new ListModelGalleryModelsRequestConditions();
            return TeaModel.build(map, self);
        }

        public ListModelGalleryModelsRequestConditions setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public ListModelGalleryModelsRequestConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListModelGalleryModelsRequestConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListModelGalleryModelsRequestTag extends TeaModel {
        /**
         * <p>The label key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The label value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListModelGalleryModelsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListModelGalleryModelsRequestTag self = new ListModelGalleryModelsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListModelGalleryModelsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListModelGalleryModelsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
