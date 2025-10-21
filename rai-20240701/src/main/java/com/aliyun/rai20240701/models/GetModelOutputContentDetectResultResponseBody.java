// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetModelOutputContentDetectResultResponseBody extends TeaModel {
    /**
     * <p>Status code, 00000 indicates success; others indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of detection result objects</p>
     */
    @NameInMap("DetectResultList")
    public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultList> detectResultList;

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
     * <p>Whether the operation was successful. true indicates success, false indicates failure.</p>
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

    public static GetModelOutputContentDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelOutputContentDetectResultResponseBody self = new GetModelOutputContentDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelOutputContentDetectResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetModelOutputContentDetectResultResponseBody setDetectResultList(java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultList> detectResultList) {
        this.detectResultList = detectResultList;
        return this;
    }
    public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultList> getDetectResultList() {
        return this.detectResultList;
    }

    public GetModelOutputContentDetectResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetModelOutputContentDetectResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetModelOutputContentDetectResultResponseBody setProcessedCount(Integer processedCount) {
        this.processedCount = processedCount;
        return this;
    }
    public Integer getProcessedCount() {
        return this.processedCount;
    }

    public GetModelOutputContentDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelOutputContentDetectResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetModelOutputContentDetectResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetModelOutputContentDetectResultResponseBody setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public GetModelOutputContentDetectResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList extends TeaModel {
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

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList setWordLabel(String wordLabel) {
            this.wordLabel = wordLabel;
            return this;
        }
        public String getWordLabel() {
            return this.wordLabel;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList extends TeaModel {
        /**
         * <p>List of keyword detection results</p>
         */
        @NameInMap("BlockWordList")
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList;

        /**
         * <p>Keyword group name</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList setBlockWordList(java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList) {
            this.blockWordList = blockWordList;
            return this;
        }
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> getBlockWordList() {
            return this.blockWordList;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord extends TeaModel {
        /**
         * <p>List of keyword detection result objects</p>
         */
        @NameInMap("BlockWordGroupInfoList")
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord setBlockWordGroupInfoList(java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList) {
            this.blockWordGroupInfoList = blockWordGroupInfoList;
            return this;
        }
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList> getBlockWordGroupInfoList() {
            return this.blockWordGroupInfoList;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList extends TeaModel {
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

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics extends TeaModel {
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
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        /**
         * <p>List of sensitive topics</p>
         */
        @NameInMap("TopicInfoList")
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList> topicInfoList;

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics setTopicInfoList(java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList> topicInfoList) {
            this.topicInfoList = topicInfoList;
            return this;
        }
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopicsTopicInfoList> getTopicInfoList() {
            return this.topicInfoList;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList extends TeaModel {
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
         * <p>Sub-category label</p>
         * 
         * <strong>example:</strong>
         * <p>morality_ethics</p>
         */
        @NameInMap("SubCategoryLabel")
        public String subCategoryLabel;

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList setSubCategoryLabel(String subCategoryLabel) {
            this.subCategoryLabel = subCategoryLabel;
            return this;
        }
        public String getSubCategoryLabel() {
            return this.subCategoryLabel;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories extends TeaModel {
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
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList;

        /**
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories setHarmfulCategoryInfoList(java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList) {
            this.harmfulCategoryInfoList = harmfulCategoryInfoList;
            return this;
        }
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> getHarmfulCategoryInfoList() {
            return this.harmfulCategoryInfoList;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList extends TeaModel {
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

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack extends TeaModel {
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
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList> promptAttackInfoList;

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

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = confidenceScore;
            return this;
        }
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setPromptAttackInfo(String promptAttackInfo) {
            this.promptAttackInfo = promptAttackInfo;
            return this;
        }
        public String getPromptAttackInfo() {
            return this.promptAttackInfo;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setPromptAttackInfoList(java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList> promptAttackInfoList) {
            this.promptAttackInfoList = promptAttackInfoList;
            return this;
        }
        public java.util.List<GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttackPromptAttackInfoList> getPromptAttackInfoList() {
            return this.promptAttackInfoList;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo extends TeaModel {
        /**
         * <p>Detected keywords</p>
         */
        @NameInMap("BlockWord")
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord blockWord;

        /**
         * <p>Sensitive topic object list</p>
         */
        @NameInMap("DenyTopics")
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics denyTopics;

        /**
         * <p>List of harmful category result objects</p>
         */
        @NameInMap("HarmfulCategories")
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories harmfulCategories;

        /**
         * <p>PromptAttack</p>
         */
        @NameInMap("PromptAttack")
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack promptAttack;

        public static GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo self = new GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo setBlockWord(GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord blockWord) {
            this.blockWord = blockWord;
            return this;
        }
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord getBlockWord() {
            return this.blockWord;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo setDenyTopics(GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics denyTopics) {
            this.denyTopics = denyTopics;
            return this;
        }
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoDenyTopics getDenyTopics() {
            return this.denyTopics;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo setHarmfulCategories(GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories harmfulCategories) {
            this.harmfulCategories = harmfulCategories;
            return this;
        }
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories getHarmfulCategories() {
            return this.harmfulCategories;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo setPromptAttack(GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack promptAttack) {
            this.promptAttack = promptAttack;
            return this;
        }
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack getPromptAttack() {
            return this.promptAttack;
        }

    }

    public static class GetModelOutputContentDetectResultResponseBodyDetectResultList extends TeaModel {
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
         * <p>Inspection results</p>
         */
        @NameInMap("TraceInfo")
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo traceInfo;

        public static GetModelOutputContentDetectResultResponseBodyDetectResultList build(java.util.Map<String, ?> map) throws Exception {
            GetModelOutputContentDetectResultResponseBodyDetectResultList self = new GetModelOutputContentDetectResultResponseBodyDetectResultList();
            return TeaModel.build(map, self);
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetModelOutputContentDetectResultResponseBodyDetectResultList setTraceInfo(GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }
        public GetModelOutputContentDetectResultResponseBodyDetectResultListTraceInfo getTraceInfo() {
            return this.traceInfo;
        }

    }

}
