// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public GetResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCountId")
    public String resultCountId;

    @NameInMap("Success")
    public Boolean success;

    public static GetResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResultResponseBody self = new GetResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResultResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetResultResponseBody setData(GetResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResultResponseBodyData getData() {
        return this.data;
    }

    public GetResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResultResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResultResponseBody setResultCountId(String resultCountId) {
        this.resultCountId = resultCountId;
        return this;
    }
    public String getResultCountId() {
        return this.resultCountId;
    }

    public GetResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetResultResponseBodyDataResultInfoAgent extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SkillGroup")
        public String skillGroup;

        public static GetResultResponseBodyDataResultInfoAgent build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoAgent self = new GetResultResponseBodyDataResultInfoAgent();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoAgent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetResultResponseBodyDataResultInfoAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResultResponseBodyDataResultInfoAgent setSkillGroup(String skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public String getSkillGroup() {
            return this.skillGroup;
        }

    }

    public static class GetResultResponseBodyDataResultInfoAsrResultAsrResult extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Long end;

        @NameInMap("Role")
        public String role;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Words")
        public String words;

        public static GetResultResponseBodyDataResultInfoAsrResultAsrResult build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoAsrResultAsrResult self = new GetResultResponseBodyDataResultInfoAsrResultAsrResult();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoAsrResultAsrResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetResultResponseBodyDataResultInfoAsrResultAsrResult setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetResultResponseBodyDataResultInfoAsrResultAsrResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetResultResponseBodyDataResultInfoAsrResultAsrResult setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetResultResponseBodyDataResultInfoAsrResultAsrResult setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetResultResponseBodyDataResultInfoAsrResultAsrResult setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class GetResultResponseBodyDataResultInfoAsrResult extends TeaModel {
        @NameInMap("AsrResult")
        public java.util.List<GetResultResponseBodyDataResultInfoAsrResultAsrResult> asrResult;

        public static GetResultResponseBodyDataResultInfoAsrResult build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoAsrResult self = new GetResultResponseBodyDataResultInfoAsrResult();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoAsrResult setAsrResult(java.util.List<GetResultResponseBodyDataResultInfoAsrResultAsrResult> asrResult) {
            this.asrResult = asrResult;
            return this;
        }
        public java.util.List<GetResultResponseBodyDataResultInfoAsrResultAsrResult> getAsrResult() {
            return this.asrResult;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor extends TeaModel {
        @NameInMap("Cid")
        public String cid;

        @NameInMap("Hit_time")
        public Integer hitTime;

        @NameInMap("Location")
        public String location;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor setHitTime(Integer hitTime) {
            this.hitTime = hitTime;
            return this;
        }
        public Integer getHitTime() {
            return this.hitTime;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeRange extends TeaModel {
        @NameInMap("From")
        public Integer from;

        @NameInMap("To")
        public Integer to;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeRange build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeRange self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeRange();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeRange setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeRange setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeTimeRange extends TeaModel {
        @NameInMap("From")
        public Long from;

        @NameInMap("To")
        public Long to;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeTimeRange self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeTimeRange();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeTimeRange setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeTimeRange setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange extends TeaModel {
        @NameInMap("Absolute")
        public Boolean absolute;

        @NameInMap("AllSentencesSatisfy")
        public Boolean allSentencesSatisfy;

        @NameInMap("Anchor")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor anchor;

        @NameInMap("Range")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeRange range;

        @NameInMap("Role")
        public String role;

        @NameInMap("RoleId")
        public Integer roleId;

        @NameInMap("TimeRange")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeTimeRange timeRange;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange setAbsolute(Boolean absolute) {
            this.absolute = absolute;
            return this;
        }
        public Boolean getAbsolute() {
            return this.absolute;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange setAllSentencesSatisfy(Boolean allSentencesSatisfy) {
            this.allSentencesSatisfy = allSentencesSatisfy;
            return this;
        }
        public Boolean getAllSentencesSatisfy() {
            return this.allSentencesSatisfy;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange setAnchor(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor anchor) {
            this.anchor = anchor;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeAnchor getAnchor() {
            return this.anchor;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange setRange(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeRange range) {
            this.range = range;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeRange getRange() {
            return this.range;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange setRoleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }
        public Integer getRoleId() {
            return this.roleId;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange setTimeRange(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRangeTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamExcludes extends TeaModel {
        @NameInMap("Exclude")
        public java.util.List<String> exclude;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamExcludes build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamExcludes self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamExcludes();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamExcludes setExclude(java.util.List<String> exclude) {
            this.exclude = exclude;
            return this;
        }
        public java.util.List<String> getExclude() {
            return this.exclude;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam extends TeaModel {
        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeMatchStatus")
        public Integer nodeMatchStatus;

        @NameInMap("NodeName")
        public String nodeName;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam setNodeMatchStatus(Integer nodeMatchStatus) {
            this.nodeMatchStatus = nodeMatchStatus;
            return this;
        }
        public Integer getNodeMatchStatus() {
            return this.nodeMatchStatus;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntentsIntent extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntentsIntent build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntentsIntent self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntentsIntent();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntentsIntent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntentsIntent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntents extends TeaModel {
        @NameInMap("Intent")
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntentsIntent> intent;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntents build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntents self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntents();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntents setIntent(java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntentsIntent> intent) {
            this.intent = intent;
            return this;
        }
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntentsIntent> getIntent() {
            return this.intent;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParm extends TeaModel {
        @NameInMap("Intents")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntents intents;

        @NameInMap("ModelScene")
        public String modelScene;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParm build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParm self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParm();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParm setIntents(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntents intents) {
            this.intents = intents;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParmIntents getIntents() {
            return this.intents;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParm setModelScene(String modelScene) {
            this.modelScene = modelScene;
            return this;
        }
        public String getModelScene() {
            return this.modelScene;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamKeywords extends TeaModel {
        @NameInMap("Keyword")
        public java.util.List<String> keyword;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamKeywords build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamKeywords self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamKeywords();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamKeywords setKeyword(java.util.List<String> keyword) {
            this.keyword = keyword;
            return this;
        }
        public java.util.List<String> getKeyword() {
            return this.keyword;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam extends TeaModel {
        @NameInMap("Average")
        public Boolean average;

        @NameInMap("BeginType")
        public String beginType;

        @NameInMap("Case_sensitive")
        public Boolean caseSensitive;

        @NameInMap("CheckFirstSentence")
        public Boolean checkFirstSentence;

        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("CompareOperator")
        public String compareOperator;

        @NameInMap("ContextChatMatch")
        public Boolean contextChatMatch;

        @NameInMap("DelayTime")
        public Integer delayTime;

        @NameInMap("EndType")
        public String endType;

        @NameInMap("Excludes")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamExcludes excludes;

        @NameInMap("FlowNodePrerequisiteParam")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam flowNodePrerequisiteParam;

        @NameInMap("From")
        public Integer from;

        @NameInMap("From_end")
        public Boolean fromEnd;

        @NameInMap("Hit_time")
        public Integer hitTime;

        @NameInMap("In_sentence")
        public Boolean inSentence;

        @NameInMap("IntentModelCheckParm")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParm intentModelCheckParm;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("IntervalEnd")
        public Integer intervalEnd;

        @NameInMap("KeywordExtension")
        public Integer keywordExtension;

        @NameInMap("KeywordMatchSize")
        public Integer keywordMatchSize;

        @NameInMap("Keywords")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamKeywords keywords;

        @NameInMap("MaxEmotionChangeValue")
        public Integer maxEmotionChangeValue;

        @NameInMap("MinWordSize")
        public Integer minWordSize;

        @NameInMap("Near_dialogue")
        public Boolean nearDialogue;

        @NameInMap("NotRegex")
        public String notRegex;

        @NameInMap("Phrase")
        public String phrase;

        @NameInMap("Regex")
        public String regex;

        @NameInMap("Target")
        public Integer target;

        @NameInMap("Threshold")
        public Float threshold;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setAverage(Boolean average) {
            this.average = average;
            return this;
        }
        public Boolean getAverage() {
            return this.average;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setBeginType(String beginType) {
            this.beginType = beginType;
            return this;
        }
        public String getBeginType() {
            return this.beginType;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setCheckFirstSentence(Boolean checkFirstSentence) {
            this.checkFirstSentence = checkFirstSentence;
            return this;
        }
        public Boolean getCheckFirstSentence() {
            return this.checkFirstSentence;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setCompareOperator(String compareOperator) {
            this.compareOperator = compareOperator;
            return this;
        }
        public String getCompareOperator() {
            return this.compareOperator;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setContextChatMatch(Boolean contextChatMatch) {
            this.contextChatMatch = contextChatMatch;
            return this;
        }
        public Boolean getContextChatMatch() {
            return this.contextChatMatch;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Integer getDelayTime() {
            return this.delayTime;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setEndType(String endType) {
            this.endType = endType;
            return this;
        }
        public String getEndType() {
            return this.endType;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setExcludes(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamExcludes excludes) {
            this.excludes = excludes;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamExcludes getExcludes() {
            return this.excludes;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setFlowNodePrerequisiteParam(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam flowNodePrerequisiteParam) {
            this.flowNodePrerequisiteParam = flowNodePrerequisiteParam;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamFlowNodePrerequisiteParam getFlowNodePrerequisiteParam() {
            return this.flowNodePrerequisiteParam;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setFromEnd(Boolean fromEnd) {
            this.fromEnd = fromEnd;
            return this;
        }
        public Boolean getFromEnd() {
            return this.fromEnd;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setHitTime(Integer hitTime) {
            this.hitTime = hitTime;
            return this;
        }
        public Integer getHitTime() {
            return this.hitTime;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setInSentence(Boolean inSentence) {
            this.inSentence = inSentence;
            return this;
        }
        public Boolean getInSentence() {
            return this.inSentence;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setIntentModelCheckParm(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParm intentModelCheckParm) {
            this.intentModelCheckParm = intentModelCheckParm;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamIntentModelCheckParm getIntentModelCheckParm() {
            return this.intentModelCheckParm;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setIntervalEnd(Integer intervalEnd) {
            this.intervalEnd = intervalEnd;
            return this;
        }
        public Integer getIntervalEnd() {
            return this.intervalEnd;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setKeywordExtension(Integer keywordExtension) {
            this.keywordExtension = keywordExtension;
            return this;
        }
        public Integer getKeywordExtension() {
            return this.keywordExtension;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setKeywordMatchSize(Integer keywordMatchSize) {
            this.keywordMatchSize = keywordMatchSize;
            return this;
        }
        public Integer getKeywordMatchSize() {
            return this.keywordMatchSize;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setKeywords(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamKeywords keywords) {
            this.keywords = keywords;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParamKeywords getKeywords() {
            return this.keywords;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setMaxEmotionChangeValue(Integer maxEmotionChangeValue) {
            this.maxEmotionChangeValue = maxEmotionChangeValue;
            return this;
        }
        public Integer getMaxEmotionChangeValue() {
            return this.maxEmotionChangeValue;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setMinWordSize(Integer minWordSize) {
            this.minWordSize = minWordSize;
            return this;
        }
        public Integer getMinWordSize() {
            return this.minWordSize;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setNearDialogue(Boolean nearDialogue) {
            this.nearDialogue = nearDialogue;
            return this;
        }
        public Boolean getNearDialogue() {
            return this.nearDialogue;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setNotRegex(String notRegex) {
            this.notRegex = notRegex;
            return this;
        }
        public String getNotRegex() {
            return this.notRegex;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setPhrase(String phrase) {
            this.phrase = phrase;
            return this;
        }
        public String getPhrase() {
            return this.phrase;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setRegex(String regex) {
            this.regex = regex;
            return this;
        }
        public String getRegex() {
            return this.regex;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Oid")
        public String oid;

        @NameInMap("Param")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam param;

        @NameInMap("Type")
        public String type;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator setOid(String oid) {
            this.oid = oid;
            return this;
        }
        public String getOid() {
            return this.oid;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator setParam(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam param) {
            this.param = param;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperatorParam getParam() {
            return this.param;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperators extends TeaModel {
        @NameInMap("Operator")
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator> operator;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperators build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperators self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperators();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperators setOperator(java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator> operator) {
            this.operator = operator;
            return this;
        }
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperatorsOperator> getOperator() {
            return this.operator;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions extends TeaModel {
        @NameInMap("Check_range")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange checkRange;

        @NameInMap("Cid")
        public String cid;

        @NameInMap("Exclusion")
        public Integer exclusion;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Lambda")
        public String lambda;

        @NameInMap("Operators")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperators operators;

        @NameInMap("Rid")
        public String rid;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions setCheckRange(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange checkRange) {
            this.checkRange = checkRange;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsCheckRange getCheckRange() {
            return this.checkRange;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions setExclusion(Integer exclusion) {
            this.exclusion = exclusion;
            return this;
        }
        public Integer getExclusion() {
            return this.exclusion;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions setLambda(String lambda) {
            this.lambda = lambda;
            return this;
        }
        public String getLambda() {
            return this.lambda;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions setOperators(GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperators operators) {
            this.operators = operators;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditionsOperators getOperators() {
            return this.operators;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultConditions extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions> conditions;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultConditions build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultConditions self = new GetResultResponseBodyDataResultInfoHitResultHitResultConditions();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultConditions setConditions(java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultConditionsConditions> getConditions() {
            return this.conditions;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitCid extends TeaModel {
        @NameInMap("Cid")
        public java.util.List<String> cid;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitCid build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitCid self = new GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitCid();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitCid setCid(java.util.List<String> cid) {
            this.cid = cid;
            return this;
        }
        public java.util.List<String> getCid() {
            return this.cid;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord extends TeaModel {
        @NameInMap("Cid")
        public String cid;

        @NameInMap("From")
        public Integer from;

        @NameInMap("To")
        public Integer to;

        @NameInMap("Val")
        public String val;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord self = new GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWords extends TeaModel {
        @NameInMap("KeyWord")
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord> keyWord;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWords build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWords self = new GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWords();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWords setKeyWord(java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord> keyWord) {
            this.keyWord = keyWord;
            return this;
        }
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWordsKeyWord> getKeyWord() {
            return this.keyWord;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Integer end;

        @NameInMap("Role")
        public String role;

        @NameInMap("Words")
        public String words;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase self = new GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit extends TeaModel {
        @NameInMap("Cid")
        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitCid cid;

        @NameInMap("KeyWords")
        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWords keyWords;

        @NameInMap("Phrase")
        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase phrase;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit self = new GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit setCid(GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitCid cid) {
            this.cid = cid;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitCid getCid() {
            return this.cid;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit setKeyWords(GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWords keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitKeyWords getKeyWords() {
            return this.keyWords;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit setPhrase(GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultHitsHitPhrase getPhrase() {
            return this.phrase;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResultHits extends TeaModel {
        @NameInMap("Hit")
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit> hit;

        public static GetResultResponseBodyDataResultInfoHitResultHitResultHits build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResultHits self = new GetResultResponseBodyDataResultInfoHitResultHitResultHits();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResultHits setHit(java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit> hit) {
            this.hit = hit;
            return this;
        }
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResultHitsHit> getHit() {
            return this.hit;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResultHitResult extends TeaModel {
        @NameInMap("Conditions")
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditions conditions;

        @NameInMap("Hits")
        public GetResultResponseBodyDataResultInfoHitResultHitResultHits hits;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReviewResult")
        public Integer reviewResult;

        @NameInMap("Rid")
        public String rid;

        @NameInMap("SchemeId")
        public Long schemeId;

        @NameInMap("SchemeVersion")
        public Long schemeVersion;

        @NameInMap("Type")
        public String type;

        public static GetResultResponseBodyDataResultInfoHitResultHitResult build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResultHitResult self = new GetResultResponseBodyDataResultInfoHitResultHitResult();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResult setConditions(GetResultResponseBodyDataResultInfoHitResultHitResultConditions conditions) {
            this.conditions = conditions;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultConditions getConditions() {
            return this.conditions;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResult setHits(GetResultResponseBodyDataResultInfoHitResultHitResultHits hits) {
            this.hits = hits;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResultHitResultHits getHits() {
            return this.hits;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResult setReviewResult(Integer reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResult setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResult setSchemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }
        public Long getSchemeId() {
            return this.schemeId;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResult setSchemeVersion(Long schemeVersion) {
            this.schemeVersion = schemeVersion;
            return this;
        }
        public Long getSchemeVersion() {
            return this.schemeVersion;
        }

        public GetResultResponseBodyDataResultInfoHitResultHitResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitResult extends TeaModel {
        @NameInMap("HitResult")
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResult> hitResult;

        public static GetResultResponseBodyDataResultInfoHitResult build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitResult self = new GetResultResponseBodyDataResultInfoHitResult();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitResult setHitResult(java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResult> hitResult) {
            this.hitResult = hitResult;
            return this;
        }
        public java.util.List<GetResultResponseBodyDataResultInfoHitResultHitResult> getHitResult() {
            return this.hitResult;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitScoreHitScore extends TeaModel {
        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("ScoreId")
        public String scoreId;

        @NameInMap("ScoreName")
        public String scoreName;

        @NameInMap("ScoreNumber")
        public String scoreNumber;

        public static GetResultResponseBodyDataResultInfoHitScoreHitScore build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitScoreHitScore self = new GetResultResponseBodyDataResultInfoHitScoreHitScore();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitScoreHitScore setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetResultResponseBodyDataResultInfoHitScoreHitScore setScoreId(String scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public String getScoreId() {
            return this.scoreId;
        }

        public GetResultResponseBodyDataResultInfoHitScoreHitScore setScoreName(String scoreName) {
            this.scoreName = scoreName;
            return this;
        }
        public String getScoreName() {
            return this.scoreName;
        }

        public GetResultResponseBodyDataResultInfoHitScoreHitScore setScoreNumber(String scoreNumber) {
            this.scoreNumber = scoreNumber;
            return this;
        }
        public String getScoreNumber() {
            return this.scoreNumber;
        }

    }

    public static class GetResultResponseBodyDataResultInfoHitScore extends TeaModel {
        @NameInMap("HitScore")
        public java.util.List<GetResultResponseBodyDataResultInfoHitScoreHitScore> hitScore;

        public static GetResultResponseBodyDataResultInfoHitScore build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoHitScore self = new GetResultResponseBodyDataResultInfoHitScore();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoHitScore setHitScore(java.util.List<GetResultResponseBodyDataResultInfoHitScoreHitScore> hitScore) {
            this.hitScore = hitScore;
            return this;
        }
        public java.util.List<GetResultResponseBodyDataResultInfoHitScoreHitScore> getHitScore() {
            return this.hitScore;
        }

    }

    public static class GetResultResponseBodyDataResultInfoRecording extends TeaModel {
        @NameInMap("Business")
        public String business;

        @NameInMap("CallId")
        public String callId;

        @NameInMap("CallTime")
        public String callTime;

        @NameInMap("CallType")
        public Integer callType;

        @NameInMap("Callee")
        public String callee;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("DataSetName")
        public String dataSetName;

        @NameInMap("DialogueSize")
        public Integer dialogueSize;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrimaryId")
        public String primaryId;

        @NameInMap("Remark1")
        public String remark1;

        @NameInMap("Remark10")
        public String remark10;

        @NameInMap("Remark11")
        public String remark11;

        @NameInMap("Remark12")
        public String remark12;

        @NameInMap("Remark13")
        public String remark13;

        @NameInMap("Remark2")
        public String remark2;

        @NameInMap("Remark3")
        public String remark3;

        @NameInMap("Remark4")
        public String remark4;

        @NameInMap("Remark5")
        public Long remark5;

        @NameInMap("Remark6")
        public String remark6;

        @NameInMap("Remark7")
        public String remark7;

        @NameInMap("Remark8")
        public String remark8;

        @NameInMap("Remark9")
        public String remark9;

        @NameInMap("Url")
        public String url;

        public static GetResultResponseBodyDataResultInfoRecording build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoRecording self = new GetResultResponseBodyDataResultInfoRecording();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoRecording setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public GetResultResponseBodyDataResultInfoRecording setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetResultResponseBodyDataResultInfoRecording setCallTime(String callTime) {
            this.callTime = callTime;
            return this;
        }
        public String getCallTime() {
            return this.callTime;
        }

        public GetResultResponseBodyDataResultInfoRecording setCallType(Integer callType) {
            this.callType = callType;
            return this;
        }
        public Integer getCallType() {
            return this.callType;
        }

        public GetResultResponseBodyDataResultInfoRecording setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public GetResultResponseBodyDataResultInfoRecording setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public GetResultResponseBodyDataResultInfoRecording setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetResultResponseBodyDataResultInfoRecording setDialogueSize(Integer dialogueSize) {
            this.dialogueSize = dialogueSize;
            return this;
        }
        public Integer getDialogueSize() {
            return this.dialogueSize;
        }

        public GetResultResponseBodyDataResultInfoRecording setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetResultResponseBodyDataResultInfoRecording setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetResultResponseBodyDataResultInfoRecording setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResultResponseBodyDataResultInfoRecording setPrimaryId(String primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public String getPrimaryId() {
            return this.primaryId;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark1(String remark1) {
            this.remark1 = remark1;
            return this;
        }
        public String getRemark1() {
            return this.remark1;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark10(String remark10) {
            this.remark10 = remark10;
            return this;
        }
        public String getRemark10() {
            return this.remark10;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark11(String remark11) {
            this.remark11 = remark11;
            return this;
        }
        public String getRemark11() {
            return this.remark11;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark12(String remark12) {
            this.remark12 = remark12;
            return this;
        }
        public String getRemark12() {
            return this.remark12;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark13(String remark13) {
            this.remark13 = remark13;
            return this;
        }
        public String getRemark13() {
            return this.remark13;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark2(String remark2) {
            this.remark2 = remark2;
            return this;
        }
        public String getRemark2() {
            return this.remark2;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark3(String remark3) {
            this.remark3 = remark3;
            return this;
        }
        public String getRemark3() {
            return this.remark3;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark4(String remark4) {
            this.remark4 = remark4;
            return this;
        }
        public String getRemark4() {
            return this.remark4;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark5(Long remark5) {
            this.remark5 = remark5;
            return this;
        }
        public Long getRemark5() {
            return this.remark5;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark6(String remark6) {
            this.remark6 = remark6;
            return this;
        }
        public String getRemark6() {
            return this.remark6;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark7(String remark7) {
            this.remark7 = remark7;
            return this;
        }
        public String getRemark7() {
            return this.remark7;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark8(String remark8) {
            this.remark8 = remark8;
            return this;
        }
        public String getRemark8() {
            return this.remark8;
        }

        public GetResultResponseBodyDataResultInfoRecording setRemark9(String remark9) {
            this.remark9 = remark9;
            return this;
        }
        public String getRemark9() {
            return this.remark9;
        }

        public GetResultResponseBodyDataResultInfoRecording setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetResultResponseBodyDataResultInfoSchemeIdList extends TeaModel {
        @NameInMap("SchemeIdList")
        public java.util.List<Long> schemeIdList;

        public static GetResultResponseBodyDataResultInfoSchemeIdList build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoSchemeIdList self = new GetResultResponseBodyDataResultInfoSchemeIdList();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoSchemeIdList setSchemeIdList(java.util.List<Long> schemeIdList) {
            this.schemeIdList = schemeIdList;
            return this;
        }
        public java.util.List<Long> getSchemeIdList() {
            return this.schemeIdList;
        }

    }

    public static class GetResultResponseBodyDataResultInfoSchemeNameList extends TeaModel {
        @NameInMap("SchemeNameList")
        public java.util.List<String> schemeNameList;

        public static GetResultResponseBodyDataResultInfoSchemeNameList build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfoSchemeNameList self = new GetResultResponseBodyDataResultInfoSchemeNameList();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfoSchemeNameList setSchemeNameList(java.util.List<String> schemeNameList) {
            this.schemeNameList = schemeNameList;
            return this;
        }
        public java.util.List<String> getSchemeNameList() {
            return this.schemeNameList;
        }

    }

    public static class GetResultResponseBodyDataResultInfo extends TeaModel {
        @NameInMap("Agent")
        public GetResultResponseBodyDataResultInfoAgent agent;

        @NameInMap("AsrResult")
        public GetResultResponseBodyDataResultInfoAsrResult asrResult;

        @NameInMap("AssignmentTime")
        public String assignmentTime;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimeLong")
        public String createTimeLong;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("HitResult")
        public GetResultResponseBodyDataResultInfoHitResult hitResult;

        @NameInMap("HitScore")
        public GetResultResponseBodyDataResultInfoHitScore hitScore;

        @NameInMap("LastDataId")
        public String lastDataId;

        @NameInMap("Recording")
        public GetResultResponseBodyDataResultInfoRecording recording;

        @NameInMap("Resolver")
        public String resolver;

        @NameInMap("ReviewResult")
        public Integer reviewResult;

        @NameInMap("ReviewStatus")
        public Integer reviewStatus;

        @NameInMap("ReviewTime")
        public String reviewTime;

        @NameInMap("ReviewTimeLong")
        public String reviewTimeLong;

        @NameInMap("ReviewType")
        public Integer reviewType;

        @NameInMap("Reviewer")
        public String reviewer;

        @NameInMap("SchemeIdList")
        public GetResultResponseBodyDataResultInfoSchemeIdList schemeIdList;

        @NameInMap("SchemeNameList")
        public GetResultResponseBodyDataResultInfoSchemeNameList schemeNameList;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static GetResultResponseBodyDataResultInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyDataResultInfo self = new GetResultResponseBodyDataResultInfo();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyDataResultInfo setAgent(GetResultResponseBodyDataResultInfoAgent agent) {
            this.agent = agent;
            return this;
        }
        public GetResultResponseBodyDataResultInfoAgent getAgent() {
            return this.agent;
        }

        public GetResultResponseBodyDataResultInfo setAsrResult(GetResultResponseBodyDataResultInfoAsrResult asrResult) {
            this.asrResult = asrResult;
            return this;
        }
        public GetResultResponseBodyDataResultInfoAsrResult getAsrResult() {
            return this.asrResult;
        }

        public GetResultResponseBodyDataResultInfo setAssignmentTime(String assignmentTime) {
            this.assignmentTime = assignmentTime;
            return this;
        }
        public String getAssignmentTime() {
            return this.assignmentTime;
        }

        public GetResultResponseBodyDataResultInfo setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetResultResponseBodyDataResultInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetResultResponseBodyDataResultInfo setCreateTimeLong(String createTimeLong) {
            this.createTimeLong = createTimeLong;
            return this;
        }
        public String getCreateTimeLong() {
            return this.createTimeLong;
        }

        public GetResultResponseBodyDataResultInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetResultResponseBodyDataResultInfo setHitResult(GetResultResponseBodyDataResultInfoHitResult hitResult) {
            this.hitResult = hitResult;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitResult getHitResult() {
            return this.hitResult;
        }

        public GetResultResponseBodyDataResultInfo setHitScore(GetResultResponseBodyDataResultInfoHitScore hitScore) {
            this.hitScore = hitScore;
            return this;
        }
        public GetResultResponseBodyDataResultInfoHitScore getHitScore() {
            return this.hitScore;
        }

        public GetResultResponseBodyDataResultInfo setLastDataId(String lastDataId) {
            this.lastDataId = lastDataId;
            return this;
        }
        public String getLastDataId() {
            return this.lastDataId;
        }

        public GetResultResponseBodyDataResultInfo setRecording(GetResultResponseBodyDataResultInfoRecording recording) {
            this.recording = recording;
            return this;
        }
        public GetResultResponseBodyDataResultInfoRecording getRecording() {
            return this.recording;
        }

        public GetResultResponseBodyDataResultInfo setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public GetResultResponseBodyDataResultInfo setReviewResult(Integer reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        public GetResultResponseBodyDataResultInfo setReviewStatus(Integer reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }
        public Integer getReviewStatus() {
            return this.reviewStatus;
        }

        public GetResultResponseBodyDataResultInfo setReviewTime(String reviewTime) {
            this.reviewTime = reviewTime;
            return this;
        }
        public String getReviewTime() {
            return this.reviewTime;
        }

        public GetResultResponseBodyDataResultInfo setReviewTimeLong(String reviewTimeLong) {
            this.reviewTimeLong = reviewTimeLong;
            return this;
        }
        public String getReviewTimeLong() {
            return this.reviewTimeLong;
        }

        public GetResultResponseBodyDataResultInfo setReviewType(Integer reviewType) {
            this.reviewType = reviewType;
            return this;
        }
        public Integer getReviewType() {
            return this.reviewType;
        }

        public GetResultResponseBodyDataResultInfo setReviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }
        public String getReviewer() {
            return this.reviewer;
        }

        public GetResultResponseBodyDataResultInfo setSchemeIdList(GetResultResponseBodyDataResultInfoSchemeIdList schemeIdList) {
            this.schemeIdList = schemeIdList;
            return this;
        }
        public GetResultResponseBodyDataResultInfoSchemeIdList getSchemeIdList() {
            return this.schemeIdList;
        }

        public GetResultResponseBodyDataResultInfo setSchemeNameList(GetResultResponseBodyDataResultInfoSchemeNameList schemeNameList) {
            this.schemeNameList = schemeNameList;
            return this;
        }
        public GetResultResponseBodyDataResultInfoSchemeNameList getSchemeNameList() {
            return this.schemeNameList;
        }

        public GetResultResponseBodyDataResultInfo setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetResultResponseBodyDataResultInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetResultResponseBodyDataResultInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetResultResponseBodyDataResultInfo setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class GetResultResponseBodyData extends TeaModel {
        @NameInMap("ResultInfo")
        public java.util.List<GetResultResponseBodyDataResultInfo> resultInfo;

        public static GetResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResultResponseBodyData self = new GetResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResultResponseBodyData setResultInfo(java.util.List<GetResultResponseBodyDataResultInfo> resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public java.util.List<GetResultResponseBodyDataResultInfo> getResultInfo() {
            return this.resultInfo;
        }

    }

}
