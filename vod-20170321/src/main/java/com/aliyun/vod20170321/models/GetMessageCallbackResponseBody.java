// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackResponseBody extends TeaModel {
    /**
     * <p>The cryptographic key. This parameter is returned only for HTTP callbacks.</p>
     */
    @NameInMap("MessageCallback")
    public GetMessageCallbackResponseBodyMessageCallback messageCallback;

    /**
     * <p>The name of the MNS queue. This parameter is returned only for MNS callbacks.</p>
     */
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
        /**
         * <p>The operation that you want to perform. Set the value to **GetMessageCallback**.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Queries the callback method, callback URL, and event type of an event notification.</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        @NameInMap("AuthSwitch")
        public String authSwitch;

        /**
         * <p>Indicates whether callback authentication is enabled. This parameter is returned only for HTTP callbacks. Valid values:</p>
         * <br>
         * <p>*   **on**: indicates that authentication is enabled.</p>
         * <p>*   **off**: indicates that authentication is disabled.</p>
         */
        @NameInMap("CallbackType")
        public String callbackType;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("EventTypeList")
        public String eventTypeList;

        @NameInMap("MnsEndpoint")
        public String mnsEndpoint;

        /**
         * <p>The callback URL. This parameter is returned only for HTTP callbacks.</p>
         */
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
