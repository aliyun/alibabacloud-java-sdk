// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AgentInfo extends TeaModel {
    @NameInMap("AgentDescription")
    public String agentDescription;

    @NameInMap("AgentName")
    public String agentName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InputType")
    public String inputType;

    @NameInMap("InstructionType")
    public String instructionType;

    @NameInMap("InstructionTypeParam")
    public AgentInfoInstructionTypeParam instructionTypeParam;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("CustomPrompt")
        public String customPrompt;

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
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Desc")
        public String desc;

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
        @NameInMap("Dimensions")
        public java.util.List<AgentInfoInstructionTypeParamServiceInspectionParamDimensions> dimensions;

        @NameInMap("SceneDescription")
        public String sceneDescription;

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
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Name")
        public String name;

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

    public static class AgentInfoInstructionTypeParam extends TeaModel {
        @NameInMap("CustomPromptParam")
        public AgentInfoInstructionTypeParamCustomPromptParam customPromptParam;

        @NameInMap("FieldsParam")
        public AgentInfoInstructionTypeParamFieldsParam fieldsParam;

        @NameInMap("ServiceInspectionParam")
        public AgentInfoInstructionTypeParamServiceInspectionParam serviceInspectionParam;

        @NameInMap("TagCategoryParam")
        public AgentInfoInstructionTypeParamTagCategoryParam tagCategoryParam;

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

    }

}
