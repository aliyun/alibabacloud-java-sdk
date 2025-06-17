// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetWebshellTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetWebshellTokenResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static GetWebshellTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebshellTokenResponseBody self = new GetWebshellTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebshellTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWebshellTokenResponseBody setData(GetWebshellTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWebshellTokenResponseBodyData getData() {
        return this.data;
    }

    public GetWebshellTokenResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWebshellTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWebshellTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebshellTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWebshellTokenResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetWebshellTokenResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HttpUrl :  &quot;<a href="https://saenext.console.aliyun.com/cn-shenzhen/app-list/app1/micro-app/shell/pod1?tokenId=xxx">https://saenext.console.aliyun.com/cn-shenzhen/app-list/app1/micro-app/shell/pod1?tokenId=xxx</a></p>
         */
        @NameInMap("HttpUrl")
        public String httpUrl;

        /**
         * <strong>example:</strong>
         * <p>zWWpvRj_5pzof4hfo7-hGynM8oGMmO_7</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <strong>example:</strong>
         * <p>wss://sae-webshell.console.aliyun.com/websocket/eamWebshell?tokenId=xxx&amp;region=cn-shenzhen</p>
         */
        @NameInMap("WebSocketUrl")
        public String webSocketUrl;

        public static GetWebshellTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWebshellTokenResponseBodyData self = new GetWebshellTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWebshellTokenResponseBodyData setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public GetWebshellTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetWebshellTokenResponseBodyData setWebSocketUrl(String webSocketUrl) {
            this.webSocketUrl = webSocketUrl;
            return this;
        }
        public String getWebSocketUrl() {
            return this.webSocketUrl;
        }

    }

}
