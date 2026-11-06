// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class DistillationTemplate extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>easydistill</p>
     */
    @NameInMap("AlgorithmName")
    public String algorithmName;

    /**
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("AlgorithmProvider")
    public String algorithmProvider;

    /**
     * <strong>example:</strong>
     * <p>v2.0.0</p>
     */
    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

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
     * <p>job_type: advanced_cot_distill</p>
     */
    @NameInMap("DefaultConfig")
    public String defaultConfig;

    /**
     * <strong>example:</strong>
     * <p>面向数学、逻辑、代码等需要多步推理的场景，产出 SFT 数据集。</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("InputDatasetMustBeDirectory")
    public Boolean inputDatasetMustBeDirectory;

    /**
     * <strong>example:</strong>
     * <p>oss://pai-quickstart-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/public_datasets/distillation_examples/advanced_cot_distill/input.jsonl</p>
     */
    @NameInMap("InputExampleUri")
    public String inputExampleUri;

    /**
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("JobType")
    public String jobType;

    @NameInMap("ModelSlots")
    public java.util.List<DistillationTemplateModelSlots> modelSlots;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OrderNumber")
    public Integer orderNumber;

    @NameInMap("PipelineStages")
    public java.util.List<DistillationTemplatePipelineStages> pipelineStages;

    @NameInMap("PresetConfig")
    public java.util.List<DistillationTemplatePresetConfig> presetConfig;

    /**
     * <strong>example:</strong>
     * <p>oss://pai-quickstart-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/public_datasets/distillation_examples/custom_distill/processor_example.py</p>
     */
    @NameInMap("ProcessorExampleUri")
    public String processorExampleUri;

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
    public java.util.List<DistillationTemplateTrainingOptions> trainingOptions;

    public static DistillationTemplate build(java.util.Map<String, ?> map) throws Exception {
        DistillationTemplate self = new DistillationTemplate();
        return TeaModel.build(map, self);
    }

    public DistillationTemplate setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public DistillationTemplate setAlgorithmProvider(String algorithmProvider) {
        this.algorithmProvider = algorithmProvider;
        return this;
    }
    public String getAlgorithmProvider() {
        return this.algorithmProvider;
    }

    public DistillationTemplate setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
        return this;
    }
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    public DistillationTemplate setCapabilityTags(java.util.List<String> capabilityTags) {
        this.capabilityTags = capabilityTags;
        return this;
    }
    public java.util.List<String> getCapabilityTags() {
        return this.capabilityTags;
    }

    public DistillationTemplate setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DistillationTemplate setDefaultConfig(String defaultConfig) {
        this.defaultConfig = defaultConfig;
        return this;
    }
    public String getDefaultConfig() {
        return this.defaultConfig;
    }

    public DistillationTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DistillationTemplate setInputDatasetMustBeDirectory(Boolean inputDatasetMustBeDirectory) {
        this.inputDatasetMustBeDirectory = inputDatasetMustBeDirectory;
        return this;
    }
    public Boolean getInputDatasetMustBeDirectory() {
        return this.inputDatasetMustBeDirectory;
    }

    public DistillationTemplate setInputExampleUri(String inputExampleUri) {
        this.inputExampleUri = inputExampleUri;
        return this;
    }
    public String getInputExampleUri() {
        return this.inputExampleUri;
    }

    public DistillationTemplate setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DistillationTemplate setModelSlots(java.util.List<DistillationTemplateModelSlots> modelSlots) {
        this.modelSlots = modelSlots;
        return this;
    }
    public java.util.List<DistillationTemplateModelSlots> getModelSlots() {
        return this.modelSlots;
    }

    public DistillationTemplate setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    public DistillationTemplate setPipelineStages(java.util.List<DistillationTemplatePipelineStages> pipelineStages) {
        this.pipelineStages = pipelineStages;
        return this;
    }
    public java.util.List<DistillationTemplatePipelineStages> getPipelineStages() {
        return this.pipelineStages;
    }

    public DistillationTemplate setPresetConfig(java.util.List<DistillationTemplatePresetConfig> presetConfig) {
        this.presetConfig = presetConfig;
        return this;
    }
    public java.util.List<DistillationTemplatePresetConfig> getPresetConfig() {
        return this.presetConfig;
    }

    public DistillationTemplate setProcessorExampleUri(String processorExampleUri) {
        this.processorExampleUri = processorExampleUri;
        return this;
    }
    public String getProcessorExampleUri() {
        return this.processorExampleUri;
    }

    public DistillationTemplate setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DistillationTemplate setTemplateKind(String templateKind) {
        this.templateKind = templateKind;
        return this;
    }
    public String getTemplateKind() {
        return this.templateKind;
    }

    public DistillationTemplate setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DistillationTemplate setTrainingOptions(java.util.List<DistillationTemplateTrainingOptions> trainingOptions) {
        this.trainingOptions = trainingOptions;
        return this;
    }
    public java.util.List<DistillationTemplateTrainingOptions> getTrainingOptions() {
        return this.trainingOptions;
    }

    public static class DistillationTemplateModelSlotsBackends extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>distillation</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>pai_token</p>
         */
        @NameInMap("Type")
        public String type;

        public static DistillationTemplateModelSlotsBackends build(java.util.Map<String, ?> map) throws Exception {
            DistillationTemplateModelSlotsBackends self = new DistillationTemplateModelSlotsBackends();
            return TeaModel.build(map, self);
        }

        public DistillationTemplateModelSlotsBackends setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DistillationTemplateModelSlotsBackends setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DistillationTemplateModelSlots extends TeaModel {
        @NameInMap("Backends")
        public java.util.List<DistillationTemplateModelSlotsBackends> backends;

        /**
         * <strong>example:</strong>
         * <p>用于生成蒸馏数据的教师模型，建议选择推理能力强的模型。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>backend</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>教师模型</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public Boolean required;

        public static DistillationTemplateModelSlots build(java.util.Map<String, ?> map) throws Exception {
            DistillationTemplateModelSlots self = new DistillationTemplateModelSlots();
            return TeaModel.build(map, self);
        }

        public DistillationTemplateModelSlots setBackends(java.util.List<DistillationTemplateModelSlotsBackends> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<DistillationTemplateModelSlotsBackends> getBackends() {
            return this.backends;
        }

        public DistillationTemplateModelSlots setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DistillationTemplateModelSlots setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DistillationTemplateModelSlots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DistillationTemplateModelSlots setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class DistillationTemplatePipelineStages extends TeaModel {
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

        public static DistillationTemplatePipelineStages build(java.util.Map<String, ?> map) throws Exception {
            DistillationTemplatePipelineStages self = new DistillationTemplatePipelineStages();
            return TeaModel.build(map, self);
        }

        public DistillationTemplatePipelineStages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DistillationTemplatePipelineStages setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DistillationTemplatePipelineStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DistillationTemplatePresetConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>任务类型</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>advanced_cot_distill</p>
         */
        @NameInMap("Value")
        public String value;

        public static DistillationTemplatePresetConfig build(java.util.Map<String, ?> map) throws Exception {
            DistillationTemplatePresetConfig self = new DistillationTemplatePresetConfig();
            return TeaModel.build(map, self);
        }

        public DistillationTemplatePresetConfig setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DistillationTemplatePresetConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DistillationTemplateTrainingOptions extends TeaModel {
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

        public static DistillationTemplateTrainingOptions build(java.util.Map<String, ?> map) throws Exception {
            DistillationTemplateTrainingOptions self = new DistillationTemplateTrainingOptions();
            return TeaModel.build(map, self);
        }

        public DistillationTemplateTrainingOptions setModelTasks(java.util.List<String> modelTasks) {
            this.modelTasks = modelTasks;
            return this;
        }
        public java.util.List<String> getModelTasks() {
            return this.modelTasks;
        }

        public DistillationTemplateTrainingOptions setTrainingMethods(java.util.List<String> trainingMethods) {
            this.trainingMethods = trainingMethods;
            return this;
        }
        public java.util.List<String> getTrainingMethods() {
            return this.trainingMethods;
        }

        public DistillationTemplateTrainingOptions setTrainingType(String trainingType) {
            this.trainingType = trainingType;
            return this;
        }
        public String getTrainingType() {
            return this.trainingType;
        }

    }

}
