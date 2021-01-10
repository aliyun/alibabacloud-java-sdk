// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetReviewInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetReviewInfoResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetReviewInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReviewInfoResponseBody self = new GetReviewInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReviewInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetReviewInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetReviewInfoResponseBody setData(GetReviewInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetReviewInfoResponseBodyData getData() {
        return this.data;
    }

    public GetReviewInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetReviewInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase extends TeaModel {
        @NameInMap("Words")
        public String words;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Long end;

        @NameInMap("Role")
        public String role;

        public static GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase self = new GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord extends TeaModel {
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

        public static GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord self = new GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords extends TeaModel {
        @NameInMap("KeyWord")
        public java.util.List<GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> keyWord;

        public static GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords self = new GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords setKeyWord(java.util.List<GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> keyWord) {
            this.keyWord = keyWord;
            return this;
        }
        public java.util.List<GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> getKeyWord() {
            return this.keyWord;
        }

    }

    public static class GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid extends TeaModel {
        @NameInMap("Cid")
        public java.util.List<String> cid;

        public static GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid self = new GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid setCid(java.util.List<String> cid) {
            this.cid = cid;
            return this;
        }
        public java.util.List<String> getCid() {
            return this.cid;
        }

    }

    public static class GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo extends TeaModel {
        @NameInMap("Phrase")
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase;

        @NameInMap("KeyWords")
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords;

        @NameInMap("Cid")
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid;

        public static GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo self = new GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setPhrase(GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase getPhrase() {
            return this.phrase;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setKeyWords(GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords getKeyWords() {
            return this.keyWords;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setCid(GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid) {
            this.cid = cid;
            return this;
        }
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid getCid() {
            return this.cid;
        }

    }

    public static class GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList extends TeaModel {
        @NameInMap("ConditionHitInfo")
        public java.util.List<GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> conditionHitInfo;

        public static GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList self = new GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList setConditionHitInfo(java.util.List<GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> conditionHitInfo) {
            this.conditionHitInfo = conditionHitInfo;
            return this;
        }
        public java.util.List<GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> getConditionHitInfo() {
            return this.conditionHitInfo;
        }

    }

    public static class GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo extends TeaModel {
        @NameInMap("HitId")
        public String hitId;

        @NameInMap("Rid")
        public Long rid;

        public static GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo self = new GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setHitId(String hitId) {
            this.hitId = hitId;
            return this;
        }
        public String getHitId() {
            return this.hitId;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

    }

    public static class GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo extends TeaModel {
        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        @NameInMap("ConditionHitInfoList")
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("AutoReview")
        public Integer autoReview;

        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        @NameInMap("ReviewInfo")
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo reviewInfo;

        @NameInMap("TotalNumber")
        public Integer totalNumber;

        @NameInMap("ScoreId")
        public Long scoreId;

        @NameInMap("Rid")
        public Long rid;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo self = new GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRuleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setConditionHitInfoList(GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList) {
            this.conditionHitInfoList = conditionHitInfoList;
            return this;
        }
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList getConditionHitInfoList() {
            return this.conditionHitInfoList;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setAutoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }
        public Integer getAutoReview() {
            return this.autoReview;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setReviewInfo(GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo reviewInfo) {
            this.reviewInfo = reviewInfo;
            return this;
        }
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo getReviewInfo() {
            return this.reviewInfo;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Long getScoreId() {
            return this.scoreId;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetReviewInfoResponseBodyDataHitRuleReviewInfoList extends TeaModel {
        @NameInMap("HitRuleReviewInfo")
        public java.util.List<GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> hitRuleReviewInfo;

        public static GetReviewInfoResponseBodyDataHitRuleReviewInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHitRuleReviewInfoList self = new GetReviewInfoResponseBodyDataHitRuleReviewInfoList();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHitRuleReviewInfoList setHitRuleReviewInfo(java.util.List<GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> hitRuleReviewInfo) {
            this.hitRuleReviewInfo = hitRuleReviewInfo;
            return this;
        }
        public java.util.List<GetReviewInfoResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> getHitRuleReviewInfo() {
            return this.hitRuleReviewInfo;
        }

    }

    public static class GetReviewInfoResponseBodyDataManualScoreMappingList extends TeaModel {
        @NameInMap("ManualScoreMappingList")
        public java.util.List<String> manualScoreMappingList;

        public static GetReviewInfoResponseBodyDataManualScoreMappingList build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataManualScoreMappingList self = new GetReviewInfoResponseBodyDataManualScoreMappingList();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataManualScoreMappingList setManualScoreMappingList(java.util.List<String> manualScoreMappingList) {
            this.manualScoreMappingList = manualScoreMappingList;
            return this;
        }
        public java.util.List<String> getManualScoreMappingList() {
            return this.manualScoreMappingList;
        }

    }

    public static class GetReviewInfoResponseBodyDataDialoguesDialogue extends TeaModel {
        @NameInMap("Words")
        public String words;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginTime")
        public String beginTime;

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

        @NameInMap("HourMinSec")
        public String hourMinSec;

        public static GetReviewInfoResponseBodyDataDialoguesDialogue build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataDialoguesDialogue self = new GetReviewInfoResponseBodyDataDialoguesDialogue();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setSilenceDuration(Integer silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        public GetReviewInfoResponseBodyDataDialoguesDialogue setHourMinSec(String hourMinSec) {
            this.hourMinSec = hourMinSec;
            return this;
        }
        public String getHourMinSec() {
            return this.hourMinSec;
        }

    }

    public static class GetReviewInfoResponseBodyDataDialogues extends TeaModel {
        @NameInMap("Dialogue")
        public java.util.List<GetReviewInfoResponseBodyDataDialoguesDialogue> dialogue;

        public static GetReviewInfoResponseBodyDataDialogues build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataDialogues self = new GetReviewInfoResponseBodyDataDialogues();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataDialogues setDialogue(java.util.List<GetReviewInfoResponseBodyDataDialoguesDialogue> dialogue) {
            this.dialogue = dialogue;
            return this;
        }
        public java.util.List<GetReviewInfoResponseBodyDataDialoguesDialogue> getDialogue() {
            return this.dialogue;
        }

    }

    public static class GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam extends TeaModel {
        @NameInMap("ScoreSubName")
        public String scoreSubName;

        @NameInMap("ScoreNum")
        public Integer scoreNum;

        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        @NameInMap("ScoreType")
        public Integer scoreType;

        @NameInMap("Hit")
        public Integer hit;

        public static GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam self = new GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setScoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setScoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }
        public Integer getScoreType() {
            return this.scoreType;
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setHit(Integer hit) {
            this.hit = hit;
            return this;
        }
        public Integer getHit() {
            return this.hit;
        }

    }

    public static class GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfos extends TeaModel {
        @NameInMap("ScoreParam")
        public java.util.List<GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam> scoreParam;

        public static GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfos build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfos self = new GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfos();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfos setScoreParam(java.util.List<GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam> scoreParam) {
            this.scoreParam = scoreParam;
            return this;
        }
        public java.util.List<GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam> getScoreParam() {
            return this.scoreParam;
        }

    }

    public static class GetReviewInfoResponseBodyDataHandScoreInfoListScorePo extends TeaModel {
        @NameInMap("ScoreInfos")
        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfos scoreInfos;

        @NameInMap("ScoreName")
        public String scoreName;

        @NameInMap("ScoreId")
        public Long scoreId;

        public static GetReviewInfoResponseBodyDataHandScoreInfoListScorePo build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHandScoreInfoListScorePo self = new GetReviewInfoResponseBodyDataHandScoreInfoListScorePo();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePo setScoreInfos(GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfos scoreInfos) {
            this.scoreInfos = scoreInfos;
            return this;
        }
        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePoScoreInfos getScoreInfos() {
            return this.scoreInfos;
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePo setScoreName(String scoreName) {
            this.scoreName = scoreName;
            return this;
        }
        public String getScoreName() {
            return this.scoreName;
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoListScorePo setScoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Long getScoreId() {
            return this.scoreId;
        }

    }

    public static class GetReviewInfoResponseBodyDataHandScoreInfoList extends TeaModel {
        @NameInMap("ScorePo")
        public java.util.List<GetReviewInfoResponseBodyDataHandScoreInfoListScorePo> scorePo;

        public static GetReviewInfoResponseBodyDataHandScoreInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyDataHandScoreInfoList self = new GetReviewInfoResponseBodyDataHandScoreInfoList();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyDataHandScoreInfoList setScorePo(java.util.List<GetReviewInfoResponseBodyDataHandScoreInfoListScorePo> scorePo) {
            this.scorePo = scorePo;
            return this;
        }
        public java.util.List<GetReviewInfoResponseBodyDataHandScoreInfoListScorePo> getScorePo() {
            return this.scorePo;
        }

    }

    public static class GetReviewInfoResponseBodyData extends TeaModel {
        @NameInMap("AudioURL")
        public String audioURL;

        @NameInMap("HitNumber")
        public Integer hitNumber;

        @NameInMap("NextVid")
        public String nextVid;

        @NameInMap("PreVid")
        public String preVid;

        @NameInMap("IsAudio")
        public Boolean isAudio;

        @NameInMap("HitRuleReviewInfoList")
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList;

        @NameInMap("Audio")
        public Boolean audio;

        @NameInMap("AsrWordsCount")
        public Integer asrWordsCount;

        @NameInMap("TotalScore")
        public Integer totalScore;

        @NameInMap("BusinessType")
        public Integer businessType;

        @NameInMap("ManualScoreMappingList")
        public GetReviewInfoResponseBodyDataManualScoreMappingList manualScoreMappingList;

        @NameInMap("FileMergeName")
        public String fileMergeName;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("Dialogues")
        public GetReviewInfoResponseBodyDataDialogues dialogues;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("HandScoreInfoList")
        public GetReviewInfoResponseBodyDataHandScoreInfoList handScoreInfoList;

        @NameInMap("Vid")
        public String vid;

        @NameInMap("ReviewNumber")
        public Integer reviewNumber;

        public static GetReviewInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetReviewInfoResponseBodyData self = new GetReviewInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetReviewInfoResponseBodyData setAudioURL(String audioURL) {
            this.audioURL = audioURL;
            return this;
        }
        public String getAudioURL() {
            return this.audioURL;
        }

        public GetReviewInfoResponseBodyData setHitNumber(Integer hitNumber) {
            this.hitNumber = hitNumber;
            return this;
        }
        public Integer getHitNumber() {
            return this.hitNumber;
        }

        public GetReviewInfoResponseBodyData setNextVid(String nextVid) {
            this.nextVid = nextVid;
            return this;
        }
        public String getNextVid() {
            return this.nextVid;
        }

        public GetReviewInfoResponseBodyData setPreVid(String preVid) {
            this.preVid = preVid;
            return this;
        }
        public String getPreVid() {
            return this.preVid;
        }

        public GetReviewInfoResponseBodyData setIsAudio(Boolean isAudio) {
            this.isAudio = isAudio;
            return this;
        }
        public Boolean getIsAudio() {
            return this.isAudio;
        }

        public GetReviewInfoResponseBodyData setHitRuleReviewInfoList(GetReviewInfoResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList) {
            this.hitRuleReviewInfoList = hitRuleReviewInfoList;
            return this;
        }
        public GetReviewInfoResponseBodyDataHitRuleReviewInfoList getHitRuleReviewInfoList() {
            return this.hitRuleReviewInfoList;
        }

        public GetReviewInfoResponseBodyData setAudio(Boolean audio) {
            this.audio = audio;
            return this;
        }
        public Boolean getAudio() {
            return this.audio;
        }

        public GetReviewInfoResponseBodyData setAsrWordsCount(Integer asrWordsCount) {
            this.asrWordsCount = asrWordsCount;
            return this;
        }
        public Integer getAsrWordsCount() {
            return this.asrWordsCount;
        }

        public GetReviewInfoResponseBodyData setTotalScore(Integer totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public Integer getTotalScore() {
            return this.totalScore;
        }

        public GetReviewInfoResponseBodyData setBusinessType(Integer businessType) {
            this.businessType = businessType;
            return this;
        }
        public Integer getBusinessType() {
            return this.businessType;
        }

        public GetReviewInfoResponseBodyData setManualScoreMappingList(GetReviewInfoResponseBodyDataManualScoreMappingList manualScoreMappingList) {
            this.manualScoreMappingList = manualScoreMappingList;
            return this;
        }
        public GetReviewInfoResponseBodyDataManualScoreMappingList getManualScoreMappingList() {
            return this.manualScoreMappingList;
        }

        public GetReviewInfoResponseBodyData setFileMergeName(String fileMergeName) {
            this.fileMergeName = fileMergeName;
            return this;
        }
        public String getFileMergeName() {
            return this.fileMergeName;
        }

        public GetReviewInfoResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public GetReviewInfoResponseBodyData setDialogues(GetReviewInfoResponseBodyDataDialogues dialogues) {
            this.dialogues = dialogues;
            return this;
        }
        public GetReviewInfoResponseBodyDataDialogues getDialogues() {
            return this.dialogues;
        }

        public GetReviewInfoResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetReviewInfoResponseBodyData setHandScoreInfoList(GetReviewInfoResponseBodyDataHandScoreInfoList handScoreInfoList) {
            this.handScoreInfoList = handScoreInfoList;
            return this;
        }
        public GetReviewInfoResponseBodyDataHandScoreInfoList getHandScoreInfoList() {
            return this.handScoreInfoList;
        }

        public GetReviewInfoResponseBodyData setVid(String vid) {
            this.vid = vid;
            return this;
        }
        public String getVid() {
            return this.vid;
        }

        public GetReviewInfoResponseBodyData setReviewNumber(Integer reviewNumber) {
            this.reviewNumber = reviewNumber;
            return this;
        }
        public Integer getReviewNumber() {
            return this.reviewNumber;
        }

    }

}
