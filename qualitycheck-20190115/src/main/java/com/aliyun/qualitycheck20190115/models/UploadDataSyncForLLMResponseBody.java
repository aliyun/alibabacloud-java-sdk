// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataSyncForLLMResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadDataSyncForLLMResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UploadDataSyncForLLMResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSyncForLLMResponseBody self = new UploadDataSyncForLLMResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDataSyncForLLMResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadDataSyncForLLMResponseBody setData(UploadDataSyncForLLMResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadDataSyncForLLMResponseBodyData getData() {
        return this.data;
    }

    public UploadDataSyncForLLMResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadDataSyncForLLMResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDataSyncForLLMResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo extends TeaModel {
        @NameInMap("ConditionInfoCid")
        public String conditionInfoCid;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo self = new UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo setConditionInfoCid(String conditionInfoCid) {
            this.conditionInfoCid = conditionInfoCid;
            return this;
        }
        public String getConditionInfoCid() {
            return this.conditionInfoCid;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo extends TeaModel {
        @NameInMap("ConditionBasicInfo")
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo> conditionBasicInfo;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo self = new UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo setConditionBasicInfo(java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo> conditionBasicInfo) {
            this.conditionBasicInfo = conditionBasicInfo;
            return this;
        }
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo> getConditionBasicInfo() {
            return this.conditionBasicInfo;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids extends TeaModel {
        @NameInMap("CidItem")
        public java.util.List<String> cidItem;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids self = new UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids setCidItem(java.util.List<String> cidItem) {
            this.cidItem = cidItem;
            return this;
        }
        public java.util.List<String> getCidItem() {
            return this.cidItem;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord extends TeaModel {
        @NameInMap("From")
        public Integer from;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("Tid")
        public String tid;

        @NameInMap("To")
        public Integer to;

        @NameInMap("Val")
        public String val;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord self = new UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords extends TeaModel {
        @NameInMap("HitKeyWord")
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord> hitKeyWord;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords self = new UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords setHitKeyWord(java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord> hitKeyWord) {
            this.hitKeyWord = hitKeyWord;
            return this;
        }
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord> getHitKeyWord() {
            return this.hitKeyWord;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("End")
        public Long end;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Role")
        public String role;

        @NameInMap("Words")
        public String words;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase self = new UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo extends TeaModel {
        @NameInMap("HitCids")
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids hitCids;

        @NameInMap("HitKeyWords")
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords hitKeyWords;

        @NameInMap("Phrase")
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase phrase;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo self = new UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo setHitCids(UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids hitCids) {
            this.hitCids = hitCids;
            return this;
        }
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids getHitCids() {
            return this.hitCids;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo setHitKeyWords(UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords hitKeyWords) {
            this.hitKeyWords = hitKeyWords;
            return this;
        }
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords getHitKeyWords() {
            return this.hitKeyWords;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo setPhrase(UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase getPhrase() {
            return this.phrase;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHit extends TeaModel {
        @NameInMap("ConditionHitInfo")
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo> conditionHitInfo;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHit build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHit self = new UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHit();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHit setConditionHitInfo(java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo> conditionHitInfo) {
            this.conditionHitInfo = conditionHitInfo;
            return this;
        }
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo> getConditionHitInfo() {
            return this.conditionHitInfo;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo extends TeaModel {
        @NameInMap("ConditionInfo")
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo conditionInfo;

        @NameInMap("Hit")
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHit hit;

        @NameInMap("Rid")
        public String rid;

        @NameInMap("Tid")
        public String tid;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo self = new UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo setConditionInfo(UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo conditionInfo) {
            this.conditionInfo = conditionInfo;
            return this;
        }
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo getConditionInfo() {
            return this.conditionInfo;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo setHit(UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHit hit) {
            this.hit = hit;
            return this;
        }
        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfoHit getHit() {
            return this.hit;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfoRules extends TeaModel {
        @NameInMap("RuleHitInfo")
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo> ruleHitInfo;

        public static UploadDataSyncForLLMResponseBodyDataResultInfoRules build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfoRules self = new UploadDataSyncForLLMResponseBodyDataResultInfoRules();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfoRules setRuleHitInfo(java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo> ruleHitInfo) {
            this.ruleHitInfo = ruleHitInfo;
            return this;
        }
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfoRulesRuleHitInfo> getRuleHitInfo() {
            return this.ruleHitInfo;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyDataResultInfo extends TeaModel {
        @NameInMap("Rules")
        public UploadDataSyncForLLMResponseBodyDataResultInfoRules rules;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("TyxmPlusCount")
        public String tyxmPlusCount;

        @NameInMap("TyxmTurboCount")
        public String tyxmTurboCount;

        public static UploadDataSyncForLLMResponseBodyDataResultInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyDataResultInfo self = new UploadDataSyncForLLMResponseBodyDataResultInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfo setRules(UploadDataSyncForLLMResponseBodyDataResultInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public UploadDataSyncForLLMResponseBodyDataResultInfoRules getRules() {
            return this.rules;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfo setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfo setTyxmPlusCount(String tyxmPlusCount) {
            this.tyxmPlusCount = tyxmPlusCount;
            return this;
        }
        public String getTyxmPlusCount() {
            return this.tyxmPlusCount;
        }

        public UploadDataSyncForLLMResponseBodyDataResultInfo setTyxmTurboCount(String tyxmTurboCount) {
            this.tyxmTurboCount = tyxmTurboCount;
            return this;
        }
        public String getTyxmTurboCount() {
            return this.tyxmTurboCount;
        }

    }

    public static class UploadDataSyncForLLMResponseBodyData extends TeaModel {
        @NameInMap("ResultInfo")
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfo> resultInfo;

        public static UploadDataSyncForLLMResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncForLLMResponseBodyData self = new UploadDataSyncForLLMResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncForLLMResponseBodyData setResultInfo(java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfo> resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public java.util.List<UploadDataSyncForLLMResponseBodyDataResultInfo> getResultInfo() {
            return this.resultInfo;
        }

    }

}
