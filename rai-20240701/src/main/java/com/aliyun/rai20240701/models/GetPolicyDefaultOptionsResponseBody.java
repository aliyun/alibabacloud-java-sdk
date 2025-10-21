// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetPolicyDefaultOptionsResponseBody extends TeaModel {
    /**
     * <p>Status code, 00000 indicates success; others indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("EnableSensitiveInputCheck")
    public Integer enableSensitiveInputCheck;

    @NameInMap("EnableSensitiveOutputCheck")
    public Integer enableSensitiveOutputCheck;

    /**
     * <p>List of harmful category objects</p>
     */
    @NameInMap("HarmfulCategoryInfoList")
    public java.util.List<GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList> harmfulCategoryInfoList;

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

    /**
     * <p>Return message.</p>
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
     * <p>Prompt attack detection result object</p>
     */
    @NameInMap("PromptAttackInfo")
    public GetPolicyDefaultOptionsResponseBodyPromptAttackInfo promptAttackInfo;

    /**
     * <p>Prompt attack list</p>
     */
    @NameInMap("PromptAttackInfoList")
    public java.util.List<GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList> promptAttackInfoList;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SensitiveDataTypeList")
    public java.util.List<GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList> sensitiveDataTypeList;

    /**
     * <p>Indicates whether the operation was successful. <code>true</code> means success, <code>false</code> means failure.</p>
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
    public java.util.List<GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList> topicConfigInfoList;

    /**
     * <p>List of keyword group objects</p>
     */
    @NameInMap("WordGroupInfoList")
    public java.util.List<GetPolicyDefaultOptionsResponseBodyWordGroupInfoList> wordGroupInfoList;

    public static GetPolicyDefaultOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyDefaultOptionsResponseBody self = new GetPolicyDefaultOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyDefaultOptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPolicyDefaultOptionsResponseBody setEnableSensitiveInputCheck(Integer enableSensitiveInputCheck) {
        this.enableSensitiveInputCheck = enableSensitiveInputCheck;
        return this;
    }
    public Integer getEnableSensitiveInputCheck() {
        return this.enableSensitiveInputCheck;
    }

    public GetPolicyDefaultOptionsResponseBody setEnableSensitiveOutputCheck(Integer enableSensitiveOutputCheck) {
        this.enableSensitiveOutputCheck = enableSensitiveOutputCheck;
        return this;
    }
    public Integer getEnableSensitiveOutputCheck() {
        return this.enableSensitiveOutputCheck;
    }

    public GetPolicyDefaultOptionsResponseBody setHarmfulCategoryInfoList(java.util.List<GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList> harmfulCategoryInfoList) {
        this.harmfulCategoryInfoList = harmfulCategoryInfoList;
        return this;
    }
    public java.util.List<GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList> getHarmfulCategoryInfoList() {
        return this.harmfulCategoryInfoList;
    }

    public GetPolicyDefaultOptionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPolicyDefaultOptionsResponseBody setInputSafeAnswer(String inputSafeAnswer) {
        this.inputSafeAnswer = inputSafeAnswer;
        return this;
    }
    public String getInputSafeAnswer() {
        return this.inputSafeAnswer;
    }

    public GetPolicyDefaultOptionsResponseBody setInputSafeAnswerSwitch(Integer inputSafeAnswerSwitch) {
        this.inputSafeAnswerSwitch = inputSafeAnswerSwitch;
        return this;
    }
    public Integer getInputSafeAnswerSwitch() {
        return this.inputSafeAnswerSwitch;
    }

    public GetPolicyDefaultOptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPolicyDefaultOptionsResponseBody setOutputSafeAnswer(String outputSafeAnswer) {
        this.outputSafeAnswer = outputSafeAnswer;
        return this;
    }
    public String getOutputSafeAnswer() {
        return this.outputSafeAnswer;
    }

    public GetPolicyDefaultOptionsResponseBody setOutputSafeAnswerSwitch(Integer outputSafeAnswerSwitch) {
        this.outputSafeAnswerSwitch = outputSafeAnswerSwitch;
        return this;
    }
    public Integer getOutputSafeAnswerSwitch() {
        return this.outputSafeAnswerSwitch;
    }

    public GetPolicyDefaultOptionsResponseBody setPromptAttackInfo(GetPolicyDefaultOptionsResponseBodyPromptAttackInfo promptAttackInfo) {
        this.promptAttackInfo = promptAttackInfo;
        return this;
    }
    public GetPolicyDefaultOptionsResponseBodyPromptAttackInfo getPromptAttackInfo() {
        return this.promptAttackInfo;
    }

    public GetPolicyDefaultOptionsResponseBody setPromptAttackInfoList(java.util.List<GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList> promptAttackInfoList) {
        this.promptAttackInfoList = promptAttackInfoList;
        return this;
    }
    public java.util.List<GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList> getPromptAttackInfoList() {
        return this.promptAttackInfoList;
    }

    public GetPolicyDefaultOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolicyDefaultOptionsResponseBody setSensitiveDataTypeList(java.util.List<GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList> sensitiveDataTypeList) {
        this.sensitiveDataTypeList = sensitiveDataTypeList;
        return this;
    }
    public java.util.List<GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList> getSensitiveDataTypeList() {
        return this.sensitiveDataTypeList;
    }

    public GetPolicyDefaultOptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPolicyDefaultOptionsResponseBody setTopicConfigInfoList(java.util.List<GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList> topicConfigInfoList) {
        this.topicConfigInfoList = topicConfigInfoList;
        return this;
    }
    public java.util.List<GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList> getTopicConfigInfoList() {
        return this.topicConfigInfoList;
    }

    public GetPolicyDefaultOptionsResponseBody setWordGroupInfoList(java.util.List<GetPolicyDefaultOptionsResponseBodyWordGroupInfoList> wordGroupInfoList) {
        this.wordGroupInfoList = wordGroupInfoList;
        return this;
    }
    public java.util.List<GetPolicyDefaultOptionsResponseBodyWordGroupInfoList> getWordGroupInfoList() {
        return this.wordGroupInfoList;
    }

    public static class GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList extends TeaModel {
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
         * <p>Harmful category configuration switch
         * 0: Off
         * 1: On</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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

        public static GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList self = new GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList();
            return TeaModel.build(map, self);
        }

        public GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public GetPolicyDefaultOptionsResponseBodyHarmfulCategoryInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetPolicyDefaultOptionsResponseBodyPromptAttackInfo extends TeaModel {
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

        public static GetPolicyDefaultOptionsResponseBodyPromptAttackInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyDefaultOptionsResponseBodyPromptAttackInfo self = new GetPolicyDefaultOptionsResponseBodyPromptAttackInfo();
            return TeaModel.build(map, self);
        }

        public GetPolicyDefaultOptionsResponseBodyPromptAttackInfo setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public GetPolicyDefaultOptionsResponseBodyPromptAttackInfo setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList extends TeaModel {
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
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList self = new GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList();
            return TeaModel.build(map, self);
        }

        public GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public GetPolicyDefaultOptionsResponseBodyPromptAttackInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Example")
        public String example;

        @NameInMap("ExampleProcessed")
        public String exampleProcessed;

        @NameInMap("IsEnabled")
        public Integer isEnabled;

        @NameInMap("MatchAndReplace")
        public String matchAndReplace;

        @NameInMap("SensitiveConfigId")
        public Long sensitiveConfigId;

        @NameInMap("SensitiveName")
        public String sensitiveName;

        public static GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList self = new GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList();
            return TeaModel.build(map, self);
        }

        public GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList setExampleProcessed(String exampleProcessed) {
            this.exampleProcessed = exampleProcessed;
            return this;
        }
        public String getExampleProcessed() {
            return this.exampleProcessed;
        }

        public GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList setMatchAndReplace(String matchAndReplace) {
            this.matchAndReplace = matchAndReplace;
            return this;
        }
        public String getMatchAndReplace() {
            return this.matchAndReplace;
        }

        public GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList setSensitiveConfigId(Long sensitiveConfigId) {
            this.sensitiveConfigId = sensitiveConfigId;
            return this;
        }
        public Long getSensitiveConfigId() {
            return this.sensitiveConfigId;
        }

        public GetPolicyDefaultOptionsResponseBodySensitiveDataTypeList setSensitiveName(String sensitiveName) {
            this.sensitiveName = sensitiveName;
            return this;
        }
        public String getSensitiveName() {
            return this.sensitiveName;
        }

    }

    public static class GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList extends TeaModel {
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
         * <p>0</p>
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
         * <p>Topic name</p>
         * 
         * <strong>example:</strong>
         * <p>Buss.</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        public static GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList self = new GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList();
            return TeaModel.build(map, self);
        }

        public GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetPolicyDefaultOptionsResponseBodyTopicConfigInfoList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetPolicyDefaultOptionsResponseBodyWordGroupInfoList extends TeaModel {
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

        public static GetPolicyDefaultOptionsResponseBodyWordGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyDefaultOptionsResponseBodyWordGroupInfoList self = new GetPolicyDefaultOptionsResponseBodyWordGroupInfoList();
            return TeaModel.build(map, self);
        }

        public GetPolicyDefaultOptionsResponseBodyWordGroupInfoList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetPolicyDefaultOptionsResponseBodyWordGroupInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetPolicyDefaultOptionsResponseBodyWordGroupInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

    }

}
