// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestRuleV4ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TestRuleV4ResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static TestRuleV4ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestRuleV4ResponseBody self = new TestRuleV4ResponseBody();
        return TeaModel.build(map, self);
    }

    public TestRuleV4ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestRuleV4ResponseBody setData(TestRuleV4ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestRuleV4ResponseBodyData getData() {
        return this.data;
    }

    public TestRuleV4ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public TestRuleV4ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TestRuleV4ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestRuleV4ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList extends TeaModel {
        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("Lambda")
        public String lambda;

        @NameInMap("Name")
        public String name;

        @NameInMap("NextNodeId")
        public Long nextNodeId;

        @NameInMap("Situation")
        public NextNodeSituations situation;

        @NameInMap("Triggers")
        public java.util.List<String> triggers;

        public static TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList build(java.util.Map<String, ?> map) throws Exception {
            TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList self = new TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList();
            return TeaModel.build(map, self);
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList setLambda(String lambda) {
            this.lambda = lambda;
            return this;
        }
        public String getLambda() {
            return this.lambda;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList setNextNodeId(Long nextNodeId) {
            this.nextNodeId = nextNodeId;
            return this;
        }
        public Long getNextNodeId() {
            return this.nextNodeId;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList setSituation(NextNodeSituations situation) {
            this.situation = situation;
            return this;
        }
        public NextNodeSituations getSituation() {
            return this.situation;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList setTriggers(java.util.List<String> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<String> getTriggers() {
            return this.triggers;
        }

    }

    public static class TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords extends TeaModel {
        @NameInMap("Cid")
        public String cid;

        @NameInMap("CustomizeCode")
        public String customizeCode;

        @NameInMap("From")
        public Integer from;

        @NameInMap("Oid")
        public String oid;

        @NameInMap("OperatorKey")
        public String operatorKey;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("SimilarPhrase")
        public String similarPhrase;

        @NameInMap("Tid")
        public String tid;

        @NameInMap("To")
        public Integer to;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Val")
        public String val;

        public static TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords build(java.util.Map<String, ?> map) throws Exception {
            TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords self = new TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords();
            return TeaModel.build(map, self);
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setCustomizeCode(String customizeCode) {
            this.customizeCode = customizeCode;
            return this;
        }
        public String getCustomizeCode() {
            return this.customizeCode;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setOid(String oid) {
            this.oid = oid;
            return this;
        }
        public String getOid() {
            return this.oid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setOperatorKey(String operatorKey) {
            this.operatorKey = operatorKey;
            return this;
        }
        public String getOperatorKey() {
            return this.operatorKey;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setSimilarPhrase(String similarPhrase) {
            this.similarPhrase = similarPhrase;
            return this;
        }
        public String getSimilarPhrase() {
            return this.similarPhrase;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

    }

    public static class TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("ChannelId")
        public Integer channelId;

        @NameInMap("EmotionFineGrainedValue")
        public Integer emotionFineGrainedValue;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Long end;

        @NameInMap("HitStatus")
        public Integer hitStatus;

        @NameInMap("HourMinSec")
        public String hourMinSec;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("RenterId")
        public Long renterId;

        @NameInMap("Role")
        public String role;

        @NameInMap("Sid")
        public Long sid;

        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Words")
        public String words;

        public static TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase build(java.util.Map<String, ?> map) throws Exception {
            TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase self = new TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase();
            return TeaModel.build(map, self);
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setChannelId(Integer channelId) {
            this.channelId = channelId;
            return this;
        }
        public Integer getChannelId() {
            return this.channelId;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setEmotionFineGrainedValue(Integer emotionFineGrainedValue) {
            this.emotionFineGrainedValue = emotionFineGrainedValue;
            return this;
        }
        public Integer getEmotionFineGrainedValue() {
            return this.emotionFineGrainedValue;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setHitStatus(Integer hitStatus) {
            this.hitStatus = hitStatus;
            return this;
        }
        public Integer getHitStatus() {
            return this.hitStatus;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setHourMinSec(String hourMinSec) {
            this.hourMinSec = hourMinSec;
            return this;
        }
        public String getHourMinSec() {
            return this.hourMinSec;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setRenterId(Long renterId) {
            this.renterId = renterId;
            return this;
        }
        public Long getRenterId() {
            return this.renterId;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setSid(Long sid) {
            this.sid = sid;
            return this;
        }
        public Long getSid() {
            return this.sid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setSilenceDuration(Integer silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList extends TeaModel {
        @NameInMap("Cid")
        public java.util.List<String> cid;

        @NameInMap("KeyWords")
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords> keyWords;

        @NameInMap("Phrase")
        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase phrase;

        public static TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList build(java.util.Map<String, ?> map) throws Exception {
            TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList self = new TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList();
            return TeaModel.build(map, self);
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList setCid(java.util.List<String> cid) {
            this.cid = cid;
            return this;
        }
        public java.util.List<String> getCid() {
            return this.cid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList setKeyWords(java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords> getKeyWords() {
            return this.keyWords;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList setPhrase(TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListPhrase getPhrase() {
            return this.phrase;
        }

    }

    public static class TestRuleV4ResponseBodyDataHitRuleReviewInfoList extends TeaModel {
        @NameInMap("BranchHitId")
        public Long branchHitId;

        @NameInMap("BranchInfoList")
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList> branchInfoList;

        @NameInMap("ConditionHitInfoList")
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList> conditionHitInfoList;

        @NameInMap("ConditionInfoList")
        public java.util.List<ConditionBasicInfo> conditionInfoList;

        @NameInMap("JudgeNodeName")
        public String judgeNodeName;

        @NameInMap("Lambda")
        public String lambda;

        /**
         * <p>true</p>
         */
        @NameInMap("Matched")
        public Boolean matched;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Rid")
        public Long rid;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        @NameInMap("TaskFlowId")
        public Long taskFlowId;

        public static TestRuleV4ResponseBodyDataHitRuleReviewInfoList build(java.util.Map<String, ?> map) throws Exception {
            TestRuleV4ResponseBodyDataHitRuleReviewInfoList self = new TestRuleV4ResponseBodyDataHitRuleReviewInfoList();
            return TeaModel.build(map, self);
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setBranchHitId(Long branchHitId) {
            this.branchHitId = branchHitId;
            return this;
        }
        public Long getBranchHitId() {
            return this.branchHitId;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setBranchInfoList(java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList> branchInfoList) {
            this.branchInfoList = branchInfoList;
            return this;
        }
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList> getBranchInfoList() {
            return this.branchInfoList;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setConditionHitInfoList(java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList> conditionHitInfoList) {
            this.conditionHitInfoList = conditionHitInfoList;
            return this;
        }
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList> getConditionHitInfoList() {
            return this.conditionHitInfoList;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setConditionInfoList(java.util.List<ConditionBasicInfo> conditionInfoList) {
            this.conditionInfoList = conditionInfoList;
            return this;
        }
        public java.util.List<ConditionBasicInfo> getConditionInfoList() {
            return this.conditionInfoList;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setJudgeNodeName(String judgeNodeName) {
            this.judgeNodeName = judgeNodeName;
            return this;
        }
        public String getJudgeNodeName() {
            return this.judgeNodeName;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setLambda(String lambda) {
            this.lambda = lambda;
            return this;
        }
        public String getLambda() {
            return this.lambda;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setMatched(Boolean matched) {
            this.matched = matched;
            return this;
        }
        public Boolean getMatched() {
            return this.matched;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setRuleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setScoreNumType(Integer scoreNumType) {
            this.scoreNumType = scoreNumType;
            return this;
        }
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        public TestRuleV4ResponseBodyDataHitRuleReviewInfoList setTaskFlowId(Long taskFlowId) {
            this.taskFlowId = taskFlowId;
            return this;
        }
        public Long getTaskFlowId() {
            return this.taskFlowId;
        }

    }

    public static class TestRuleV4ResponseBodyDataHitTaskFlowList extends TeaModel {
        @NameInMap("GraphFlow")
        public TaskGraphFlow graphFlow;

        @NameInMap("Rid")
        public Long rid;

        @NameInMap("TaskFlowType")
        public Integer taskFlowType;

        public static TestRuleV4ResponseBodyDataHitTaskFlowList build(java.util.Map<String, ?> map) throws Exception {
            TestRuleV4ResponseBodyDataHitTaskFlowList self = new TestRuleV4ResponseBodyDataHitTaskFlowList();
            return TeaModel.build(map, self);
        }

        public TestRuleV4ResponseBodyDataHitTaskFlowList setGraphFlow(TaskGraphFlow graphFlow) {
            this.graphFlow = graphFlow;
            return this;
        }
        public TaskGraphFlow getGraphFlow() {
            return this.graphFlow;
        }

        public TestRuleV4ResponseBodyDataHitTaskFlowList setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public TestRuleV4ResponseBodyDataHitTaskFlowList setTaskFlowType(Integer taskFlowType) {
            this.taskFlowType = taskFlowType;
            return this;
        }
        public Integer getTaskFlowType() {
            return this.taskFlowType;
        }

    }

    public static class TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList extends TeaModel {
        @NameInMap("ConditionInfoList")
        public java.util.List<ConditionBasicInfo> conditionInfoList;

        @NameInMap("Matched")
        public Boolean matched;

        @NameInMap("Rid")
        public Long rid;

        @NameInMap("TaskFlowType")
        public Integer taskFlowType;

        public static TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList build(java.util.Map<String, ?> map) throws Exception {
            TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList self = new TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList();
            return TeaModel.build(map, self);
        }

        public TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList setConditionInfoList(java.util.List<ConditionBasicInfo> conditionInfoList) {
            this.conditionInfoList = conditionInfoList;
            return this;
        }
        public java.util.List<ConditionBasicInfo> getConditionInfoList() {
            return this.conditionInfoList;
        }

        public TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList setMatched(Boolean matched) {
            this.matched = matched;
            return this;
        }
        public Boolean getMatched() {
            return this.matched;
        }

        public TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList setTaskFlowType(Integer taskFlowType) {
            this.taskFlowType = taskFlowType;
            return this;
        }
        public Integer getTaskFlowType() {
            return this.taskFlowType;
        }

    }

    public static class TestRuleV4ResponseBodyData extends TeaModel {
        @NameInMap("HitRuleReviewInfoList")
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoList> hitRuleReviewInfoList;

        @NameInMap("HitTaskFlowList")
        public java.util.List<TestRuleV4ResponseBodyDataHitTaskFlowList> hitTaskFlowList;

        @NameInMap("UnhitRuleReviewInfoList")
        public java.util.List<TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList> unhitRuleReviewInfoList;

        public static TestRuleV4ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestRuleV4ResponseBodyData self = new TestRuleV4ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestRuleV4ResponseBodyData setHitRuleReviewInfoList(java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoList> hitRuleReviewInfoList) {
            this.hitRuleReviewInfoList = hitRuleReviewInfoList;
            return this;
        }
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoList> getHitRuleReviewInfoList() {
            return this.hitRuleReviewInfoList;
        }

        public TestRuleV4ResponseBodyData setHitTaskFlowList(java.util.List<TestRuleV4ResponseBodyDataHitTaskFlowList> hitTaskFlowList) {
            this.hitTaskFlowList = hitTaskFlowList;
            return this;
        }
        public java.util.List<TestRuleV4ResponseBodyDataHitTaskFlowList> getHitTaskFlowList() {
            return this.hitTaskFlowList;
        }

        public TestRuleV4ResponseBodyData setUnhitRuleReviewInfoList(java.util.List<TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList> unhitRuleReviewInfoList) {
            this.unhitRuleReviewInfoList = unhitRuleReviewInfoList;
            return this;
        }
        public java.util.List<TestRuleV4ResponseBodyDataUnhitRuleReviewInfoList> getUnhitRuleReviewInfoList() {
            return this.unhitRuleReviewInfoList;
        }

    }

}
