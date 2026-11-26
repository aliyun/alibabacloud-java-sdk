// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AgentInfo extends TeaModel {
    /**
     * <p>The description of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent for customer service session quality inspection</p>
     */
    @NameInMap("AgentDescription")
    public String agentDescription;

    /**
     * <p>The name of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer service quality inspection assistant</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The unique identifier of the agent configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The object type for analysis. Valid values: audio and text.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("InputType")
    public String inputType;

    /**
     * <p>The instruction type. Valid values: serviceInspection (service quality inspection), field (key property extraction), tagCategory (label classification), multiLevelTag (multi-level label recognition), and customPrompt (custom instruction).</p>
     * 
     * <strong>example:</strong>
     * <p>field</p>
     */
    @NameInMap("InstructionType")
    public String instructionType;

    /**
     * <p>The parameters corresponding to the instruction type. Different InstructionType values require different sub-parameters. Specify only the sub-parameters that correspond to the current InstructionType and leave the others empty.</p>
     */
    @NameInMap("InstructionTypeParam")
    public AgentInfoInstructionTypeParam instructionTypeParam;

    /**
     * <p>The type of the large language model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    public static AgentInfo build(java.util.Map<String, ?> map) throws Exception {
        AgentInfo self = new AgentInfo();
        return TeaModel.build(map, self);
    }

    public AgentInfo setAgentDescription(String agentDescription) {
        this.agentDescription = agentDescription;
        return this;
    }
    public String getAgentDescription() {
        return this.agentDescription;
    }

    public AgentInfo setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public AgentInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AgentInfo setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public AgentInfo setInstructionType(String instructionType) {
        this.instructionType = instructionType;
        return this;
    }
    public String getInstructionType() {
        return this.instructionType;
    }

    public AgentInfo setInstructionTypeParam(AgentInfoInstructionTypeParam instructionTypeParam) {
        this.instructionTypeParam = instructionTypeParam;
        return this;
    }
    public AgentInfoInstructionTypeParam getInstructionTypeParam() {
        return this.instructionTypeParam;
    }

    public AgentInfo setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public static class AgentInfoInstructionTypeParamCustomPromptParamNameDescPairList extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Scenario</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>After-sales inquiry</p>
         */
        @NameInMap("Value")
        public String value;

        public static AgentInfoInstructionTypeParamCustomPromptParamNameDescPairList build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamCustomPromptParamNameDescPairList self = new AgentInfoInstructionTypeParamCustomPromptParamNameDescPairList();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamCustomPromptParamNameDescPairList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AgentInfoInstructionTypeParamCustomPromptParamNameDescPairList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AgentInfoInstructionTypeParamCustomPromptParam extends TeaModel {
        /**
         * <p>The content of the user-defined prompt template. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyze the service attitude of the customer service representative in the following conversation</p>
         */
        @NameInMap("CustomPrompt")
        public String customPrompt;

        /**
         * <p>The list of name-value pairs attached to the custom instruction.</p>
         */
        @NameInMap("NameDescPairList")
        public java.util.List<AgentInfoInstructionTypeParamCustomPromptParamNameDescPairList> nameDescPairList;

        public static AgentInfoInstructionTypeParamCustomPromptParam build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamCustomPromptParam self = new AgentInfoInstructionTypeParamCustomPromptParam();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamCustomPromptParam setCustomPrompt(String customPrompt) {
            this.customPrompt = customPrompt;
            return this;
        }
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        public AgentInfoInstructionTypeParamCustomPromptParam setNameDescPairList(java.util.List<AgentInfoInstructionTypeParamCustomPromptParamNameDescPairList> nameDescPairList) {
            this.nameDescPairList = nameDescPairList;
            return this;
        }
        public java.util.List<AgentInfoInstructionTypeParamCustomPromptParamNameDescPairList> getNameDescPairList() {
            return this.nameDescPairList;
        }

    }

    public static class AgentInfoInstructionTypeParamFieldsParamNameDescPairList extends TeaModel {
        /**
         * <p>The attribute description. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>The specific request raised by the customer during the session</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The attribute name. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer request</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The attribute value. In the key attribute extraction scenario, this is the extracted result value corresponding to the dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>Refund</p>
         */
        @NameInMap("Value")
        public String value;

        public static AgentInfoInstructionTypeParamFieldsParamNameDescPairList build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamFieldsParamNameDescPairList self = new AgentInfoInstructionTypeParamFieldsParamNameDescPairList();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamFieldsParamNameDescPairList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public AgentInfoInstructionTypeParamFieldsParamNameDescPairList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AgentInfoInstructionTypeParamFieldsParamNameDescPairList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AgentInfoInstructionTypeParamFieldsParam extends TeaModel {
        /**
         * <p>The list of attribute dimensions to be extracted.</p>
         */
        @NameInMap("NameDescPairList")
        public java.util.List<AgentInfoInstructionTypeParamFieldsParamNameDescPairList> nameDescPairList;

        public static AgentInfoInstructionTypeParamFieldsParam build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamFieldsParam self = new AgentInfoInstructionTypeParamFieldsParam();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamFieldsParam setNameDescPairList(java.util.List<AgentInfoInstructionTypeParamFieldsParamNameDescPairList> nameDescPairList) {
            this.nameDescPairList = nameDescPairList;
            return this;
        }
        public java.util.List<AgentInfoInstructionTypeParamFieldsParamNameDescPairList> getNameDescPairList() {
            return this.nameDescPairList;
        }

    }

    public static class AgentInfoInstructionTypeParamServiceInspectionParamDimensions extends TeaModel {
        /**
         * <p>The dimension description. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Whether the customer service representative is polite and patient</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The dimension name. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Service attitude</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        public static AgentInfoInstructionTypeParamServiceInspectionParamDimensions build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamServiceInspectionParamDimensions self = new AgentInfoInstructionTypeParamServiceInspectionParamDimensions();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamServiceInspectionParamDimensions setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public AgentInfoInstructionTypeParamServiceInspectionParamDimensions setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

    }

    public static class AgentInfoInstructionTypeParamServiceInspectionParam extends TeaModel {
        /**
         * <p>The list of quality inspection dimensions. This parameter is required.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<AgentInfoInstructionTypeParamServiceInspectionParamDimensions> dimensions;

        /**
         * <p>The description of the quality inspection scenario. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Service quality inspection for after-sales customer service sessions</p>
         */
        @NameInMap("SceneDescription")
        public String sceneDescription;

        /**
         * <p>The name of the quality inspection scenario. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>After-sales service quality inspection</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        public static AgentInfoInstructionTypeParamServiceInspectionParam build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamServiceInspectionParam self = new AgentInfoInstructionTypeParamServiceInspectionParam();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamServiceInspectionParam setDimensions(java.util.List<AgentInfoInstructionTypeParamServiceInspectionParamDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<AgentInfoInstructionTypeParamServiceInspectionParamDimensions> getDimensions() {
            return this.dimensions;
        }

        public AgentInfoInstructionTypeParamServiceInspectionParam setSceneDescription(String sceneDescription) {
            this.sceneDescription = sceneDescription;
            return this;
        }
        public String getSceneDescription() {
            return this.sceneDescription;
        }

        public AgentInfoInstructionTypeParamServiceInspectionParam setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

    }

    public static class AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList extends TeaModel {
        /**
         * <p>The dimension description.</p>
         * 
         * <strong>example:</strong>
         * <p>The classification of the types of issues consulted by the customer</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>Issue type</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of candidate tag values.</p>
         */
        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList self = new AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class AgentInfoInstructionTypeParamTagCategoryParam extends TeaModel {
        /**
         * <p>The list of label classification dimensions. This parameter is required.</p>
         */
        @NameInMap("NameDescPairList")
        public java.util.List<AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList> nameDescPairList;

        public static AgentInfoInstructionTypeParamTagCategoryParam build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamTagCategoryParam self = new AgentInfoInstructionTypeParamTagCategoryParam();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamTagCategoryParam setNameDescPairList(java.util.List<AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList> nameDescPairList) {
            this.nameDescPairList = nameDescPairList;
            return this;
        }
        public java.util.List<AgentInfoInstructionTypeParamTagCategoryParamNameDescPairList> getNameDescPairList() {
            return this.nameDescPairList;
        }

    }

    public static class AgentInfoInstructionTypeParamTagTreeLevelParamTagTreeLevels extends TeaModel {
        /**
         * <p>The analysis prompt for this level. It is concatenated with the tag data and sent to the large language model. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Determine which tag category this conversation belongs to</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The list of candidate tag IDs for this level. A value of -1 indicates that all tags at this level are selected. This parameter is required.</p>
         */
        @NameInMap("TagTreeIds")
        public java.util.List<Long> tagTreeIds;

        public static AgentInfoInstructionTypeParamTagTreeLevelParamTagTreeLevels build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamTagTreeLevelParamTagTreeLevels self = new AgentInfoInstructionTypeParamTagTreeLevelParamTagTreeLevels();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamTagTreeLevelParamTagTreeLevels setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public AgentInfoInstructionTypeParamTagTreeLevelParamTagTreeLevels setTagTreeIds(java.util.List<Long> tagTreeIds) {
            this.tagTreeIds = tagTreeIds;
            return this;
        }
        public java.util.List<Long> getTagTreeIds() {
            return this.tagTreeIds;
        }

    }

    public static class AgentInfoInstructionTypeParamTagTreeLevelParam extends TeaModel {
        /**
         * <p>The list of starting parent tag IDs at runtime. The first ID is treated as the matched parent tag, and recognition proceeds level by level from its child nodes, skipping the preceding levels. This field also takes effect when AgentId is specified.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<Long> tagIds;

        /**
         * <p>The recognition configuration for each level, arranged in hierarchical order. This parameter is required.</p>
         */
        @NameInMap("TagTreeLevels")
        public java.util.List<AgentInfoInstructionTypeParamTagTreeLevelParamTagTreeLevels> tagTreeLevels;

        public static AgentInfoInstructionTypeParamTagTreeLevelParam build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParamTagTreeLevelParam self = new AgentInfoInstructionTypeParamTagTreeLevelParam();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParamTagTreeLevelParam setTagIds(java.util.List<Long> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<Long> getTagIds() {
            return this.tagIds;
        }

        public AgentInfoInstructionTypeParamTagTreeLevelParam setTagTreeLevels(java.util.List<AgentInfoInstructionTypeParamTagTreeLevelParamTagTreeLevels> tagTreeLevels) {
            this.tagTreeLevels = tagTreeLevels;
            return this;
        }
        public java.util.List<AgentInfoInstructionTypeParamTagTreeLevelParamTagTreeLevels> getTagTreeLevels() {
            return this.tagTreeLevels;
        }

    }

    public static class AgentInfoInstructionTypeParam extends TeaModel {
        /**
         * <p>The custom instruction parameters. Used when InstructionType is set to customPrompt.</p>
         */
        @NameInMap("CustomPromptParam")
        public AgentInfoInstructionTypeParamCustomPromptParam customPromptParam;

        /**
         * <p>The key attribute extraction parameters. Used when InstructionType is set to field.</p>
         */
        @NameInMap("FieldsParam")
        public AgentInfoInstructionTypeParamFieldsParam fieldsParam;

        /**
         * <p>The service quality inspection parameters. Used when InstructionType is set to serviceInspection.</p>
         */
        @NameInMap("ServiceInspectionParam")
        public AgentInfoInstructionTypeParamServiceInspectionParam serviceInspectionParam;

        /**
         * <p>The label classification parameters. Used when InstructionType is set to tagCategory.</p>
         */
        @NameInMap("TagCategoryParam")
        public AgentInfoInstructionTypeParamTagCategoryParam tagCategoryParam;

        /**
         * <p>The multi-level tag recognition parameters. Used when InstructionType is set to multiLevelTag.</p>
         */
        @NameInMap("TagTreeLevelParam")
        public AgentInfoInstructionTypeParamTagTreeLevelParam tagTreeLevelParam;

        public static AgentInfoInstructionTypeParam build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoInstructionTypeParam self = new AgentInfoInstructionTypeParam();
            return TeaModel.build(map, self);
        }

        public AgentInfoInstructionTypeParam setCustomPromptParam(AgentInfoInstructionTypeParamCustomPromptParam customPromptParam) {
            this.customPromptParam = customPromptParam;
            return this;
        }
        public AgentInfoInstructionTypeParamCustomPromptParam getCustomPromptParam() {
            return this.customPromptParam;
        }

        public AgentInfoInstructionTypeParam setFieldsParam(AgentInfoInstructionTypeParamFieldsParam fieldsParam) {
            this.fieldsParam = fieldsParam;
            return this;
        }
        public AgentInfoInstructionTypeParamFieldsParam getFieldsParam() {
            return this.fieldsParam;
        }

        public AgentInfoInstructionTypeParam setServiceInspectionParam(AgentInfoInstructionTypeParamServiceInspectionParam serviceInspectionParam) {
            this.serviceInspectionParam = serviceInspectionParam;
            return this;
        }
        public AgentInfoInstructionTypeParamServiceInspectionParam getServiceInspectionParam() {
            return this.serviceInspectionParam;
        }

        public AgentInfoInstructionTypeParam setTagCategoryParam(AgentInfoInstructionTypeParamTagCategoryParam tagCategoryParam) {
            this.tagCategoryParam = tagCategoryParam;
            return this;
        }
        public AgentInfoInstructionTypeParamTagCategoryParam getTagCategoryParam() {
            return this.tagCategoryParam;
        }

        public AgentInfoInstructionTypeParam setTagTreeLevelParam(AgentInfoInstructionTypeParamTagTreeLevelParam tagTreeLevelParam) {
            this.tagTreeLevelParam = tagTreeLevelParam;
            return this;
        }
        public AgentInfoInstructionTypeParamTagTreeLevelParam getTagTreeLevelParam() {
            return this.tagTreeLevelParam;
        }

    }

}
