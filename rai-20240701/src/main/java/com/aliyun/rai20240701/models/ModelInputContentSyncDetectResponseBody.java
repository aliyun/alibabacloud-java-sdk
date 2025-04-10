// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelInputContentSyncDetectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskResult")
    public Integer riskResult;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Word")
        public String word;

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
        @NameInMap("BlockWordList")
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList;

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
        @NameInMap("BlockWordGroupInfoList")
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList;

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

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList extends TeaModel {
        @NameInMap("CategoryLabel")
        public String categoryLabel;

        @NameInMap("CategoryType")
        public Integer categoryType;

        @NameInMap("RiskResult")
        public Integer riskResult;

        @NameInMap("SecurityLevel")
        public Integer securityLevel;

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

    }

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories extends TeaModel {
        @NameInMap("ConfidenceScore")
        public Double confidenceScore;

        @NameInMap("HarmfulCategoryInfoList")
        public java.util.List<ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList;

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

    public static class ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack extends TeaModel {
        @NameInMap("ConfidenceScore")
        public Double confidenceScore;

        @NameInMap("PromptAttackInfo")
        public String promptAttackInfo;

        @NameInMap("RiskResult")
        public Integer riskResult;

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

    public static class ModelInputContentSyncDetectResponseBodyTraceInfo extends TeaModel {
        @NameInMap("BlockWord")
        public ModelInputContentSyncDetectResponseBodyTraceInfoBlockWord blockWord;

        @NameInMap("HarmfulCategories")
        public ModelInputContentSyncDetectResponseBodyTraceInfoHarmfulCategories harmfulCategories;

        @NameInMap("PromptAttack")
        public ModelInputContentSyncDetectResponseBodyTraceInfoPromptAttack promptAttack;

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

    }

}
