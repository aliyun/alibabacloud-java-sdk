// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetModelInputContentDetectResultResponseBody extends TeaModel {
    /**
     * <p>Status code, 00000 indicates success; others indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Detection result object</p>
     */
    @NameInMap("DetectResultList")
    public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultList> detectResultList;

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
     * <p>Number of processed items in the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProcessedCount")
    public Integer processedCount;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. true means success, false means failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5d85cd38-03b2-49fd-86b2-be85c4b13215</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Task processing status:
     * 0: Queued
     * 1: Processing
     * 2: Completed
     * 3: Failed</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetModelInputContentDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelInputContentDetectResultResponseBody self = new GetModelInputContentDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelInputContentDetectResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetModelInputContentDetectResultResponseBody setDetectResultList(java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultList> detectResultList) {
        this.detectResultList = detectResultList;
        return this;
    }
    public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultList> getDetectResultList() {
        return this.detectResultList;
    }

    public GetModelInputContentDetectResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetModelInputContentDetectResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetModelInputContentDetectResultResponseBody setProcessedCount(Integer processedCount) {
        this.processedCount = processedCount;
        return this;
    }
    public Integer getProcessedCount() {
        return this.processedCount;
    }

    public GetModelInputContentDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelInputContentDetectResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetModelInputContentDetectResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetModelInputContentDetectResultResponseBody setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public GetModelInputContentDetectResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList extends TeaModel {
        /**
         * <p>Word</p>
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

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList setWordLabel(String wordLabel) {
            this.wordLabel = wordLabel;
            return this;
        }
        public String getWordLabel() {
            return this.wordLabel;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList extends TeaModel {
        /**
         * <p>Keyword detection result object list</p>
         */
        @NameInMap("BlockWordList")
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList;

        /**
         * <p>Keyword group name</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList setBlockWordList(java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList) {
            this.blockWordList = blockWordList;
            return this;
        }
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> getBlockWordList() {
            return this.blockWordList;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord extends TeaModel {
        /**
         * <p>Keyword detection result object list</p>
         */
        @NameInMap("BlockWordGroupInfoList")
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord setBlockWordGroupInfoList(java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList) {
            this.blockWordGroupInfoList = blockWordGroupInfoList;
            return this;
        }
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList> getBlockWordGroupInfoList() {
            return this.blockWordGroupInfoList;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList extends TeaModel {
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

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics extends TeaModel {
        /**
         * <p>ConfidenceScore</p>
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
         * <p>List of sensitive topics</p>
         */
        @NameInMap("TopicInfoList")
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList> topicInfoList;

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics setTopicInfoList(java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList> topicInfoList) {
            this.topicInfoList = topicInfoList;
            return this;
        }
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList> getTopicInfoList() {
            return this.topicInfoList;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList extends TeaModel {
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
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        /**
         * <p>Sub-category label</p>
         * 
         * <strong>example:</strong>
         * <p>morality_ethics</p>
         */
        @NameInMap("SubCategoryLabel")
        public String subCategoryLabel;

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setSubCategoryLabel(String subCategoryLabel) {
            this.subCategoryLabel = subCategoryLabel;
            return this;
        }
        public String getSubCategoryLabel() {
            return this.subCategoryLabel;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories extends TeaModel {
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
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories setHarmfulCategoryInfoList(java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList) {
            this.harmfulCategoryInfoList = harmfulCategoryInfoList;
            return this;
        }
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> getHarmfulCategoryInfoList() {
            return this.harmfulCategoryInfoList;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList extends TeaModel {
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
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack extends TeaModel {
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
         * <p>Prompt attack list</p>
         */
        @NameInMap("PromptAttackInfoList")
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList> promptAttackInfoList;

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

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setPromptAttackInfo(String promptAttackInfo) {
            this.promptAttackInfo = promptAttackInfo;
            return this;
        }
        public String getPromptAttackInfo() {
            return this.promptAttackInfo;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setPromptAttackInfoList(java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList> promptAttackInfoList) {
            this.promptAttackInfoList = promptAttackInfoList;
            return this;
        }
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList> getPromptAttackInfoList() {
            return this.promptAttackInfoList;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo extends TeaModel {
        /**
         * <p>Detected keywords</p>
         */
        @NameInMap("BlockWord")
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord blockWord;

        /**
         * <p>Sensitive topic object list</p>
         */
        @NameInMap("DenyTopics")
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics denyTopics;

        /**
         * <p>List of harmful category result objects</p>
         */
        @NameInMap("HarmfulCategories")
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories harmfulCategories;

        /**
         * <p>Prompt attack information</p>
         */
        @NameInMap("PromptAttack")
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack promptAttack;

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo setBlockWord(GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord blockWord) {
            this.blockWord = blockWord;
            return this;
        }
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord getBlockWord() {
            return this.blockWord;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo setDenyTopics(GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics denyTopics) {
            this.denyTopics = denyTopics;
            return this;
        }
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics getDenyTopics() {
            return this.denyTopics;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo setHarmfulCategories(GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories harmfulCategories) {
            this.harmfulCategories = harmfulCategories;
            return this;
        }
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories getHarmfulCategories() {
            return this.harmfulCategories;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo setPromptAttack(GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack promptAttack) {
            this.promptAttack = promptAttack;
            return this;
        }
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack getPromptAttack() {
            return this.promptAttack;
        }

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultList extends TeaModel {
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
         * <p>0: Queued
         * 1: Processing
         * 2: Completed
         * 3: Failed</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Inspection result</p>
         */
        @NameInMap("TraceInfo")
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo traceInfo;

        public static GetModelInputContentDetectResultResponseBodyDetectResultList build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultList self = new GetModelInputContentDetectResultResponseBodyDetectResultList();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultList setTraceInfo(GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfo getTraceInfo() {
            return this.traceInfo;
        }

    }

}
