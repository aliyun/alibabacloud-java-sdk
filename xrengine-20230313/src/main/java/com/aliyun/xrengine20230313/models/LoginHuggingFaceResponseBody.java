// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LoginHuggingFaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public LoginHuggingFaceResponseBodyData data;

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

    public static LoginHuggingFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoginHuggingFaceResponseBody self = new LoginHuggingFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public LoginHuggingFaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LoginHuggingFaceResponseBody setData(LoginHuggingFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LoginHuggingFaceResponseBodyData getData() {
        return this.data;
    }

    public LoginHuggingFaceResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public LoginHuggingFaceResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public LoginHuggingFaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LoginHuggingFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LoginHuggingFaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LoginHuggingFaceResponseBodyData extends TeaModel {
        @NameInMap("JwtToken")
        public String jwtToken;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("Uid")
        public String uid;

        public static LoginHuggingFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LoginHuggingFaceResponseBodyData self = new LoginHuggingFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LoginHuggingFaceResponseBodyData setJwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }
        public String getJwtToken() {
            return this.jwtToken;
        }

        public LoginHuggingFaceResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public LoginHuggingFaceResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
