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
