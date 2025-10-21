// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    @NameInMap("ContentSafeModelInstanceId")
    public Long contentSafeModelInstanceId;

    @NameInMap("EnableSensitiveInputCheck")
    public Integer enableSensitiveInputCheck;

    @NameInMap("EnableSensitiveOutputCheck")
    public Integer enableSensitiveOutputCheck;

    /**
     * <p>List of harmful category configurations</p>
     */
    @NameInMap("HarmfulCategoryConfigInfoList")
    public java.util.List<CreatePolicyRequestHarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList;

    @NameInMap("InputSafeAnswer")
    public String inputSafeAnswer;

    @NameInMap("InputSafeAnswerSwitch")
    public Integer inputSafeAnswerSwitch;

    @NameInMap("IsSidecarPolicy")
    public Integer isSidecarPolicy;

    @NameInMap("OutputSafeAnswer")
    public String outputSafeAnswer;

    @NameInMap("OutputSafeAnswerSwitch")
    public Integer outputSafeAnswerSwitch;

    /**
     * <p>Detection policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>testPolicy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>Prompt attack detection result object</p>
     */
    @NameInMap("PromptAttackInfo")
    public CreatePolicyRequestPromptAttackInfo promptAttackInfo;

    /**
     * <p>List of prompt attacks</p>
     */
    @NameInMap("PromptAttackInfoList")
    public java.util.List<CreatePolicyRequestPromptAttackInfoList> promptAttackInfoList;

    @NameInMap("PromptAttackModelInstanceId")
    public Long promptAttackModelInstanceId;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegularExpressList")
    public java.util.List<CreatePolicyRequestRegularExpressList> regularExpressList;

    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("SensitiveConfigList")
    public java.util.List<CreatePolicyRequestSensitiveConfigList> sensitiveConfigList;

    @NameInMap("SensitiveTopicList")
    public java.util.List<CreatePolicyRequestSensitiveTopicList> sensitiveTopicList;

    @NameInMap("SensitiveTopicModelInstanceId")
    public Long sensitiveTopicModelInstanceId;

    @NameInMap("SensitiveWordList")
    public java.util.List<CreatePolicyRequestSensitiveWordList> sensitiveWordList;

    /**
     * <p>List of sensitive topics</p>
     */
    @NameInMap("TopicConfigInfoList")
    public java.util.List<CreatePolicyRequestTopicConfigInfoList> topicConfigInfoList;

    /**
     * <p>List of keyword group objects</p>
     */
    @NameInMap("WordGroupInfoList")
    public java.util.List<CreatePolicyRequestWordGroupInfoList> wordGroupInfoList;

    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>608226</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyRequest setContentSafeModelInstanceId(Long contentSafeModelInstanceId) {
        this.contentSafeModelInstanceId = contentSafeModelInstanceId;
        return this;
    }
    public Long getContentSafeModelInstanceId() {
        return this.contentSafeModelInstanceId;
    }

    public CreatePolicyRequest setEnableSensitiveInputCheck(Integer enableSensitiveInputCheck) {
        this.enableSensitiveInputCheck = enableSensitiveInputCheck;
        return this;
    }
    public Integer getEnableSensitiveInputCheck() {
        return this.enableSensitiveInputCheck;
    }

    public CreatePolicyRequest setEnableSensitiveOutputCheck(Integer enableSensitiveOutputCheck) {
        this.enableSensitiveOutputCheck = enableSensitiveOutputCheck;
        return this;
    }
    public Integer getEnableSensitiveOutputCheck() {
        return this.enableSensitiveOutputCheck;
    }

    public CreatePolicyRequest setHarmfulCategoryConfigInfoList(java.util.List<CreatePolicyRequestHarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList) {
        this.harmfulCategoryConfigInfoList = harmfulCategoryConfigInfoList;
        return this;
    }
    public java.util.List<CreatePolicyRequestHarmfulCategoryConfigInfoList> getHarmfulCategoryConfigInfoList() {
        return this.harmfulCategoryConfigInfoList;
    }

    public CreatePolicyRequest setInputSafeAnswer(String inputSafeAnswer) {
        this.inputSafeAnswer = inputSafeAnswer;
        return this;
    }
    public String getInputSafeAnswer() {
        return this.inputSafeAnswer;
    }

    public CreatePolicyRequest setInputSafeAnswerSwitch(Integer inputSafeAnswerSwitch) {
        this.inputSafeAnswerSwitch = inputSafeAnswerSwitch;
        return this;
    }
    public Integer getInputSafeAnswerSwitch() {
        return this.inputSafeAnswerSwitch;
    }

    public CreatePolicyRequest setIsSidecarPolicy(Integer isSidecarPolicy) {
        this.isSidecarPolicy = isSidecarPolicy;
        return this;
    }
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
    }

    public CreatePolicyRequest setOutputSafeAnswer(String outputSafeAnswer) {
        this.outputSafeAnswer = outputSafeAnswer;
        return this;
    }
    public String getOutputSafeAnswer() {
        return this.outputSafeAnswer;
    }

    public CreatePolicyRequest setOutputSafeAnswerSwitch(Integer outputSafeAnswerSwitch) {
        this.outputSafeAnswerSwitch = outputSafeAnswerSwitch;
        return this;
    }
    public Integer getOutputSafeAnswerSwitch() {
        return this.outputSafeAnswerSwitch;
    }

    public CreatePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyRequest setPromptAttackInfo(CreatePolicyRequestPromptAttackInfo promptAttackInfo) {
        this.promptAttackInfo = promptAttackInfo;
        return this;
    }
    public CreatePolicyRequestPromptAttackInfo getPromptAttackInfo() {
        return this.promptAttackInfo;
    }

    public CreatePolicyRequest setPromptAttackInfoList(java.util.List<CreatePolicyRequestPromptAttackInfoList> promptAttackInfoList) {
        this.promptAttackInfoList = promptAttackInfoList;
        return this;
    }
    public java.util.List<CreatePolicyRequestPromptAttackInfoList> getPromptAttackInfoList() {
        return this.promptAttackInfoList;
    }

    public CreatePolicyRequest setPromptAttackModelInstanceId(Long promptAttackModelInstanceId) {
        this.promptAttackModelInstanceId = promptAttackModelInstanceId;
        return this;
    }
    public Long getPromptAttackModelInstanceId() {
        return this.promptAttackModelInstanceId;
    }

    public CreatePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolicyRequest setRegularExpressList(java.util.List<CreatePolicyRequestRegularExpressList> regularExpressList) {
        this.regularExpressList = regularExpressList;
        return this;
    }
    public java.util.List<CreatePolicyRequestRegularExpressList> getRegularExpressList() {
        return this.regularExpressList;
    }

    public CreatePolicyRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public CreatePolicyRequest setSensitiveConfigList(java.util.List<CreatePolicyRequestSensitiveConfigList> sensitiveConfigList) {
        this.sensitiveConfigList = sensitiveConfigList;
        return this;
    }
    public java.util.List<CreatePolicyRequestSensitiveConfigList> getSensitiveConfigList() {
        return this.sensitiveConfigList;
    }

    public CreatePolicyRequest setSensitiveTopicList(java.util.List<CreatePolicyRequestSensitiveTopicList> sensitiveTopicList) {
        this.sensitiveTopicList = sensitiveTopicList;
        return this;
    }
    public java.util.List<CreatePolicyRequestSensitiveTopicList> getSensitiveTopicList() {
        return this.sensitiveTopicList;
    }

    public CreatePolicyRequest setSensitiveTopicModelInstanceId(Long sensitiveTopicModelInstanceId) {
        this.sensitiveTopicModelInstanceId = sensitiveTopicModelInstanceId;
        return this;
    }
    public Long getSensitiveTopicModelInstanceId() {
        return this.sensitiveTopicModelInstanceId;
    }

    public CreatePolicyRequest setSensitiveWordList(java.util.List<CreatePolicyRequestSensitiveWordList> sensitiveWordList) {
        this.sensitiveWordList = sensitiveWordList;
        return this;
    }
    public java.util.List<CreatePolicyRequestSensitiveWordList> getSensitiveWordList() {
        return this.sensitiveWordList;
    }

    public CreatePolicyRequest setTopicConfigInfoList(java.util.List<CreatePolicyRequestTopicConfigInfoList> topicConfigInfoList) {
        this.topicConfigInfoList = topicConfigInfoList;
        return this;
    }
    public java.util.List<CreatePolicyRequestTopicConfigInfoList> getTopicConfigInfoList() {
        return this.topicConfigInfoList;
    }

    public CreatePolicyRequest setWordGroupInfoList(java.util.List<CreatePolicyRequestWordGroupInfoList> wordGroupInfoList) {
        this.wordGroupInfoList = wordGroupInfoList;
        return this;
    }
    public java.util.List<CreatePolicyRequestWordGroupInfoList> getWordGroupInfoList() {
        return this.wordGroupInfoList;
    }

    public CreatePolicyRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreatePolicyRequestHarmfulCategoryConfigInfoList extends TeaModel {
        /**
         * <p>Harmful category ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>Category name</p>
         * 
         * <strong>example:</strong>
         * <p>Morality</p>
         */
        @NameInMap("CategoryLabel")
        public String categoryLabel;

        /**
         * <p>0: Text
         * 1: Image</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CategoryType")
        public Integer categoryType;

        /**
         * <p>Model input/output type
         * 0: Input
         * 1: Output</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InputOutputType")
        public Integer inputOutputType;

        /**
         * <p>Whether it is enabled
         * 0: Not enabled
         * 1: Enabled</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsEnabled")
        public Integer isEnabled;

        /**
         * <p>Security level
         * 0: Low
         * 1: Medium
         * 2: High</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static CreatePolicyRequestHarmfulCategoryConfigInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestHarmfulCategoryConfigInfoList self = new CreatePolicyRequestHarmfulCategoryConfigInfoList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestHarmfulCategoryConfigInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public CreatePolicyRequestHarmfulCategoryConfigInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public CreatePolicyRequestHarmfulCategoryConfigInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public CreatePolicyRequestHarmfulCategoryConfigInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public CreatePolicyRequestHarmfulCategoryConfigInfoList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public CreatePolicyRequestHarmfulCategoryConfigInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class CreatePolicyRequestPromptAttackInfo extends TeaModel {
        /**
         * <p>Prompt attack configuration switch
         * 0: Off
         * 1: On</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsEnabled")
        public Integer isEnabled;

        /**
         * <p>Security level
         * 0: Low
         * 1: Medium
         * 2: High</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static CreatePolicyRequestPromptAttackInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestPromptAttackInfo self = new CreatePolicyRequestPromptAttackInfo();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestPromptAttackInfo setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public CreatePolicyRequestPromptAttackInfo setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class CreatePolicyRequestPromptAttackInfoList extends TeaModel {
        /**
         * <p>Harmful category ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>Category name</p>
         * 
         * <strong>example:</strong>
         * <p>Role Play</p>
         */
        @NameInMap("CategoryLabel")
        public String categoryLabel;

        /**
         * <p>Prompt attack configuration switch
         * 0: Off
         * 1: On</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsEnabled")
        public Integer isEnabled;

        /**
         * <p>Security level
         * 0: Low
         * 1: Medium
         * 2: High</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static CreatePolicyRequestPromptAttackInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestPromptAttackInfoList self = new CreatePolicyRequestPromptAttackInfoList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestPromptAttackInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public CreatePolicyRequestPromptAttackInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public CreatePolicyRequestPromptAttackInfoList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public CreatePolicyRequestPromptAttackInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class CreatePolicyRequestRegularExpressList extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("RegularExpress")
        public String regularExpress;

        @NameInMap("RegularExpressName")
        public String regularExpressName;

        public static CreatePolicyRequestRegularExpressList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestRegularExpressList self = new CreatePolicyRequestRegularExpressList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestRegularExpressList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public CreatePolicyRequestRegularExpressList setRegularExpress(String regularExpress) {
            this.regularExpress = regularExpress;
            return this;
        }
        public String getRegularExpress() {
            return this.regularExpress;
        }

        public CreatePolicyRequestRegularExpressList setRegularExpressName(String regularExpressName) {
            this.regularExpressName = regularExpressName;
            return this;
        }
        public String getRegularExpressName() {
            return this.regularExpressName;
        }

    }

    public static class CreatePolicyRequestSensitiveConfigList extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("IsEnabled")
        public Integer isEnabled;

        @NameInMap("SensitiveConfigId")
        public Long sensitiveConfigId;

        public static CreatePolicyRequestSensitiveConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestSensitiveConfigList self = new CreatePolicyRequestSensitiveConfigList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestSensitiveConfigList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public CreatePolicyRequestSensitiveConfigList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public CreatePolicyRequestSensitiveConfigList setSensitiveConfigId(Long sensitiveConfigId) {
            this.sensitiveConfigId = sensitiveConfigId;
            return this;
        }
        public Long getSensitiveConfigId() {
            return this.sensitiveConfigId;
        }

    }

    public static class CreatePolicyRequestSensitiveTopicListTopicExampleInfoList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ExampleType")
        public Integer exampleType;

        public static CreatePolicyRequestSensitiveTopicListTopicExampleInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestSensitiveTopicListTopicExampleInfoList self = new CreatePolicyRequestSensitiveTopicListTopicExampleInfoList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestSensitiveTopicListTopicExampleInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreatePolicyRequestSensitiveTopicListTopicExampleInfoList setExampleType(Integer exampleType) {
            this.exampleType = exampleType;
            return this;
        }
        public Integer getExampleType() {
            return this.exampleType;
        }

    }

    public static class CreatePolicyRequestSensitiveTopicList extends TeaModel {
        @NameInMap("CategoryType")
        public Integer categoryType;

        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        @NameInMap("TopicDefinition")
        public String topicDefinition;

        @NameInMap("TopicExampleInfoList")
        public java.util.List<CreatePolicyRequestSensitiveTopicListTopicExampleInfoList> topicExampleInfoList;

        @NameInMap("TopicName")
        public String topicName;

        public static CreatePolicyRequestSensitiveTopicList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestSensitiveTopicList self = new CreatePolicyRequestSensitiveTopicList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestSensitiveTopicList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public CreatePolicyRequestSensitiveTopicList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public CreatePolicyRequestSensitiveTopicList setTopicDefinition(String topicDefinition) {
            this.topicDefinition = topicDefinition;
            return this;
        }
        public String getTopicDefinition() {
            return this.topicDefinition;
        }

        public CreatePolicyRequestSensitiveTopicList setTopicExampleInfoList(java.util.List<CreatePolicyRequestSensitiveTopicListTopicExampleInfoList> topicExampleInfoList) {
            this.topicExampleInfoList = topicExampleInfoList;
            return this;
        }
        public java.util.List<CreatePolicyRequestSensitiveTopicListTopicExampleInfoList> getTopicExampleInfoList() {
            return this.topicExampleInfoList;
        }

        public CreatePolicyRequestSensitiveTopicList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class CreatePolicyRequestSensitiveWordList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Word")
        public String word;

        public static CreatePolicyRequestSensitiveWordList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestSensitiveWordList self = new CreatePolicyRequestSensitiveWordList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestSensitiveWordList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreatePolicyRequestSensitiveWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class CreatePolicyRequestTopicConfigInfoList extends TeaModel {
        /**
         * <p>0: Text
         * 1: Image</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CategoryType")
        public Integer categoryType;

        /**
         * <p>Model input/output type
         * 0: Input
         * 1: Output</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InputOutputType")
        public Integer inputOutputType;

        /**
         * <p>Security level
         * 0: Low
         * 1: Medium
         * 2: High</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        /**
         * <p>Sensitive topic ID</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>Topic Name</p>
         * 
         * <strong>example:</strong>
         * <p>Buss.</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        public static CreatePolicyRequestTopicConfigInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestTopicConfigInfoList self = new CreatePolicyRequestTopicConfigInfoList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestTopicConfigInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public CreatePolicyRequestTopicConfigInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public CreatePolicyRequestTopicConfigInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public CreatePolicyRequestTopicConfigInfoList setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public CreatePolicyRequestTopicConfigInfoList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class CreatePolicyRequestWordGroupInfoList extends TeaModel {
        /**
         * <p>Keyword group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>Keyword group name</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Model input/output type
         * 0: Input
         * 1: Output</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InputOutputType")
        public Integer inputOutputType;

        public static CreatePolicyRequestWordGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestWordGroupInfoList self = new CreatePolicyRequestWordGroupInfoList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestWordGroupInfoList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public CreatePolicyRequestWordGroupInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreatePolicyRequestWordGroupInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

    }

}
