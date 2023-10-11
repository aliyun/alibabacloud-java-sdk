// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LoginModelScopeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public LoginModelScopeResponseBodyData data;

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

    public static LoginModelScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoginModelScopeResponseBody self = new LoginModelScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public LoginModelScopeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LoginModelScopeResponseBody setData(LoginModelScopeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LoginModelScopeResponseBodyData getData() {
        return this.data;
    }

    public LoginModelScopeResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public LoginModelScopeResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public LoginModelScopeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LoginModelScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LoginModelScopeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LoginModelScopeResponseBodyData extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("JwtToken")
        public String jwtToken;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("Uid")
        public String uid;

        public static LoginModelScopeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LoginModelScopeResponseBodyData self = new LoginModelScopeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LoginModelScopeResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public LoginModelScopeResponseBodyData setJwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }
        public String getJwtToken() {
            return this.jwtToken;
        }

        public LoginModelScopeResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public LoginModelScopeResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
