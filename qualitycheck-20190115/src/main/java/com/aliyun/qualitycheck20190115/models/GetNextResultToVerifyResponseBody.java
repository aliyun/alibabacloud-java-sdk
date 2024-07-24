// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetNextResultToVerifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetNextResultToVerifyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNextResultToVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNextResultToVerifyResponseBody self = new GetNextResultToVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNextResultToVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNextResultToVerifyResponseBody setData(GetNextResultToVerifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNextResultToVerifyResponseBodyData getData() {
        return this.data;
    }

    public GetNextResultToVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNextResultToVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNextResultToVerifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSourceLine extends TeaModel {
        @NameInMap("Line")
        public java.util.List<String> line;

        public static GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSourceLine build(java.util.Map<String, ?> map) throws Exception {
            GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSourceLine self = new GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSourceLine();
            return TeaModel.build(map, self);
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSourceLine setLine(java.util.List<String> line) {
            this.line = line;
            return this;
        }
        public java.util.List<String> getLine() {
            return this.line;
        }

    }

    public static class GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSource extends TeaModel {
        @NameInMap("Line")
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSourceLine line;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Position")
        public Integer position;

        public static GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSource build(java.util.Map<String, ?> map) throws Exception {
            GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSource self = new GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSource();
            return TeaModel.build(map, self);
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSource setLine(GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSourceLine line) {
            this.line = line;
            return this;
        }
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSourceLine getLine() {
            return this.line;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSource setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

    }

    public static class GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTargetLine extends TeaModel {
        @NameInMap("Line")
        public java.util.List<String> line;

        public static GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTargetLine build(java.util.Map<String, ?> map) throws Exception {
            GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTargetLine self = new GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTargetLine();
            return TeaModel.build(map, self);
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTargetLine setLine(java.util.List<String> line) {
            this.line = line;
            return this;
        }
        public java.util.List<String> getLine() {
            return this.line;
        }

    }

    public static class GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTarget extends TeaModel {
        @NameInMap("Line")
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTargetLine line;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Position")
        public Integer position;

        public static GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTarget build(java.util.Map<String, ?> map) throws Exception {
            GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTarget self = new GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTarget();
            return TeaModel.build(map, self);
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTarget setLine(GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTargetLine line) {
            this.line = line;
            return this;
        }
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTargetLine getLine() {
            return this.line;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTarget setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

    }

    public static class GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta extends TeaModel {
        @NameInMap("Source")
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSource source;

        @NameInMap("Target")
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTarget target;

        /**
         * <strong>example:</strong>
         * <p>CHANGE</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta build(java.util.Map<String, ?> map) throws Exception {
            GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta self = new GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta();
            return TeaModel.build(map, self);
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta setSource(GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSource source) {
            this.source = source;
            return this;
        }
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaSource getSource() {
            return this.source;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta setTarget(GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTarget target) {
            this.target = target;
            return this;
        }
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDeltaTarget getTarget() {
            return this.target;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltas extends TeaModel {
        @NameInMap("Delta")
        public java.util.List<GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta> delta;

        public static GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltas build(java.util.Map<String, ?> map) throws Exception {
            GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltas self = new GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltas();
            return TeaModel.build(map, self);
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltas setDelta(java.util.List<GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta> delta) {
            this.delta = delta;
            return this;
        }
        public java.util.List<GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltasDelta> getDelta() {
            return this.delta;
        }

    }

    public static class GetNextResultToVerifyResponseBodyDataDialoguesDialogue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>980</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("Deltas")
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltas deltas;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("EmotionValue")
        public Integer emotionValue;

        /**
         * <strong>example:</strong>
         * <p>3422</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <strong>example:</strong>
         * <p>00:00:07</p>
         */
        @NameInMap("HourMinSec")
        public String hourMinSec;

        @NameInMap("Identity")
        public String identity;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IncorrectWords")
        public Integer incorrectWords;

        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        @NameInMap("SourceRole")
        public String sourceRole;

        @NameInMap("SourceWords")
        public String sourceWords;

        /**
         * <strong>example:</strong>
         * <p>332</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Words")
        public String words;

        public static GetNextResultToVerifyResponseBodyDataDialoguesDialogue build(java.util.Map<String, ?> map) throws Exception {
            GetNextResultToVerifyResponseBodyDataDialoguesDialogue self = new GetNextResultToVerifyResponseBodyDataDialoguesDialogue();
            return TeaModel.build(map, self);
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setDeltas(GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltas deltas) {
            this.deltas = deltas;
            return this;
        }
        public GetNextResultToVerifyResponseBodyDataDialoguesDialogueDeltas getDeltas() {
            return this.deltas;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setHourMinSec(String hourMinSec) {
            this.hourMinSec = hourMinSec;
            return this;
        }
        public String getHourMinSec() {
            return this.hourMinSec;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setIncorrectWords(Integer incorrectWords) {
            this.incorrectWords = incorrectWords;
            return this;
        }
        public Integer getIncorrectWords() {
            return this.incorrectWords;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setSilenceDuration(Integer silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setSourceRole(String sourceRole) {
            this.sourceRole = sourceRole;
            return this;
        }
        public String getSourceRole() {
            return this.sourceRole;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setSourceWords(String sourceWords) {
            this.sourceWords = sourceWords;
            return this;
        }
        public String getSourceWords() {
            return this.sourceWords;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetNextResultToVerifyResponseBodyDataDialoguesDialogue setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class GetNextResultToVerifyResponseBodyDataDialogues extends TeaModel {
        @NameInMap("Dialogue")
        public java.util.List<GetNextResultToVerifyResponseBodyDataDialoguesDialogue> dialogue;

        public static GetNextResultToVerifyResponseBodyDataDialogues build(java.util.Map<String, ?> map) throws Exception {
            GetNextResultToVerifyResponseBodyDataDialogues self = new GetNextResultToVerifyResponseBodyDataDialogues();
            return TeaModel.build(map, self);
        }

        public GetNextResultToVerifyResponseBodyDataDialogues setDialogue(java.util.List<GetNextResultToVerifyResponseBodyDataDialoguesDialogue> dialogue) {
            this.dialogue = dialogue;
            return this;
        }
        public java.util.List<GetNextResultToVerifyResponseBodyDataDialoguesDialogue> getDialogue() {
            return this.dialogue;
        }

    }

    public static class GetNextResultToVerifyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("AudioScheme")
        public String audioScheme;

        /**
         * <strong>example:</strong>
         * <p>sca-bucket.oss-cn-hangzhou.aliyuncs.com/upload_1173636551461420/dateset_1584674455133_SzC/%E4%BA%BA%E5%B7%A5%E6%A0%A1%E9%AA%8C%E6%B5%8B%E8%AF%95-%E6%9F%A5%E5%8C%97%E4%BA%AC%E5%A4%A9%E6%B0%94.wav?Expires=1584847372&amp;OSSAccessKeyId=<em><strong><strong>&amp;Signature=HccAKnLOJwoYvzE</strong></strong></em>****</p>
         */
        @NameInMap("AudioURL")
        public String audioURL;

        @NameInMap("Dialogues")
        public GetNextResultToVerifyResponseBodyDataDialogues dialogues;

        /**
         * <strong>example:</strong>
         * <p>23421</p>
         */
        @NameInMap("Duration")
        public Integer duration;

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
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("IncorrectWords")
        public Integer incorrectWords;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>0.97079998</p>
         */
        @NameInMap("Precision")
        public Float precision;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <strong>example:</strong>
         * <p>2020-03-20T11:26Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Verified")
        public Boolean verified;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("VerifiedCount")
        public Integer verifiedCount;

        public static GetNextResultToVerifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNextResultToVerifyResponseBodyData self = new GetNextResultToVerifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNextResultToVerifyResponseBodyData setAudioScheme(String audioScheme) {
            this.audioScheme = audioScheme;
            return this;
        }
        public String getAudioScheme() {
            return this.audioScheme;
        }

        public GetNextResultToVerifyResponseBodyData setAudioURL(String audioURL) {
            this.audioURL = audioURL;
            return this;
        }
        public String getAudioURL() {
            return this.audioURL;
        }

        public GetNextResultToVerifyResponseBodyData setDialogues(GetNextResultToVerifyResponseBodyDataDialogues dialogues) {
            this.dialogues = dialogues;
            return this;
        }
        public GetNextResultToVerifyResponseBodyDataDialogues getDialogues() {
            return this.dialogues;
        }

        public GetNextResultToVerifyResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetNextResultToVerifyResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetNextResultToVerifyResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetNextResultToVerifyResponseBodyData setIncorrectWords(Integer incorrectWords) {
            this.incorrectWords = incorrectWords;
            return this;
        }
        public Integer getIncorrectWords() {
            return this.incorrectWords;
        }

        public GetNextResultToVerifyResponseBodyData setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetNextResultToVerifyResponseBodyData setPrecision(Float precision) {
            this.precision = precision;
            return this;
        }
        public Float getPrecision() {
            return this.precision;
        }

        public GetNextResultToVerifyResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetNextResultToVerifyResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetNextResultToVerifyResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetNextResultToVerifyResponseBodyData setVerified(Boolean verified) {
            this.verified = verified;
            return this;
        }
        public Boolean getVerified() {
            return this.verified;
        }

        public GetNextResultToVerifyResponseBodyData setVerifiedCount(Integer verifiedCount) {
            this.verifiedCount = verifiedCount;
            return this;
        }
        public Integer getVerifiedCount() {
            return this.verifiedCount;
        }

    }

}
