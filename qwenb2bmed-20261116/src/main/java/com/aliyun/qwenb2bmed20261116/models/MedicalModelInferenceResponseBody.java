// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261116.models;

import com.aliyun.tea.*;

public class MedicalModelInferenceResponseBody extends TeaModel {
    /**
     * <p>The optional list of audio frames in the response. This can be empty or omitted when no audio is present.</p>
     */
    @NameInMap("audioFrames")
    public java.util.List<MedicalModelInferenceResponseBodyAudioFrames> audioFrames;

    /**
     * <p>The information used to associate response frames with the original business request and session.</p>
     */
    @NameInMap("communication")
    public MedicalModelInferenceResponseBodyCommunication communication;

    /**
     * <p>The business data returned in this response, including messages and optional extended information.</p>
     */
    @NameInMap("data")
    public MedicalModelInferenceResponseBodyData data;

    /**
     * <p>The error details returned when a business call fails.</p>
     */
    @NameInMap("error")
    public MedicalModelInferenceResponseBodyError error;

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

    public static MedicalModelInferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MedicalModelInferenceResponseBody self = new MedicalModelInferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public MedicalModelInferenceResponseBody setAudioFrames(java.util.List<MedicalModelInferenceResponseBodyAudioFrames> audioFrames) {
        this.audioFrames = audioFrames;
        return this;
    }
    public java.util.List<MedicalModelInferenceResponseBodyAudioFrames> getAudioFrames() {
        return this.audioFrames;
    }

    public MedicalModelInferenceResponseBody setCommunication(MedicalModelInferenceResponseBodyCommunication communication) {
        this.communication = communication;
        return this;
    }
    public MedicalModelInferenceResponseBodyCommunication getCommunication() {
        return this.communication;
    }

