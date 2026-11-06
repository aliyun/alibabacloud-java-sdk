// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class DistillationTemplateSummary extends TeaModel {
    @NameInMap("CapabilityTags")
    public java.util.List<String> capabilityTags;

    /**
     * <strong>example:</strong>
     * <p>reasoning</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>面向数学、逻辑、代码等需要多步推理的场景，产出 SFT 数据集。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OrderNumber")
    public Integer orderNumber;

    @NameInMap("PipelineStages")
    public java.util.List<DistillationTemplateSummaryPipelineStages> pipelineStages;

    /**
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>scenario</p>
     */
    @NameInMap("TemplateKind")
    public String templateKind;

    /**
     * <strong>example:</strong>
     * <p>思维链推理蒸馏</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

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

    public DistillationTemplateSummary setTemplateKind(String templateKind) {
        this.templateKind = templateKind;
        return this;
    }
    public String getTemplateKind() {
        return this.templateKind;
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
         * <strong>example:</strong>
         * <p>由教师模型对每个问题生成带推理过程的回答。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cot_distill</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>生成思维链</p>
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
        @NameInMap("ModelTasks")
        public java.util.List<String> modelTasks;

        @NameInMap("TrainingMethods")
        public java.util.List<String> trainingMethods;

        /**
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
