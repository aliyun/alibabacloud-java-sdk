// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261116.models;

import com.aliyun.tea.*;

public class MedicalModelInferenceRequest extends TeaModel {
    /**
     * <p>The association ID, session, and application identity information for the current request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("communication")
    public MedicalModelInferenceRequestCommunication communication;

    /**
     * <p>The business data that carries the messages for the current request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public MedicalModelInferenceRequestData data;

    /**
     * <p>The extensible JSON object. The modelName parameter is required and its value must be an activated model selector. The directAgent parameter cannot be passed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("params")
    public MedicalModelInferenceRequestParams params;

    public static MedicalModelInferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        MedicalModelInferenceRequest self = new MedicalModelInferenceRequest();
        return TeaModel.build(map, self);
    }

    public MedicalModelInferenceRequest setCommunication(MedicalModelInferenceRequestCommunication communication) {
        this.communication = communication;
        return this;
    }
    public MedicalModelInferenceRequestCommunication getCommunication() {
        return this.communication;
    }

    public MedicalModelInferenceRequest setData(MedicalModelInferenceRequestData data) {
        this.data = data;
        return this;
    }
    public MedicalModelInferenceRequestData getData() {
        return this.data;
    }

    public MedicalModelInferenceRequest setParams(MedicalModelInferenceRequestParams params) {
        this.params = params;
        return this;
    }
    public MedicalModelInferenceRequestParams getParams() {
        return this.params;
    }

    public static class MedicalModelInferenceRequestCommunicationUserInfo extends TeaModel {
        /**
         * <p>The terminal device identifier provided by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-device-001</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <p>The business user identifier in the customer application. This value is provided based on the user binding or delegation configuration of the business gateway credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The business user IP address provided by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.10</p>
         */
        @NameInMap("userIp")
        public String userIp;

        /**
         * <p>The business user name provided by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample user</p>
         */
        @NameInMap("userName")
        public String userName;

        public static MedicalModelInferenceRequestCommunicationUserInfo build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceRequestCommunicationUserInfo self = new MedicalModelInferenceRequestCommunicationUserInfo();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceRequestCommunicationUserInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public MedicalModelInferenceRequestCommunicationUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public MedicalModelInferenceRequestCommunicationUserInfo setUserIp(String userIp) {
            this.userIp = userIp;
            return this;
        }
        public String getUserIp() {
            return this.userIp;
        }

        public MedicalModelInferenceRequestCommunicationUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class MedicalModelInferenceRequestCommunication extends TeaModel {
        /**
         * <p>The business application ID. This parameter is required when no fixed application is configured.</p>
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
         * <p>The host of the session history. This value must be the same as the value specified in the first call of the session.</p>
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
         * <p>The customer session ID, which is reused for continued conversations.</p>
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
        public MedicalModelInferenceRequestCommunicationUserInfo userInfo;

        public static MedicalModelInferenceRequestCommunication build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceRequestCommunication self = new MedicalModelInferenceRequestCommunication();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceRequestCommunication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public MedicalModelInferenceRequestCommunication setAppScene(String appScene) {
            this.appScene = appScene;
            return this;
        }
        public String getAppScene() {
            return this.appScene;
        }

        public MedicalModelInferenceRequestCommunication setHistoryOwner(String historyOwner) {
            this.historyOwner = historyOwner;
            return this;
        }
        public String getHistoryOwner() {
            return this.historyOwner;
        }

        public MedicalModelInferenceRequestCommunication setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public MedicalModelInferenceRequestCommunication setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public MedicalModelInferenceRequestCommunication setUserInfo(MedicalModelInferenceRequestCommunicationUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public MedicalModelInferenceRequestCommunicationUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class MedicalModelInferenceRequestDataMessages extends TeaModel {
        /**
         * <p>The string or array of multimodal content blocks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>What does hemoglobin mean in the physical examination report?</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The sender of the message. A value of user indicates the business user, and a value of assistant indicates the assistant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static MedicalModelInferenceRequestDataMessages build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceRequestDataMessages self = new MedicalModelInferenceRequestDataMessages();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceRequestDataMessages setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalModelInferenceRequestDataMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class MedicalModelInferenceRequestData extends TeaModel {
        /**
         * <p>The list of messages arranged in conversation order. When hosted by the client, this list can include the session history provided by the client.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("messages")
        public java.util.List<MedicalModelInferenceRequestDataMessages> messages;

        public static MedicalModelInferenceRequestData build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceRequestData self = new MedicalModelInferenceRequestData();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceRequestData setMessages(java.util.List<MedicalModelInferenceRequestDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<MedicalModelInferenceRequestDataMessages> getMessages() {
            return this.messages;
        }

    }

    public static class MedicalModelInferenceRequestParams extends TeaModel {
        /**
         * <p>Required. The model selector for this medical API is med_qwen4-vl-125.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>med_qwen4-vl-125</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The response mode. A value of false indicates that a complete JSON object is returned. A value of true indicates that Server-Sent Events (SSE) is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("responseStreaming")
        public Boolean responseStreaming;

        public static MedicalModelInferenceRequestParams build(java.util.Map<String, ?> map) throws Exception {
            MedicalModelInferenceRequestParams self = new MedicalModelInferenceRequestParams();
            return TeaModel.build(map, self);
        }

        public MedicalModelInferenceRequestParams setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public MedicalModelInferenceRequestParams setResponseStreaming(Boolean responseStreaming) {
            this.responseStreaming = responseStreaming;
            return this;
        }
        public Boolean getResponseStreaming() {
            return this.responseStreaming;
        }

    }

}
