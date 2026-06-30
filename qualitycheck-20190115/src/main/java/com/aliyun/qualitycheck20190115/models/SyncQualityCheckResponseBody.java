// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SyncQualityCheckResponseBody extends TeaModel {
    /**
     * <p>Result status code. 200 indicates success. Other values indicate failure. The caller can determine the reason for failure using this field.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned result, including hit information.</p>
     */
    @NameInMap("Data")
    public SyncQualityCheckResponseBodyData data;

    /**
     * <p>Error details if an error occurs. &quot;successful&quot; if successful.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>66E1ACB8-17B2-4BE8-8581-954A8*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. The caller can use this field to determine if the request succeeded: true for success; false/null for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SyncQualityCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncQualityCheckResponseBody self = new SyncQualityCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncQualityCheckResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncQualityCheckResponseBody setData(SyncQualityCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncQualityCheckResponseBodyData getData() {
        return this.data;
    }

    public SyncQualityCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncQualityCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncQualityCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyncQualityCheckResponseBodyDataRulesHitHitKeyWords extends TeaModel {
        /**
         * <p>Condition ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>2312</p>
         */
        @NameInMap("Cid")
        public Integer cid;

        /**
         * <p>Start position of the keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <p>Index value of the hit sentence in the entire conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        /**
         * <p>End position of the keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("To")
        public Integer to;

        /**
         * <p>Keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("Val")
        public String val;

        public static SyncQualityCheckResponseBodyDataRulesHitHitKeyWords build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyDataRulesHitHitKeyWords self = new SyncQualityCheckResponseBodyDataRulesHitHitKeyWords();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyDataRulesHitHitKeyWords setCid(Integer cid) {
            this.cid = cid;
            return this;
        }
        public Integer getCid() {
            return this.cid;
        }

        public SyncQualityCheckResponseBodyDataRulesHitHitKeyWords setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public SyncQualityCheckResponseBodyDataRulesHitHitKeyWords setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SyncQualityCheckResponseBodyDataRulesHitHitKeyWords setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

        public SyncQualityCheckResponseBodyDataRulesHitHitKeyWords setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

    }

    public static class SyncQualityCheckResponseBodyDataRulesHitPhrase extends TeaModel {
        /**
         * <p>Start time of this sentence relative to the entire conversation, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1230</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <p>Emotional value of this sentence, 0-10. Higher values indicate stronger emotions.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("EmotionValue")
        public Integer emotionValue;

        /**
         * <p>End time of this sentence relative to the entire conversation, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3440</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>Deprecated field. Ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Identity")
        public String identity;

        /**
         * <p>Role of this sentence. Valid values: customer service representative, customer.</p>
         * 
         * <strong>example:</strong>
         * <p>客服</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Deprecated field. Ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        /**
         * <p>Speech rate of this sentence, in characters per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>Dialogue content.</p>
         * 
         * <strong>example:</strong>
         * <p>你好请问有什么可以帮您的</p>
         */
        @NameInMap("Words")
        public String words;

        public static SyncQualityCheckResponseBodyDataRulesHitPhrase build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyDataRulesHitPhrase self = new SyncQualityCheckResponseBodyDataRulesHitPhrase();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setSilenceDuration(Integer silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class SyncQualityCheckResponseBodyDataRulesHit extends TeaModel {
        /**
         * <p>Keywords that met the condition.</p>
         */
        @NameInMap("HitKeyWords")
        public java.util.List<SyncQualityCheckResponseBodyDataRulesHitHitKeyWords> hitKeyWords;

        /**
         * <p>Dialogue content that met the condition.</p>
         */
        @NameInMap("Phrase")
        public SyncQualityCheckResponseBodyDataRulesHitPhrase phrase;

        public static SyncQualityCheckResponseBodyDataRulesHit build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyDataRulesHit self = new SyncQualityCheckResponseBodyDataRulesHit();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyDataRulesHit setHitKeyWords(java.util.List<SyncQualityCheckResponseBodyDataRulesHitHitKeyWords> hitKeyWords) {
            this.hitKeyWords = hitKeyWords;
            return this;
        }
        public java.util.List<SyncQualityCheckResponseBodyDataRulesHitHitKeyWords> getHitKeyWords() {
            return this.hitKeyWords;
        }

        public SyncQualityCheckResponseBodyDataRulesHit setPhrase(SyncQualityCheckResponseBodyDataRulesHitPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public SyncQualityCheckResponseBodyDataRulesHitPhrase getPhrase() {
            return this.phrase;
        }

    }

    public static class SyncQualityCheckResponseBodyDataRulesRuleInfoBase extends TeaModel {
        /**
         * <p>Rule remarks</p>
         * 
         * <strong>example:</strong>
         * <p>邀约客户，客户不同意参加试听</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>Rule importance level</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>Rule category name</p>
         * <blockquote>
         * <p>Notice: The requiredFields parameter must include &quot;ruleInfoBase.ruleCategoryName&quot;.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>服务规范</p>
         */
        @NameInMap("RuleCategoryName")
        public String ruleCategoryName;

        /**
         * <p>Score value</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreNum")
        public Integer scoreNum;

        /**
         * <p>Scoring type. 0: bonus/penalty points, 1: one-time score.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        /**
         * <p>1 for bonus points, 3 for penalty points. Default is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreType")
        public Integer scoreType;

        /**
         * <p>Rule type ID</p>
         * <blockquote>
         * <p>Notice: The requiredFields parameter must include &quot;ruleInfoBase&quot;.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static SyncQualityCheckResponseBodyDataRulesRuleInfoBase build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyDataRulesRuleInfoBase self = new SyncQualityCheckResponseBodyDataRulesRuleInfoBase();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase setRuleCategoryName(String ruleCategoryName) {
            this.ruleCategoryName = ruleCategoryName;
            return this;
        }
        public String getRuleCategoryName() {
            return this.ruleCategoryName;
        }

        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase setScoreNumType(Integer scoreNumType) {
            this.scoreNumType = scoreNumType;
            return this;
        }
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase setScoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }
        public Integer getScoreType() {
            return this.scoreType;
        }

        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class SyncQualityCheckResponseBodyDataRules extends TeaModel {
        /**
         * <p>List of hit sentences. For this API, if a hit occurs, it is a single data entry.</p>
         */
        @NameInMap("Hit")
        public java.util.List<SyncQualityCheckResponseBodyDataRulesHit> hit;

        /**
         * <p>ID of the hit rule.</p>
         * 
         * <strong>example:</strong>
         * <p>232232</p>
         */
        @NameInMap("Rid")
        public String rid;

        /**
         * <p>Rule basic information</p>
         */
        @NameInMap("RuleInfoBase")
        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase ruleInfoBase;

        /**
         * <p>Name of the hit rule.</p>
         * 
         * <strong>example:</strong>
         * <p>禁用语</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static SyncQualityCheckResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyDataRules self = new SyncQualityCheckResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyDataRules setHit(java.util.List<SyncQualityCheckResponseBodyDataRulesHit> hit) {
            this.hit = hit;
            return this;
        }
        public java.util.List<SyncQualityCheckResponseBodyDataRulesHit> getHit() {
            return this.hit;
        }

        public SyncQualityCheckResponseBodyDataRules setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public SyncQualityCheckResponseBodyDataRules setRuleInfoBase(SyncQualityCheckResponseBodyDataRulesRuleInfoBase ruleInfoBase) {
            this.ruleInfoBase = ruleInfoBase;
            return this;
        }
        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase getRuleInfoBase() {
            return this.ruleInfoBase;
        }

        public SyncQualityCheckResponseBodyDataRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class SyncQualityCheckResponseBodyData extends TeaModel {
        /**
         * <p>Time of recording and dialogue occurrence, in milliseconds since January 1, 1970, 00:00:00 UTC (UNIX timestamp in milliseconds, such as 1584535485856).</p>
         * 
         * <strong>example:</strong>
         * <p>1584535485856</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>List of hit rules. Each item is a rule. Only hit rule information and hit rule location information are returned.</p>
         */
        @NameInMap("Rules")
        public java.util.List<SyncQualityCheckResponseBodyDataRules> rules;

        /**
         * <p>Final score, with a maximum of 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66E1ACB866E1ACB8</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Unique identifier for the current conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>20200876-66E1ACB8</p>
         */
        @NameInMap("Tid")
        public String tid;

        public static SyncQualityCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyData self = new SyncQualityCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public SyncQualityCheckResponseBodyData setRules(java.util.List<SyncQualityCheckResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<SyncQualityCheckResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public SyncQualityCheckResponseBodyData setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public SyncQualityCheckResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public SyncQualityCheckResponseBodyData setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

    }

}
