// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSyncResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<GetSyncResultResponseBodyData> data;

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

    public static GetSyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSyncResultResponseBody self = new GetSyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSyncResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSyncResultResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetSyncResultResponseBody setData(java.util.List<GetSyncResultResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSyncResultResponseBodyData> getData() {
        return this.data;
    }

    public GetSyncResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSyncResultResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetSyncResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSyncResultResponseBody setResultCountId(String resultCountId) {
        this.resultCountId = resultCountId;
        return this;
    }
    public String getResultCountId() {
        return this.resultCountId;
    }

    public GetSyncResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSyncResultResponseBodyDataAgent extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SkillGroup")
        public String skillGroup;

        public static GetSyncResultResponseBodyDataAgent build(java.util.Map<String, ?> map) throws Exception {
            GetSyncResultResponseBodyDataAgent self = new GetSyncResultResponseBodyDataAgent();
            return TeaModel.build(map, self);
        }

        public GetSyncResultResponseBodyDataAgent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSyncResultResponseBodyDataAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSyncResultResponseBodyDataAgent setSkillGroup(String skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public String getSkillGroup() {
            return this.skillGroup;
        }

    }

    public static class GetSyncResultResponseBodyDataAsrResult extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Long end;

        @NameInMap("Role")
        public String role;

        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Words")
        public String words;

        public static GetSyncResultResponseBodyDataAsrResult build(java.util.Map<String, ?> map) throws Exception {
            GetSyncResultResponseBodyDataAsrResult self = new GetSyncResultResponseBodyDataAsrResult();
            return TeaModel.build(map, self);
        }

        public GetSyncResultResponseBodyDataAsrResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetSyncResultResponseBodyDataAsrResult setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetSyncResultResponseBodyDataAsrResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetSyncResultResponseBodyDataAsrResult setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetSyncResultResponseBodyDataAsrResult setSilenceDuration(Integer silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        public GetSyncResultResponseBodyDataAsrResult setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetSyncResultResponseBodyDataAsrResult setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class GetSyncResultResponseBodyDataHitResultHitsKeyWords extends TeaModel {
        @NameInMap("Cid")
        public String cid;

        @NameInMap("From")
        public Integer from;

        @NameInMap("To")
        public Integer to;

        @NameInMap("Val")
        public String val;

        public static GetSyncResultResponseBodyDataHitResultHitsKeyWords build(java.util.Map<String, ?> map) throws Exception {
            GetSyncResultResponseBodyDataHitResultHitsKeyWords self = new GetSyncResultResponseBodyDataHitResultHitsKeyWords();
            return TeaModel.build(map, self);
        }

        public GetSyncResultResponseBodyDataHitResultHitsKeyWords setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public GetSyncResultResponseBodyDataHitResultHitsKeyWords setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetSyncResultResponseBodyDataHitResultHitsKeyWords setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

        public GetSyncResultResponseBodyDataHitResultHitsKeyWords setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

    }

    public static class GetSyncResultResponseBodyDataHitResultHitsPhrase extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Integer end;

        @NameInMap("Role")
        public String role;

        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Words")
        public String words;

        public static GetSyncResultResponseBodyDataHitResultHitsPhrase build(java.util.Map<String, ?> map) throws Exception {
            GetSyncResultResponseBodyDataHitResultHitsPhrase self = new GetSyncResultResponseBodyDataHitResultHitsPhrase();
            return TeaModel.build(map, self);
        }

        public GetSyncResultResponseBodyDataHitResultHitsPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetSyncResultResponseBodyDataHitResultHitsPhrase setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetSyncResultResponseBodyDataHitResultHitsPhrase setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public GetSyncResultResponseBodyDataHitResultHitsPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetSyncResultResponseBodyDataHitResultHitsPhrase setSilenceDuration(Integer silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        public GetSyncResultResponseBodyDataHitResultHitsPhrase setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetSyncResultResponseBodyDataHitResultHitsPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class GetSyncResultResponseBodyDataHitResultHits extends TeaModel {
        @NameInMap("Cid")
        public java.util.List<String> cid;

        @NameInMap("KeyWords")
        public java.util.List<GetSyncResultResponseBodyDataHitResultHitsKeyWords> keyWords;

        @NameInMap("Phrase")
        public GetSyncResultResponseBodyDataHitResultHitsPhrase phrase;

        public static GetSyncResultResponseBodyDataHitResultHits build(java.util.Map<String, ?> map) throws Exception {
            GetSyncResultResponseBodyDataHitResultHits self = new GetSyncResultResponseBodyDataHitResultHits();
            return TeaModel.build(map, self);
        }

        public GetSyncResultResponseBodyDataHitResultHits setCid(java.util.List<String> cid) {
            this.cid = cid;
            return this;
        }
        public java.util.List<String> getCid() {
            return this.cid;
        }

        public GetSyncResultResponseBodyDataHitResultHits setKeyWords(java.util.List<GetSyncResultResponseBodyDataHitResultHitsKeyWords> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<GetSyncResultResponseBodyDataHitResultHitsKeyWords> getKeyWords() {
            return this.keyWords;
        }

        public GetSyncResultResponseBodyDataHitResultHits setPhrase(GetSyncResultResponseBodyDataHitResultHitsPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public GetSyncResultResponseBodyDataHitResultHitsPhrase getPhrase() {
            return this.phrase;
        }

    }

    public static class GetSyncResultResponseBodyDataHitResult extends TeaModel {
        @NameInMap("Hits")
        public java.util.List<GetSyncResultResponseBodyDataHitResultHits> hits;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReviewResult")
        public Integer reviewResult;

        @NameInMap("Rid")
        public String rid;

        @NameInMap("Type")
        public String type;

        public static GetSyncResultResponseBodyDataHitResult build(java.util.Map<String, ?> map) throws Exception {
            GetSyncResultResponseBodyDataHitResult self = new GetSyncResultResponseBodyDataHitResult();
            return TeaModel.build(map, self);
        }

        public GetSyncResultResponseBodyDataHitResult setHits(java.util.List<GetSyncResultResponseBodyDataHitResultHits> hits) {
            this.hits = hits;
            return this;
        }
        public java.util.List<GetSyncResultResponseBodyDataHitResultHits> getHits() {
            return this.hits;
        }

        public GetSyncResultResponseBodyDataHitResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSyncResultResponseBodyDataHitResult setReviewResult(Integer reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        public GetSyncResultResponseBodyDataHitResult setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public GetSyncResultResponseBodyDataHitResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetSyncResultResponseBodyDataRecording extends TeaModel {
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

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("DurationAudio")
        public Long durationAudio;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrimaryId")
        public String primaryId;

        @NameInMap("Remark1")
        public String remark1;

        @NameInMap("Remark2")
        public String remark2;

        @NameInMap("Remark3")
        public String remark3;

        @NameInMap("Url")
        public String url;

        public static GetSyncResultResponseBodyDataRecording build(java.util.Map<String, ?> map) throws Exception {
            GetSyncResultResponseBodyDataRecording self = new GetSyncResultResponseBodyDataRecording();
            return TeaModel.build(map, self);
        }

        public GetSyncResultResponseBodyDataRecording setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public GetSyncResultResponseBodyDataRecording setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetSyncResultResponseBodyDataRecording setCallTime(String callTime) {
            this.callTime = callTime;
            return this;
        }
        public String getCallTime() {
            return this.callTime;
        }

        public GetSyncResultResponseBodyDataRecording setCallType(Integer callType) {
            this.callType = callType;
            return this;
        }
        public Integer getCallType() {
            return this.callType;
        }

        public GetSyncResultResponseBodyDataRecording setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public GetSyncResultResponseBodyDataRecording setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public GetSyncResultResponseBodyDataRecording setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetSyncResultResponseBodyDataRecording setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetSyncResultResponseBodyDataRecording setDurationAudio(Long durationAudio) {
            this.durationAudio = durationAudio;
            return this;
        }
        public Long getDurationAudio() {
            return this.durationAudio;
        }

        public GetSyncResultResponseBodyDataRecording setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSyncResultResponseBodyDataRecording setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSyncResultResponseBodyDataRecording setPrimaryId(String primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public String getPrimaryId() {
            return this.primaryId;
        }

        public GetSyncResultResponseBodyDataRecording setRemark1(String remark1) {
            this.remark1 = remark1;
            return this;
        }
        public String getRemark1() {
            return this.remark1;
        }

        public GetSyncResultResponseBodyDataRecording setRemark2(String remark2) {
            this.remark2 = remark2;
            return this;
        }
        public String getRemark2() {
            return this.remark2;
        }

        public GetSyncResultResponseBodyDataRecording setRemark3(String remark3) {
            this.remark3 = remark3;
            return this;
        }
        public String getRemark3() {
            return this.remark3;
        }

        public GetSyncResultResponseBodyDataRecording setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetSyncResultResponseBodyData extends TeaModel {
        @NameInMap("Agent")
        public GetSyncResultResponseBodyDataAgent agent;

        @NameInMap("AsrResult")
        public java.util.List<GetSyncResultResponseBodyDataAsrResult> asrResult;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("HitResult")
        public java.util.List<GetSyncResultResponseBodyDataHitResult> hitResult;

        @NameInMap("Recording")
        public GetSyncResultResponseBodyDataRecording recording;

        @NameInMap("Resolver")
        public String resolver;

        @NameInMap("ReviewResult")
        public Integer reviewResult;

        @NameInMap("ReviewStatus")
        public Integer reviewStatus;

        @NameInMap("Reviewer")
        public String reviewer;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static GetSyncResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSyncResultResponseBodyData self = new GetSyncResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSyncResultResponseBodyData setAgent(GetSyncResultResponseBodyDataAgent agent) {
            this.agent = agent;
            return this;
        }
        public GetSyncResultResponseBodyDataAgent getAgent() {
            return this.agent;
        }

        public GetSyncResultResponseBodyData setAsrResult(java.util.List<GetSyncResultResponseBodyDataAsrResult> asrResult) {
            this.asrResult = asrResult;
            return this;
        }
        public java.util.List<GetSyncResultResponseBodyDataAsrResult> getAsrResult() {
            return this.asrResult;
        }

        public GetSyncResultResponseBodyData setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetSyncResultResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSyncResultResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetSyncResultResponseBodyData setHitResult(java.util.List<GetSyncResultResponseBodyDataHitResult> hitResult) {
            this.hitResult = hitResult;
            return this;
        }
        public java.util.List<GetSyncResultResponseBodyDataHitResult> getHitResult() {
            return this.hitResult;
        }

        public GetSyncResultResponseBodyData setRecording(GetSyncResultResponseBodyDataRecording recording) {
            this.recording = recording;
            return this;
        }
        public GetSyncResultResponseBodyDataRecording getRecording() {
            return this.recording;
        }

        public GetSyncResultResponseBodyData setResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }
        public String getResolver() {
            return this.resolver;
        }

        public GetSyncResultResponseBodyData setReviewResult(Integer reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        public GetSyncResultResponseBodyData setReviewStatus(Integer reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }
        public Integer getReviewStatus() {
            return this.reviewStatus;
        }

        public GetSyncResultResponseBodyData setReviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }
        public String getReviewer() {
            return this.reviewer;
        }

        public GetSyncResultResponseBodyData setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetSyncResultResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetSyncResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetSyncResultResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
