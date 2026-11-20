// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261116.models;

import com.aliyun.tea.*;

public class MedicalAgentChatResponseBody extends TeaModel {
    /**
     * <p>The optional list of audio frames in the response. This list can be empty or omitted when no audio is present.</p>
     */
    @NameInMap("audioFrames")
    public java.util.List<MedicalAgentChatResponseBodyAudioFrames> audioFrames;

    /**
     * <p>The information used to correlate response frames with the original business request and session.</p>
     */
    @NameInMap("communication")
    public MedicalAgentChatResponseBodyCommunication communication;

    /**
     * <p>The business data returned in this response, including messages and optional extended information.</p>
     */
    @NameInMap("data")
    public MedicalAgentChatResponseBodyData data;

    /**
     * <p>The error details returned when a business call fails.</p>
     */
    @NameInMap("error")
    public MedicalAgentChatResponseBodyError error;

    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errorCode")
    public Object errorCode;

    /**
     * <p>The business status description.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The optional business request correlation ID. For the POP request ID, see x-acs-request-id.</p>
     * 
     * <strong>example:</strong>
     * <p>med-req-001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static MedicalAgentChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MedicalAgentChatResponseBody self = new MedicalAgentChatResponseBody();
        return TeaModel.build(map, self);
    }

    public MedicalAgentChatResponseBody setAudioFrames(java.util.List<MedicalAgentChatResponseBodyAudioFrames> audioFrames) {
        this.audioFrames = audioFrames;
        return this;
    }
    public java.util.List<MedicalAgentChatResponseBodyAudioFrames> getAudioFrames() {
        return this.audioFrames;
    }

    public MedicalAgentChatResponseBody setCommunication(MedicalAgentChatResponseBodyCommunication communication) {
        this.communication = communication;
        return this;
    }
    public MedicalAgentChatResponseBodyCommunication getCommunication() {
        return this.communication;
    }

    public MedicalAgentChatResponseBody setData(MedicalAgentChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MedicalAgentChatResponseBodyData getData() {
        return this.data;
    }

    public MedicalAgentChatResponseBody setError(MedicalAgentChatResponseBodyError error) {
        this.error = error;
        return this;
    }
    public MedicalAgentChatResponseBodyError getError() {
        return this.error;
    }

    public MedicalAgentChatResponseBody setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Object getErrorCode() {
        return this.errorCode;
    }

    public MedicalAgentChatResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public MedicalAgentChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MedicalAgentChatResponseBodyAudioFrames extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DOWNSTREAM_ERROR</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The encoded audio data.</p>
         * 
         * <strong>example:</strong>
         * <p>AAEC</p>
         */
        @NameInMap("data")
        public String data;

        /**
         * <p>Indicates whether this is the last audio frame.</p>
         */
        @NameInMap("last")
        public Boolean last;

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>Audio generation failed</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The business request correlation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The audio or error frame type.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("type")
        public String type;

        public static MedicalAgentChatResponseBodyAudioFrames build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyAudioFrames self = new MedicalAgentChatResponseBodyAudioFrames();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyAudioFrames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MedicalAgentChatResponseBodyAudioFrames setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public MedicalAgentChatResponseBodyAudioFrames setLast(Boolean last) {
            this.last = last;
            return this;
        }
        public Boolean getLast() {
            return this.last;
        }

        public MedicalAgentChatResponseBodyAudioFrames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MedicalAgentChatResponseBodyAudioFrames setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public MedicalAgentChatResponseBodyAudioFrames setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MedicalAgentChatResponseBodyCommunication extends TeaModel {
        /**
         * <p>The business request ID, which is identical to the original request ID when present.</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The business response frame ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("responseId")
        public Long responseId;

        /**
         * <p>The customer session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>med-session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static MedicalAgentChatResponseBodyCommunication build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyCommunication self = new MedicalAgentChatResponseBodyCommunication();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyCommunication setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public MedicalAgentChatResponseBodyCommunication setResponseId(Long responseId) {
            this.responseId = responseId;
            return this;
        }
        public Long getResponseId() {
            return this.responseId;
        }

        public MedicalAgentChatResponseBodyCommunication setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class MedicalAgentChatResponseBodyDataExtraInfoInputResources extends TeaModel {
        /**
         * <p>The index of the original content block.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("contentIndex")
        public Integer contentIndex;

        /**
         * <p>The resource file name.</p>
         * 
         * <strong>example:</strong>
         * <p>report.png</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The ID of the transferred resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_123</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The input resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The URL of the transferred resource.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/report.png">https://example.com/report.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static MedicalAgentChatResponseBodyDataExtraInfoInputResources build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataExtraInfoInputResources self = new MedicalAgentChatResponseBodyDataExtraInfoInputResources();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setContentIndex(Integer contentIndex) {
            this.contentIndex = contentIndex;
            return this;
        }
        public Integer getContentIndex() {
            return this.contentIndex;
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MedicalAgentChatResponseBodyDataExtraInfo extends TeaModel {
        /**
         * <p>The transfer results of the input resources for this round.</p>
         */
        @NameInMap("inputResources")
        public java.util.List<MedicalAgentChatResponseBodyDataExtraInfoInputResources> inputResources;

        public static MedicalAgentChatResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataExtraInfo self = new MedicalAgentChatResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataExtraInfo setInputResources(java.util.List<MedicalAgentChatResponseBodyDataExtraInfoInputResources> inputResources) {
            this.inputResources = inputResources;
            return this;
        }
        public java.util.List<MedicalAgentChatResponseBodyDataExtraInfoInputResources> getInputResources() {
            return this.inputResources;
        }

    }

