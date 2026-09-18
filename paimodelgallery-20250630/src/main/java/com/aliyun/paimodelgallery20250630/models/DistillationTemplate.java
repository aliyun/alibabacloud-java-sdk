// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class DistillationTemplate extends TeaModel {
    /**
     * <p>The algorithm name.</p>
     * 
     * <strong>example:</strong>
     * <p>easydistill</p>
     */
    @NameInMap("AlgorithmName")
    public String algorithmName;

    /**
     * <p>The algorithm provider.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("AlgorithmProvider")
    public String algorithmProvider;

    /**
     * <p>The algorithm version.</p>
     * 
     * <strong>example:</strong>
     * <p>v2.0.0</p>
     */
    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    /**
     * <p>The list of capability tags used for displaying scenario cards.</p>
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
     * <p>The raw YAML content of the EasyDistill default configurations. The frontend uses this content for rendering the configuration form and supports recovering to default configurations. The model and credential fields are intentionally left empty and are populated by the user in the form upon commit.</p>
     * 
     * <strong>example:</strong>
     * <p>job_type: advanced_cot_distill</p>
     */
    @NameInMap("DefaultConfig")
    public String defaultConfig;

    /**
     * <p>The template description, localized based on the requested language. The description specifies the applicable scenarios and outputs.</p>
     * 
     * <strong>example:</strong>
     * <p>Designed for scenarios that require multi-step reasoning such as math, logic, and code. Produces an SFT dataset</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the input data must be an entire directory. If this parameter is set to true, only a directory can be selected on the form, not a single file. If this parameter is absent or set to false, either a file or a directory can be selected. This value is true when seed files reference other files in the same directory by relative path.</p>
     */
    @NameInMap("InputDatasetMustBeDirectory")
    public Boolean inputDatasetMustBeDirectory;

    /**
     * <p>The OSS address of the sample input data, rendered based on the region. Users can download the sample and prepare their own data in the same format. An empty value indicates that the template does not provide a sample.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://pai-quickstart-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/public_datasets/distillation_examples/advanced_cot_distill/input.jsonl</p>
     */
    @NameInMap("InputExampleUri")
    public String inputExampleUri;

    /**
     * <p>The algorithm job type. The value is the same as TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The list of model slots that require user selection. The frontend uses this list to render the model selection form.</p>
     */
    @NameInMap("ModelSlots")
    public java.util.List<DistillationTemplateModelSlots> modelSlots;

    /**
     * <p>The display order. A smaller value indicates a higher priority.</p>
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
    public java.util.List<DistillationTemplatePipelineStages> pipelineStages;

    /**
     * <p>The content of the preset configuration card, displayed in order to show the key default configurations of the template.</p>
     */
    @NameInMap("PresetConfig")
    public java.util.List<DistillationTemplatePresetConfig> presetConfig;

    /**
     * <p>The distillation template ID, which is the same as the algorithm job_type. Pass this value as TemplateId when creating a task plan.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template display name, localized based on the requested language.</p>
     * 
     * <strong>example:</strong>
     * <p>Chain-of-thought reasoning distillation</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The capability declaration for the second stage (training the student model with the distilled data). An empty value indicates that the template supports only the distillation stage.</p>
     */
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

    public DistillationTemplate setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
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
         * <p>The channel name of the PAI-Token gateway. The frontend uses this value to retrieve the list of available models for the channel. This value must be passed back as-is upon submission. This parameter is returned only when Type is pai_token.</p>
         * 
         * <strong>example:</strong>
         * <p>distillation</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The model access method. pai_token indicates the PAI-Token gateway, where the user selects from the list of available models for the channel. pai_eas indicates the user\&quot;s own PAI-EAS service instance, which requires the service address and token.</p>
         * 
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
        /**
         * <p>The list of model access methods supported by this slot.</p>
         */
        @NameInMap("Backends")
        public java.util.List<DistillationTemplateModelSlotsBackends> backends;

        /**
         * <p>The slot description, localized based on the requested language.</p>
         * 
         * <strong>example:</strong>
         * <p>The teacher model used to generate distillation data. We recommend selecting a model with strong reasoning capabilities</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The slot identifier, which corresponds to the backend section name in the submitted configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>backend</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The slot display name, localized based on the requested language.</p>
         * 
         * <strong>example:</strong>
         * <p>Teacher model</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether this slot is required. If this parameter is set to false, the user can skip the selection, and the algorithm falls back to other slots.</p>
         */
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
         * <p>The stage description, localized based on the requested language.</p>
         * 
         * <strong>example:</strong>
         * <p>The teacher model generates responses with reasoning processes for each question</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The stage identifier, which corresponds to the value of pipeline[].stage in the algorithm configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>cot_distill</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The stage display name, localized based on the requested language.</p>
         * 
         * <strong>example:</strong>
         * <p>Generate chain of thought</p>
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
         * <p>The configuration item name, localized based on the requested language. Names are matched by position across languages, so the same row can have different names in different languages.</p>
         * 
         * <strong>example:</strong>
         * <p>Task type</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The configuration item value, localized based on the requested language.</p>
         * 
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
        /**
         * <p>The range of Model Gallery tasks available for the student model.</p>
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
