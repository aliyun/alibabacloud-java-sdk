// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelOutputContentSyncDetectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

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
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("RiskInfo")
    public String riskInfo;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RiskResult")
    public Integer riskResult;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Word")
        public String word;

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
        @NameInMap("BlockWordList")
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoListBlockWordList> blockWordList;

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
        @NameInMap("BlockWordGroupInfoList")
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWordBlockWordGroupInfoList> blockWordGroupInfoList;

        /**
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

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList extends TeaModel {
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
         * <p>1</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

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

    }

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("ConfidenceScore")
        public Double confidenceScore;

        @NameInMap("HarmfulCategoryInfoList")
        public java.util.List<ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategoriesHarmfulCategoryInfoList> harmfulCategoryInfoList;

        /**
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

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack extends TeaModel {
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

        public static ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack self = new ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack setPromptAttackInfo(String promptAttackInfo) {
            this.promptAttackInfo = promptAttackInfo;
            return this;
        }
        public String getPromptAttackInfo() {
            return this.promptAttackInfo;
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

    public static class ModelOutputContentSyncDetectResponseBodyTraceInfo extends TeaModel {
        @NameInMap("BlockWord")
        public ModelOutputContentSyncDetectResponseBodyTraceInfoBlockWord blockWord;

        @NameInMap("HarmfulCategories")
        public ModelOutputContentSyncDetectResponseBodyTraceInfoHarmfulCategories harmfulCategories;

        @NameInMap("PromptAttack")
        public ModelOutputContentSyncDetectResponseBodyTraceInfoPromptAttack promptAttack;

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

    }

}
