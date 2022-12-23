// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackResponseBody extends TeaModel {
    // The configuration of the event notification.
    @NameInMap("MessageCallback")
    public GetMessageCallbackResponseBodyMessageCallback messageCallback;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetMessageCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCallbackResponseBody self = new GetMessageCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageCallbackResponseBody setMessageCallback(GetMessageCallbackResponseBodyMessageCallback messageCallback) {
        this.messageCallback = messageCallback;
        return this;
    }
    public GetMessageCallbackResponseBodyMessageCallback getMessageCallback() {
        return this.messageCallback;
    }

    public GetMessageCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMessageCallbackResponseBodyMessageCallback extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The cryptographic key. This parameter is returned only for HTTP callbacks.
        @NameInMap("AuthKey")
        public String authKey;

        // Indicates whether callback authentication is enabled. This parameter is returned only for HTTP callbacks. Valid values:
        // 
        // *   **on**: indicates that authentication is enabled.
        // *   **off**: indicates that authentication is disabled.
        @NameInMap("AuthSwitch")
        public String authSwitch;

        // The callback method. Valid values:
        // 
        // *   **HTTP**
        // *   **MNS**
        @NameInMap("CallbackType")
        public String callbackType;

        // The callback URL. This parameter is returned only for HTTP callbacks.
        @NameInMap("CallbackURL")
        public String callbackURL;

        // The type of the callback event.
        @NameInMap("EventTypeList")
        public String eventTypeList;

        // The public endpoint of Message Service (MNS). This parameter is returned only for MNS callbacks.
        @NameInMap("MnsEndpoint")
        public String mnsEndpoint;

        // The name of the MNS queue. This parameter is returned only for MNS callbacks.
        @NameInMap("MnsQueueName")
        public String mnsQueueName;

        public static GetMessageCallbackResponseBodyMessageCallback build(java.util.Map<String, ?> map) throws Exception {
            GetMessageCallbackResponseBodyMessageCallback self = new GetMessageCallbackResponseBodyMessageCallback();
            return TeaModel.build(map, self);
        }

        public GetMessageCallbackResponseBodyMessageCallback setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetMessageCallbackResponseBodyMessageCallback setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public GetMessageCallbackResponseBodyMessageCallback setAuthSwitch(String authSwitch) {
            this.authSwitch = authSwitch;
            return this;
        }
        public String getAuthSwitch() {
            return this.authSwitch;
        }

        public GetMessageCallbackResponseBodyMessageCallback setCallbackType(String callbackType) {
            this.callbackType = callbackType;
            return this;
        }
        public String getCallbackType() {
            return this.callbackType;
        }

        public GetMessageCallbackResponseBodyMessageCallback setCallbackURL(String callbackURL) {
            this.callbackURL = callbackURL;
            return this;
        }
        public String getCallbackURL() {
            return this.callbackURL;
        }

        public GetMessageCallbackResponseBodyMessageCallback setEventTypeList(String eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public String getEventTypeList() {
            return this.eventTypeList;
        }

        public GetMessageCallbackResponseBodyMessageCallback setMnsEndpoint(String mnsEndpoint) {
            this.mnsEndpoint = mnsEndpoint;
            return this;
        }
        public String getMnsEndpoint() {
            return this.mnsEndpoint;
        }

        public GetMessageCallbackResponseBodyMessageCallback setMnsQueueName(String mnsQueueName) {
            this.mnsQueueName = mnsQueueName;
            return this;
        }
        public String getMnsQueueName() {
            return this.mnsQueueName;
        }

    }

}
