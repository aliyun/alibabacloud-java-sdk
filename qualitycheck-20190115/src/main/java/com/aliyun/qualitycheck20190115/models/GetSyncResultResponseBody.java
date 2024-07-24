// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSyncResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<GetSyncResultResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>76DB5D8C-5BD9-42A7-B527-5AF3A5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ResultCountId")
    public String resultCountId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>12221</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>340</p>
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
         * <p>3000</p>
         */
        @NameInMap("End")
        public Long end;

        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        /**
         * <strong>example:</strong>
         * <p>221</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>66666</p>
         */
        @NameInMap("Cid")
        public String cid;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>440</p>
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
         * <p>4000</p>
         */
        @NameInMap("End")
        public Integer end;

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
         * <p>234</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReviewResult")
        public Integer reviewResult;

        /**
         * <strong>example:</strong>
         * <p>1211</p>
         */
        @NameInMap("Rid")
        public String rid;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>1563967699000</p>
         */
        @NameInMap("CallTime")
        public String callTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallType")
        public Integer callType;

        /**
         * <strong>example:</strong>
         * <p>1888888***</p>
         */
        @NameInMap("Callee")
        public String callee;

        /**
         * <strong>example:</strong>
         * <p>0108888****</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DataSetName")
        public String dataSetName;

        /**
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("DurationAudio")
        public Long durationAudio;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>123123.wav</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("PrimaryId")
        public String primaryId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Remark1")
        public String remark1;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Remark2")
        public String remark2;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Remark3")
        public String remark3;

        /**
         * <strong>example:</strong>
         * <p><a href="http://aliyun.com/xxx.wav">http://aliyun.com/xxx.wav</a></p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <strong>example:</strong>
         * <p>2019-07-24T19:31Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("HitResult")
        public java.util.List<GetSyncResultResponseBodyDataHitResult> hitResult;

        @NameInMap("Recording")
        public GetSyncResultResponseBodyDataRecording recording;

        @NameInMap("Resolver")
        public String resolver;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReviewResult")
        public Integer reviewResult;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReviewStatus")
        public Integer reviewStatus;

        @NameInMap("Reviewer")
        public String reviewer;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>20201231de3d34ec-40fa-4a55-8d27-76ea*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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