    public static class MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad extends TeaModel {
        /**
         * <p>The card content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;list&quot;:[{&quot;image_url&quot;:&quot;<a href="https://example.com/image.jpg%22,%22image_width%22:%22800%22,%22image_height%22:%22600%22%7D%5D%7D">https://example.com/image.jpg&quot;,&quot;image_width&quot;:&quot;800&quot;,&quot;image_height&quot;:&quot;600&quot;}]}</a></p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The card reference identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>image_waterfall_1</p>
         */
        @NameInMap("sourceSeq")
        public String sourceSeq;

        /**
         * <p>The card type.</p>
         * 
         * <strong>example:</strong>
         * <p>image_waterfall</p>
         */
        @NameInMap("type")
        public String type;

        public static MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad self = new MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MedicalAgentChatResponseBodyDataMessagesMetaData extends TeaModel {
        /**
         * <p>The status bar title.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyzing the issue</p>
         */
        @NameInMap("barTitle")
        public String barTitle;

        /**
         * <p>The metadata content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;body&quot;:&quot;Analyzing the user\&quot;s issue.&quot;,&quot;status&quot;:&quot;processing&quot;}</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The list of structured content associated with the body, such as image-text cards, returned by message type.</p>
         */
        @NameInMap("multiLoad")
        public java.util.List<MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad> multiLoad;

        /**
         * <p>The source identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>bar_thinking_1</p>
         */
        @NameInMap("sourceSeq")
        public String sourceSeq;

        /**
         * <p>The metadata type.</p>
         * 
         * <strong>example:</strong>
         * <p>bar_thinking</p>
         */
        @NameInMap("type")
        public String type;

        public static MedicalAgentChatResponseBodyDataMessagesMetaData build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataMessagesMetaData self = new MedicalAgentChatResponseBodyDataMessagesMetaData();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setBarTitle(String barTitle) {
            this.barTitle = barTitle;
            return this;
        }
        public String getBarTitle() {
            return this.barTitle;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setMultiLoad(java.util.List<MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad> multiLoad) {
            this.multiLoad = multiLoad;
            return this;
        }
        public java.util.List<MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad> getMultiLoad() {
            return this.multiLoad;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MedicalAgentChatResponseBodyDataMessages extends TeaModel {
        /**
         * <p>The text or content corresponding to the message type.</p>
         * 
         * <strong>example:</strong>
         * <p>Hemoglobin carries oxygen. Refer to the reference ranges on the report for interpretation</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The extended metadata associated with this message.</p>
         */
        @NameInMap("metaData")
        public MedicalAgentChatResponseBodyDataMessagesMetaData metaData;

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>multi_load/iframe</p>
         */
        @NameInMap("mimeType")
        public String mimeType;

        /**
         * <p>The business message status.</p>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("status")
        public String status;

        public static MedicalAgentChatResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataMessages self = new MedicalAgentChatResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataMessages setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalAgentChatResponseBodyDataMessages setMetaData(MedicalAgentChatResponseBodyDataMessagesMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public MedicalAgentChatResponseBodyDataMessagesMetaData getMetaData() {
            return this.metaData;
        }

        public MedicalAgentChatResponseBodyDataMessages setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public MedicalAgentChatResponseBodyDataMessages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class MedicalAgentChatResponseBodyData extends TeaModel {
        /**
         * <p>The optional debug information included in the business response.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("debug")
        public Object debug;

        /**
         * <p>The business extended information, which may include inputResources.</p>
         */
        @NameInMap("extraInfo")
        public MedicalAgentChatResponseBodyDataExtraInfo extraInfo;

        /**
         * <p>The list of messages returned in this business response or the current streaming response frame.</p>
         */
        @NameInMap("messages")
        public java.util.List<MedicalAgentChatResponseBodyDataMessages> messages;

        public static MedicalAgentChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyData self = new MedicalAgentChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyData setDebug(Object debug) {
            this.debug = debug;
            return this;
        }
        public Object getDebug() {
            return this.debug;
        }

        public MedicalAgentChatResponseBodyData setExtraInfo(MedicalAgentChatResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public MedicalAgentChatResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public MedicalAgentChatResponseBodyData setMessages(java.util.List<MedicalAgentChatResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<MedicalAgentChatResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

    }

    public static class MedicalAgentChatResponseBodyError extends TeaModel {
        /**
         * <p>The business error code used by the client to identify the failure type.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_REQUEST</p>
         */
        @NameInMap("code")
        public Object code;

        /**
         * <p>The descriptive text for the business error.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid request parameters</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The business request correlation ID for the failed call, used to troubleshoot the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        public static MedicalAgentChatResponseBodyError build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyError self = new MedicalAgentChatResponseBodyError();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyError setCode(Object code) {
            this.code = code;
            return this;
        }
        public Object getCode() {
            return this.code;
        }

        public MedicalAgentChatResponseBodyError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MedicalAgentChatResponseBodyError setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
