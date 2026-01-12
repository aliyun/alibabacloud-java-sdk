// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class LoginResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public LoginResponseBodyData data;

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

    public static LoginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoginResponseBody self = new LoginResponseBody();
        return TeaModel.build(map, self);
    }

    public LoginResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LoginResponseBody setData(LoginResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LoginResponseBodyData getData() {
        return this.data;
    }

    public LoginResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public LoginResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public LoginResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LoginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LoginResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LoginResponseBodyData extends TeaModel {
        @NameInMap("JwtToken")
        public String jwtToken;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("Uid")
        public String uid;

        public static LoginResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LoginResponseBodyData self = new LoginResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LoginResponseBodyData setJwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }
        public String getJwtToken() {
            return this.jwtToken;
        }

        public LoginResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public LoginResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
