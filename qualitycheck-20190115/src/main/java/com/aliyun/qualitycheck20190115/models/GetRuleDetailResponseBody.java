// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetRuleDetailResponseBodyData data;

    public static GetRuleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDetailResponseBody self = new GetRuleDetailResponseBody();
        return TeaModel.build(map, self);
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

    public GetRuleDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRuleDetailResponseBody setData(GetRuleDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuleDetailResponseBodyData getData() {
        return this.data;
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

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam extends TeaModel {
        @NameInMap("Regex")
        public String regex;

        @NameInMap("Phrase")
        public String phrase;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("InSentence")
        public Boolean inSentence;

        @NameInMap("Target")
        public Integer target;

        @NameInMap("FromEnd")
        public Boolean fromEnd;

        @NameInMap("DifferentRole")
        public Boolean differentRole;

        @NameInMap("TargetRole")
        public String targetRole;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("ContextChatMatch")
        public Boolean contextChatMatch;

        @NameInMap("KeywordMatchSize")
        public Integer keywordMatchSize;

        @NameInMap("Average")
        public Boolean average;

        @NameInMap("VelocityInMint")
        public Integer velocityInMint;

        @NameInMap("MinWordSize")
        public Integer minWordSize;

        @NameInMap("KeywordExtension")
        public Boolean keywordExtension;

        @NameInMap("HitTime")
        public Integer hitTime;

        @NameInMap("From")
        public Integer from;

        @NameInMap("BeginType")
        public String beginType;

        @NameInMap("CompareOperator")
        public String compareOperator;

        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("MaxEmotionChangeValue")
        public Integer maxEmotionChangeValue;

        @NameInMap("OperKeyWords")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords operKeyWords;

        @NameInMap("References")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences references;

        @NameInMap("SimilarlySentences")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences similarlySentences;

        @NameInMap("Excludes")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes excludes;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setRegex(String regex) {
            this.regex = regex;
            return this;
        }
        public String getRegex() {
            return this.regex;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setPhrase(String phrase) {
            this.phrase = phrase;
            return this;
        }
        public String getPhrase() {
            return this.phrase;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setInSentence(Boolean inSentence) {
            this.inSentence = inSentence;
            return this;
        }
        public Boolean getInSentence() {
            return this.inSentence;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setFromEnd(Boolean fromEnd) {
            this.fromEnd = fromEnd;
            return this;
        }
        public Boolean getFromEnd() {
            return this.fromEnd;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setDifferentRole(Boolean differentRole) {
            this.differentRole = differentRole;
            return this;
        }
        public Boolean getDifferentRole() {
            return this.differentRole;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setTargetRole(String targetRole) {
            this.targetRole = targetRole;
            return this;
        }
        public String getTargetRole() {
            return this.targetRole;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setContextChatMatch(Boolean contextChatMatch) {
            this.contextChatMatch = contextChatMatch;
            return this;
        }
        public Boolean getContextChatMatch() {
            return this.contextChatMatch;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setKeywordMatchSize(Integer keywordMatchSize) {
            this.keywordMatchSize = keywordMatchSize;
            return this;
        }
        public Integer getKeywordMatchSize() {
            return this.keywordMatchSize;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setAverage(Boolean average) {
            this.average = average;
            return this;
        }
        public Boolean getAverage() {
            return this.average;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setVelocityInMint(Integer velocityInMint) {
            this.velocityInMint = velocityInMint;
            return this;
        }
        public Integer getVelocityInMint() {
            return this.velocityInMint;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setMinWordSize(Integer minWordSize) {
            this.minWordSize = minWordSize;
            return this;
        }
        public Integer getMinWordSize() {
            return this.minWordSize;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setKeywordExtension(Boolean keywordExtension) {
            this.keywordExtension = keywordExtension;
            return this;
        }
        public Boolean getKeywordExtension() {
            return this.keywordExtension;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setHitTime(Integer hitTime) {
            this.hitTime = hitTime;
            return this;
        }
        public Integer getHitTime() {
            return this.hitTime;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setBeginType(String beginType) {
            this.beginType = beginType;
            return this;
        }
        public String getBeginType() {
            return this.beginType;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setCompareOperator(String compareOperator) {
            this.compareOperator = compareOperator;
            return this;
        }
        public String getCompareOperator() {
            return this.compareOperator;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setMaxEmotionChangeValue(Integer maxEmotionChangeValue) {
            this.maxEmotionChangeValue = maxEmotionChangeValue;
            return this;
        }
        public Integer getMaxEmotionChangeValue() {
            return this.maxEmotionChangeValue;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setOperKeyWords(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords operKeyWords) {
            this.operKeyWords = operKeyWords;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamOperKeyWords getOperKeyWords() {
            return this.operKeyWords;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setReferences(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences references) {
            this.references = references;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamReferences getReferences() {
            return this.references;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setSimilarlySentences(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences similarlySentences) {
            this.similarlySentences = similarlySentences;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamSimilarlySentences getSimilarlySentences() {
            return this.similarlySentences;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setExcludes(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes excludes) {
            this.excludes = excludes;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamExcludes getExcludes() {
            return this.excludes;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo extends TeaModel {
        @NameInMap("Oid")
        public String oid;

        @NameInMap("Type")
        public String type;

        @NameInMap("OperName")
        public String operName;

        @NameInMap("Param")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam param;

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

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperatorsOperatorBasicInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor extends TeaModel {
        @NameInMap("AnchorCid")
        public String anchorCid;

        @NameInMap("Location")
        public String location;

        @NameInMap("HitTime")
        public Integer hitTime;

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

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor setHitTime(Integer hitTime) {
            this.hitTime = hitTime;
            return this;
        }
        public Integer getHitTime() {
            return this.hitTime;
        }

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange extends TeaModel {
        @NameInMap("From")
        public Integer from;

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
        @NameInMap("Role")
        public String role;

        @NameInMap("Absolute")
        public Boolean absolute;

        @NameInMap("Anchor")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeAnchor anchor;

        @NameInMap("Range")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRangeRange range;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
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

    }

    public static class GetRuleDetailResponseBodyDataConditionsConditionBasicInfo extends TeaModel {
        @NameInMap("ConditionInfoCid")
        public String conditionInfoCid;

        @NameInMap("OperLambda")
        public String operLambda;

        @NameInMap("Operators")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoOperators operators;

        @NameInMap("CheckRange")
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange checkRange;

        public static GetRuleDetailResponseBodyDataConditionsConditionBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataConditionsConditionBasicInfo self = new GetRuleDetailResponseBodyDataConditionsConditionBasicInfo();
            return TeaModel.build(map, self);
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

        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfo setCheckRange(GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange checkRange) {
            this.checkRange = checkRange;
            return this;
        }
        public GetRuleDetailResponseBodyDataConditionsConditionBasicInfoCheckRange getCheckRange() {
            return this.checkRange;
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

    public static class GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo extends TeaModel {
        @NameInMap("Bid")
        public Integer bid;

        @NameInMap("ServiceType")
        public Integer serviceType;

        @NameInMap("BusinessName")
        public String businessName;

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

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategoriesBusinessCategoryBasicInfo setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
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

    public static class GetRuleDetailResponseBodyDataRulesRuleBasicInfo extends TeaModel {
        @NameInMap("Rid")
        public String rid;

        @NameInMap("RuleLambda")
        public String ruleLambda;

        @NameInMap("Triggers")
        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoTriggers triggers;

        @NameInMap("BusinessCategories")
        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories businessCategories;

        public static GetRuleDetailResponseBodyDataRulesRuleBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyDataRulesRuleBasicInfo self = new GetRuleDetailResponseBodyDataRulesRuleBasicInfo();
            return TeaModel.build(map, self);
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

        public GetRuleDetailResponseBodyDataRulesRuleBasicInfo setBusinessCategories(GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories businessCategories) {
            this.businessCategories = businessCategories;
            return this;
        }
        public GetRuleDetailResponseBodyDataRulesRuleBasicInfoBusinessCategories getBusinessCategories() {
            return this.businessCategories;
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

        public GetRuleDetailResponseBodyData setRules(GetRuleDetailResponseBodyDataRules rules) {
            this.rules = rules;
            return this;
        }
        public GetRuleDetailResponseBodyDataRules getRules() {
            return this.rules;
        }

    }

}
