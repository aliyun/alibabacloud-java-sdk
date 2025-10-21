// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelInputContentSyncDetectResponseBody extends TeaModel {
    /**
     * <p>Result code, 00000 indicates success; others indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>0: No risk
     * 1: Risk exists</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RiskResult")
    public Integer riskResult;

    @NameInMap("SafeAnswer")
    public String safeAnswer;

    /**
     * <p>Whether the operation was successful. true indicates success, false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Inspection result</p>
     */
    @NameInMap("TraceInfo")
    public ModelInputContentSyncDetectResponseBodyTraceInfo traceInfo;

    public static ModelInputContentSyncDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelInputContentSyncDetectResponseBody self = new ModelInputContentSyncDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelInputContentSyncDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModelInputContentSyncDetectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelInputContentSyncDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModelInputContentSyncDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelInputContentSyncDetectResponseBody setRiskResult(Integer riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    public Integer getRiskResult() {
        return this.riskResult;
    }

    public ModelInputContentSyncDetectResponseBody setSafeAnswer(String safeAnswer) {
        this.safeAnswer = safeAnswer;
        return this;
    }
    public String getSafeAnswer() {
        return this.safeAnswer;
    }

    public ModelInputContentSyncDetectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModelInputContentSyncDetectResponseBody setTraceInfo(ModelInputContentSyncDetectResponseBodyTraceInfo traceInfo) {
        this.traceInfo = traceInfo;
        return this;
    }
    public ModelInputContentSyncDetectResponseBodyTraceInfo getTraceInfo() {
        return this.traceInfo;
    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList extends TeaModel {
        /**
         * <p>Keyword</p>
         * 
         * <strong>example:</strong>
         * <p>testWord</p>
         */
        @NameInMap("Word")
        public String word;

        /**
         * <p>Label</p>
         * 
         * <strong>example:</strong>
         * <p>testLabel</p>
         */
        @NameInMap("WordLabel")
        public String wordLabel;

        public static ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList self = new ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList setWordLabel(String wordLabel) {
            this.wordLabel = wordLabel;
            return this;
        }
        public String getWordLabel() {
            return this.wordLabel;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList extends TeaModel {
        /**
         * <p>List of keyword detection results</p>
         */
        @NameInMap("BlockWordList")
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList;

        /**
         * <p>Keyword group name</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList self = new ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList setBlockWordList(java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList) {
            this.blockWordList = blockWordList;
            return this;
        }
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> getBlockWordList() {
            return this.blockWordList;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord extends TeaModel {
        /**
         * <p>List of keyword detection result objects</p>
         */
        @NameInMap("BlockWordGroupInfoList")
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        public static ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord self = new ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord setBlockWordGroupInfoList(java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList) {
            this.blockWordGroupInfoList = blockWordGroupInfoList;
            return this;
        }
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList> getBlockWordGroupInfoList() {
            return this.blockWordGroupInfoList;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList extends TeaModel {
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
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

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
         * <p>Topic name</p>
         * 
         * <strong>example:</strong>
         * <p>Buss.</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        public static ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList self = new ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics extends TeaModel {
        /**
         * <p>Confidence score</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ConfidenceScore")
        public Double confidenceScore;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        /**
         * <p>Sensitive topic list</p>
         */
        @NameInMap("TopicInfoList")
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList> topicInfoList;

        public static ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics self = new ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics setTopicInfoList(java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList> topicInfoList) {
            this.topicInfoList = topicInfoList;
            return this;
        }
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList> getTopicInfoList() {
            return this.topicInfoList;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList extends TeaModel {
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
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

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
         * <p>Subcategory label</p>
         * 
         * <strong>example:</strong>
         * <p>morality_ethics</p>
         */
        @NameInMap("SubCategoryLabel")
        public String subCategoryLabel;

        public static ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList self = new ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setSubCategoryLabel(String subCategoryLabel) {
            this.subCategoryLabel = subCategoryLabel;
            return this;
        }
        public String getSubCategoryLabel() {
            return this.subCategoryLabel;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories extends TeaModel {
        /**
         * <p>Confidence score</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ConfidenceScore")
        public Double confidenceScore;

        /**
         * <p>List of harmful category objects</p>
         */
        @NameInMap("HarmfulCategoryInfoList")
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        public static ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories self = new ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories setHarmfulCategoryInfoList(java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList) {
            this.harmfulCategoryInfoList = harmfulCategoryInfoList;
            return this;
        }
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> getHarmfulCategoryInfoList() {
            return this.harmfulCategoryInfoList;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList extends TeaModel {
        /**
         * <p>Category name</p>
         * 
         * <strong>example:</strong>
         * <p>Role Play</p>
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
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

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

        public static ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList self = new ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack extends TeaModel {
        /**
         * <p>Confidence score</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ConfidenceScore")
        public Double confidenceScore;

        /**
         * <p>Prompt attack detection result object</p>
         * 
         * <strong>example:</strong>
         * <p>Role Play</p>
         */
        @NameInMap("PromptAttackInfo")
        public String promptAttackInfo;

        /**
         * <p>List of prompt attack objects</p>
         */
        @NameInMap("PromptAttackInfoList")
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList> promptAttackInfoList;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

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

        public static ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack self = new ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack setPromptAttackInfo(String promptAttackInfo) {
            this.promptAttackInfo = promptAttackInfo;
            return this;
        }
        public String getPromptAttackInfo() {
            return this.promptAttackInfo;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack setPromptAttackInfoList(java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList> promptAttackInfoList) {
            this.promptAttackInfoList = promptAttackInfoList;
            return this;
        }
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList> getPromptAttackInfoList() {
            return this.promptAttackInfoList;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("MaskedContent")
        public String maskedContent;

        @NameInMap("SensitiveCategory")
        public Integer sensitiveCategory;

        @NameInMap("SensitiveContent")
        public String sensitiveContent;

        @NameInMap("SensitiveTypeName")
        public String sensitiveTypeName;

        public static ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList self = new ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setMaskedContent(String maskedContent) {
            this.maskedContent = maskedContent;
            return this;
        }
        public String getMaskedContent() {
            return this.maskedContent;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setSensitiveCategory(Integer sensitiveCategory) {
            this.sensitiveCategory = sensitiveCategory;
            return this;
        }
        public Integer getSensitiveCategory() {
            return this.sensitiveCategory;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setSensitiveContent(String sensitiveContent) {
            this.sensitiveContent = sensitiveContent;
            return this;
        }
        public String getSensitiveContent() {
            return this.sensitiveContent;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setSensitiveTypeName(String sensitiveTypeName) {
            this.sensitiveTypeName = sensitiveTypeName;
            return this;
        }
        public String getSensitiveTypeName() {
            return this.sensitiveTypeName;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType extends TeaModel {
        @NameInMap("MaskedContent")
        public String maskedContent;

        @NameInMap("RiskResult")
        public Integer riskResult;

        @NameInMap("SensitiveTypeInfoList")
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList> sensitiveTypeInfoList;

        public static ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType self = new ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType setMaskedContent(String maskedContent) {
            this.maskedContent = maskedContent;
            return this;
        }
        public String getMaskedContent() {
            return this.maskedContent;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType setSensitiveTypeInfoList(java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList> sensitiveTypeInfoList) {
            this.sensitiveTypeInfoList = sensitiveTypeInfoList;
            return this;
        }
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList> getSensitiveTypeInfoList() {
            return this.sensitiveTypeInfoList;
        }

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfo extends TeaModel {
        /**
         * <p>Detected keywords</p>
         */
        @NameInMap("BlockWord")
        public ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord blockWord;

        /**
         * <p>Sensitive topic object list</p>
         */
        @NameInMap("DenyTopics")
        public ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics denyTopics;

        /**
         * <p>HarmfulCategories</p>
         */
        @NameInMap("HarmfulCategories")
        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories harmfulCategories;

        /**
         * <p>Prompt attack information</p>
         */
        @NameInMap("PromptAttack")
        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack promptAttack;

        @NameInMap("SensitiveType")
        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType sensitiveType;

        public static ModelInputContentSyncDetectResponseBodyTraceInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectResponseBodyTraceInfo self = new ModelInputContentSyncDetectResponseBodyTraceInfo();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfo setBlockWord(ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord blockWord) {
            this.blockWord = blockWord;
            return this;
        }
        public ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord getBlockWord() {
            return this.blockWord;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfo setDenyTopics(ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics denyTopics) {
            this.denyTopics = denyTopics;
            return this;
        }
        public ModelInputContentSyncDetectResponseBodyTraceInfoDenyTopics getDenyTopics() {
            return this.denyTopics;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfo setHarmfulCategories(ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories harmfulCategories) {
            this.harmfulCategories = harmfulCategories;
            return this;
        }
        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories getHarmfulCategories() {
            return this.harmfulCategories;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfo setPromptAttack(ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack promptAttack) {
            this.promptAttack = promptAttack;
            return this;
        }
        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack getPromptAttack() {
            return this.promptAttack;
        }

        public ModelInputContentSyncDetectResponseBodyTraceInfo setSensitiveType(ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType sensitiveType) {
            this.sensitiveType = sensitiveType;
            return this;
        }
        public ModelInputContentSyncDetectResponseBodyTraceInfoSensitiveType getSensitiveType() {
            return this.sensitiveType;
        }

    }

}
