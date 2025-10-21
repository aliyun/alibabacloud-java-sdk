// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelOutputContentSyncDetectResponseBody extends TeaModel {
    /**
     * <p>Status code, 00000 indicates success; others indicate failure.</p>
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
     * <p>Risk labels, separated by commas if multiple.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("RiskInfo")
    public String riskInfo;

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
     * <p>操作是否成功。true表示成功，false表示失败。</p>
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
    public ModelOutputContentSyncDetectResponseBodyTraceInfo traceInfo;

    public static ModelOutputContentSyncDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelOutputContentSyncDetectResponseBody self = new ModelOutputContentSyncDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelOutputContentSyncDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModelOutputContentSyncDetectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelOutputContentSyncDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModelOutputContentSyncDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelOutputContentSyncDetectResponseBody setRiskInfo(String riskInfo) {
        this.riskInfo = riskInfo;
        return this;
    }
    public String getRiskInfo() {
        return this.riskInfo;
    }

    public ModelOutputContentSyncDetectResponseBody setRiskResult(Integer riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    public Integer getRiskResult() {
        return this.riskResult;
    }

    public ModelOutputContentSyncDetectResponseBody setSafeAnswer(String safeAnswer) {
        this.safeAnswer = safeAnswer;
        return this;
    }
    public String getSafeAnswer() {
        return this.safeAnswer;
    }

    public ModelOutputContentSyncDetectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModelOutputContentSyncDetectResponseBody setTraceInfo(ModelOutputContentSyncDetectResponseBodyTraceInfo traceInfo) {
        this.traceInfo = traceInfo;
        return this;
    }
    public ModelOutputContentSyncDetectResponseBodyTraceInfo getTraceInfo() {
        return this.traceInfo;
    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList extends TeaModel {
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

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList self = new ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList setWordLabel(String wordLabel) {
            this.wordLabel = wordLabel;
            return this;
        }
        public String getWordLabel() {
            return this.wordLabel;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList extends TeaModel {
        /**
         * <p>List of keyword detection result objects</p>
         */
        @NameInMap("BlockWordList")
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList;

        /**
         * <p>Keyword group name</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList self = new ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList setBlockWordList(java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList) {
            this.blockWordList = blockWordList;
            return this;
        }
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> getBlockWordList() {
            return this.blockWordList;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord extends TeaModel {
        /**
         * <p>List of keyword detection result objects</p>
         */
        @NameInMap("BlockWordGroupInfoList")
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord self = new ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord setBlockWordGroupInfoList(java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList) {
            this.blockWordGroupInfoList = blockWordGroupInfoList;
            return this;
        }
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList> getBlockWordGroupInfoList() {
            return this.blockWordGroupInfoList;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList extends TeaModel {
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
         * 1: Risk present</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList self = new ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics extends TeaModel {
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
         * 1: Risk present</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        /**
         * <p>Sensitive topic list</p>
         */
        @NameInMap("TopicInfoList")
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList> topicInfoList;

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics self = new ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics setTopicInfoList(java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList> topicInfoList) {
            this.topicInfoList = topicInfoList;
            return this;
        }
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopicsTopicInfoList> getTopicInfoList() {
            return this.topicInfoList;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList extends TeaModel {
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

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList self = new ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setSubCategoryLabel(String subCategoryLabel) {
            this.subCategoryLabel = subCategoryLabel;
            return this;
        }
        public String getSubCategoryLabel() {
            return this.subCategoryLabel;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories extends TeaModel {
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
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories self = new ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories setHarmfulCategoryInfoList(java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList) {
            this.harmfulCategoryInfoList = harmfulCategoryInfoList;
            return this;
        }
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> getHarmfulCategoryInfoList() {
            return this.harmfulCategoryInfoList;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList extends TeaModel {
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
         * 1: Risk present</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList self = new ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack extends TeaModel {
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
         * <p>List of prompt attacks</p>
         */
        @NameInMap("PromptAttackInfoList")
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList> promptAttackInfoList;

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

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack self = new ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack setPromptAttackInfo(String promptAttackInfo) {
            this.promptAttackInfo = promptAttackInfo;
            return this;
        }
        public String getPromptAttackInfo() {
            return this.promptAttackInfo;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack setPromptAttackInfoList(java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList> promptAttackInfoList) {
            this.promptAttackInfoList = promptAttackInfoList;
            return this;
        }
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttackPromptAttackInfoList> getPromptAttackInfoList() {
            return this.promptAttackInfoList;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList extends TeaModel {
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

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList self = new ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setMaskedContent(String maskedContent) {
            this.maskedContent = maskedContent;
            return this;
        }
        public String getMaskedContent() {
            return this.maskedContent;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setSensitiveCategory(Integer sensitiveCategory) {
            this.sensitiveCategory = sensitiveCategory;
            return this;
        }
        public Integer getSensitiveCategory() {
            return this.sensitiveCategory;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setSensitiveContent(String sensitiveContent) {
            this.sensitiveContent = sensitiveContent;
            return this;
        }
        public String getSensitiveContent() {
            return this.sensitiveContent;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList setSensitiveTypeName(String sensitiveTypeName) {
            this.sensitiveTypeName = sensitiveTypeName;
            return this;
        }
        public String getSensitiveTypeName() {
            return this.sensitiveTypeName;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType extends TeaModel {
        @NameInMap("MaskedContent")
        public String maskedContent;

        @NameInMap("RiskResult")
        public Integer riskResult;

        @NameInMap("SensitiveTypeInfoList")
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList> sensitiveTypeInfoList;

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType self = new ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType setMaskedContent(String maskedContent) {
            this.maskedContent = maskedContent;
            return this;
        }
        public String getMaskedContent() {
            return this.maskedContent;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType setSensitiveTypeInfoList(java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList> sensitiveTypeInfoList) {
            this.sensitiveTypeInfoList = sensitiveTypeInfoList;
            return this;
        }
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveTypeSensitiveTypeInfoList> getSensitiveTypeInfoList() {
            return this.sensitiveTypeInfoList;
        }

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfo extends TeaModel {
        /**
         * <p>Detected keywords</p>
         */
        @NameInMap("BlockWord")
        public ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord blockWord;

        /**
         * <p>Sensitive topic object list</p>
         */
        @NameInMap("DenyTopics")
        public ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics denyTopics;

        /**
         * <p>HarmfulCategories</p>
         */
        @NameInMap("HarmfulCategories")
        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories harmfulCategories;

        /**
         * <p>Prompt attack information</p>
         */
        @NameInMap("PromptAttack")
        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack promptAttack;

        @NameInMap("SensitiveType")
        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType sensitiveType;

        public static ModelOutputContentSyncDetectResponseBodyTraceInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfo self = new ModelOutputContentSyncDetectResponseBodyTraceInfo();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfo setBlockWord(ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord blockWord) {
            this.blockWord = blockWord;
            return this;
        }
        public ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord getBlockWord() {
            return this.blockWord;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfo setDenyTopics(ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics denyTopics) {
            this.denyTopics = denyTopics;
            return this;
        }
        public ModelOutputContentSyncDetectResponseBodyTraceInfoDenyTopics getDenyTopics() {
            return this.denyTopics;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfo setHarmfulCategories(ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories harmfulCategories) {
            this.harmfulCategories = harmfulCategories;
            return this;
        }
        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories getHarmfulCategories() {
            return this.harmfulCategories;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfo setPromptAttack(ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack promptAttack) {
            this.promptAttack = promptAttack;
            return this;
        }
        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack getPromptAttack() {
            return this.promptAttack;
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfo setSensitiveType(ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType sensitiveType) {
            this.sensitiveType = sensitiveType;
            return this;
        }
        public ModelOutputContentSyncDetectResponseBodyTraceInfoSensitiveType getSensitiveType() {
            return this.sensitiveType;
        }

    }

}
