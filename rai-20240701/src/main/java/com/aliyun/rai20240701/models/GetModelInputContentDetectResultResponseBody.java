// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetModelInputContentDetectResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("DetectResultList")
    public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultList> detectResultList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProcessedCount")
    public Integer processedCount;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>5d85cd38-03b2-49fd-86b2-be85c4b13215</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    /**
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
        @NameInMap("Word")
        public String word;

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
        @NameInMap("BlockWordList")
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList;

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
        @NameInMap("BlockWordGroupInfoList")
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList;

        /**
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

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList extends TeaModel {
        @NameInMap("CategoryLabel")
        public String categoryLabel;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CategoryType")
        public Integer categoryType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

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

    }

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("ConfidenceScore")
        public Double confidenceScore;

        @NameInMap("HarmfulCategoryInfoList")
        public java.util.List<GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList;

        /**
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

    public static class GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack extends TeaModel {
        @NameInMap("PromptAttackInfo")
        public String promptAttackInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack build(java.util.Map<String, ?> map) throws Exception {
            GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack self = new GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack();
            return TeaModel.build(map, self);
        }

        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoPromptAttack setPromptAttackInfo(String promptAttackInfo) {
            this.promptAttackInfo = promptAttackInfo;
            return this;
        }
        public String getPromptAttackInfo() {
            return this.promptAttackInfo;
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
        @NameInMap("BlockWord")
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoBlockWord blockWord;

        @NameInMap("HarmfulCategories")
        public GetModelInputContentDetectResultResponseBodyDetectResultListTraceInfoHarmfulCategories harmfulCategories;

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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

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
