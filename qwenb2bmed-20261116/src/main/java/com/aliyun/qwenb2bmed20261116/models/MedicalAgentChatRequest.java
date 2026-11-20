// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261116.models;

import com.aliyun.tea.*;

public class MedicalAgentChatRequest extends TeaModel {
    /**
     * <p>The correlation ID, session, and application identity information for this request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("communication")
    public MedicalAgentChatRequestCommunication communication;

    /**
     * <p>The business data that carries the message for this request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public MedicalAgentChatRequestData data;

    /**
     * <p>The optional extensible JSON object. The directAgent parameter can be omitted or set to med_qa. Other parameters are passed based on the parameters supported by the medical agent.</p>
     */
    @NameInMap("params")
    public MedicalAgentChatRequestParams params;

    public static MedicalAgentChatRequest build(java.util.Map<String, ?> map) throws Exception {
        MedicalAgentChatRequest self = new MedicalAgentChatRequest();
        return TeaModel.build(map, self);
    }

    public MedicalAgentChatRequest setCommunication(MedicalAgentChatRequestCommunication communication) {
        this.communication = communication;
        return this;
    }
    public MedicalAgentChatRequestCommunication getCommunication() {
        return this.communication;
    }

    public MedicalAgentChatRequest setData(MedicalAgentChatRequestData data) {
        this.data = data;
        return this;
    }
    public MedicalAgentChatRequestData getData() {
        return this.data;
    }

    public MedicalAgentChatRequest setParams(MedicalAgentChatRequestParams params) {
        this.params = params;
        return this;
    }
    public MedicalAgentChatRequestParams getParams() {
        return this.params;
    }

    public static class MedicalAgentChatRequestCommunicationUserInfo extends TeaModel {
        /**
         * <p>The terminal device identifier provided by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-device-001</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <p>The business user identifier in the customer application. This is provided based on the user binding or delegation configuration of the business gateway credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
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
         * <p>The name of the business user provided by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample user</p>
         */
        @NameInMap("userName")
        public String userName;

        public static MedicalAgentChatRequestCommunicationUserInfo build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatRequestCommunicationUserInfo self = new MedicalAgentChatRequestCommunicationUserInfo();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatRequestCommunicationUserInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public MedicalAgentChatRequestCommunicationUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public MedicalAgentChatRequestCommunicationUserInfo setUserIp(String userIp) {
            this.userIp = userIp;
            return this;
        }
        public String getUserIp() {
            return this.userIp;
        }

        public MedicalAgentChatRequestCommunicationUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class MedicalAgentChatRequestCommunication extends TeaModel {
        /**
         * <p>The business application ID. This parameter is required if no fixed application is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>your-app-id</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The optional business scenario tag.</p>
         * 
         * <strong>example:</strong>
         * <p>health_qa</p>
         */
        @NameInMap("appScene")
        public String appScene;

        /**
         * <p>The session history owner. This value must be the same as the one used in the first call of the session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLIENT</p>
         */
        @NameInMap("historyOwner")
        public String historyOwner;

        /**
         * <p>The customer business request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The customer session ID. Reuse this ID to continue the conversation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>med-session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The business user and device information provided by the customer. Identity fields are passed based on the configuration of the business gateway credentials.</p>
         */
        @NameInMap("userInfo")
        public MedicalAgentChatRequestCommunicationUserInfo userInfo;

        public static MedicalAgentChatRequestCommunication build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatRequestCommunication self = new MedicalAgentChatRequestCommunication();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatRequestCommunication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public MedicalAgentChatRequestCommunication setAppScene(String appScene) {
            this.appScene = appScene;
            return this;
        }
        public String getAppScene() {
            return this.appScene;
        }

        public MedicalAgentChatRequestCommunication setHistoryOwner(String historyOwner) {
            this.historyOwner = historyOwner;
            return this;
        }
        public String getHistoryOwner() {
            return this.historyOwner;
        }

        public MedicalAgentChatRequestCommunication setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public MedicalAgentChatRequestCommunication setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public MedicalAgentChatRequestCommunication setUserInfo(MedicalAgentChatRequestCommunicationUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public MedicalAgentChatRequestCommunicationUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class MedicalAgentChatRequestDataMessages extends TeaModel {
        /**
         * <p>The string or array of multimodal content blocks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>What does the hemoglobin level in the physical examination report mean?</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The sender of the message. A value of user indicates the business user, and assistant indicates the assistant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static MedicalAgentChatRequestDataMessages build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatRequestDataMessages self = new MedicalAgentChatRequestDataMessages();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatRequestDataMessages setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalAgentChatRequestDataMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class MedicalAgentChatRequestData extends TeaModel {
        /**
         * <p>The list of messages arranged in conversation order. When the history owner is CLIENT, this list can include the session history provided by the client.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("messages")
        public java.util.List<MedicalAgentChatRequestDataMessages> messages;

        public static MedicalAgentChatRequestData build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatRequestData self = new MedicalAgentChatRequestData();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatRequestData setMessages(java.util.List<MedicalAgentChatRequestDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<MedicalAgentChatRequestDataMessages> getMessages() {
            return this.messages;
        }

    }

    public static class MedicalAgentChatRequestParams extends TeaModel {
        /**
         * <p>Specifies whether to enable deep thinking for the medical agent.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deepthink")
        public String deepthink;

        /**
         * <p>This parameter can be omitted. If explicitly provided, the value must be med_qa.</p>
         * 
         * <strong>example:</strong>
         * <p>med_qa</p>
         */
        @NameInMap("directAgent")
        public String directAgent;

        /**
         * <p>The response mode. A value of false returns a complete JSON response, and true returns Server-Sent Events (SSE).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("responseStreaming")
        public Boolean responseStreaming;

        public static MedicalAgentChatRequestParams build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatRequestParams self = new MedicalAgentChatRequestParams();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatRequestParams setDeepthink(String deepthink) {
            this.deepthink = deepthink;
            return this;
        }
        public String getDeepthink() {
            return this.deepthink;
        }

        public MedicalAgentChatRequestParams setDirectAgent(String directAgent) {
            this.directAgent = directAgent;
            return this;
        }
        public String getDirectAgent() {
            return this.directAgent;
        }

        public MedicalAgentChatRequestParams setResponseStreaming(Boolean responseStreaming) {
            this.responseStreaming = responseStreaming;
            return this;
        }
        public Boolean getResponseStreaming() {
            return this.responseStreaming;
        }

    }

}
