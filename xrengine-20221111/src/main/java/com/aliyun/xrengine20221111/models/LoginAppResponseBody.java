// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class LoginAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public LoginAppResponseBodyData data;

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

    public static LoginAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoginAppResponseBody self = new LoginAppResponseBody();
        return TeaModel.build(map, self);
    }

    public LoginAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LoginAppResponseBody setData(LoginAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LoginAppResponseBodyData getData() {
        return this.data;
    }

    public LoginAppResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public LoginAppResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public LoginAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LoginAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LoginAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LoginAppResponseBodyData extends TeaModel {
        @NameInMap("JwtToken")
        public String jwtToken;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("Uid")
        public String uid;

        public static LoginAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LoginAppResponseBodyData self = new LoginAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LoginAppResponseBodyData setJwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }
        public String getJwtToken() {
            return this.jwtToken;
        }

        public LoginAppResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public LoginAppResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
