// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class OpenWhiteBoardResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 请求结果
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // 返回结果体
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
        // 用户头像的URL
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        // 用户昵称
        @NameInMap("Nick")
        public String nick;

        // 用户的拼音昵称
        @NameInMap("NickPinyin")
        public String nickPinyin;

        // 打开白板的用户ID
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
        // 连接签名
        @NameInMap("AccessToken")
        public String accessToken;

        // 白板长连接地址
        @NameInMap("CollabHost")
        public String collabHost;

        // 权限码，取值：0:无权限，1:只读，2:读写
        @NameInMap("Permission")
        public Long permission;

        // 用户信息
        @NameInMap("UserInfo")
        public OpenWhiteBoardResponseBodyResultDocumentAccessInfoUserInfo userInfo;

        // 新协议长连接服务域名
        @NameInMap("WsDomain")
        public String wsDomain;

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

        public OpenWhiteBoardResponseBodyResultDocumentAccessInfo setWsDomain(String wsDomain) {
            this.wsDomain = wsDomain;
            return this;
        }
        public String getWsDomain() {
            return this.wsDomain;
        }

    }

    public static class OpenWhiteBoardResponseBodyResult extends TeaModel {
        // 白板连接信息
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
