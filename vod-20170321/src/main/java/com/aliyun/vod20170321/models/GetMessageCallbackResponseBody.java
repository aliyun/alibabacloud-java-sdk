// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackResponseBody extends TeaModel {
    /**
     * <p>The configuration of the event notification.</p>
     */
    @NameInMap("MessageCallback")
    public GetMessageCallbackResponseBodyMessageCallback messageCallback;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The cryptographic key. This parameter is returned only for HTTP callbacks.</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>Indicates whether callback authentication is enabled. This parameter is returned only for HTTP callbacks. Valid values:</p>
         * <br>
         * <p>*   **on**</p>
         * <p>*   **off**</p>
         */
        @NameInMap("AuthSwitch")
        public String authSwitch;

        /**
         * <p>The callback method. Valid values:</p>
         * <br>
         * <p>*   **HTTP**</p>
         * <p>*   **MNS**</p>
         */
        @NameInMap("CallbackType")
        public String callbackType;

        /**
         * <p>The callback URL. This parameter is returned only for HTTP callbacks.</p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <p>The type of the callback event.</p>
         */
        @NameInMap("EventTypeList")
        public String eventTypeList;

        /**
         * <p>The public endpoint of MNS. This parameter is returned only for MNS callbacks.</p>
         */
        @NameInMap("MnsEndpoint")
        public String mnsEndpoint;

        /**
         * <p>The name of the Message Service (MNS) queue. This parameter is returned only for MNS callbacks.</p>
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
