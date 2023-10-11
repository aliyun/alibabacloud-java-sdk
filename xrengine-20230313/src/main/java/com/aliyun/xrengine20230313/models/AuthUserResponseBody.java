// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class AuthUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AuthUserResponseBodyData data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AuthUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthUserResponseBody self = new AuthUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AuthUserResponseBody setData(AuthUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AuthUserResponseBodyData getData() {
        return this.data;
    }

    public AuthUserResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public AuthUserResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public AuthUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AuthUserResponseBodyData extends TeaModel {
        @NameInMap("JwtToken")
        public String jwtToken;

        @NameInMap("Type")
        public String type;

        public static AuthUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AuthUserResponseBodyData self = new AuthUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AuthUserResponseBodyData setJwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }
        public String getJwtToken() {
            return this.jwtToken;
        }

        public AuthUserResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
