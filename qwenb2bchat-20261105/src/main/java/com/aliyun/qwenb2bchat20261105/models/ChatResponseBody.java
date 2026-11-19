// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261105.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    /**
     * <p>The optional list of audio frames in the response. This list can be empty or omitted when no audio is present.</p>
     */
    @NameInMap("audioFrames")
    public java.util.List<ChatResponseBodyAudioFrames> audioFrames;

    /**
     * <p>The information used to associate the response frame with the original business request and session.</p>
     */
    @NameInMap("communication")
    public ChatResponseBodyCommunication communication;

    /**
     * <p>The business data returned in the response, including messages and optional extended information.</p>
     */
    @NameInMap("data")
    public ChatResponseBodyData data;

    /**
     * <p>The error details returned when a business call fails.</p>
     */
    @NameInMap("error")
    public ChatResponseBodyError error;

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
     * <p>req-example-001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatResponseBody self = new ChatResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatResponseBody setAudioFrames(java.util.List<ChatResponseBodyAudioFrames> audioFrames) {
        this.audioFrames = audioFrames;
        return this;
    }
    public java.util.List<ChatResponseBodyAudioFrames> getAudioFrames() {
        return this.audioFrames;
    }

    public ChatResponseBody setCommunication(ChatResponseBodyCommunication communication) {
        this.communication = communication;
        return this;
    }
    public ChatResponseBodyCommunication getCommunication() {
        return this.communication;
    }

    public ChatResponseBody setData(ChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChatResponseBodyData getData() {
        return this.data;
    }

    public ChatResponseBody setError(ChatResponseBodyError error) {
        this.error = error;
        return this;
    }
    public ChatResponseBodyError getError() {
        return this.error;
    }

    public ChatResponseBody setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Object getErrorCode() {
        return this.errorCode;
    }

    public ChatResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChatResponseBodyAudioFrames extends TeaModel {
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
         * <p>SUQz</p>
         */
        @NameInMap("data")
        public String data;

        /**
         * <p>Indicates whether the frame is the last audio frame.</p>
         */
        @NameInMap("last")
        public Boolean last;

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>Speech synthesis is currently unavailable</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The business request correlation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>req-example-001</p>
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

        public static ChatResponseBodyAudioFrames build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyAudioFrames self = new ChatResponseBodyAudioFrames();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyAudioFrames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ChatResponseBodyAudioFrames setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ChatResponseBodyAudioFrames setLast(Boolean last) {
            this.last = last;
            return this;
        }
        public Boolean getLast() {
            return this.last;
        }

        public ChatResponseBodyAudioFrames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ChatResponseBodyAudioFrames setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChatResponseBodyAudioFrames setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ChatResponseBodyCommunication extends TeaModel {
        /**
         * <p>The business request ID, if present.</p>
         * 
         * <strong>example:</strong>
         * <p>req-example-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The identifier of the business response frame.</p>
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
         * <p>session-example-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static ChatResponseBodyCommunication build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyCommunication self = new ChatResponseBodyCommunication();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyCommunication setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChatResponseBodyCommunication setResponseId(Long responseId) {
            this.responseId = responseId;
            return this;
        }
        public Long getResponseId() {
            return this.responseId;
        }

        public ChatResponseBodyCommunication setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class ChatResponseBodyDataExtraInfoInputResources extends TeaModel {
        /**
         * <p>The position of the original content block.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("contentIndex")
        public Integer contentIndex;

        /**
         * <p>The file name of the transferred and stored resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cat.png</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The ID of the transferred and stored resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_example_001</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The type of the transferred and stored resource.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The URL of the transferred and stored resource.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn.example.com/uploads/cat.png">https://cdn.example.com/uploads/cat.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ChatResponseBodyDataExtraInfoInputResources build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataExtraInfoInputResources self = new ChatResponseBodyDataExtraInfoInputResources();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataExtraInfoInputResources setContentIndex(Integer contentIndex) {
            this.contentIndex = contentIndex;
            return this;
        }
        public Integer getContentIndex() {
            return this.contentIndex;
        }

        public ChatResponseBodyDataExtraInfoInputResources setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ChatResponseBodyDataExtraInfoInputResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ChatResponseBodyDataExtraInfoInputResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChatResponseBodyDataExtraInfoInputResources setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ChatResponseBodyDataExtraInfo extends TeaModel {
        /**
         * <p>The transfer and storage results of the input resources for the current round.</p>
         */
        @NameInMap("inputResources")
        public java.util.List<ChatResponseBodyDataExtraInfoInputResources> inputResources;

        public static ChatResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataExtraInfo self = new ChatResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataExtraInfo setInputResources(java.util.List<ChatResponseBodyDataExtraInfoInputResources> inputResources) {
            this.inputResources = inputResources;
            return this;
        }
        public java.util.List<ChatResponseBodyDataExtraInfoInputResources> getInputResources() {
            return this.inputResources;
        }

    }

    public static class ChatResponseBodyDataMessagesMetaDataMultiLoad extends TeaModel {
        /**
         * <p>The card content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;list&quot;:[{&quot;imageUrl&quot;:&quot;<a href="https://images.example.com/cat.png%22%7D%5D%7D">https://images.example.com/cat.png&quot;}]}</a></p>
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

        public static ChatResponseBodyDataMessagesMetaDataMultiLoad build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataMessagesMetaDataMultiLoad self = new ChatResponseBodyDataMessagesMetaDataMultiLoad();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataMessagesMetaDataMultiLoad setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public ChatResponseBodyDataMessagesMetaDataMultiLoad setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public ChatResponseBodyDataMessagesMetaDataMultiLoad setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ChatResponseBodyDataMessagesMetaData extends TeaModel {
        /**
         * <p>The display title of the process module.</p>
         * 
         * <strong>example:</strong>
         * <p>Issue analysis</p>
         */
        @NameInMap("barTitle")
        public String barTitle;

        /**
         * <p>The complete content snapshot of the process module.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;body&quot;:&quot;Analyzing the issue&quot;,&quot;status&quot;:&quot;processing&quot;}</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The list of structured content associated with the body, such as image-text cards, returned by message type.</p>
         */
        @NameInMap("multiLoad")
        public java.util.List<ChatResponseBodyDataMessagesMetaDataMultiLoad> multiLoad;

        /**
         * <p>The process module identifier within the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>thinking-1</p>
         */
        @NameInMap("sourceSeq")
        public String sourceSeq;

        /**
         * <p>The process module type.</p>
         * 
         * <strong>example:</strong>
         * <p>bar_thinking</p>
         */
        @NameInMap("type")
        public String type;

        public static ChatResponseBodyDataMessagesMetaData build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataMessagesMetaData self = new ChatResponseBodyDataMessagesMetaData();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataMessagesMetaData setBarTitle(String barTitle) {
            this.barTitle = barTitle;
            return this;
        }
        public String getBarTitle() {
            return this.barTitle;
        }

        public ChatResponseBodyDataMessagesMetaData setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public ChatResponseBodyDataMessagesMetaData setMultiLoad(java.util.List<ChatResponseBodyDataMessagesMetaDataMultiLoad> multiLoad) {
            this.multiLoad = multiLoad;
            return this;
        }
        public java.util.List<ChatResponseBodyDataMessagesMetaDataMultiLoad> getMultiLoad() {
            return this.multiLoad;
        }

        public ChatResponseBodyDataMessagesMetaData setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public ChatResponseBodyDataMessagesMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ChatResponseBodyDataMessages extends TeaModel {
        /**
         * <p>The text or content of the corresponding message type.</p>
         * 
         * <strong>example:</strong>
         * <p>Image as follows [(image_waterfall_1)]</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The extended metadata associated with the message.</p>
         */
        @NameInMap("metaData")
        public ChatResponseBodyDataMessagesMetaData metaData;

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

        public static ChatResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataMessages self = new ChatResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataMessages setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public ChatResponseBodyDataMessages setMetaData(ChatResponseBodyDataMessagesMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public ChatResponseBodyDataMessagesMetaData getMetaData() {
            return this.metaData;
        }

        public ChatResponseBodyDataMessages setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public ChatResponseBodyDataMessages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ChatResponseBodyData extends TeaModel {
        /**
         * <p>The optional debug information included in the business response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;intentLabel&quot;:&quot;image_search&quot;}</p>
         */
        @NameInMap("debug")
        public Object debug;

        /**
         * <p>The business extended information, which may include inputResources.</p>
         */
        @NameInMap("extraInfo")
        public ChatResponseBodyDataExtraInfo extraInfo;

        /**
         * <p>The list of messages returned in the business response or the current streaming response frame.</p>
         */
        @NameInMap("messages")
        public java.util.List<ChatResponseBodyDataMessages> messages;

        public static ChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyData self = new ChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyData setDebug(Object debug) {
            this.debug = debug;
            return this;
        }
        public Object getDebug() {
            return this.debug;
        }

        public ChatResponseBodyData setExtraInfo(ChatResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public ChatResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public ChatResponseBodyData setMessages(java.util.List<ChatResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ChatResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

    }

    public static class ChatResponseBodyError extends TeaModel {
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
         * <p>req-example-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        public static ChatResponseBodyError build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyError self = new ChatResponseBodyError();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyError setCode(Object code) {
            this.code = code;
            return this;
        }
        public Object getCode() {
            return this.code;
        }

        public ChatResponseBodyError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ChatResponseBodyError setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
