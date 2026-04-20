// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetDataChannelCredentialResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataChannelCredentialResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>A8AED3C8-F57B-5D71-9A34-4A170287533F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataChannelCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataChannelCredentialResponseBody self = new GetDataChannelCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataChannelCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataChannelCredentialResponseBody setData(GetDataChannelCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataChannelCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetDataChannelCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataChannelCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataChannelCredentialResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetDataChannelCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataChannelCredentialResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GID_rtc-datachannel@@@*******</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>d4c38420-<strong><strong>-43bc-b001-56bfc274</strong></strong></p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>mqtt.***.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>1774794266093</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>datachannel-hz/****</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <strong>example:</strong>
         * <p>Token|LTAI****|mqtt-***</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetDataChannelCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataChannelCredentialResponseBodyData self = new GetDataChannelCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataChannelCredentialResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetDataChannelCredentialResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDataChannelCredentialResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetDataChannelCredentialResponseBodyData setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public GetDataChannelCredentialResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetDataChannelCredentialResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetDataChannelCredentialResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
