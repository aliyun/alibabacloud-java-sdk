// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetPolicyInfoResponseBody extends TeaModel {
    /**
     * <p>Result code, 00000 indicates success; others indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ContentSafeModelInfo")
    public GetPolicyInfoResponseBodyContentSafeModelInfo contentSafeModelInfo;

    @NameInMap("EnableSensitiveInputCheck")
    public Integer enableSensitiveInputCheck;

    @NameInMap("EnableSensitiveOutputCheck")
    public Integer enableSensitiveOutputCheck;

    /**
     * <p>Policy modification time</p>
     * 
     * <strong>example:</strong>
     * <p>1634122349000</p>
     */
    @NameInMap("GmtModified")
    public Long gmtModified;

    /**
     * <p>Harmful category configuration list</p>
     */
    @NameInMap("HarmfulCategoryConfigInfoList")
    public java.util.List<GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InputSafeAnswer")
    public String inputSafeAnswer;

    @NameInMap("InputSafeAnswerSwitch")
    public Integer inputSafeAnswerSwitch;

    @NameInMap("IsSidecarPolicy")
    public Integer isSidecarPolicy;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("OutputSafeAnswer")
    public String outputSafeAnswer;

    @NameInMap("OutputSafeAnswerSwitch")
    public Integer outputSafeAnswerSwitch;

    /**
     * <p>Policy identifier</p>
     * 
     * <strong>example:</strong>
     * <p>x1bc5xgs4uhx</p>
     */
    @NameInMap("PolicyIdentifier")
    public String policyIdentifier;

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
    public GetPolicyInfoResponseBodyPromptAttackInfo promptAttackInfo;

    /**
     * <p>Prompt attack list</p>
     */
    @NameInMap("PromptAttackInfoList")
    public java.util.List<GetPolicyInfoResponseBodyPromptAttackInfoList> promptAttackInfoList;

    @NameInMap("PromptAttackModelInfo")
    public GetPolicyInfoResponseBodyPromptAttackModelInfo promptAttackModelInfo;

    @NameInMap("RegularExpressList")
    public java.util.List<GetPolicyInfoResponseBodyRegularExpressList> regularExpressList;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("SensitiveConfigList")
    public java.util.List<GetPolicyInfoResponseBodySensitiveConfigList> sensitiveConfigList;

    @NameInMap("SensitiveTopicList")
    public java.util.List<GetPolicyInfoResponseBodySensitiveTopicList> sensitiveTopicList;

    @NameInMap("SensitiveTopicModelInfo")
    public GetPolicyInfoResponseBodySensitiveTopicModelInfo sensitiveTopicModelInfo;

    @NameInMap("SensitiveWordList")
    public java.util.List<GetPolicyInfoResponseBodySensitiveWordList> sensitiveWordList;

    /**
     * <p>Indicates whether the operation was successful. <code>true</code> for success, <code>false</code> for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Sensitive topic list</p>
     */
    @NameInMap("TopicConfigInfoList")
    public java.util.List<GetPolicyInfoResponseBodyTopicConfigInfoList> topicConfigInfoList;

    /**
     * <p>Keyword group object list</p>
     */
    @NameInMap("WordGroupInfoList")
    public java.util.List<GetPolicyInfoResponseBodyWordGroupInfoList> wordGroupInfoList;

    public static GetPolicyInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyInfoResponseBody self = new GetPolicyInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPolicyInfoResponseBody setContentSafeModelInfo(GetPolicyInfoResponseBodyContentSafeModelInfo contentSafeModelInfo) {
        this.contentSafeModelInfo = contentSafeModelInfo;
        return this;
    }
    public GetPolicyInfoResponseBodyContentSafeModelInfo getContentSafeModelInfo() {
        return this.contentSafeModelInfo;
    }

    public GetPolicyInfoResponseBody setEnableSensitiveInputCheck(Integer enableSensitiveInputCheck) {
        this.enableSensitiveInputCheck = enableSensitiveInputCheck;
        return this;
    }
    public Integer getEnableSensitiveInputCheck() {
        return this.enableSensitiveInputCheck;
    }

    public GetPolicyInfoResponseBody setEnableSensitiveOutputCheck(Integer enableSensitiveOutputCheck) {
        this.enableSensitiveOutputCheck = enableSensitiveOutputCheck;
        return this;
    }
    public Integer getEnableSensitiveOutputCheck() {
        return this.enableSensitiveOutputCheck;
    }

    public GetPolicyInfoResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public GetPolicyInfoResponseBody setHarmfulCategoryConfigInfoList(java.util.List<GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList) {
        this.harmfulCategoryConfigInfoList = harmfulCategoryConfigInfoList;
        return this;
    }
    public java.util.List<GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList> getHarmfulCategoryConfigInfoList() {
        return this.harmfulCategoryConfigInfoList;
    }

    public GetPolicyInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPolicyInfoResponseBody setInputSafeAnswer(String inputSafeAnswer) {
        this.inputSafeAnswer = inputSafeAnswer;
        return this;
    }
    public String getInputSafeAnswer() {
        return this.inputSafeAnswer;
    }

    public GetPolicyInfoResponseBody setInputSafeAnswerSwitch(Integer inputSafeAnswerSwitch) {
        this.inputSafeAnswerSwitch = inputSafeAnswerSwitch;
        return this;
    }
    public Integer getInputSafeAnswerSwitch() {
        return this.inputSafeAnswerSwitch;
    }

    public GetPolicyInfoResponseBody setIsSidecarPolicy(Integer isSidecarPolicy) {
        this.isSidecarPolicy = isSidecarPolicy;
        return this;
    }
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
    }

    public GetPolicyInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPolicyInfoResponseBody setOutputSafeAnswer(String outputSafeAnswer) {
        this.outputSafeAnswer = outputSafeAnswer;
        return this;
    }
    public String getOutputSafeAnswer() {
        return this.outputSafeAnswer;
    }

    public GetPolicyInfoResponseBody setOutputSafeAnswerSwitch(Integer outputSafeAnswerSwitch) {
        this.outputSafeAnswerSwitch = outputSafeAnswerSwitch;
        return this;
    }
    public Integer getOutputSafeAnswerSwitch() {
        return this.outputSafeAnswerSwitch;
    }

    public GetPolicyInfoResponseBody setPolicyIdentifier(String policyIdentifier) {
        this.policyIdentifier = policyIdentifier;
        return this;
    }
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public GetPolicyInfoResponseBody setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public GetPolicyInfoResponseBody setPromptAttackInfo(GetPolicyInfoResponseBodyPromptAttackInfo promptAttackInfo) {
        this.promptAttackInfo = promptAttackInfo;
        return this;
    }
    public GetPolicyInfoResponseBodyPromptAttackInfo getPromptAttackInfo() {
        return this.promptAttackInfo;
    }

    public GetPolicyInfoResponseBody setPromptAttackInfoList(java.util.List<GetPolicyInfoResponseBodyPromptAttackInfoList> promptAttackInfoList) {
        this.promptAttackInfoList = promptAttackInfoList;
        return this;
    }
    public java.util.List<GetPolicyInfoResponseBodyPromptAttackInfoList> getPromptAttackInfoList() {
        return this.promptAttackInfoList;
    }

    public GetPolicyInfoResponseBody setPromptAttackModelInfo(GetPolicyInfoResponseBodyPromptAttackModelInfo promptAttackModelInfo) {
        this.promptAttackModelInfo = promptAttackModelInfo;
        return this;
    }
    public GetPolicyInfoResponseBodyPromptAttackModelInfo getPromptAttackModelInfo() {
        return this.promptAttackModelInfo;
    }

    public GetPolicyInfoResponseBody setRegularExpressList(java.util.List<GetPolicyInfoResponseBodyRegularExpressList> regularExpressList) {
        this.regularExpressList = regularExpressList;
        return this;
    }
    public java.util.List<GetPolicyInfoResponseBodyRegularExpressList> getRegularExpressList() {
        return this.regularExpressList;
    }

    public GetPolicyInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolicyInfoResponseBody setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public GetPolicyInfoResponseBody setSensitiveConfigList(java.util.List<GetPolicyInfoResponseBodySensitiveConfigList> sensitiveConfigList) {
        this.sensitiveConfigList = sensitiveConfigList;
        return this;
    }
    public java.util.List<GetPolicyInfoResponseBodySensitiveConfigList> getSensitiveConfigList() {
        return this.sensitiveConfigList;
    }

    public GetPolicyInfoResponseBody setSensitiveTopicList(java.util.List<GetPolicyInfoResponseBodySensitiveTopicList> sensitiveTopicList) {
        this.sensitiveTopicList = sensitiveTopicList;
        return this;
    }
    public java.util.List<GetPolicyInfoResponseBodySensitiveTopicList> getSensitiveTopicList() {
        return this.sensitiveTopicList;
    }

    public GetPolicyInfoResponseBody setSensitiveTopicModelInfo(GetPolicyInfoResponseBodySensitiveTopicModelInfo sensitiveTopicModelInfo) {
        this.sensitiveTopicModelInfo = sensitiveTopicModelInfo;
        return this;
    }
    public GetPolicyInfoResponseBodySensitiveTopicModelInfo getSensitiveTopicModelInfo() {
        return this.sensitiveTopicModelInfo;
    }

    public GetPolicyInfoResponseBody setSensitiveWordList(java.util.List<GetPolicyInfoResponseBodySensitiveWordList> sensitiveWordList) {
        this.sensitiveWordList = sensitiveWordList;
        return this;
    }
    public java.util.List<GetPolicyInfoResponseBodySensitiveWordList> getSensitiveWordList() {
        return this.sensitiveWordList;
    }

    public GetPolicyInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPolicyInfoResponseBody setTopicConfigInfoList(java.util.List<GetPolicyInfoResponseBodyTopicConfigInfoList> topicConfigInfoList) {
        this.topicConfigInfoList = topicConfigInfoList;
        return this;
    }
    public java.util.List<GetPolicyInfoResponseBodyTopicConfigInfoList> getTopicConfigInfoList() {
        return this.topicConfigInfoList;
    }

    public GetPolicyInfoResponseBody setWordGroupInfoList(java.util.List<GetPolicyInfoResponseBodyWordGroupInfoList> wordGroupInfoList) {
        this.wordGroupInfoList = wordGroupInfoList;
        return this;
    }
    public java.util.List<GetPolicyInfoResponseBodyWordGroupInfoList> getWordGroupInfoList() {
        return this.wordGroupInfoList;
    }

    public static class GetPolicyInfoResponseBodyContentSafeModelInfo extends TeaModel {
        @NameInMap("EasServiceName")
        public String easServiceName;

        @NameInMap("ModelInstanceId")
        public Long modelInstanceId;

        public static GetPolicyInfoResponseBodyContentSafeModelInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodyContentSafeModelInfo self = new GetPolicyInfoResponseBodyContentSafeModelInfo();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodyContentSafeModelInfo setEasServiceName(String easServiceName) {
            this.easServiceName = easServiceName;
            return this;
        }
        public String getEasServiceName() {
            return this.easServiceName;
        }

        public GetPolicyInfoResponseBodyContentSafeModelInfo setModelInstanceId(Long modelInstanceId) {
            this.modelInstanceId = modelInstanceId;
            return this;
        }
        public Long getModelInstanceId() {
            return this.modelInstanceId;
        }

    }

    public static class GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList extends TeaModel {
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
         * <p>Harmful category configuration switch
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

        public static GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList self = new GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList setCategoryConfigId(Long categoryConfigId) {
            this.categoryConfigId = categoryConfigId;
            return this;
        }
        public Long getCategoryConfigId() {
            return this.categoryConfigId;
        }

        public GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public GetPolicyInfoResponseBodyHarmfulCategoryConfigInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetPolicyInfoResponseBodyPromptAttackInfo extends TeaModel {
        /**
         * <p>Prompt attack configuration switch
         * 0: Off
         * 1: On</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        public static GetPolicyInfoResponseBodyPromptAttackInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodyPromptAttackInfo self = new GetPolicyInfoResponseBodyPromptAttackInfo();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodyPromptAttackInfo setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public GetPolicyInfoResponseBodyPromptAttackInfo setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetPolicyInfoResponseBodyPromptAttackInfoList extends TeaModel {
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
         * <p>Harmful category configuration switch
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

        public static GetPolicyInfoResponseBodyPromptAttackInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodyPromptAttackInfoList self = new GetPolicyInfoResponseBodyPromptAttackInfoList();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodyPromptAttackInfoList setCategoryConfigId(Long categoryConfigId) {
            this.categoryConfigId = categoryConfigId;
            return this;
        }
        public Long getCategoryConfigId() {
            return this.categoryConfigId;
        }

        public GetPolicyInfoResponseBodyPromptAttackInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetPolicyInfoResponseBodyPromptAttackInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetPolicyInfoResponseBodyPromptAttackInfoList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public GetPolicyInfoResponseBodyPromptAttackInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetPolicyInfoResponseBodyPromptAttackModelInfo extends TeaModel {
        @NameInMap("EasServiceName")
        public String easServiceName;

        @NameInMap("ModelInstanceId")
        public Long modelInstanceId;

        public static GetPolicyInfoResponseBodyPromptAttackModelInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodyPromptAttackModelInfo self = new GetPolicyInfoResponseBodyPromptAttackModelInfo();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodyPromptAttackModelInfo setEasServiceName(String easServiceName) {
            this.easServiceName = easServiceName;
            return this;
        }
        public String getEasServiceName() {
            return this.easServiceName;
        }

        public GetPolicyInfoResponseBodyPromptAttackModelInfo setModelInstanceId(Long modelInstanceId) {
            this.modelInstanceId = modelInstanceId;
            return this;
        }
        public Long getModelInstanceId() {
            return this.modelInstanceId;
        }

    }

    public static class GetPolicyInfoResponseBodyRegularExpressList extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("InputOutputType")
        public Integer inputOutputType;

        @NameInMap("IsEnabled")
        public Integer isEnabled;

        @NameInMap("MatchAndReplace")
        public String matchAndReplace;

        @NameInMap("RegularExpress")
        public String regularExpress;

        @NameInMap("RegularExpressId")
        public Long regularExpressId;

        @NameInMap("RegularExpressName")
        public String regularExpressName;

        public static GetPolicyInfoResponseBodyRegularExpressList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodyRegularExpressList self = new GetPolicyInfoResponseBodyRegularExpressList();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodyRegularExpressList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public GetPolicyInfoResponseBodyRegularExpressList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public GetPolicyInfoResponseBodyRegularExpressList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public GetPolicyInfoResponseBodyRegularExpressList setMatchAndReplace(String matchAndReplace) {
            this.matchAndReplace = matchAndReplace;
            return this;
        }
        public String getMatchAndReplace() {
            return this.matchAndReplace;
        }

        public GetPolicyInfoResponseBodyRegularExpressList setRegularExpress(String regularExpress) {
            this.regularExpress = regularExpress;
            return this;
        }
        public String getRegularExpress() {
            return this.regularExpress;
        }

        public GetPolicyInfoResponseBodyRegularExpressList setRegularExpressId(Long regularExpressId) {
            this.regularExpressId = regularExpressId;
            return this;
        }
        public Long getRegularExpressId() {
            return this.regularExpressId;
        }

        public GetPolicyInfoResponseBodyRegularExpressList setRegularExpressName(String regularExpressName) {
            this.regularExpressName = regularExpressName;
            return this;
        }
        public String getRegularExpressName() {
            return this.regularExpressName;
        }

    }

    public static class GetPolicyInfoResponseBodySensitiveConfigList extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("InputOutputType")
        public Integer inputOutputType;

        @NameInMap("IsEnabled")
        public Integer isEnabled;

        @NameInMap("MatchAndReplace")
        public String matchAndReplace;

        @NameInMap("SensitiveConfigId")
        public Long sensitiveConfigId;

        @NameInMap("SensitiveName")
        public String sensitiveName;

        public static GetPolicyInfoResponseBodySensitiveConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodySensitiveConfigList self = new GetPolicyInfoResponseBodySensitiveConfigList();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodySensitiveConfigList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public GetPolicyInfoResponseBodySensitiveConfigList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public GetPolicyInfoResponseBodySensitiveConfigList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public GetPolicyInfoResponseBodySensitiveConfigList setMatchAndReplace(String matchAndReplace) {
            this.matchAndReplace = matchAndReplace;
            return this;
        }
        public String getMatchAndReplace() {
            return this.matchAndReplace;
        }

        public GetPolicyInfoResponseBodySensitiveConfigList setSensitiveConfigId(Long sensitiveConfigId) {
            this.sensitiveConfigId = sensitiveConfigId;
            return this;
        }
        public Long getSensitiveConfigId() {
            return this.sensitiveConfigId;
        }

        public GetPolicyInfoResponseBodySensitiveConfigList setSensitiveName(String sensitiveName) {
            this.sensitiveName = sensitiveName;
            return this;
        }
        public String getSensitiveName() {
            return this.sensitiveName;
        }

    }

    public static class GetPolicyInfoResponseBodySensitiveTopicListTopicExampleInfoList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ExampleType")
        public Long exampleType;

        public static GetPolicyInfoResponseBodySensitiveTopicListTopicExampleInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodySensitiveTopicListTopicExampleInfoList self = new GetPolicyInfoResponseBodySensitiveTopicListTopicExampleInfoList();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodySensitiveTopicListTopicExampleInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetPolicyInfoResponseBodySensitiveTopicListTopicExampleInfoList setExampleType(Long exampleType) {
            this.exampleType = exampleType;
            return this;
        }
        public Long getExampleType() {
            return this.exampleType;
        }

    }

    public static class GetPolicyInfoResponseBodySensitiveTopicList extends TeaModel {
        @NameInMap("CategoryType")
        public Integer categoryType;

        @NameInMap("InputOutputType")
        public Integer inputOutputType;

        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        @NameInMap("TopicDefinition")
        public String topicDefinition;

        @NameInMap("TopicExampleInfoList")
        public java.util.List<GetPolicyInfoResponseBodySensitiveTopicListTopicExampleInfoList> topicExampleInfoList;

        @NameInMap("TopicId")
        public Long topicId;

        @NameInMap("TopicName")
        public String topicName;

        public static GetPolicyInfoResponseBodySensitiveTopicList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodySensitiveTopicList self = new GetPolicyInfoResponseBodySensitiveTopicList();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodySensitiveTopicList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetPolicyInfoResponseBodySensitiveTopicList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public GetPolicyInfoResponseBodySensitiveTopicList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public GetPolicyInfoResponseBodySensitiveTopicList setTopicDefinition(String topicDefinition) {
            this.topicDefinition = topicDefinition;
            return this;
        }
        public String getTopicDefinition() {
            return this.topicDefinition;
        }

        public GetPolicyInfoResponseBodySensitiveTopicList setTopicExampleInfoList(java.util.List<GetPolicyInfoResponseBodySensitiveTopicListTopicExampleInfoList> topicExampleInfoList) {
            this.topicExampleInfoList = topicExampleInfoList;
            return this;
        }
        public java.util.List<GetPolicyInfoResponseBodySensitiveTopicListTopicExampleInfoList> getTopicExampleInfoList() {
            return this.topicExampleInfoList;
        }

        public GetPolicyInfoResponseBodySensitiveTopicList setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetPolicyInfoResponseBodySensitiveTopicList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetPolicyInfoResponseBodySensitiveTopicModelInfo extends TeaModel {
        @NameInMap("EasServiceName")
        public String easServiceName;

        @NameInMap("ModelInstanceId")
        public Long modelInstanceId;

        public static GetPolicyInfoResponseBodySensitiveTopicModelInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodySensitiveTopicModelInfo self = new GetPolicyInfoResponseBodySensitiveTopicModelInfo();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodySensitiveTopicModelInfo setEasServiceName(String easServiceName) {
            this.easServiceName = easServiceName;
            return this;
        }
        public String getEasServiceName() {
            return this.easServiceName;
        }

        public GetPolicyInfoResponseBodySensitiveTopicModelInfo setModelInstanceId(Long modelInstanceId) {
            this.modelInstanceId = modelInstanceId;
            return this;
        }
        public Long getModelInstanceId() {
            return this.modelInstanceId;
        }

    }

    public static class GetPolicyInfoResponseBodySensitiveWordList extends TeaModel {
        @NameInMap("InputOutputType")
        public Integer inputOutputType;

        @NameInMap("Label")
        public String label;

        @NameInMap("Word")
        public String word;

        public static GetPolicyInfoResponseBodySensitiveWordList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodySensitiveWordList self = new GetPolicyInfoResponseBodySensitiveWordList();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodySensitiveWordList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public GetPolicyInfoResponseBodySensitiveWordList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetPolicyInfoResponseBodySensitiveWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class GetPolicyInfoResponseBodyTopicConfigInfoList extends TeaModel {
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

        public static GetPolicyInfoResponseBodyTopicConfigInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodyTopicConfigInfoList self = new GetPolicyInfoResponseBodyTopicConfigInfoList();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodyTopicConfigInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetPolicyInfoResponseBodyTopicConfigInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public GetPolicyInfoResponseBodyTopicConfigInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public GetPolicyInfoResponseBodyTopicConfigInfoList setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetPolicyInfoResponseBodyTopicConfigInfoList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetPolicyInfoResponseBodyWordGroupInfoList extends TeaModel {
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

        public static GetPolicyInfoResponseBodyWordGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyInfoResponseBodyWordGroupInfoList self = new GetPolicyInfoResponseBodyWordGroupInfoList();
            return TeaModel.build(map, self);
        }

        public GetPolicyInfoResponseBodyWordGroupInfoList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetPolicyInfoResponseBodyWordGroupInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetPolicyInfoResponseBodyWordGroupInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

    }

}
