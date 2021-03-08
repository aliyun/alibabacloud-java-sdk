// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageCallback")
    public GetMessageCallbackResponseBodyMessageCallback messageCallback;

    public static GetMessageCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCallbackResponseBody self = new GetMessageCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessageCallbackResponseBody setMessageCallback(GetMessageCallbackResponseBodyMessageCallback messageCallback) {
        this.messageCallback = messageCallback;
        return this;
    }
    public GetMessageCallbackResponseBodyMessageCallback getMessageCallback() {
        return this.messageCallback;
    }

    public static class GetMessageCallbackResponseBodyMessageCallback extends TeaModel {
        @NameInMap("CallbackType")
        public String callbackType;

        @NameInMap("CallbackURL")
        public String callbackURL;

        @NameInMap("EventTypeList")
        public String eventTypeList;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("MnsQueueName")
        public String mnsQueueName;

        @NameInMap("AuthKey")
        public String authKey;

        @NameInMap("AuthSwitch")
        public String authSwitch;

        @NameInMap("MnsEndpoint")
        public String mnsEndpoint;

        public static GetMessageCallbackResponseBodyMessageCallback build(java.util.Map<String, ?> map) throws Exception {
            GetMessageCallbackResponseBodyMessageCallback self = new GetMessageCallbackResponseBodyMessageCallback();
            return TeaModel.build(map, self);
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

        public GetMessageCallbackResponseBodyMessageCallback setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetMessageCallbackResponseBodyMessageCallback setMnsQueueName(String mnsQueueName) {
            this.mnsQueueName = mnsQueueName;
            return this;
        }
        public String getMnsQueueName() {
            return this.mnsQueueName;
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

        public GetMessageCallbackResponseBodyMessageCallback setMnsEndpoint(String mnsEndpoint) {
            this.mnsEndpoint = mnsEndpoint;
            return this;
        }
        public String getMnsEndpoint() {
            return this.mnsEndpoint;
        }

    }

}
