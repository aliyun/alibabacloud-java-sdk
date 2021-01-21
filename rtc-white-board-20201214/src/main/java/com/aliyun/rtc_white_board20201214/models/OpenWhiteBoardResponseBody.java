// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class OpenWhiteBoardResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Result")
    public OpenWhiteBoardResponseBodyResult result;

    public static OpenWhiteBoardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenWhiteBoardResponseBody self = new OpenWhiteBoardResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenWhiteBoardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenWhiteBoardResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public OpenWhiteBoardResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OpenWhiteBoardResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public OpenWhiteBoardResponseBody setResult(OpenWhiteBoardResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public OpenWhiteBoardResponseBodyResult getResult() {
        return this.result;
    }

    public static class OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("NickPinyin")
        public String nickPinyin;

        @NameInMap("UserId")
        public String userId;

        public static OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo build(java.util.Map<String, ?> map) throws Exception {
            OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo self = new OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo();
            return TeaModel.build(map, self);
        }

        public OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo setNickPinyin(String nickPinyin) {
            this.nickPinyin = nickPinyin;
            return this;
        }
        public String getNickPinyin() {
            return this.nickPinyin;
        }

        public OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class OpenWhiteBoardResponseBodyResultDocumentAccessInfo extends TeaModel {
        @NameInMap("AccessToken")
        public String accessToken;

        @NameInMap("CollabHost")
        public String collabHost;

        @NameInMap("Permission")
        public Long permission;

        @NameInMap("UserInfo")
        public OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo userInfo;

        public static OpenWhiteBoardResponseBodyResultDocumentAccessInfo build(java.util.Map<String, ?> map) throws Exception {
            OpenWhiteBoardResponseBodyResultDocumentAccessInfo self = new OpenWhiteBoardResponseBodyResultDocumentAccessInfo();
            return TeaModel.build(map, self);
        }

        public OpenWhiteBoardResponseBodyResultDocumentAccessInfo setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public OpenWhiteBoardResponseBodyResultDocumentAccessInfo setCollabHost(String collabHost) {
            this.collabHost = collabHost;
            return this;
        }
        public String getCollabHost() {
            return this.collabHost;
        }

        public OpenWhiteBoardResponseBodyResultDocumentAccessInfo setPermission(Long permission) {
            this.permission = permission;
            return this;
        }
        public Long getPermission() {
            return this.permission;
        }

        public OpenWhiteBoardResponseBodyResultDocumentAccessInfo setUserInfo(OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class OpenWhiteBoardResponseBodyResult extends TeaModel {
        @NameInMap("DocumentAccessInfo")
        public OpenWhiteBoardResponseBodyResultDocumentAccessInfo documentAccessInfo;

        public static OpenWhiteBoardResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            OpenWhiteBoardResponseBodyResult self = new OpenWhiteBoardResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public OpenWhiteBoardResponseBodyResult setDocumentAccessInfo(OpenWhiteBoardResponseBodyResultDocumentAccessInfo documentAccessInfo) {
            this.documentAccessInfo = documentAccessInfo;
            return this;
        }
        public OpenWhiteBoardResponseBodyResultDocumentAccessInfo getDocumentAccessInfo() {
            return this.documentAccessInfo;
        }

    }

}
