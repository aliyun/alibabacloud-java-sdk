// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdatePolicyRequest extends TeaModel {
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
    public java.util.List<UpdatePolicyRequestHarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList;

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
     * <p>Detection policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

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
    public UpdatePolicyRequestPromptAttackInfo promptAttackInfo;

    /**
     * <p>List of prompt attacks</p>
     */
    @NameInMap("PromptAttackInfoList")
    public java.util.List<UpdatePolicyRequestPromptAttackInfoList> promptAttackInfoList;

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
    public java.util.List<UpdatePolicyRequestRegularExpressList> regularExpressList;

    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("SensitiveConfigList")
    public java.util.List<UpdatePolicyRequestSensitiveConfigList> sensitiveConfigList;

    @NameInMap("SensitiveTopicList")
    public java.util.List<UpdatePolicyRequestSensitiveTopicList> sensitiveTopicList;

    @NameInMap("SensitiveTopicModelInstanceId")
    public Long sensitiveTopicModelInstanceId;

    @NameInMap("SensitiveWordList")
    public java.util.List<UpdatePolicyRequestSensitiveWordList> sensitiveWordList;

    /**
     * <p>List of sensitive topics</p>
     */
    @NameInMap("TopicConfigInfoList")
    public java.util.List<UpdatePolicyRequestTopicConfigInfoList> topicConfigInfoList;

    /**
     * <p>List of keyword group objects</p>
     */
    @NameInMap("WordGroupInfoList")
    public java.util.List<UpdatePolicyRequestWordGroupInfoList> wordGroupInfoList;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static UpdatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyRequest self = new UpdatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyRequest setContentSafeModelInstanceId(Long contentSafeModelInstanceId) {
        this.contentSafeModelInstanceId = contentSafeModelInstanceId;
        return this;
    }
    public Long getContentSafeModelInstanceId() {
        return this.contentSafeModelInstanceId;
    }

    public UpdatePolicyRequest setEnableSensitiveInputCheck(Integer enableSensitiveInputCheck) {
        this.enableSensitiveInputCheck = enableSensitiveInputCheck;
        return this;
    }
    public Integer getEnableSensitiveInputCheck() {
        return this.enableSensitiveInputCheck;
    }

    public UpdatePolicyRequest setEnableSensitiveOutputCheck(Integer enableSensitiveOutputCheck) {
        this.enableSensitiveOutputCheck = enableSensitiveOutputCheck;
        return this;
    }
    public Integer getEnableSensitiveOutputCheck() {
        return this.enableSensitiveOutputCheck;
    }

    public UpdatePolicyRequest setHarmfulCategoryConfigInfoList(java.util.List<UpdatePolicyRequestHarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList) {
        this.harmfulCategoryConfigInfoList = harmfulCategoryConfigInfoList;
        return this;
    }
    public java.util.List<UpdatePolicyRequestHarmfulCategoryConfigInfoList> getHarmfulCategoryConfigInfoList() {
        return this.harmfulCategoryConfigInfoList;
    }

    public UpdatePolicyRequest setInputSafeAnswer(String inputSafeAnswer) {
        this.inputSafeAnswer = inputSafeAnswer;
        return this;
    }
    public String getInputSafeAnswer() {
        return this.inputSafeAnswer;
    }

    public UpdatePolicyRequest setInputSafeAnswerSwitch(Integer inputSafeAnswerSwitch) {
        this.inputSafeAnswerSwitch = inputSafeAnswerSwitch;
        return this;
    }
    public Integer getInputSafeAnswerSwitch() {
        return this.inputSafeAnswerSwitch;
    }

    public UpdatePolicyRequest setIsSidecarPolicy(Integer isSidecarPolicy) {
        this.isSidecarPolicy = isSidecarPolicy;
        return this;
    }
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
    }

    public UpdatePolicyRequest setOutputSafeAnswer(String outputSafeAnswer) {
        this.outputSafeAnswer = outputSafeAnswer;
        return this;
    }
    public String getOutputSafeAnswer() {
        return this.outputSafeAnswer;
    }

    public UpdatePolicyRequest setOutputSafeAnswerSwitch(Integer outputSafeAnswerSwitch) {
        this.outputSafeAnswerSwitch = outputSafeAnswerSwitch;
        return this;
    }
    public Integer getOutputSafeAnswerSwitch() {
        return this.outputSafeAnswerSwitch;
    }

    public UpdatePolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public UpdatePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpdatePolicyRequest setPromptAttackInfo(UpdatePolicyRequestPromptAttackInfo promptAttackInfo) {
        this.promptAttackInfo = promptAttackInfo;
        return this;
    }
    public UpdatePolicyRequestPromptAttackInfo getPromptAttackInfo() {
        return this.promptAttackInfo;
    }

    public UpdatePolicyRequest setPromptAttackInfoList(java.util.List<UpdatePolicyRequestPromptAttackInfoList> promptAttackInfoList) {
        this.promptAttackInfoList = promptAttackInfoList;
        return this;
    }
    public java.util.List<UpdatePolicyRequestPromptAttackInfoList> getPromptAttackInfoList() {
        return this.promptAttackInfoList;
    }

    public UpdatePolicyRequest setPromptAttackModelInstanceId(Long promptAttackModelInstanceId) {
        this.promptAttackModelInstanceId = promptAttackModelInstanceId;
        return this;
    }
    public Long getPromptAttackModelInstanceId() {
        return this.promptAttackModelInstanceId;
    }

    public UpdatePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePolicyRequest setRegularExpressList(java.util.List<UpdatePolicyRequestRegularExpressList> regularExpressList) {
        this.regularExpressList = regularExpressList;
        return this;
    }
    public java.util.List<UpdatePolicyRequestRegularExpressList> getRegularExpressList() {
        return this.regularExpressList;
    }

    public UpdatePolicyRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public UpdatePolicyRequest setSensitiveConfigList(java.util.List<UpdatePolicyRequestSensitiveConfigList> sensitiveConfigList) {
        this.sensitiveConfigList = sensitiveConfigList;
        return this;
    }
    public java.util.List<UpdatePolicyRequestSensitiveConfigList> getSensitiveConfigList() {
        return this.sensitiveConfigList;
    }

    public UpdatePolicyRequest setSensitiveTopicList(java.util.List<UpdatePolicyRequestSensitiveTopicList> sensitiveTopicList) {
        this.sensitiveTopicList = sensitiveTopicList;
        return this;
    }
    public java.util.List<UpdatePolicyRequestSensitiveTopicList> getSensitiveTopicList() {
        return this.sensitiveTopicList;
    }

    public UpdatePolicyRequest setSensitiveTopicModelInstanceId(Long sensitiveTopicModelInstanceId) {
        this.sensitiveTopicModelInstanceId = sensitiveTopicModelInstanceId;
        return this;
    }
    public Long getSensitiveTopicModelInstanceId() {
        return this.sensitiveTopicModelInstanceId;
    }

    public UpdatePolicyRequest setSensitiveWordList(java.util.List<UpdatePolicyRequestSensitiveWordList> sensitiveWordList) {
        this.sensitiveWordList = sensitiveWordList;
        return this;
    }
    public java.util.List<UpdatePolicyRequestSensitiveWordList> getSensitiveWordList() {
        return this.sensitiveWordList;
    }

    public UpdatePolicyRequest setTopicConfigInfoList(java.util.List<UpdatePolicyRequestTopicConfigInfoList> topicConfigInfoList) {
        this.topicConfigInfoList = topicConfigInfoList;
        return this;
    }
    public java.util.List<UpdatePolicyRequestTopicConfigInfoList> getTopicConfigInfoList() {
        return this.topicConfigInfoList;
    }

    public UpdatePolicyRequest setWordGroupInfoList(java.util.List<UpdatePolicyRequestWordGroupInfoList> wordGroupInfoList) {
        this.wordGroupInfoList = wordGroupInfoList;
        return this;
    }
    public java.util.List<UpdatePolicyRequestWordGroupInfoList> getWordGroupInfoList() {
        return this.wordGroupInfoList;
    }

    public UpdatePolicyRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdatePolicyRequestHarmfulCategoryConfigInfoList extends TeaModel {
        /**
         * <p>Harmful category configuration ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryConfigId")
        public Long categoryConfigId;

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
         * <p>2</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static UpdatePolicyRequestHarmfulCategoryConfigInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestHarmfulCategoryConfigInfoList self = new UpdatePolicyRequestHarmfulCategoryConfigInfoList();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestHarmfulCategoryConfigInfoList setCategoryConfigId(Long categoryConfigId) {
            this.categoryConfigId = categoryConfigId;
            return this;
        }
        public Long getCategoryConfigId() {
            return this.categoryConfigId;
        }

        public UpdatePolicyRequestHarmfulCategoryConfigInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public UpdatePolicyRequestHarmfulCategoryConfigInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public UpdatePolicyRequestHarmfulCategoryConfigInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public UpdatePolicyRequestHarmfulCategoryConfigInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public UpdatePolicyRequestHarmfulCategoryConfigInfoList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public UpdatePolicyRequestHarmfulCategoryConfigInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class UpdatePolicyRequestPromptAttackInfo extends TeaModel {
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
         * <p>2</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static UpdatePolicyRequestPromptAttackInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestPromptAttackInfo self = new UpdatePolicyRequestPromptAttackInfo();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestPromptAttackInfo setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public UpdatePolicyRequestPromptAttackInfo setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class UpdatePolicyRequestPromptAttackInfoList extends TeaModel {
        /**
         * <p>Harmful category configuration ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryConfigId")
        public Long categoryConfigId;

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

        public static UpdatePolicyRequestPromptAttackInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestPromptAttackInfoList self = new UpdatePolicyRequestPromptAttackInfoList();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestPromptAttackInfoList setCategoryConfigId(Long categoryConfigId) {
            this.categoryConfigId = categoryConfigId;
            return this;
        }
        public Long getCategoryConfigId() {
            return this.categoryConfigId;
        }

        public UpdatePolicyRequestPromptAttackInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public UpdatePolicyRequestPromptAttackInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public UpdatePolicyRequestPromptAttackInfoList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public UpdatePolicyRequestPromptAttackInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class UpdatePolicyRequestRegularExpressList extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("RegularExpress")
        public String regularExpress;

        @NameInMap("RegularExpressName")
        public String regularExpressName;

        public static UpdatePolicyRequestRegularExpressList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestRegularExpressList self = new UpdatePolicyRequestRegularExpressList();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestRegularExpressList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public UpdatePolicyRequestRegularExpressList setRegularExpress(String regularExpress) {
            this.regularExpress = regularExpress;
            return this;
        }
        public String getRegularExpress() {
            return this.regularExpress;
        }

        public UpdatePolicyRequestRegularExpressList setRegularExpressName(String regularExpressName) {
            this.regularExpressName = regularExpressName;
            return this;
        }
        public String getRegularExpressName() {
            return this.regularExpressName;
        }

    }

    public static class UpdatePolicyRequestSensitiveConfigList extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("IsEnabled")
        public Integer isEnabled;

        @NameInMap("SensitiveConfigId")
        public Long sensitiveConfigId;

        public static UpdatePolicyRequestSensitiveConfigList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestSensitiveConfigList self = new UpdatePolicyRequestSensitiveConfigList();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestSensitiveConfigList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public UpdatePolicyRequestSensitiveConfigList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public UpdatePolicyRequestSensitiveConfigList setSensitiveConfigId(Long sensitiveConfigId) {
            this.sensitiveConfigId = sensitiveConfigId;
            return this;
        }
        public Long getSensitiveConfigId() {
            return this.sensitiveConfigId;
        }

    }

    public static class UpdatePolicyRequestSensitiveTopicListTopicExampleInfoList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ExampleType")
        public Integer exampleType;

        public static UpdatePolicyRequestSensitiveTopicListTopicExampleInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestSensitiveTopicListTopicExampleInfoList self = new UpdatePolicyRequestSensitiveTopicListTopicExampleInfoList();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestSensitiveTopicListTopicExampleInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdatePolicyRequestSensitiveTopicListTopicExampleInfoList setExampleType(Integer exampleType) {
            this.exampleType = exampleType;
            return this;
        }
        public Integer getExampleType() {
            return this.exampleType;
        }

    }

    public static class UpdatePolicyRequestSensitiveTopicList extends TeaModel {
        @NameInMap("CategoryType")
        public Integer categoryType;

        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        @NameInMap("TopicDefinition")
        public String topicDefinition;

        @NameInMap("TopicExampleInfoList")
        public java.util.List<UpdatePolicyRequestSensitiveTopicListTopicExampleInfoList> topicExampleInfoList;

        @NameInMap("TopicName")
        public String topicName;

        public static UpdatePolicyRequestSensitiveTopicList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestSensitiveTopicList self = new UpdatePolicyRequestSensitiveTopicList();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestSensitiveTopicList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public UpdatePolicyRequestSensitiveTopicList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public UpdatePolicyRequestSensitiveTopicList setTopicDefinition(String topicDefinition) {
            this.topicDefinition = topicDefinition;
            return this;
        }
        public String getTopicDefinition() {
            return this.topicDefinition;
        }

        public UpdatePolicyRequestSensitiveTopicList setTopicExampleInfoList(java.util.List<UpdatePolicyRequestSensitiveTopicListTopicExampleInfoList> topicExampleInfoList) {
            this.topicExampleInfoList = topicExampleInfoList;
            return this;
        }
        public java.util.List<UpdatePolicyRequestSensitiveTopicListTopicExampleInfoList> getTopicExampleInfoList() {
            return this.topicExampleInfoList;
        }

        public UpdatePolicyRequestSensitiveTopicList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class UpdatePolicyRequestSensitiveWordList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Word")
        public String word;

        public static UpdatePolicyRequestSensitiveWordList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestSensitiveWordList self = new UpdatePolicyRequestSensitiveWordList();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestSensitiveWordList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public UpdatePolicyRequestSensitiveWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class UpdatePolicyRequestTopicConfigInfoList extends TeaModel {
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
         * <p>3</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>Topic name</p>
         * 
         * <strong>example:</strong>
         * <p>Buss.</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        public static UpdatePolicyRequestTopicConfigInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestTopicConfigInfoList self = new UpdatePolicyRequestTopicConfigInfoList();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestTopicConfigInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public UpdatePolicyRequestTopicConfigInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public UpdatePolicyRequestTopicConfigInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public UpdatePolicyRequestTopicConfigInfoList setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public UpdatePolicyRequestTopicConfigInfoList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class UpdatePolicyRequestWordGroupInfoList extends TeaModel {
        /**
         * <p>Keyword group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5fa285a60a9342e097cb7a3491ec00cc</p>
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

        public static UpdatePolicyRequestWordGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestWordGroupInfoList self = new UpdatePolicyRequestWordGroupInfoList();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestWordGroupInfoList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public UpdatePolicyRequestWordGroupInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdatePolicyRequestWordGroupInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

    }

}
