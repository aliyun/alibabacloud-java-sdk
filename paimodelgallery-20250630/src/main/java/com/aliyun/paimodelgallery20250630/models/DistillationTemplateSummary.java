// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class DistillationTemplateSummary extends TeaModel {
    /**
     * <p>The list of capability tags, used for scenario card display.</p>
     */
    @NameInMap("CapabilityTags")
    public java.util.List<String> capabilityTags;

    /**
     * <p>The template category. The frontend uses this value to filter scenario cards.</p>
     * 
     * <strong>example:</strong>
     * <p>reasoning</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The template description, localized based on the language specified in the request. The description specifies applicable scenarios and outputs.</p>
     * 
     * <strong>example:</strong>
     * <p>Designed for scenarios that require multi-step reasoning, such as math, logic, and code. Produces an SFT dataset</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The algorithm job type. The value is the same as TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The display order. A smaller value indicates a higher position.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OrderNumber")
    public Integer orderNumber;

    /**
     * <p>The list of pipeline stages. The order of the stages represents the execution order.</p>
     */
    @NameInMap("PipelineStages")
    public java.util.List<DistillationTemplateSummaryPipelineStages> pipelineStages;

    /**
     * <p>The distillation template ID, which is the same as the algorithm job_type. Pass this value as TemplateId when creating a task plan.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template display name, localized based on the language specified in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>Chain-of-Thought Reasoning Distillation</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The capability declaration for the second stage, in which the distilled data is used to train the student model. An empty value indicates that the template supports only the distillation stage.</p>
     */
    @NameInMap("TrainingOptions")
    public java.util.List<DistillationTemplateSummaryTrainingOptions> trainingOptions;

    public static DistillationTemplateSummary build(java.util.Map<String, ?> map) throws Exception {
        DistillationTemplateSummary self = new DistillationTemplateSummary();
        return TeaModel.build(map, self);
    }

    public DistillationTemplateSummary setCapabilityTags(java.util.List<String> capabilityTags) {
        this.capabilityTags = capabilityTags;
        return this;
    }
    public java.util.List<String> getCapabilityTags() {
        return this.capabilityTags;
    }

    public DistillationTemplateSummary setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DistillationTemplateSummary setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DistillationTemplateSummary setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DistillationTemplateSummary setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    public DistillationTemplateSummary setPipelineStages(java.util.List<DistillationTemplateSummaryPipelineStages> pipelineStages) {
        this.pipelineStages = pipelineStages;
        return this;
    }
    public java.util.List<DistillationTemplateSummaryPipelineStages> getPipelineStages() {
        return this.pipelineStages;
    }

    public DistillationTemplateSummary setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DistillationTemplateSummary setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DistillationTemplateSummary setTrainingOptions(java.util.List<DistillationTemplateSummaryTrainingOptions> trainingOptions) {
        this.trainingOptions = trainingOptions;
        return this;
    }
    public java.util.List<DistillationTemplateSummaryTrainingOptions> getTrainingOptions() {
        return this.trainingOptions;
    }

    public static class DistillationTemplateSummaryPipelineStages extends TeaModel {
        /**
         * <p>The stage description, localized based on the language specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>The teacher model generates reasoning-augmented responses for each question</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The stage identifier, which corresponds to the pipeline[].stage value in the algorithm configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>cot_distill</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The stage display name, localized based on the language specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Generate Chain-of-Thought</p>
         */
        @NameInMap("Name")
        public String name;

        public static DistillationTemplateSummaryPipelineStages build(java.util.Map<String, ?> map) throws Exception {
            DistillationTemplateSummaryPipelineStages self = new DistillationTemplateSummaryPipelineStages();
            return TeaModel.build(map, self);
        }

        public DistillationTemplateSummaryPipelineStages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DistillationTemplateSummaryPipelineStages setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DistillationTemplateSummaryPipelineStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DistillationTemplateSummaryTrainingOptions extends TeaModel {
        /**
         * <p>The available Model Gallery Task values for the student model.</p>
         */
        @NameInMap("ModelTasks")
        public java.util.List<String> modelTasks;

        /**
         * <p>The list of supported training method families.</p>
         */
        @NameInMap("TrainingMethods")
        public java.util.List<String> trainingMethods;

        /**
         * <p>The training type. The frontend uses this value to select the training workflow and display text.</p>
         * 
         * <strong>example:</strong>
         * <p>sft</p>
         */
        @NameInMap("TrainingType")
        public String trainingType;

        public static DistillationTemplateSummaryTrainingOptions build(java.util.Map<String, ?> map) throws Exception {
            DistillationTemplateSummaryTrainingOptions self = new DistillationTemplateSummaryTrainingOptions();
            return TeaModel.build(map, self);
        }

        public DistillationTemplateSummaryTrainingOptions setModelTasks(java.util.List<String> modelTasks) {
            this.modelTasks = modelTasks;
            return this;
        }
        public java.util.List<String> getModelTasks() {
            return this.modelTasks;
        }

        public DistillationTemplateSummaryTrainingOptions setTrainingMethods(java.util.List<String> trainingMethods) {
            this.trainingMethods = trainingMethods;
            return this;
        }
        public java.util.List<String> getTrainingMethods() {
            return this.trainingMethods;
        }

        public DistillationTemplateSummaryTrainingOptions setTrainingType(String trainingType) {
            this.trainingType = trainingType;
            return this;
        }
        public String getTrainingType() {
            return this.trainingType;
        }

    }

}
