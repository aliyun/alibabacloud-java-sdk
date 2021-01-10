// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataSyncResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UploadDataSyncResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static UploadDataSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSyncResponseBody self = new UploadDataSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDataSyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadDataSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDataSyncResponseBody setData(UploadDataSyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadDataSyncResponseBodyData getData() {
        return this.data;
    }

    public UploadDataSyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadDataSyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase extends TeaModel {
        @NameInMap("Words")
        public String words;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("End")
        public Long end;

        @NameInMap("Role")
        public String role;

        public static UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase self = new UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids extends TeaModel {
        @NameInMap("CidItem")
        public java.util.List<String> cidItem;

        public static UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids self = new UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids setCidItem(java.util.List<String> cidItem) {
            this.cidItem = cidItem;
            return this;
        }
        public java.util.List<String> getCidItem() {
            return this.cidItem;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord extends TeaModel {
        @NameInMap("From")
        public Integer from;

        @NameInMap("Val")
        public String val;

        @NameInMap("Tid")
        public String tid;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("To")
        public Integer to;

        public static UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord self = new UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords extends TeaModel {
        @NameInMap("HitKeyWord")
        public java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord> hitKeyWord;

        public static UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords self = new UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords setHitKeyWord(java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord> hitKeyWord) {
            this.hitKeyWord = hitKeyWord;
            return this;
        }
        public java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWordsHitKeyWord> getHitKeyWord() {
            return this.hitKeyWord;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo extends TeaModel {
        @NameInMap("Phrase")
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase phrase;

        @NameInMap("HitCids")
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids hitCids;

        @NameInMap("HitKeyWords")
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords hitKeyWords;

        public static UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo self = new UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo setPhrase(UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoPhrase getPhrase() {
            return this.phrase;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo setHitCids(UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids hitCids) {
            this.hitCids = hitCids;
            return this;
        }
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitCids getHitCids() {
            return this.hitCids;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo setHitKeyWords(UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords hitKeyWords) {
            this.hitKeyWords = hitKeyWords;
            return this;
        }
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfoHitKeyWords getHitKeyWords() {
            return this.hitKeyWords;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHit extends TeaModel {
        @NameInMap("ConditionHitInfo")
        public java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo> conditionHitInfo;

        public static UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHit build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHit self = new UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHit();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHit setConditionHitInfo(java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo> conditionHitInfo) {
            this.conditionHitInfo = conditionHitInfo;
            return this;
        }
        public java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHitConditionHitInfo> getConditionHitInfo() {
            return this.conditionHitInfo;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo extends TeaModel {
        @NameInMap("ConditionInfoCid")
        public String conditionInfoCid;

        public static UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo self = new UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo setConditionInfoCid(String conditionInfoCid) {
            this.conditionInfoCid = conditionInfoCid;
            return this;
        }
        public String getConditionInfoCid() {
            return this.conditionInfoCid;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo extends TeaModel {
        @NameInMap("ConditionBasicInfo")
        public java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo> conditionBasicInfo;

        public static UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo self = new UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo setConditionBasicInfo(java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo> conditionBasicInfo) {
            this.conditionBasicInfo = conditionBasicInfo;
            return this;
        }
        public java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfoConditionBasicInfo> getConditionBasicInfo() {
            return this.conditionBasicInfo;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo extends TeaModel {
        @NameInMap("Tid")
        public String tid;

        @NameInMap("Hit")
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHit hit;

        @NameInMap("ConditionInfo")
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo conditionInfo;

        @NameInMap("Rid")
        public String rid;

        public static UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo self = new UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo setHit(UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHit hit) {
            this.hit = hit;
            return this;
        }
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoHit getHit() {
            return this.hit;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo setConditionInfo(UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo conditionInfo) {
            this.conditionInfo = conditionInfo;
            return this;
        }
        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfoConditionInfo getConditionInfo() {
            return this.conditionInfo;
        }

        public UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoRules extends TeaModel {
        @NameInMap("RuleHitInfo")
        public java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo> ruleHitInfo;

        public static UploadDataSyncResponseBodyDataResultInfoRules build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoRules self = new UploadDataSyncResponseBodyDataResultInfoRules();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoRules setRuleHitInfo(java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo> ruleHitInfo) {
            this.ruleHitInfo = ruleHitInfo;
            return this;
        }
        public java.util.List<UploadDataSyncResponseBodyDataResultInfoRulesRuleHitInfo> getRuleHitInfo() {
            return this.ruleHitInfo;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfoHandScoreIdList extends TeaModel {
        @NameInMap("HandScoreIdList")
        public java.util.List<String> handScoreIdList;

        public static UploadDataSyncResponseBodyDataResultInfoHandScoreIdList build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfoHandScoreIdList self = new UploadDataSyncResponseBodyDataResultInfoHandScoreIdList();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfoHandScoreIdList setHandScoreIdList(java.util.List<String> handScoreIdList) {
            this.handScoreIdList = handScoreIdList;
            return this;
        }
        public java.util.List<String> getHandScoreIdList() {
            return this.handScoreIdList;
        }

    }

    public static class UploadDataSyncResponseBodyDataResultInfo extends TeaModel {
        @NameInMap("Score")
        public Integer score;

        @NameInMap("Rules")
        public UploadDataSyncResponseBodyDataResultInfoRules rules;

        @NameInMap("HandScoreIdList")
        public UploadDataSyncResponseBodyDataResultInfoHandScoreIdList handScoreIdList;

        public static UploadDataSyncResponseBodyDataResultInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyDataResultInfo self = new UploadDataSyncResponseBodyDataResultInfo();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyDataResultInfo setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public UploadDataSyncResponseBodyDataResultInfo setRules(UploadDataSyncResponseBodyDataResultInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public UploadDataSyncResponseBodyDataResultInfoRules getRules() {
            return this.rules;
        }

        public UploadDataSyncResponseBodyDataResultInfo setHandScoreIdList(UploadDataSyncResponseBodyDataResultInfoHandScoreIdList handScoreIdList) {
            this.handScoreIdList = handScoreIdList;
            return this;
        }
        public UploadDataSyncResponseBodyDataResultInfoHandScoreIdList getHandScoreIdList() {
            return this.handScoreIdList;
        }

    }

    public static class UploadDataSyncResponseBodyData extends TeaModel {
        @NameInMap("ResultInfo")
        public java.util.List<UploadDataSyncResponseBodyDataResultInfo> resultInfo;

        public static UploadDataSyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSyncResponseBodyData self = new UploadDataSyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadDataSyncResponseBodyData setResultInfo(java.util.List<UploadDataSyncResponseBodyDataResultInfo> resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public java.util.List<UploadDataSyncResponseBodyDataResultInfo> getResultInfo() {
            return this.resultInfo;
        }

    }

}
