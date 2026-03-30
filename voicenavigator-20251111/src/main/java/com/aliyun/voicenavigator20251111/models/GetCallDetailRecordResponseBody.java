// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetCallDetailRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCallDetailRecordResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>a2c26e67-5984-4935-984e-bcee52971993</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCallDetailRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallDetailRecordResponseBody self = new GetCallDetailRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallDetailRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCallDetailRecordResponseBody setData(GetCallDetailRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCallDetailRecordResponseBodyData getData() {
        return this.data;
    }

    public GetCallDetailRecordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCallDetailRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCallDetailRecordResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetCallDetailRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCallDetailRecordResponseBodyDataTranscripts extends TeaModel {
        @NameInMap("Answer")
        public String answer;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Backchannels")
        public Boolean backchannels;

        /**
         * <strong>example:</strong>
         * <p>1748945414222</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;endSilenceTimeout&quot;:500,&quot;interruptible&quot;:false,&quot;silenceDetectionTimeout&quot;:5,&quot;type&quot;:&quot;Voice&quot;}]</p>
         */
        @NameInMap("ControlParamsList")
        public String controlParamsList;

        /**
         * <strong>example:</strong>
         * <p>1767315903531</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1774859592165</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;dataType&quot;:&quot;Silence&quot;}]</p>
         */
        @NameInMap("Extras")
        public String extras;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Interrupted")
        public Boolean interrupted;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Legacy")
        public Boolean legacy;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PlayedWords")
        public Integer playedWords;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StreamEnd")
        public Boolean streamEnd;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StreamId")
        public String streamId;

        @NameInMap("Utterance")
        public String utterance;

        /**
         * <strong>example:</strong>
         * <p>{&quot;test1&quot;:&quot;1234&quot;}</p>
         */
        @NameInMap("VendorParams")
        public String vendorParams;

        public static GetCallDetailRecordResponseBodyDataTranscripts build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataTranscripts self = new GetCallDetailRecordResponseBodyDataTranscripts();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setBackchannels(Boolean backchannels) {
            this.backchannels = backchannels;
            return this;
        }
        public Boolean getBackchannels() {
            return this.backchannels;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setControlParamsList(String controlParamsList) {
            this.controlParamsList = controlParamsList;
            return this;
        }
        public String getControlParamsList() {
            return this.controlParamsList;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setExtras(String extras) {
            this.extras = extras;
            return this;
        }
        public String getExtras() {
            return this.extras;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setInterrupted(Boolean interrupted) {
            this.interrupted = interrupted;
            return this;
        }
        public Boolean getInterrupted() {
            return this.interrupted;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setLegacy(Boolean legacy) {
            this.legacy = legacy;
            return this;
        }
        public Boolean getLegacy() {
            return this.legacy;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setPlayedWords(Integer playedWords) {
            this.playedWords = playedWords;
            return this;
        }
        public Integer getPlayedWords() {
            return this.playedWords;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setStreamEnd(Boolean streamEnd) {
            this.streamEnd = streamEnd;
            return this;
        }
        public Boolean getStreamEnd() {
            return this.streamEnd;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setStreamId(String streamId) {
            this.streamId = streamId;
            return this;
        }
        public String getStreamId() {
            return this.streamId;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setUtterance(String utterance) {
            this.utterance = utterance;
            return this;
        }
        public String getUtterance() {
            return this.utterance;
        }

        public GetCallDetailRecordResponseBodyDataTranscripts setVendorParams(String vendorParams) {
            this.vendorParams = vendorParams;
            return this;
        }
        public String getVendorParams() {
            return this.vendorParams;
        }

    }

    public static class GetCallDetailRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>15100000001</p>
         */
        @NameInMap("Callee")
        public String callee;

        /**
         * <strong>example:</strong>
         * <p>15929990193</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <strong>example:</strong>
         * <p>Answered</p>
         */
        @NameInMap("DispositionCode")
        public String dispositionCode;

        /**
         * <strong>example:</strong>
         * <p>ConcurrentLimitExceeded</p>
         */
        @NameInMap("DispositionReason")
        public String dispositionReason;

        /**
         * <strong>example:</strong>
         * <p>160</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>1752283603978</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IssueResolved")
        public Boolean issueResolved;

        /**
         * <strong>example:</strong>
         * <p>Customer</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ResolutionEvidence")
        public String resolutionEvidence;

        /**
         * <strong>example:</strong>
         * <p>07d72ea0-6e38-48d4-8371-14deaaba996f</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>1774858849987</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TalkTime")
        public Integer talkTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TalkTurns")
        public Integer talkTurns;

        @NameInMap("Transcripts")
        public java.util.List<GetCallDetailRecordResponseBodyDataTranscripts> transcripts;

        /**
         * <strong>example:</strong>
         * <p>default@testInstance1</p>
         */
        @NameInMap("TransferTarget")
        public String transferTarget;

        /**
         * <strong>example:</strong>
         * <p>SkillGroup</p>
         */
        @NameInMap("TransferType")
        public String transferType;

        public static GetCallDetailRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyData self = new GetCallDetailRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyData setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public GetCallDetailRecordResponseBodyData setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public GetCallDetailRecordResponseBodyData setDispositionCode(String dispositionCode) {
            this.dispositionCode = dispositionCode;
            return this;
        }
        public String getDispositionCode() {
            return this.dispositionCode;
        }

        public GetCallDetailRecordResponseBodyData setDispositionReason(String dispositionReason) {
            this.dispositionReason = dispositionReason;
            return this;
        }
        public String getDispositionReason() {
            return this.dispositionReason;
        }

        public GetCallDetailRecordResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetCallDetailRecordResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetCallDetailRecordResponseBodyData setIssueResolved(Boolean issueResolved) {
            this.issueResolved = issueResolved;
            return this;
        }
        public Boolean getIssueResolved() {
            return this.issueResolved;
        }

        public GetCallDetailRecordResponseBodyData setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public GetCallDetailRecordResponseBodyData setResolutionEvidence(String resolutionEvidence) {
            this.resolutionEvidence = resolutionEvidence;
            return this;
        }
        public String getResolutionEvidence() {
            return this.resolutionEvidence;
        }

        public GetCallDetailRecordResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetCallDetailRecordResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetCallDetailRecordResponseBodyData setTalkTime(Integer talkTime) {
            this.talkTime = talkTime;
            return this;
        }
        public Integer getTalkTime() {
            return this.talkTime;
        }

        public GetCallDetailRecordResponseBodyData setTalkTurns(Integer talkTurns) {
            this.talkTurns = talkTurns;
            return this;
        }
        public Integer getTalkTurns() {
            return this.talkTurns;
        }

        public GetCallDetailRecordResponseBodyData setTranscripts(java.util.List<GetCallDetailRecordResponseBodyDataTranscripts> transcripts) {
            this.transcripts = transcripts;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataTranscripts> getTranscripts() {
            return this.transcripts;
        }

        public GetCallDetailRecordResponseBodyData setTransferTarget(String transferTarget) {
            this.transferTarget = transferTarget;
            return this;
        }
        public String getTransferTarget() {
            return this.transferTarget;
        }

        public GetCallDetailRecordResponseBodyData setTransferType(String transferType) {
            this.transferType = transferType;
            return this;
        }
        public String getTransferType() {
            return this.transferType;
        }

    }

}
