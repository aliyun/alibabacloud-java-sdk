// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestRuleV4ResponseBody extends TeaModel {
    /**
     * <p>Result code. 200 indicates success. Other values indicate failure. Callers can use this field to identify the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Full response body.</p>
     */
    @NameInMap("Data")
    public TestRuleV4ResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error details when an error occurs. Returns successful when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96138D8D-XXXX-4E41-XXXX-77AED1088BBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Callers can use this field to determine success: true means success; false or null means failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Check item type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>Index number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>Lambda expression.</p>
         * 
         * <strong>example:</strong>
         * <p>a&amp;&amp;b</p>
         */
        @NameInMap("Lambda")
        public String lambda;

        /**
         * <p>Node name.</p>
         * 
         * <strong>example:</strong>
         * <p>节点A</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>ID of the next flow node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NextNodeId")
        public Long nextNodeId;

        /**
         * <p>Flow node condition.</p>
         */
        @NameInMap("Situation")
        public NextNodeSituations situation;

        /**
         * <p>List of trigger IDs.</p>
         */
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
        /**
         * <p>Condition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cid")
        public String cid;

        /**
         * <p>Internal field. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("CustomizeCode")
        public String customizeCode;

        /**
         * <p>Starting character position for highlighting. Index starts at 0. Maximum value is the total number of characters in the sentence minus 1. The character at position from is included in the highlight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <p>Operator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Oid")
        public String oid;

        /**
         * <p>Key information matched by the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("OperatorKey")
        public String operatorKey;

        /**
         * <p>Index of this sentence in the full list of sentences. This is the index of the sentence in the dialogues array of the request parameters, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        /**
         * <p>Similar phrase.</p>
         * 
         * <strong>example:</strong>
         * <p>您好</p>
         */
        @NameInMap("SimilarPhrase")
        public String similarPhrase;

        /**
         * <p>Internal use only. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Tid")
        public String tid;

        /**
         * <p>The position of the character that follows the highlighted keyword. The character at the \<code>to\\</code> position is not included in the highlight. For example, if \<code>from\\</code> is 0 and \<code>to\\</code> is 3, the highlighted keyword consists of the characters at indices 0, 1, and 2. The maximum value is one less than the total number of characters in the sentence.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("To")
        public Integer to;

        /**
         * <p>Internal use only. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>Key information matched by the operator. For details, see <strong>Detailed explanation of Val key information</strong> in the response parameter description below.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
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
        /**
         * <p>Start time offset of this sentence relative to the start of the full dialogue, in milliseconds. For example, if the total audio duration is 2 minutes and 10 seconds, and a customer starts speaking at 1 minute and 12 seconds and finishes at 1 minute and 20 seconds, then begin equals 72000 and end equals 80000.</p>
         * 
         * <strong>example:</strong>
         * <p>72000</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <p>Start time of this sentence. Example: 2019-11-25 15:37:16.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-25 15:37:16</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>Channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChannelId")
        public Integer channelId;

        /**
         * <p>Internal use only. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>忽略</p>
         */
        @NameInMap("EmotionFineGrainedValue")
        public Integer emotionFineGrainedValue;

        /**
         * <p>Emotion intensity score. Value equals volume in decibels divided by 10. Valid range: [1, 10]. Higher values indicate stronger emotion.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("EmotionValue")
        public Integer emotionValue;

        /**
         * <p>End time offset of this sentence relative to the start of the full dialogue, in milliseconds. For example, if the total audio duration is 2 minutes and 10 seconds, and a customer starts speaking at 1 minute and 12 seconds and finishes at 1 minute and 20 seconds, then begin equals 72000 and end equals 80000.</p>
         * 
         * <strong>example:</strong>
         * <p>80000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>Hit status. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Not hit</p>
         * </li>
         * <li><p><strong>1</strong>: Hit</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitStatus")
        public Integer hitStatus;

        /**
         * <p>Start time of this sentence in hh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00:00</p>
         */
        @NameInMap("HourMinSec")
        public String hourMinSec;

        /**
         * <p>Role identifier. In offline voice scenarios, roles are limited to agent or customer. In offline text quality check scenarios, this field shows the identity value passed in during upload.</p>
         * 
         * <strong>example:</strong>
         * <p>客服</p>
         */
        @NameInMap("Identity")
        public String identity;

        /**
         * <p>Index of this sentence in the full list of sentences. This is the index of the sentence in the dialogues array of the request parameters, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        /**
         * <p>Internal use only. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("RenterId")
        public Long renterId;

        /**
         * <p>Speaker role for this sentence. Valid values: agent and customer.</p>
         * 
         * <strong>example:</strong>
         * <p>客服</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Internal use only. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Sid")
        public Long sid;

        /**
         * <p>Silence duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        /**
         * <p>Average speech rate for this sentence, in words per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>Internal use only. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>Dialogue content.</p>
         * 
         * <strong>example:</strong>
         * <p>你好，请问有什么可以帮您</p>
         */
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
        /**
         * <p>Condition ID.</p>
         */
        @NameInMap("Cid")
        public java.util.List<String> cid;

        /**
         * <p>Key information that was hit. This information appears highlighted on the review page. Examples include keywords matched by a keyword-check operator or category information matched by an agent-model-check operator.</p>
         */
        @NameInMap("KeyWords")
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoListKeyWords> keyWords;

        /**
         * <p>Sentence details for the current hit check item.</p>
         */
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
        /**
         * <p>ID of the hit branch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BranchHitId")
        public Long branchHitId;

        /**
         * <p>List of branch information.</p>
         */
        @NameInMap("BranchInfoList")
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListBranchInfoList> branchInfoList;

        /**
         * <p>Information about hit conditions.</p>
         */
        @NameInMap("ConditionHitInfoList")
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoListConditionHitInfoList> conditionHitInfoList;

        /**
         * <p>List of conditions.</p>
         */
        @NameInMap("ConditionInfoList")
        public java.util.List<ConditionBasicInfo> conditionInfoList;

        /**
         * <p>Judgement node name.</p>
         * 
         * <strong>example:</strong>
         * <p>判断节点A</p>
         */
        @NameInMap("JudgeNodeName")
        public String judgeNodeName;

        /**
         * <p>Lambda expression. Example: a&amp;\&amp;b.</p>
         * 
         * <strong>example:</strong>
         * <p>a&amp;&amp;b</p>
         */
        @NameInMap("Lambda")
        public String lambda;

        /**
         * <p>Whether the rule was hit.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Matched")
        public Boolean matched;

        /**
         * <p>Node type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>Check item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>451</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>规则A</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Whether scoring applies. Valid values: 1 (no scoring) and 3 (scoring).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        /**
         * <p>Scoring type. Valid values: 0 (add or subtract points on hit) and 1 (one-time score on hit).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        /**
         * <p>Flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Flowchart canvas.</p>
         */
        @NameInMap("GraphFlow")
        public TaskGraphFlow graphFlow;

        /**
         * <p>Rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <p>Flowchart type. Deprecated. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
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
        /**
         * <p>List of conditions.</p>
         */
        @NameInMap("ConditionInfoList")
        public java.util.List<ConditionBasicInfo> conditionInfoList;

        /**
         * <p>Whether the rule was hit.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Matched")
        public Boolean matched;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <p>Flowchart type. Deprecated. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>忽略</p>
         */
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
        /**
         * <p>Information about hit check items.</p>
         */
        @NameInMap("HitRuleReviewInfoList")
        public java.util.List<TestRuleV4ResponseBodyDataHitRuleReviewInfoList> hitRuleReviewInfoList;

        /**
         * <p>List of hit advanced flow nodes.</p>
         */
        @NameInMap("HitTaskFlowList")
        public java.util.List<TestRuleV4ResponseBodyDataHitTaskFlowList> hitTaskFlowList;

        /**
         * <p>Information about rules that were not hit.</p>
         */
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
