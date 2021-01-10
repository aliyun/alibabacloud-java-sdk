// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SyncQualityCheckResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SyncQualityCheckResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static SyncQualityCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncQualityCheckResponseBody self = new SyncQualityCheckResponseBody();
        return TeaModel.build(map, self);
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

    public SyncQualityCheckResponseBody setData(SyncQualityCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncQualityCheckResponseBodyData getData() {
        return this.data;
    }

    public SyncQualityCheckResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncQualityCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyncQualityCheckResponseBodyDataRulesHitPhrase extends TeaModel {
        @NameInMap("Words")
        public String words;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Long end;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Role")
        public String role;

        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        public static SyncQualityCheckResponseBodyDataRulesHitPhrase build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyDataRulesHitPhrase self = new SyncQualityCheckResponseBodyDataRulesHitPhrase();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
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

        public SyncQualityCheckResponseBodyDataRulesHitPhrase setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
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

    }

    public static class SyncQualityCheckResponseBodyDataRulesHitHitKeyWords extends TeaModel {
        @NameInMap("From")
        public Integer from;

        @NameInMap("Val")
        public String val;

        @NameInMap("Cid")
        public Integer cid;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("To")
        public Integer to;

        public static SyncQualityCheckResponseBodyDataRulesHitHitKeyWords build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyDataRulesHitHitKeyWords self = new SyncQualityCheckResponseBodyDataRulesHitHitKeyWords();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyDataRulesHitHitKeyWords setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public SyncQualityCheckResponseBodyDataRulesHitHitKeyWords setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

        public SyncQualityCheckResponseBodyDataRulesHitHitKeyWords setCid(Integer cid) {
            this.cid = cid;
            return this;
        }
        public Integer getCid() {
            return this.cid;
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

    }

    public static class SyncQualityCheckResponseBodyDataRulesHit extends TeaModel {
        @NameInMap("Phrase")
        public SyncQualityCheckResponseBodyDataRulesHitPhrase phrase;

        @NameInMap("HitKeyWords")
        public java.util.List<SyncQualityCheckResponseBodyDataRulesHitHitKeyWords> hitKeyWords;

        public static SyncQualityCheckResponseBodyDataRulesHit build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyDataRulesHit self = new SyncQualityCheckResponseBodyDataRulesHit();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyDataRulesHit setPhrase(SyncQualityCheckResponseBodyDataRulesHitPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public SyncQualityCheckResponseBodyDataRulesHitPhrase getPhrase() {
            return this.phrase;
        }

        public SyncQualityCheckResponseBodyDataRulesHit setHitKeyWords(java.util.List<SyncQualityCheckResponseBodyDataRulesHitHitKeyWords> hitKeyWords) {
            this.hitKeyWords = hitKeyWords;
            return this;
        }
        public java.util.List<SyncQualityCheckResponseBodyDataRulesHitHitKeyWords> getHitKeyWords() {
            return this.hitKeyWords;
        }

    }

    public static class SyncQualityCheckResponseBodyDataRules extends TeaModel {
        @NameInMap("Hit")
        public java.util.List<SyncQualityCheckResponseBodyDataRulesHit> hit;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Rid")
        public String rid;

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

        public SyncQualityCheckResponseBodyDataRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public SyncQualityCheckResponseBodyDataRules setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

    }

    public static class SyncQualityCheckResponseBodyData extends TeaModel {
        @NameInMap("Tid")
        public String tid;

        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Rules")
        public java.util.List<SyncQualityCheckResponseBodyDataRules> rules;

        public static SyncQualityCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncQualityCheckResponseBodyData self = new SyncQualityCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncQualityCheckResponseBodyData setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public SyncQualityCheckResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
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

        public SyncQualityCheckResponseBodyData setRules(java.util.List<SyncQualityCheckResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<SyncQualityCheckResponseBodyDataRules> getRules() {
            return this.rules;
        }

    }

}
