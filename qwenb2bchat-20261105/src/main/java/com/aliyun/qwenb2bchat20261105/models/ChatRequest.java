// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261105.models;

import com.aliyun.tea.*;

public class ChatRequest extends TeaModel {
    /**
     * <p>The correlation ID, session, and application identity information for the current request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("communication")
    public ChatRequestCommunication communication;

    /**
     * <p>The business data that carries the messages for the current request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public ChatRequestData data;

    /**
     * <p>An optional extensible JSON object. responseStreaming is an optional boolean value. A value of false returns a complete JSON response, and a value of true returns a Server-Sent Events (SSE) response.</p>
     */
    @NameInMap("params")
    public ChatRequestParams params;

    public static ChatRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatRequest self = new ChatRequest();
        return TeaModel.build(map, self);
    }

    public ChatRequest setCommunication(ChatRequestCommunication communication) {
        this.communication = communication;
        return this;
    }
    public ChatRequestCommunication getCommunication() {
        return this.communication;
    }

    public ChatRequest setData(ChatRequestData data) {
        this.data = data;
        return this;
    }
    public ChatRequestData getData() {
        return this.data;
    }

    public ChatRequest setParams(ChatRequestParams params) {
        this.params = params;
        return this;
    }
    public ChatRequestParams getParams() {
        return this.params;
    }

    public static class ChatRequestCommunicationUserInfo extends TeaModel {
        /**
         * <p>The terminal device identifier provided by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>device-example-001</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <p>The business user identifier within the customer application, provided based on the user binding or delegation configuration of the business gateway credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>example-user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The IP address of the business user provided by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.10</p>
         */
        @NameInMap("userIp")
        public String userIp;

        /**
         * <p>The username of the business user provided by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>示例用户</p>
         */
        @NameInMap("userName")
        public String userName;

        public static ChatRequestCommunicationUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestCommunicationUserInfo self = new ChatRequestCommunicationUserInfo();
            return TeaModel.build(map, self);
        }

        public ChatRequestCommunicationUserInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ChatRequestCommunicationUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ChatRequestCommunicationUserInfo setUserIp(String userIp) {
            this.userIp = userIp;
            return this;
        }
        public String getUserIp() {
            return this.userIp;
        }

        public ChatRequestCommunicationUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ChatRequestCommunication extends TeaModel {
        /**
         * <p>The application ID provided based on the gateway credential identity configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The optional business scene marker.</p>
         * 
         * <strong>example:</strong>
         * <p>travel</p>
         */
        @NameInMap("appScene")
        public String appScene;

        /**
         * <p>The owner of the session history, which must be consistent with the first call of the session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLIENT</p>
         */
        @NameInMap("historyOwner")
        public String historyOwner;

        /**
         * <p>The business request ID of the customer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>req-example-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The session ID of the customer, which is reused for continued chats.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session-example-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The business user and device information provided by the customer. Identity fields are passed based on the configuration of the business gateway credentials.</p>
         */
        @NameInMap("userInfo")
        public ChatRequestCommunicationUserInfo userInfo;

        public static ChatRequestCommunication build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestCommunication self = new ChatRequestCommunication();
            return TeaModel.build(map, self);
        }

        public ChatRequestCommunication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ChatRequestCommunication setAppScene(String appScene) {
            this.appScene = appScene;
            return this;
        }
        public String getAppScene() {
            return this.appScene;
        }

        public ChatRequestCommunication setHistoryOwner(String historyOwner) {
            this.historyOwner = historyOwner;
            return this;
        }
        public String getHistoryOwner() {
            return this.historyOwner;
        }

        public ChatRequestCommunication setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChatRequestCommunication setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ChatRequestCommunication setUserInfo(ChatRequestCommunicationUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public ChatRequestCommunicationUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class ChatRequestDataMessages extends TeaModel {
        /**
         * <p>The text or an array of supported multimodal content blocks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>请介绍杭州西湖。</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The sender of the message. user indicates the business user, and assistant indicates the assistant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static ChatRequestDataMessages build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestDataMessages self = new ChatRequestDataMessages();
            return TeaModel.build(map, self);
        }

        public ChatRequestDataMessages setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public ChatRequestDataMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ChatRequestData extends TeaModel {
        /**
         * <p>The list of messages arranged in conversational order. When history is managed by the client, it can include the session history provided by the client.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("messages")
        public java.util.List<ChatRequestDataMessages> messages;

        public static ChatRequestData build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestData self = new ChatRequestData();
            return TeaModel.build(map, self);
        }

        public ChatRequestData setMessages(java.util.List<ChatRequestDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ChatRequestDataMessages> getMessages() {
            return this.messages;
        }

    }

    public static class ChatRequestParams extends TeaModel {
        /**
         * <p>The deep thinking switch.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deepthink")
        public String deepthink;

        /**
         * <p>The agent selector for the current turn.</p>
         * 
         * <strong>example:</strong>
         * <p>study_qa</p>
         */
        @NameInMap("directAgent")
        public String directAgent;

        /**
         * <p>The mixed text and image output switch.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableTextImageMixed")
        public Boolean enableTextImageMixed;

        /**
         * <p>The maximum number of output tokens for the model.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("maxTokens")
        public Integer maxTokens;

        /**
         * <p>The HTTP audio output switch.</p>
         */
        @NameInMap("outputAudio")
        public Boolean outputAudio;

        /**
         * <p>Specifies whether to use Server-Sent Events (SSE) for conversation responses.</p>
         */
        @NameInMap("responseStreaming")
        public Boolean responseStreaming;

        /**
         * <p>The model sampling temperature.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("temperature")
        public Float temperature;

        /**
         * <p>The nucleus sampling probability for the model.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("topP")
        public Float topP;

        public static ChatRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestParams self = new ChatRequestParams();
            return TeaModel.build(map, self);
        }

        public ChatRequestParams setDeepthink(String deepthink) {
            this.deepthink = deepthink;
            return this;
        }
        public String getDeepthink() {
            return this.deepthink;
        }

        public ChatRequestParams setDirectAgent(String directAgent) {
            this.directAgent = directAgent;
            return this;
        }
        public String getDirectAgent() {
            return this.directAgent;
        }

        public ChatRequestParams setEnableTextImageMixed(Boolean enableTextImageMixed) {
            this.enableTextImageMixed = enableTextImageMixed;
            return this;
        }
        public Boolean getEnableTextImageMixed() {
            return this.enableTextImageMixed;
        }

        public ChatRequestParams setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public ChatRequestParams setOutputAudio(Boolean outputAudio) {
            this.outputAudio = outputAudio;
            return this;
        }
        public Boolean getOutputAudio() {
            return this.outputAudio;
        }

        public ChatRequestParams setResponseStreaming(Boolean responseStreaming) {
            this.responseStreaming = responseStreaming;
            return this;
        }
        public Boolean getResponseStreaming() {
            return this.responseStreaming;
        }

        public ChatRequestParams setTemperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }
        public Float getTemperature() {
            return this.temperature;
        }

        public ChatRequestParams setTopP(Float topP) {
            this.topP = topP;
            return this;
        }
        public Float getTopP() {
            return this.topP;
        }

    }

}
