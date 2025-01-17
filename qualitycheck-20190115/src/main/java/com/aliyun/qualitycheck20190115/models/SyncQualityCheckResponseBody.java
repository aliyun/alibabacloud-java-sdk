// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SyncQualityCheckResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SyncQualityCheckResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>66E1ACB8-17B2-4BE8-8581-954A8*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>2312</p>
         */
        @NameInMap("Cid")
        public Integer cid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("To")
        public Integer to;

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
         * <strong>example:</strong>
         * <p>1230</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("EmotionValue")
        public Integer emotionValue;

        /**
         * <strong>example:</strong>
         * <p>3440</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Identity")
        public String identity;

        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        /**
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

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
        @NameInMap("HitKeyWords")
        public java.util.List<SyncQualityCheckResponseBodyDataRulesHitHitKeyWords> hitKeyWords;

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
        @NameInMap("Comments")
        public String comments;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("RuleCategoryName")
        public String ruleCategoryName;

        @NameInMap("ScoreNum")
        public Integer scoreNum;

        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        @NameInMap("ScoreType")
        public Integer scoreType;

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
        @NameInMap("Hit")
        public java.util.List<SyncQualityCheckResponseBodyDataRulesHit> hit;

        /**
         * <strong>example:</strong>
         * <p>232232</p>
         */
        @NameInMap("Rid")
        public String rid;

        @NameInMap("RuleInfoBase")
        public SyncQualityCheckResponseBodyDataRulesRuleInfoBase ruleInfoBase;

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
         * <strong>example:</strong>
         * <p>1584535485856</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("Rules")
        public java.util.List<SyncQualityCheckResponseBodyDataRules> rules;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <strong>example:</strong>
         * <p>66E1ACB866E1ACB8</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
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
