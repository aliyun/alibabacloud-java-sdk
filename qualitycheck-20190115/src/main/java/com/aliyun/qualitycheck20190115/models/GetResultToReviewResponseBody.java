// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultToReviewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetResultToReviewResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>82C91484-B2D5-4D2A-A21F-A6D73F4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetResultToReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResultToReviewResponseBody self = new GetResultToReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResultToReviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResultToReviewResponseBody setData(GetResultToReviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResultToReviewResponseBodyData getData() {
        return this.data;
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

    public GetResultToReviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetResultToReviewResponseBodyDataDialoguesDialogue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>72000</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <strong>example:</strong>
         * <p>2019-10-01 11:12:01</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("BeginTimeMs")
        public Long beginTimeMs;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("EmotionValue")
        public Integer emotionValue;

        /**
         * <strong>example:</strong>
         * <p>80000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <strong>example:</strong>
         * <p>00:08</p>
         */
        @NameInMap("HourMinSec")
        public String hourMinSec;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Words")
        public String words;

        public static GetResultToReviewResponseBodyDataDialoguesDialogue build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataDialoguesDialogue self = new GetResultToReviewResponseBodyDataDialoguesDialogue();
            return TeaModel.build(map, self);
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

        public GetResultToReviewResponseBodyDataDialoguesDialogue setBeginTimeMs(Long beginTimeMs) {
            this.beginTimeMs = beginTimeMs;
            return this;
        }
        public Long getBeginTimeMs() {
            return this.beginTimeMs;
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

        public GetResultToReviewResponseBodyDataDialoguesDialogue setHourMinSec(String hourMinSec) {
            this.hourMinSec = hourMinSec;
            return this;
        }
        public String getHourMinSec() {
            return this.hourMinSec;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
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

        public GetResultToReviewResponseBodyDataDialoguesDialogue setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetResultToReviewResponseBodyDataDialoguesDialogue setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
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

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        /**
         * <strong>example:</strong>
         * <p>2020-10-16T11:13Z</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("OperationType")
        public Integer operationType;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Operator")
        public Long operator;

        @NameInMap("OperatorName")
        public String operatorName;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
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

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistoriesComplainHistories setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
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

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Cid")
        public String cid;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomizeCode")
        public String customizeCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Integer from;

        @NameInMap("IsMatch")
        public Boolean isMatch;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        /**
         * <strong>example:</strong>
         * <p>6fa76916-3ce6-45d8-ac64-01b7f31c7295</p>
         */
        @NameInMap("Tid")
        public String tid;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("To")
        public Integer to;

        @NameInMap("Val")
        public String val;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setCustomizeCode(String customizeCode) {
            this.customizeCode = customizeCode;
            return this;
        }
        public String getCustomizeCode() {
            return this.customizeCode;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setIsMatch(Boolean isMatch) {
            this.isMatch = isMatch;
            return this;
        }
        public Boolean getIsMatch() {
            return this.isMatch;
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

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
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

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>72000</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("EmotionValue")
        public Integer emotionValue;

        /**
         * <strong>example:</strong>
         * <p>80000</p>
         */
        @NameInMap("End")
        public Long end;

        @NameInMap("Identity")
        public String identity;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("Role")
        public String role;

        @NameInMap("Words")
        public String words;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
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

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo extends TeaModel {
        @NameInMap("Cid")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid;

        @NameInMap("KeyWords")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords;

        @NameInMap("Phrase")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setCid(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid) {
            this.cid = cid;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid getCid() {
            return this.cid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setKeyWords(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords getKeyWords() {
            return this.keyWords;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setPhrase(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase getPhrase() {
            return this.phrase;
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

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults extends TeaModel {
        @NameInMap("Changed")
        public Boolean changed;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cid")
        public Long cid;

        /**
         * <strong>example:</strong>
         * <p>无意见</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitStatus")
        public Integer hitStatus;

        /**
         * <strong>example:</strong>
         * <p>122-122-22-333</p>
         */
        @NameInMap("OriginTaskId")
        public String originTaskId;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("OriginVid")
        public String originVid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ReviewDimensionType")
        public String reviewDimensionType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sid")
        public Long sid;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setChanged(Boolean changed) {
            this.changed = changed;
            return this;
        }
        public Boolean getChanged() {
            return this.changed;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setHitStatus(Integer hitStatus) {
            this.hitStatus = hitStatus;
            return this;
        }
        public Integer getHitStatus() {
            return this.hitStatus;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setOriginTaskId(String originTaskId) {
            this.originTaskId = originTaskId;
            return this;
        }
        public String getOriginTaskId() {
            return this.originTaskId;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setOriginVid(String originVid) {
            this.originVid = originVid;
            return this;
        }
        public String getOriginVid() {
            return this.originVid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setReviewDimensionType(String reviewDimensionType) {
            this.reviewDimensionType = reviewDimensionType;
            return this;
        }
        public String getReviewDimensionType() {
            return this.reviewDimensionType;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults setSid(Long sid) {
            this.sid = sid;
            return this;
        }
        public Long getSid() {
            return this.sid;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResults extends TeaModel {
        @NameInMap("SentenceReviewResults")
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults> sentenceReviewResults;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResults build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResults self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResults();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResults setSentenceReviewResults(java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults> sentenceReviewResults) {
            this.sentenceReviewResults = sentenceReviewResults;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResultsSentenceReviewResults> getSentenceReviewResults() {
            return this.sentenceReviewResults;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>013c68142fec4f0899fa6ee0exxx</p>
         */
        @NameInMap("HitId")
        public String hitId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReviewResult")
        public Integer reviewResult;

        /**
         * <strong>example:</strong>
         * <p>2019-10-12 17:06:00</p>
         */
        @NameInMap("ReviewTime")
        public String reviewTime;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Reviewer")
        public String reviewer;

        /**
         * <strong>example:</strong>
         * <p>451</p>
         */
        @NameInMap("Rid")
        public Long rid;

        @NameInMap("SentenceReviewResults")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResults sentenceReviewResults;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setHitId(String hitId) {
            this.hitId = hitId;
            return this;
        }
        public String getHitId() {
            return this.hitId;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setReviewResult(Integer reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }
        public Integer getReviewResult() {
            return this.reviewResult;
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

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setSentenceReviewResults(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResults sentenceReviewResults) {
            this.sentenceReviewResults = sentenceReviewResults;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfoSentenceReviewResults getSentenceReviewResults() {
            return this.sentenceReviewResults;
        }

    }

    public static class GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoReview")
        public Integer autoReview;

        @NameInMap("ComplainHistories")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoComplainHistories complainHistories;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Complainable")
        public Boolean complainable;

        @NameInMap("ConditionHitInfoList")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList;

        @NameInMap("MachineHitResult")
        public Integer machineHitResult;

        @NameInMap("ReviewHitResult")
        public Integer reviewHitResult;

        @NameInMap("ReviewInfo")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo reviewInfo;

        /**
         * <strong>example:</strong>
         * <p>451</p>
         */
        @NameInMap("Rid")
        public Long rid;

        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ScoreId")
        public Long scoreId;

        /**
         * <strong>example:</strong>
         * <p>-10</p>
         */
        @NameInMap("ScoreNum")
        public Integer scoreNum;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ScoreSubName")
        public String scoreSubName;

        public static GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo self = new GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo();
            return TeaModel.build(map, self);
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

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setConditionHitInfoList(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList) {
            this.conditionHitInfoList = conditionHitInfoList;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList getConditionHitInfoList() {
            return this.conditionHitInfoList;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setMachineHitResult(Integer machineHitResult) {
            this.machineHitResult = machineHitResult;
            return this;
        }
        public Integer getMachineHitResult() {
            return this.machineHitResult;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setReviewHitResult(Integer reviewHitResult) {
            this.reviewHitResult = reviewHitResult;
            return this;
        }
        public Integer getReviewHitResult() {
            return this.reviewHitResult;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setReviewInfo(GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo reviewInfo) {
            this.reviewInfo = reviewInfo;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo getReviewInfo() {
            return this.reviewInfo;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Long getScoreId() {
            return this.scoreId;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        public GetResultToReviewResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
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
        @NameInMap("Comments")
        public String comments;

        /**
         * <strong>example:</strong>
         * <p>2020-10-16T11:13Z</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("OperationType")
        public Integer operationType;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Operator")
        public Long operator;

        @NameInMap("OperatorName")
        public String operatorName;

        public static GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories self = new GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
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

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistoriesComplainHistories setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
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
        @NameInMap("ComplainHistories")
        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfoComplainHistories complainHistories;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Complainable")
        public Boolean complainable;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ScoreId")
        public Long scoreId;

        /**
         * <strong>example:</strong>
         * <p>-10</p>
         */
        @NameInMap("ScoreNum")
        public Integer scoreNum;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        @NameInMap("ScoreSubName")
        public String scoreSubName;

        public static GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo self = new GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo();
            return TeaModel.build(map, self);
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

        public GetResultToReviewResponseBodyDataManualScoreInfoListManualScoreInfo setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
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

    public static class GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRuleReviewRightRule extends TeaModel {
        @NameInMap("rid")
        public Long rid;

        @NameInMap("ruleName")
        public String ruleName;

        public static GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRuleReviewRightRule build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRuleReviewRightRule self = new GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRuleReviewRightRule();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRuleReviewRightRule setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRuleReviewRightRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRule extends TeaModel {
        @NameInMap("ReviewRightRule")
        public java.util.List<GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRuleReviewRightRule> reviewRightRule;

        public static GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRule build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRule self = new GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRule();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRule setReviewRightRule(java.util.List<GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRuleReviewRightRule> reviewRightRule) {
            this.reviewRightRule = reviewRightRule;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRuleReviewRightRule> getReviewRightRule() {
            return this.reviewRightRule;
        }

    }

    public static class GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComplainResult")
        public Integer complainResult;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("OldScore")
        public Integer oldScore;

        @NameInMap("Operator")
        public Long operator;

        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("ReviewManagerType")
        public String reviewManagerType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReviewResult")
        public Integer reviewResult;

        @NameInMap("ReviewRightRule")
        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRule reviewRightRule;

        /**
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Score")
        public Integer score;

        @NameInMap("Time")
        public Long time;

        /**
         * <strong>example:</strong>
         * <p>2019-10-28 15:21:00</p>
         */
        @NameInMap("TimeStr")
        public String timeStr;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory self = new GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
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

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setReviewManagerType(String reviewManagerType) {
            this.reviewManagerType = reviewManagerType;
            return this;
        }
        public String getReviewManagerType() {
            return this.reviewManagerType;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setReviewResult(Integer reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setReviewRightRule(GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRule reviewRightRule) {
            this.reviewRightRule = reviewRightRule;
            return this;
        }
        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistoryReviewRightRule getReviewRightRule() {
            return this.reviewRightRule;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setTimeStr(String timeStr) {
            this.timeStr = timeStr;
            return this;
        }
        public String getTimeStr() {
            return this.timeStr;
        }

        public GetResultToReviewResponseBodyDataReviewHistoryListReviewHistory setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
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

    public static class GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdListReviewKeyIdList extends TeaModel {
        @NameInMap("ReviewKeyIdList")
        public java.util.List<Long> reviewKeyIdList;

        public static GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdListReviewKeyIdList build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdListReviewKeyIdList self = new GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdListReviewKeyIdList();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdListReviewKeyIdList setReviewKeyIdList(java.util.List<Long> reviewKeyIdList) {
            this.reviewKeyIdList = reviewKeyIdList;
            return this;
        }
        public java.util.List<Long> getReviewKeyIdList() {
            return this.reviewKeyIdList;
        }

    }

    public static class GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdList extends TeaModel {
        @NameInMap("ReviewKeyIdList")
        public GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdListReviewKeyIdList reviewKeyIdList;

        @NameInMap("ReviewTypeId")
        public Long reviewTypeId;

        public static GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdList build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdList self = new GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdList();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdList setReviewKeyIdList(GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdListReviewKeyIdList reviewKeyIdList) {
            this.reviewKeyIdList = reviewKeyIdList;
            return this;
        }
        public GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdListReviewKeyIdList getReviewKeyIdList() {
            return this.reviewKeyIdList;
        }

        public GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdList setReviewTypeId(Long reviewTypeId) {
            this.reviewTypeId = reviewTypeId;
            return this;
        }
        public Long getReviewTypeId() {
            return this.reviewTypeId;
        }

    }

    public static class GetResultToReviewResponseBodyDataReviewTypeIdList extends TeaModel {
        @NameInMap("ReviewTypeIdList")
        public java.util.List<GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdList> reviewTypeIdList;

        public static GetResultToReviewResponseBodyDataReviewTypeIdList build(java.util.Map<String, ?> map) throws Exception {
            GetResultToReviewResponseBodyDataReviewTypeIdList self = new GetResultToReviewResponseBodyDataReviewTypeIdList();
            return TeaModel.build(map, self);
        }

        public GetResultToReviewResponseBodyDataReviewTypeIdList setReviewTypeIdList(java.util.List<GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdList> reviewTypeIdList) {
            this.reviewTypeIdList = reviewTypeIdList;
            return this;
        }
        public java.util.List<GetResultToReviewResponseBodyDataReviewTypeIdListReviewTypeIdList> getReviewTypeIdList() {
            return this.reviewTypeIdList;
        }

    }

    public static class GetResultToReviewResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("AudioScheme")
        public String audioScheme;

        /**
         * <strong>example:</strong>
         * <p>sca-ccc-test.oss-cn-beijing.aliyuncs.com/xxxxx</p>
         */
        @NameInMap("AudioURL")
        public String audioURL;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Comments")
        public String comments;

        @NameInMap("Dialogues")
        public GetResultToReviewResponseBodyDataDialogues dialogues;

        /**
         * <strong>example:</strong>
         * <p>e790e6c919d84b82b64ee*****</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>xxx.wav</p>
         */
        @NameInMap("FileMergeName")
        public String fileMergeName;

        @NameInMap("HitRuleReviewInfoList")
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList;

        @NameInMap("ManualScoreInfoList")
        public GetResultToReviewResponseBodyDataManualScoreInfoList manualScoreInfoList;

        @NameInMap("ReviewHistoryList")
        public GetResultToReviewResponseBodyDataReviewHistoryList reviewHistoryList;

        @NameInMap("ReviewTypeIdList")
        public GetResultToReviewResponseBodyDataReviewTypeIdList reviewTypeIdList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("TotalScore")
        public Integer totalScore;

        /**
         * <strong>example:</strong>
         * <p>6fa76916-3ce6-45d8-ac64-01b7f31***</p>
         */
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

        public GetResultToReviewResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetResultToReviewResponseBodyData setFileMergeName(String fileMergeName) {
            this.fileMergeName = fileMergeName;
            return this;
        }
        public String getFileMergeName() {
            return this.fileMergeName;
        }

        public GetResultToReviewResponseBodyData setHitRuleReviewInfoList(GetResultToReviewResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList) {
            this.hitRuleReviewInfoList = hitRuleReviewInfoList;
            return this;
        }
        public GetResultToReviewResponseBodyDataHitRuleReviewInfoList getHitRuleReviewInfoList() {
            return this.hitRuleReviewInfoList;
        }

        public GetResultToReviewResponseBodyData setManualScoreInfoList(GetResultToReviewResponseBodyDataManualScoreInfoList manualScoreInfoList) {
            this.manualScoreInfoList = manualScoreInfoList;
            return this;
        }
        public GetResultToReviewResponseBodyDataManualScoreInfoList getManualScoreInfoList() {
            return this.manualScoreInfoList;
        }

        public GetResultToReviewResponseBodyData setReviewHistoryList(GetResultToReviewResponseBodyDataReviewHistoryList reviewHistoryList) {
            this.reviewHistoryList = reviewHistoryList;
            return this;
        }
        public GetResultToReviewResponseBodyDataReviewHistoryList getReviewHistoryList() {
            return this.reviewHistoryList;
        }

        public GetResultToReviewResponseBodyData setReviewTypeIdList(GetResultToReviewResponseBodyDataReviewTypeIdList reviewTypeIdList) {
            this.reviewTypeIdList = reviewTypeIdList;
            return this;
        }
        public GetResultToReviewResponseBodyDataReviewTypeIdList getReviewTypeIdList() {
            return this.reviewTypeIdList;
        }

        public GetResultToReviewResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetResultToReviewResponseBodyData setTotalScore(Integer totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public Integer getTotalScore() {
            return this.totalScore;
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
