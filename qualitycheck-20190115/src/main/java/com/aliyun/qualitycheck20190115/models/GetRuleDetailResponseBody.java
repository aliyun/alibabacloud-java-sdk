// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRuleDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4987D326-83D9-4A42-B9A5-0B27F9B40539</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRuleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDetailResponseBody self = new GetRuleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleDetailResponseBody setData(GetRuleDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuleDetailResponseBodyData getData() {
        return this.data;
    }

    public GetRuleDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRuleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("AnchorCid")
        public String anchorCid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitTime")
        public Integer hitTime;

        /**
         * <strong>example:</strong>
         * <p>AFTER</p>
         */
        @NameInMap("Location")
        public String location;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor setAnchorCid(String anchorCid) {
            this.anchorCid = anchorCid;
            return this;
        }
        public String getAnchorCid() {
            return this.anchorCid;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor setHitTime(Integer hitTime) {
            this.hitTime = hitTime;
            return this;
        }
        public Integer getHitTime() {
            return this.hitTime;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("To")
        public Integer to;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Absolute")
        public Boolean absolute;

        @NameInMap("Anchor")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor anchor;

        @NameInMap("Range")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange range;

        @NameInMap("Role")
        public String role;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange setAbsolute(Boolean absolute) {
            this.absolute = absolute;
            return this;
        }
        public Boolean getAbsolute() {
            return this.absolute;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange setAnchor(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor anchor) {
            this.anchor = anchor;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor getAnchor() {
            return this.anchor;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange setRange(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange range) {
            this.range = range;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange getRange() {
            return this.range;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamAntModelInfo extends TeaModel {
        @NameInMap("AntModelInfo")
        public java.util.List<String> antModelInfo;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamAntModelInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamAntModelInfo self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamAntModelInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamAntModelInfo setAntModelInfo(java.util.List<String> antModelInfo) {
            this.antModelInfo = antModelInfo;
            return this;
        }
        public java.util.List<String> getAntModelInfo() {
            return this.antModelInfo;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes extends TeaModel {
        @NameInMap("Excludes")
        public java.util.List<String> excludes;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes setExcludes(java.util.List<String> excludes) {
            this.excludes = excludes;
            return this;
        }
        public java.util.List<String> getExcludes() {
            return this.excludes;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords extends TeaModel {
        @NameInMap("OperKeyWord")
        public java.util.List<String> operKeyWord;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords setOperKeyWord(java.util.List<String> operKeyWord) {
            this.operKeyWord = operKeyWord;
            return this;
        }
        public java.util.List<String> getOperKeyWord() {
            return this.operKeyWord;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamPvalues extends TeaModel {
        @NameInMap("Pvalues")
        public java.util.List<String> pvalues;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamPvalues build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamPvalues self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamPvalues();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamPvalues setPvalues(java.util.List<String> pvalues) {
            this.pvalues = pvalues;
            return this;
        }
        public java.util.List<String> getPvalues() {
            return this.pvalues;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences extends TeaModel {
        @NameInMap("Reference")
        public java.util.List<String> reference;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences setReference(java.util.List<String> reference) {
            this.reference = reference;
            return this;
        }
        public java.util.List<String> getReference() {
            return this.reference;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences extends TeaModel {
        @NameInMap("SimilarlySentence")
        public java.util.List<String> similarlySentence;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences setSimilarlySentence(java.util.List<String> similarlySentence) {
            this.similarlySentence = similarlySentence;
            return this;
        }
        public java.util.List<String> getSimilarlySentence() {
            return this.similarlySentence;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam extends TeaModel {
        @NameInMap("AntModelInfo")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamAntModelInfo antModelInfo;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Average")
        public Boolean average;

        /**
         * <strong>example:</strong>
         * <p>DIALOGUE</p>
         */
        @NameInMap("BeginType")
        public String beginType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <strong>example:</strong>
         * <p>gt</p>
         */
        @NameInMap("CompareOperator")
        public String compareOperator;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContextChatMatch")
        public Boolean contextChatMatch;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("DelayTime")
        public Integer delayTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DifferentRole")
        public Boolean differentRole;

        @NameInMap("Excludes")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes excludes;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FromEnd")
        public Boolean fromEnd;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitTime")
        public Integer hitTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InSentence")
        public Boolean inSentence;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("KeywordExtension")
        public Boolean keywordExtension;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("KeywordMatchSize")
        public Integer keywordMatchSize;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxEmotionChangeValue")
        public Integer maxEmotionChangeValue;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MinWordSize")
        public Integer minWordSize;

        @NameInMap("NotRegex")
        public String notRegex;

        @NameInMap("OperKeyWords")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords operKeyWords;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Phrase")
        public String phrase;

        @NameInMap("Pvalues")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamPvalues pvalues;

        @NameInMap("References")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences references;

        @NameInMap("Regex")
        public String regex;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Similarity_threshold")
        public Float similarityThreshold;

        @NameInMap("SimilarlySentences")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences similarlySentences;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Target")
        public Integer target;

        @NameInMap("TargetRole")
        public String targetRole;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <strong>example:</strong>
         * <p>280</p>
         */
        @NameInMap("VelocityInMint")
        public Integer velocityInMint;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setAntModelInfo(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamAntModelInfo antModelInfo) {
            this.antModelInfo = antModelInfo;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamAntModelInfo getAntModelInfo() {
            return this.antModelInfo;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setAverage(Boolean average) {
            this.average = average;
            return this;
        }
        public Boolean getAverage() {
            return this.average;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setBeginType(String beginType) {
            this.beginType = beginType;
            return this;
        }
        public String getBeginType() {
            return this.beginType;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setCompareOperator(String compareOperator) {
            this.compareOperator = compareOperator;
            return this;
        }
        public String getCompareOperator() {
            return this.compareOperator;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setContextChatMatch(Boolean contextChatMatch) {
            this.contextChatMatch = contextChatMatch;
            return this;
        }
        public Boolean getContextChatMatch() {
            return this.contextChatMatch;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Integer getDelayTime() {
            return this.delayTime;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setDifferentRole(Boolean differentRole) {
            this.differentRole = differentRole;
            return this;
        }
        public Boolean getDifferentRole() {
            return this.differentRole;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setExcludes(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes excludes) {
            this.excludes = excludes;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes getExcludes() {
            return this.excludes;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setFromEnd(Boolean fromEnd) {
            this.fromEnd = fromEnd;
            return this;
        }
        public Boolean getFromEnd() {
            return this.fromEnd;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setHitTime(Integer hitTime) {
            this.hitTime = hitTime;
            return this;
        }
        public Integer getHitTime() {
            return this.hitTime;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setInSentence(Boolean inSentence) {
            this.inSentence = inSentence;
            return this;
        }
        public Boolean getInSentence() {
            return this.inSentence;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setKeywordExtension(Boolean keywordExtension) {
            this.keywordExtension = keywordExtension;
            return this;
        }
        public Boolean getKeywordExtension() {
            return this.keywordExtension;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setKeywordMatchSize(Integer keywordMatchSize) {
            this.keywordMatchSize = keywordMatchSize;
            return this;
        }
        public Integer getKeywordMatchSize() {
            return this.keywordMatchSize;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setMaxEmotionChangeValue(Integer maxEmotionChangeValue) {
            this.maxEmotionChangeValue = maxEmotionChangeValue;
            return this;
        }
        public Integer getMaxEmotionChangeValue() {
            return this.maxEmotionChangeValue;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setMinWordSize(Integer minWordSize) {
            this.minWordSize = minWordSize;
            return this;
        }
        public Integer getMinWordSize() {
            return this.minWordSize;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setNotRegex(String notRegex) {
            this.notRegex = notRegex;
            return this;
        }
        public String getNotRegex() {
            return this.notRegex;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setOperKeyWords(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords operKeyWords) {
            this.operKeyWords = operKeyWords;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords getOperKeyWords() {
            return this.operKeyWords;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setPhrase(String phrase) {
            this.phrase = phrase;
            return this;
        }
        public String getPhrase() {
            return this.phrase;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setPvalues(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamPvalues pvalues) {
            this.pvalues = pvalues;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamPvalues getPvalues() {
            return this.pvalues;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setReferences(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences references) {
            this.references = references;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences getReferences() {
            return this.references;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setRegex(String regex) {
            this.regex = regex;
            return this;
        }
        public String getRegex() {
            return this.regex;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setSimilarityThreshold(Float similarityThreshold) {
            this.similarityThreshold = similarityThreshold;
            return this;
        }
        public Float getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setSimilarlySentences(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences similarlySentences) {
            this.similarlySentences = similarlySentences;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences getSimilarlySentences() {
            return this.similarlySentences;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setTargetRole(String targetRole) {
            this.targetRole = targetRole;
            return this;
        }
        public String getTargetRole() {
            return this.targetRole;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setVelocityInMint(Integer velocityInMint) {
            this.velocityInMint = velocityInMint;
            return this;
        }
        public Integer getVelocityInMint() {
            return this.velocityInMint;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Oid")
        public String oid;

        /**
         * <strong>example:</strong>
         * <p>operator demo</p>
         */
        @NameInMap("OperName")
        public String operName;

        @NameInMap("Param")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam param;

        /**
         * <strong>example:</strong>
         * <p>REGULAR_EXPRESSION</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo setOid(String oid) {
            this.oid = oid;
            return this;
        }
        public String getOid() {
            return this.oid;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo setOperName(String operName) {
            this.operName = operName;
            return this;
        }
        public String getOperName() {
            return this.operName;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo setParam(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam param) {
            this.param = param;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam getParam() {
            return this.param;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperators extends TeaModel {
        @NameInMap("OperatorBasicInfo")
        public java.util.List<GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo> operatorBasicInfo;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperators build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperators self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperators();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperators setOperatorBasicInfo(java.util.List<GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo> operatorBasicInfo) {
            this.operatorBasicInfo = operatorBasicInfo;
            return this;
        }
        public java.util.List<GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo> getOperatorBasicInfo() {
            return this.operatorBasicInfo;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfo extends TeaModel {
        @NameInMap("CheckRange")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange checkRange;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ConditionInfoCid")
        public String conditionInfoCid;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("OperLambda")
        public String operLambda;

        @NameInMap("Operators")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperators operators;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfo self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfo setCheckRange(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange checkRange) {
            this.checkRange = checkRange;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange getCheckRange() {
            return this.checkRange;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfo setConditionInfoCid(String conditionInfoCid) {
            this.conditionInfoCid = conditionInfoCid;
            return this;
        }
        public String getConditionInfoCid() {
            return this.conditionInfoCid;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfo setOperLambda(String operLambda) {
            this.operLambda = operLambda;
            return this;
        }
        public String getOperLambda() {
            return this.operLambda;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfo setOperators(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperators operators) {
            this.operators = operators;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperators getOperators() {
            return this.operators;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditions extends TeaModel {
        @NameInMap("ConditionBasicInfo")
        public java.util.List<GetRuleDetailResponseBodyDataConditionsConditionBasicInfo> conditionBasicInfo;

        public static GetRuleDetailResponseBodyDataConditions build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditions self = new GetRuleDetailResponseBodyDataConditions();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditions setConditionBasicInfo(java.util.List<GetRuleDetailResponseBodyDataConditionsConditionBasicInfo> conditionBasicInfo) {
            this.conditionBasicInfo = conditionBasicInfo;
            return this;
        }
        public java.util.List<GetRuleDetailResponseBodyDataConditionsConditionBasicInfo> getConditionBasicInfo() {
            return this.conditionBasicInfo;
        }

    }

    public static class GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>264971810</p>
         */
        @NameInMap("Bid")
        public Integer bid;

        @NameInMap("BusinessName")
        public String businessName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceType")
        public Integer serviceType;

        public static GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo self = new GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo setBid(Integer bid) {
            this.bid = bid;
            return this;
        }
        public Integer getBid() {
            return this.bid;
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

    }

    public static class GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories extends TeaModel {
        @NameInMap("BusinessCategoryBasicInfo")
        public java.util.List<GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo> businessCategoryBasicInfo;

        public static GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories self = new GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories setBusinessCategoryBasicInfo(java.util.List<GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo> businessCategoryBasicInfo) {
            this.businessCategoryBasicInfo = businessCategoryBasicInfo;
            return this;
        }
        public java.util.List<GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo> getBusinessCategoryBasicInfo() {
            return this.businessCategoryBasicInfo;
        }

    }

    public static class GetRuleDetailResponseBodyDataRulesRuleBasicInfoTriggers extends TeaModel {
        @NameInMap("Trigger")
        public java.util.List<String> trigger;

        public static GetRuleDetailResponseBodyDataRulesRuleBasicInfoTriggers build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataRulesRuleBasicInfoTriggers self = new GetRuleDetailResponseBodyDataRulesRuleBasicInfoTriggers();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoTriggers setTrigger(java.util.List<String> trigger) {
            this.trigger = trigger;
            return this;
        }
        public java.util.List<String> getTrigger() {
            return this.trigger;
        }

    }

    public static class GetRuleDetailResponseBodyDataRulesRuleBasicInfo extends TeaModel {
        @NameInMap("BusinessCategories")
        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories businessCategories;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Rid")
        public String rid;

        /**
         * <strong>example:</strong>
         * <p>7&amp;&amp;!8</p>
         */
        @NameInMap("RuleLambda")
        public String ruleLambda;

        @NameInMap("Triggers")
        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoTriggers triggers;

        public static GetRuleDetailResponseBodyDataRulesRuleBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataRulesRuleBasicInfo self = new GetRuleDetailResponseBodyDataRulesRuleBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfo setBusinessCategories(GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories businessCategories) {
            this.businessCategories = businessCategories;
            return this;
        }
        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories getBusinessCategories() {
            return this.businessCategories;
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfo setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfo setRuleLambda(String ruleLambda) {
            this.ruleLambda = ruleLambda;
            return this;
        }
        public String getRuleLambda() {
            return this.ruleLambda;
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfo setTriggers(GetRuleDetailResponseBodyDataRulesRuleBasicInfoTriggers triggers) {
            this.triggers = triggers;
            return this;
        }
        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoTriggers getTriggers() {
            return this.triggers;
        }

    }

    public static class GetRuleDetailResponseBodyDataRules extends TeaModel {
        @NameInMap("RuleBasicInfo")
        public java.util.List<GetRuleDetailResponseBodyDataRulesRuleBasicInfo> ruleBasicInfo;

        public static GetRuleDetailResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataRules self = new GetRuleDetailResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataRules setRuleBasicInfo(java.util.List<GetRuleDetailResponseBodyDataRulesRuleBasicInfo> ruleBasicInfo) {
            this.ruleBasicInfo = ruleBasicInfo;
            return this;
        }
        public java.util.List<GetRuleDetailResponseBodyDataRulesRuleBasicInfo> getRuleBasicInfo() {
            return this.ruleBasicInfo;
        }

    }

    public static class GetRuleDetailResponseBodyData extends TeaModel {
        @NameInMap("Conditions")
        public GetRuleDetailResponseBodyDataConditions conditions;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rules")
        public GetRuleDetailResponseBodyDataRules rules;

        public static GetRuleDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyData self = new GetRuleDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyData setConditions(GetRuleDetailResponseBodyDataConditions conditions) {
            this.conditions = conditions;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditions getConditions() {
            return this.conditions;
        }

        public GetRuleDetailResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetRuleDetailResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetRuleDetailResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetRuleDetailResponseBodyData setRules(GetRuleDetailResponseBodyDataRules rules) {
            this.rules = rules;
            return this;
        }
        public GetRuleDetailResponseBodyDataRules getRules() {
            return this.rules;
        }

    }

}
