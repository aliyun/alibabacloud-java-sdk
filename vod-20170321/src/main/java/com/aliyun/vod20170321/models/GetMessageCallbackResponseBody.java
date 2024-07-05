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
     * 
     * <strong>example:</strong>
     * <p>272A222A-F7F7-4A3E-****-F531574F1234</p>
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
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The cryptographic key. This parameter is returned only for HTTP callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678abc</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>Indicates whether callback authentication is enabled. This parameter is returned only for HTTP callbacks. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AuthSwitch")
        public String authSwitch;

        /**
         * <p>The callback method. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong></li>
         * <li><strong>MNS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("CallbackType")
        public String callbackType;

        /**
         * <p>The callback URL. This parameter is returned only for HTTP callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test.com/test">http://test.com/test</a></p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <p>The type of the callback event.</p>
         * 
         * <strong>example:</strong>
         * <p>FileUploadComplete,StreamTranscodeComplete,TranscodeComplete,SnapshotComplete,AIComplete,AddLiveRecordVideoComplete,CreateAuditComplete,UploadByURLComplete,ProduceMediaComplete,LiveRecordVideoComposeStart,ImageUploadComplete,VideoAnalysisComplete</p>
         */
        @NameInMap("EventTypeList")
        public String eventTypeList;

        /**
         * <p>The public endpoint of MNS. This parameter is returned only for MNS callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://1234567.mns.cn-shanghai-internal.aliyuncs.com/">http://1234567.mns.cn-shanghai-internal.aliyuncs.com/</a></p>
         */
        @NameInMap("MnsEndpoint")
        public String mnsEndpoint;

        /**
         * <p>The name of the Message Service (MNS) queue. This parameter is returned only for MNS callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p>vodcallback</p>
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
