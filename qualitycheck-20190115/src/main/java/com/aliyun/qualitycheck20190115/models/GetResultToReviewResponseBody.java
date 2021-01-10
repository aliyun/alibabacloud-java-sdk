// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultToReviewResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetResultToReviewResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetResultToReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResultToReviewResponseBody self = new GetResultToReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResultToReviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResultToReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResultToReviewResponseBody setData(GetResultToReviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResultToReviewResponseBodyData getData() {
        return this.data;
    }

    public GetResultToReviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResultToReviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("TimeStr")
        public String timeStr;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("ReviewResult")
        public Integer reviewResult;

        @NameInMap("ComplainResult")
        public Integer complainResult;

        @NameInMap("OldScore")
        public Integer oldScore;

        public static GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory self = new GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setTimeStr(String timeStr) {
            this.timeStr = timeStr;
            return this;
        }
        public String getTimeStr() {
            return this.timeStr;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setReviewResult(Integer reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setComplainResult(Integer complainResult) {
            this.complainResult = complainResult;
            return this;
        }
        public Integer getComplainResult() {
            return this.complainResult;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setOldScore(Integer oldScore) {
            this.oldScore = oldScore;
            return this;
        }
        public Integer getOldScore() {
            return this.oldScore;
        }

    }

    public static class GetResultToReviewResponseBodyDataReviewHistoryList extends TeaModel {
        @NameInMap("ReviewHistory")
        public java.util.List<GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory> reviewHistory;

        public static GetResultToReviewResponseBodyDataReviewHistoryList build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataReviewHistoryList self = new GetResultToReviewResponseBodyDataReviewHistoryList();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataReviewHistoryList setReviewHistory(java.util.List<GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory> reviewHistory) {
            this.reviewHistory = reviewHistory;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory> getReviewHistory() {
            return this.reviewHistory;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase extends TeaModel {
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

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord extends TeaModel {
        @NameInMap("From")
        public Integer from;

        @NameInMap("Val")
        public String val;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("Tid")
        public String tid;

        @NameInMap("Cid")
        public String cid;

        @NameInMap("To")
        public Integer to;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords extends TeaModel {
        @NameInMap("KeyWord")
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> keyWord;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords setKeyWord(java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> keyWord) {
            this.keyWord = keyWord;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> getKeyWord() {
            return this.keyWord;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid extends TeaModel {
        @NameInMap("Cid")
        public java.util.List<String> cid;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid setCid(java.util.List<String> cid) {
            this.cid = cid;
            return this;
        }
        public java.util.List<String> getCid() {
            return this.cid;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo extends TeaModel {
        @NameInMap("Phrase")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase;

        @NameInMap("KeyWords")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords;

        @NameInMap("Cid")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setPhrase(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase getPhrase() {
            return this.phrase;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setKeyWords(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords getKeyWords() {
            return this.keyWords;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setCid(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid) {
            this.cid = cid;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid getCid() {
            return this.cid;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList extends TeaModel {
        @NameInMap("ConditionHitInfo")
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> conditionHitInfo;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList setConditionHitInfo(java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> conditionHitInfo) {
            this.conditionHitInfo = conditionHitInfo;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> getConditionHitInfo() {
            return this.conditionHitInfo;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo extends TeaModel {
        @NameInMap("ReviewTime")
        public String reviewTime;

        @NameInMap("Reviewer")
        public String reviewer;

        @NameInMap("ReviewResult")
        public Integer reviewResult;

        @NameInMap("HitId")
        public String hitId;

        @NameInMap("Rid")
        public Long rid;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setReviewTime(String reviewTime) {
            this.reviewTime = reviewTime;
            return this;
        }
        public String getReviewTime() {
            return this.reviewTime;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setReviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }
        public String getReviewer() {
            return this.reviewer;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setReviewResult(Integer reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setHitId(String hitId) {
            this.hitId = hitId;
            return this;
        }
        public String getHitId() {
            return this.hitId;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories extends TeaModel {
        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("Operator")
        public Long operator;

        @NameInMap("OperationTime")
        public String operationTime;

        @NameInMap("OperationType")
        public Integer operationType;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories setOperationType(Integer operationType) {
            this.operationType = operationType;
            return this;
        }
        public Integer getOperationType() {
            return this.operationType;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistories extends TeaModel {
        @NameInMap("ComplainHistories")
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories> complainHistories;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistories build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistories self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistories();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistories setComplainHistories(java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories> complainHistories) {
            this.complainHistories = complainHistories;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories> getComplainHistories() {
            return this.complainHistories;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo extends TeaModel {
        @NameInMap("ConditionHitInfoList")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList;

        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        @NameInMap("ReviewInfo")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo reviewInfo;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Rid")
        public Long rid;

        @NameInMap("ScoreSubName")
        public String scoreSubName;

        @NameInMap("ScoreNum")
        public Integer scoreNum;

        @NameInMap("AutoReview")
        public Integer autoReview;

        @NameInMap("ComplainHistories")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistories complainHistories;

        @NameInMap("Complainable")
        public Boolean complainable;

        @NameInMap("ScoreId")
        public Long scoreId;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setConditionHitInfoList(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList) {
            this.conditionHitInfoList = conditionHitInfoList;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList getConditionHitInfoList() {
            return this.conditionHitInfoList;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setReviewInfo(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo reviewInfo) {
            this.reviewInfo = reviewInfo;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo getReviewInfo() {
            return this.reviewInfo;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setAutoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }
        public Integer getAutoReview() {
            return this.autoReview;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setComplainHistories(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistories complainHistories) {
            this.complainHistories = complainHistories;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistories getComplainHistories() {
            return this.complainHistories;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setComplainable(Boolean complainable) {
            this.complainable = complainable;
            return this;
        }
        public Boolean getComplainable() {
            return this.complainable;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Long getScoreId() {
            return this.scoreId;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoList extends TeaModel {
        @NameInMap("HitRuleReviewInfo")
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> hitRuleReviewInfo;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoList self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoList();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoList setHitRuleReviewInfo(java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> hitRuleReviewInfo) {
            this.hitRuleReviewInfo = hitRuleReviewInfo;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> getHitRuleReviewInfo() {
            return this.hitRuleReviewInfo;
        }

    }

    public static class GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories extends TeaModel {
        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("Operator")
        public Long operator;

        @NameInMap("OperationTime")
        public String operationTime;

        @NameInMap("OperationType")
        public Integer operationType;

        public static GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories self = new GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories setOperationType(Integer operationType) {
            this.operationType = operationType;
            return this;
        }
        public Integer getOperationType() {
            return this.operationType;
        }

    }

    public static class GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistories extends TeaModel {
        @NameInMap("ComplainHistories")
        public java.util.List<GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories> complainHistories;

        public static GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistories build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistories self = new GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistories();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistories setComplainHistories(java.util.List<GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories> complainHistories) {
            this.complainHistories = complainHistories;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories> getComplainHistories() {
            return this.complainHistories;
        }

    }

    public static class GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo extends TeaModel {
        @NameInMap("ScoreSubName")
        public String scoreSubName;

        @NameInMap("ScoreNum")
        public Integer scoreNum;

        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        @NameInMap("ComplainHistories")
        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistories complainHistories;

        @NameInMap("Complainable")
        public Boolean complainable;

        @NameInMap("ScoreId")
        public Long scoreId;

        public static GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo self = new GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo setScoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo setComplainHistories(GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistories complainHistories) {
            this.complainHistories = complainHistories;
            return this;
        }
        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistories getComplainHistories() {
            return this.complainHistories;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo setComplainable(Boolean complainable) {
            this.complainable = complainable;
            return this;
        }
        public Boolean getComplainable() {
            return this.complainable;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo setScoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Long getScoreId() {
            return this.scoreId;
        }

    }

    public static class GetResultToReviewResponseBodyDataManualScoreInfoList extends TeaModel {
        @NameInMap("ManualScoreInfo")
        public java.util.List<GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo> manualScoreInfo;

        public static GetResultToReviewResponseBodyDataManualScoreInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataManualScoreInfoList self = new GetResultToReviewResponseBodyDataManualScoreInfoList();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoList setManualScoreInfo(java.util.List<GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo> manualScoreInfo) {
            this.manualScoreInfo = manualScoreInfo;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo> getManualScoreInfo() {
            return this.manualScoreInfo;
        }

    }

    public static class GetResultToReviewResponseBodyDataDialoguesDialogue extends TeaModel {
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

        public static GetResultToReviewResponseBodyDataDialoguesDialogue build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataDialoguesDialogue self = new GetResultToReviewResponseBodyDataDialoguesDialogue();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setSilenceDuration(Integer silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setHourMinSec(String hourMinSec) {
            this.hourMinSec = hourMinSec;
            return this;
        }
        public String getHourMinSec() {
            return this.hourMinSec;
        }

    }

    public static class GetResultToReviewResponseBodyDataDialogues extends TeaModel {
        @NameInMap("Dialogue")
        public java.util.List<GetResultToReviewResponseBodyDataDialoguesDialogue> dialogue;

        public static GetResultToReviewResponseBodyDataDialogues build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataDialogues self = new GetResultToReviewResponseBodyDataDialogues();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataDialogues setDialogue(java.util.List<GetResultToReviewResponseBodyDataDialoguesDialogue> dialogue) {
            this.dialogue = dialogue;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataDialoguesDialogue> getDialogue() {
            return this.dialogue;
        }

    }

    public static class GetResultToReviewResponseBodyData extends TeaModel {
        @NameInMap("AudioScheme")
        public String audioScheme;

        @NameInMap("AudioURL")
        public String audioURL;

        @NameInMap("ReviewHistoryList")
        public GetResultToReviewResponseBodyDataReviewHistoryList reviewHistoryList;

        @NameInMap("HitRuleReviewInfoList")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList;

        @NameInMap("TotalScore")
        public Integer totalScore;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("ManualScoreInfoList")
        public GetResultToReviewResponseBodyDataManualScoreInfoList manualScoreInfoList;

        @NameInMap("FileMergeName")
        public String fileMergeName;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("Dialogues")
        public GetResultToReviewResponseBodyDataDialogues dialogues;

        @NameInMap("Vid")
        public String vid;

        public static GetResultToReviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyData self = new GetResultToReviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyData setAudioScheme(String audioScheme) {
            this.audioScheme = audioScheme;
            return this;
        }
        public String getAudioScheme() {
            return this.audioScheme;
        }

        public GetResultToReviewResponseBodyData setAudioURL(String audioURL) {
            this.audioURL = audioURL;
            return this;
        }
        public String getAudioURL() {
            return this.audioURL;
        }

        public GetResultToReviewResponseBodyData setReviewHistoryList(GetResultToReviewResponseBodyDataReviewHistoryList reviewHistoryList) {
            this.reviewHistoryList = reviewHistoryList;
            return this;
        }
        public GetResultToReviewResponseBodyDataReviewHistoryList getReviewHistoryList() {
            return this.reviewHistoryList;
        }

        public GetResultToReviewResponseBodyData setHitRuleReviewInfoList(GetResultToReviewResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList) {
            this.hitRuleReviewInfoList = hitRuleReviewInfoList;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoList getHitRuleReviewInfoList() {
            return this.hitRuleReviewInfoList;
        }

        public GetResultToReviewResponseBodyData setTotalScore(Integer totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public Integer getTotalScore() {
            return this.totalScore;
        }

        public GetResultToReviewResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetResultToReviewResponseBodyData setManualScoreInfoList(GetResultToReviewResponseBodyDataManualScoreInfoList manualScoreInfoList) {
            this.manualScoreInfoList = manualScoreInfoList;
            return this;
        }
        public GetResultToReviewResponseBodyDataManualScoreInfoList getManualScoreInfoList() {
            return this.manualScoreInfoList;
        }

        public GetResultToReviewResponseBodyData setFileMergeName(String fileMergeName) {
            this.fileMergeName = fileMergeName;
            return this;
        }
        public String getFileMergeName() {
            return this.fileMergeName;
        }

        public GetResultToReviewResponseBodyData setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetResultToReviewResponseBodyData setDialogues(GetResultToReviewResponseBodyDataDialogues dialogues) {
            this.dialogues = dialogues;
            return this;
        }
        public GetResultToReviewResponseBodyDataDialogues getDialogues() {
            return this.dialogues;
        }

        public GetResultToReviewResponseBodyData setVid(String vid) {
            this.vid = vid;
            return this;
        }
        public String getVid() {
            return this.vid;
        }

    }

}
