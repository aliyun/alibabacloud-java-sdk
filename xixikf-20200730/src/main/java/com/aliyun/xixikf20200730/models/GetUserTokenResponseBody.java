// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetUserTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUserTokenResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenResponseBody self = new GetUserTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserTokenResponseBody setData(GetUserTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserTokenResponseBodyData getData() {
        return this.data;
    }

    public GetUserTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserTokenResponseBodyData extends TeaModel {
        @NameInMap("Expires")
        public Long expires;

        @NameInMap("Token")
        public String token;

        public static GetUserTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserTokenResponseBodyData self = new GetUserTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserTokenResponseBodyData setExpires(Long expires) {
            this.expires = expires;
            return this;
        }
        public Long getExpires() {
            return this.expires;
        }

        public GetUserTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
