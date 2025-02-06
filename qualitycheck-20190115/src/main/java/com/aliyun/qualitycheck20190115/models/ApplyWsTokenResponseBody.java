// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ApplyWsTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ApplyWsTokenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6987D326-83D9-4A42-B9A5-0B27F9B40539</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyWsTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyWsTokenResponseBody self = new ApplyWsTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyWsTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyWsTokenResponseBody setData(ApplyWsTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApplyWsTokenResponseBodyData getData() {
        return this.data;
    }

    public ApplyWsTokenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ApplyWsTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ApplyWsTokenResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>42e59bcd-7206-44c5-ad34-525d364687c4</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>5607b21d1728700640</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <strong>example:</strong>
         * <p>wss://ws-gateway-real-voice.aliyuncs.com</p>
         */
        @NameInMap("WsEndpoint")
        public String wsEndpoint;

        public static ApplyWsTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyWsTokenResponseBodyData self = new ApplyWsTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyWsTokenResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ApplyWsTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ApplyWsTokenResponseBodyData setWsEndpoint(String wsEndpoint) {
            this.wsEndpoint = wsEndpoint;
            return this;
        }
        public String getWsEndpoint() {
            return this.wsEndpoint;
        }

    }

}