    public MedicalModelInferenceResponseBody setData(MedicalModelInferenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MedicalModelInferenceResponseBodyData getData() {
        return this.data;
    }

    public MedicalModelInferenceResponseBody setError(MedicalModelInferenceResponseBodyError error) {
        this.error = error;
        return this;
    }
    public MedicalModelInferenceResponseBodyError getError() {
        return this.error;
    }

    public MedicalModelInferenceResponseBody setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Object getErrorCode() {
        return this.errorCode;
    }

    public MedicalModelInferenceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public MedicalModelInferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MedicalModelInferenceResponseBodyAudioFrames extends TeaModel {
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
         * <p>The request correlation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The type of the audio or error frame.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("type")
        public String type;

        public static MedicalModelInferenceResponseBodyAudioFrames build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceResponseBodyAudioFrames self = new MedicalModelInferenceResponseBodyAudioFrames();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceResponseBodyAudioFrames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MedicalModelInferenceResponseBodyAudioFrames setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public MedicalModelInferenceResponseBodyAudioFrames setLast(Boolean last) {
            this.last = last;
            return this;
        }
        public Boolean getLast() {
            return this.last;
        }

        public MedicalModelInferenceResponseBodyAudioFrames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MedicalModelInferenceResponseBodyAudioFrames setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public MedicalModelInferenceResponseBodyAudioFrames setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MedicalModelInferenceResponseBodyCommunication extends TeaModel {
        /**
         * <p>The business request ID. This is the same as the business request ID when present.</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The ID of the business response frame.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("responseId")
        public Long responseId;

        /**
         * <p>The ID of the customer session.</p>
         * 
         * <strong>example:</strong>
         * <p>med-session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static MedicalModelInferenceResponseBodyCommunication build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceResponseBodyCommunication self = new MedicalModelInferenceResponseBodyCommunication();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceResponseBodyCommunication setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public MedicalModelInferenceResponseBodyCommunication setResponseId(Long responseId) {
            this.responseId = responseId;
            return this;
        }
        public Long getResponseId() {
            return this.responseId;
        }

        public MedicalModelInferenceResponseBodyCommunication setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class MedicalModelInferenceResponseBodyDataExtraInfoInputResources extends TeaModel {
        /**
         * <p>The index of the original content block.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("contentIndex")
        public Integer contentIndex;

        /**
         * <p>The name of the resource file.</p>
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
         * <p>The type of the input resource.</p>
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

        public static MedicalModelInferenceResponseBodyDataExtraInfoInputResources build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceResponseBodyDataExtraInfoInputResources self = new MedicalModelInferenceResponseBodyDataExtraInfoInputResources();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceResponseBodyDataExtraInfoInputResources setContentIndex(Integer contentIndex) {
            this.contentIndex = contentIndex;
            return this;
        }
        public Integer getContentIndex() {
            return this.contentIndex;
        }

        public MedicalModelInferenceResponseBodyDataExtraInfoInputResources setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public MedicalModelInferenceResponseBodyDataExtraInfoInputResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public MedicalModelInferenceResponseBodyDataExtraInfoInputResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MedicalModelInferenceResponseBodyDataExtraInfoInputResources setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MedicalModelInferenceResponseBodyDataExtraInfo extends TeaModel {
        /**
         * <p>The transfer results of the input resources for this round.</p>
         */
        @NameInMap("inputResources")
        public java.util.List<MedicalModelInferenceResponseBodyDataExtraInfoInputResources> inputResources;

        public static MedicalModelInferenceResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceResponseBodyDataExtraInfo self = new MedicalModelInferenceResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceResponseBodyDataExtraInfo setInputResources(java.util.List<MedicalModelInferenceResponseBodyDataExtraInfoInputResources> inputResources) {
            this.inputResources = inputResources;
            return this;
        }
        public java.util.List<MedicalModelInferenceResponseBodyDataExtraInfoInputResources> getInputResources() {
            return this.inputResources;
        }

    }

    public static class MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad extends TeaModel {
        /**
         * <p>The content of the card.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;list&quot;:[{&quot;image_url&quot;:&quot;<a href="https://example.com/image.jpg%22,%22image_width%22:%22800%22,%22image_height%22:%22600%22%7D%5D%7D">https://example.com/image.jpg&quot;,&quot;image_width&quot;:&quot;800&quot;,&quot;image_height&quot;:&quot;600&quot;}]}</a></p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The reference identifier of the card.</p>
         * 
         * <strong>example:</strong>
         * <p>image_waterfall_1</p>
         */
        @NameInMap("sourceSeq")
        public String sourceSeq;

        /**
         * <p>The type of the card.</p>
         * 
         * <strong>example:</strong>
         * <p>image_waterfall</p>
         */
        @NameInMap("type")
        public String type;

        public static MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad self = new MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MedicalModelInferenceResponseBodyDataMessagesMetaData extends TeaModel {
        /**
         * <p>The title of the status bar.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyzing the issue</p>
         */
        @NameInMap("barTitle")
        public String barTitle;

        /**
         * <p>The content of the metadata.</p>
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
        public java.util.List<MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad> multiLoad;

        /**
         * <p>The source identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>bar_thinking_1</p>
         */
        @NameInMap("sourceSeq")
        public String sourceSeq;

        /**
         * <p>The type of the metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>bar_thinking</p>
         */
        @NameInMap("type")
        public String type;

        public static MedicalModelInferenceResponseBodyDataMessagesMetaData build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceResponseBodyDataMessagesMetaData self = new MedicalModelInferenceResponseBodyDataMessagesMetaData();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceResponseBodyDataMessagesMetaData setBarTitle(String barTitle) {
            this.barTitle = barTitle;
            return this;
        }
        public String getBarTitle() {
            return this.barTitle;
        }

        public MedicalModelInferenceResponseBodyDataMessagesMetaData setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalModelInferenceResponseBodyDataMessagesMetaData setMultiLoad(java.util.List<MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad> multiLoad) {
            this.multiLoad = multiLoad;
            return this;
        }
        public java.util.List<MedicalModelInferenceResponseBodyDataMessagesMetaDataMultiLoad> getMultiLoad() {
            return this.multiLoad;
        }

        public MedicalModelInferenceResponseBodyDataMessagesMetaData setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public MedicalModelInferenceResponseBodyDataMessagesMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MedicalModelInferenceResponseBodyDataMessages extends TeaModel {
        /**
         * <p>The text or content corresponding to the message type.</p>
         * 
         * <strong>example:</strong>
         * <p>Hemoglobin is used to carry oxygen. When interpreting the report, you can refer to the reference ranges provided on the report</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The extended metadata associated with this message.</p>
         */
        @NameInMap("metaData")
        public MedicalModelInferenceResponseBodyDataMessagesMetaData metaData;

        /**
         * <p>The type of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>multi_load/iframe</p>
         */
        @NameInMap("mimeType")
        public String mimeType;

        /**
         * <p>The status of the business message.</p>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("status")
        public String status;

        public static MedicalModelInferenceResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceResponseBodyDataMessages self = new MedicalModelInferenceResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceResponseBodyDataMessages setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalModelInferenceResponseBodyDataMessages setMetaData(MedicalModelInferenceResponseBodyDataMessagesMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public MedicalModelInferenceResponseBodyDataMessagesMetaData getMetaData() {
            return this.metaData;
        }

        public MedicalModelInferenceResponseBodyDataMessages setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public MedicalModelInferenceResponseBodyDataMessages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class MedicalModelInferenceResponseBodyData extends TeaModel {
        /**
         * <p>The optional debug information included in the business response.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("debug")
        public Object debug;

        /**
         * <p>The extended business information, which may include inputResources.</p>
         */
        @NameInMap("extraInfo")
        public MedicalModelInferenceResponseBodyDataExtraInfo extraInfo;

        /**
         * <p>The list of messages returned in this business response or the current streaming response frame.</p>
         */
        @NameInMap("messages")
        public java.util.List<MedicalModelInferenceResponseBodyDataMessages> messages;

        public static MedicalModelInferenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceResponseBodyData self = new MedicalModelInferenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceResponseBodyData setDebug(Object debug) {
            this.debug = debug;
            return this;
        }
        public Object getDebug() {
            return this.debug;
        }

        public MedicalModelInferenceResponseBodyData setExtraInfo(MedicalModelInferenceResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public MedicalModelInferenceResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public MedicalModelInferenceResponseBodyData setMessages(java.util.List<MedicalModelInferenceResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<MedicalModelInferenceResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

    }

    public static class MedicalModelInferenceResponseBodyError extends TeaModel {
        /**
         * <p>The business error code used by the client to identify the failure type.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_REQUEST</p>
         */
        @NameInMap("code")
        public Object code;

        /**
         * <p>The descriptive text of the business error.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid request parameters</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The business request correlation ID of the failed call, used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        public static MedicalModelInferenceResponseBodyError build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceResponseBodyError self = new MedicalModelInferenceResponseBodyError();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceResponseBodyError setCode(Object code) {
            this.code = code;
            return this;
        }
        public Object getCode() {
            return this.code;
        }

        public MedicalModelInferenceResponseBodyError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MedicalModelInferenceResponseBodyError setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
