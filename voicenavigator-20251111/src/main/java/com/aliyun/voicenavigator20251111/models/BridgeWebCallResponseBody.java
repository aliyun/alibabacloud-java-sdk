// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class BridgeWebCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BridgeWebCallResponseBodyData data;

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
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BridgeWebCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BridgeWebCallResponseBody self = new BridgeWebCallResponseBody();
        return TeaModel.build(map, self);
    }

    public BridgeWebCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BridgeWebCallResponseBody setData(BridgeWebCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BridgeWebCallResponseBodyData getData() {
        return this.data;
    }

    public BridgeWebCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BridgeWebCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BridgeWebCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public BridgeWebCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BridgeWebCallResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1515602866088888___5ec8446df1e2495a97969e887ab9e748</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>1774794266093</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <strong>example:</strong>
         * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <strong>example:</strong>
         * <p>f814f3ae-b2a7-44fb-883c-771221274673</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>token</p>
         * 
         * <strong>example:</strong>
         * <p>57aa3e9b11d2fa5736787cacf0408c1a</p>
         */
        @NameInMap("Token")
        public String token;

        public static BridgeWebCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BridgeWebCallResponseBodyData self = new BridgeWebCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BridgeWebCallResponseBodyData setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public BridgeWebCallResponseBodyData setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public BridgeWebCallResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BridgeWebCallResponseBodyData setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public BridgeWebCallResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public BridgeWebCallResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
