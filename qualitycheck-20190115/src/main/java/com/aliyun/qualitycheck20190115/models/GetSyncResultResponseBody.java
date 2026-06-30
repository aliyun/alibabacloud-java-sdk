// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSyncResultResponseBody extends TeaModel {
    /**
     * <p>Result code. A value of 200 indicates success. Any other value indicates failure. The caller can use this field to determine the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Query result.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetSyncResultResponseBodyData> data;

    /**
     * <p>Error details when an error occurs; &quot;successful&quot; when the operation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>76DB5D8C-5BD9-42A7-B527-5AF3A5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Internal field. Ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ResultCountId")
    public String resultCountId;

    /**
     * <p>Indicates whether the request succeeded. The caller can use this field to determine the request status: true indicates success; false or null indicates failure.</p>
     * 
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
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12221</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Agent name</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Skill group name</p>
         * 
         * <strong>example:</strong>
         * <p>客服组</p>
         */
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
         * <p>The start time of this sentence, which is the offset from the starting point in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>340</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <p>Emotion intensity value ranging from 1 to 10. A higher value indicates stronger emotion.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("EmotionValue")
        public Integer emotionValue;

        /**
         * <p>The end time of this sentence, which is the offset from the starting point in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>Role in the dialogue content. Possible values: agent, Customer.</p>
         * 
         * <strong>example:</strong>
         * <p>客服</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Internal field. Ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        /**
         * <p>The average speech rate of this sentence, in characters per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>221</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>Dialogue content.</p>
         * 
         * <strong>example:</strong>
         * <p>您好，很高兴为您服务</p>
         */
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
         * <p>The ID of the condition that was hit.</p>
         * 
         * <strong>example:</strong>
         * <p>66666</p>
         */
        @NameInMap("Cid")
        public String cid;

        /**
         * <p>The starting character position (inclusive) of the keyword to be highlighted. The value starts from 0 and can be at most the total number of characters in the sentence minus 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <p>The ending character position (exclusive) of the keyword to be highlighted. The maximum value is the total number of characters in the sentence minus 1. For example, in the sentence “不可能给你退货的”, if from=0 and to=3, the highlighted keyword is “不可能”, which consists of three characters.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("To")
        public Integer to;

        /**
         * <p>The exact keyword content.</p>
         * 
         * <strong>example:</strong>
         * <p>投诉</p>
         */
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
         * <p>The Start Time of this sentence, represented as an offset in milliseconds from the starting point.</p>
         * 
         * <strong>example:</strong>
         * <p>440</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <p>Emotion intensity value ranging from 1 to 10. A higher value indicates stronger emotion.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("EmotionValue")
        public Integer emotionValue;

        /**
         * <p>The End Time of this sentence, represented as an offset in milliseconds from the starting point.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("End")
        public Integer end;

        /**
         * <p>The role in the conversation content. Possible values: agent, Customer, System.</p>
         * 
         * <strong>example:</strong>
         * <p>客服</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Internal field. Ignore.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        /**
         * <p>The speech rate of this sentence.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>A sentence spoken by this role.</p>
         * 
         * <strong>example:</strong>
         * <p>我要投诉</p>
         */
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
        /**
         * <p>List of hit condition IDs.</p>
         */
        @NameInMap("Cid")
        public java.util.List<String> cid;

        /**
         * <p>Returns the specific characters in the current sentence that hit the rule, which are the keywords to be highlighted.</p>
         */
        @NameInMap("KeyWords")
        public java.util.List<GetSyncResultResponseBodyDataHitResultHitsKeyWords> keyWords;

        /**
         * <p>Details of the sentence that hit the current rule.</p>
         */
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
        /**
         * <p>Specific hit location information. At the sentence dimension, returns which condition in the rule was hit and which specific characters triggered the hit within the sentence.</p>
         */
        @NameInMap("Hits")
        public java.util.List<GetSyncResultResponseBodyDataHitResultHits> hits;

        /**
         * <p>Hit rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试规则</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Review accuracy; possible values: 0 (fault); 1 (correct).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReviewResult")
        public Integer reviewResult;

        /**
         * <p>Hit rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1211</p>
         */
        @NameInMap("Rid")
        public String rid;

        /**
         * <p>Rule type associated with the hit rule.</p>
         * 
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
        /**
         * <p>Line-of-business name.</p>
         * 
         * <strong>example:</strong>
         * <p>客服部</p>
         */
        @NameInMap("Business")
        public String business;

        /**
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>Recording generation UNIX timestamp, accurate to milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1563967699000</p>
         */
        @NameInMap("CallTime")
        public String callTime;

        /**
         * <p>Call type:  </p>
         * <ul>
         * <li>1: Outgoing call  </li>
         * <li>3: Incoming call</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallType")
        public Integer callType;

        /**
         * <p>Callee number.</p>
         * 
         * <strong>example:</strong>
         * <p>1888888***</p>
         */
        @NameInMap("Callee")
        public String callee;

        /**
         * <p>Caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>0108888****</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <p>Internal field. Ignore this.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DataSetName")
        public String dataSetName;

        /**
         * <p>Total number of words in the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Call duration.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("DurationAudio")
        public Long durationAudio;

        /**
         * <p>File ID, which is the callId in the request parameters. If not specified, a random ID will be generated.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Recording file name.</p>
         * 
         * <strong>example:</strong>
         * <p>123123.wav</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Internal field. Ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("PrimaryId")
        public String primaryId;

        /**
         * <p>Custom data 1.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Remark1")
        public String remark1;

        /**
         * <p>Custom data 2.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Remark2")
        public String remark2;

        /**
         * <p>Custom data 3.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Remark3")
        public String remark3;

        /**
         * <p>Recording file URL, used for playback.</p>
         * 
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
        /**
         * <p>Agent information</p>
         */
        @NameInMap("Agent")
        public GetSyncResultResponseBodyDataAgent agent;

        /**
         * <p>Transcription result (dialogue text)</p>
         */
        @NameInMap("AsrResult")
        public java.util.List<GetSyncResultResponseBodyDataAsrResult> asrResult;

        /**
         * <p>Review comments.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>Job Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-24T19:31Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>When status is neither 0 nor 1, this field indicates the Error Details.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Rule hit result.</p>
         */
        @NameInMap("HitResult")
        public java.util.List<GetSyncResultResponseBodyDataHitResult> hitResult;

        /**
         * <p>Recording file information</p>
         */
        @NameInMap("Recording")
        public GetSyncResultResponseBodyDataRecording recording;

        /**
         * <p>The quality inspector who actually reviewed the task.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Resolver")
        public String resolver;

        /**
         * <p>Review accuracy. Possible values: 0 (fault); 1 (correct); 2 (partially correct); 3 (pending review).</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReviewResult")
        public Integer reviewResult;

        /**
         * <p>Review status; possible values: 0 (not reviewed); 1 (reviewed).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReviewStatus")
        public Integer reviewStatus;

        /**
         * <p>Username of the assigned quality inspector.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Reviewer")
        public String reviewer;

        /**
         * <p>Quality inspection score, with a maximum of 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>Current job status. Possible values: 0 (not completed); 1 (completed). The caller can use this field to determine whether the job is complete. Values other than 0 or 1 indicate an error; see the errorMessage field for Error Details.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20201231de3d34ec-40fa-4a55-8d27-76ea*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Internal field. Ignore it.</p>
         * 
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
