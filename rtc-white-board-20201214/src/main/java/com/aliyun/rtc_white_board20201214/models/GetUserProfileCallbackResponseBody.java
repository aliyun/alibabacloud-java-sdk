// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class GetUserProfileCallbackResponseBody extends TeaModel {
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
    public GetUserProfileCallbackResponseBodyResult result;

    public static GetUserProfileCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserProfileCallbackResponseBody self = new GetUserProfileCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserProfileCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserProfileCallbackResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public GetUserProfileCallbackResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserProfileCallbackResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetUserProfileCallbackResponseBody setResult(GetUserProfileCallbackResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetUserProfileCallbackResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetUserProfileCallbackResponseBodyResultUserProfileList extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("NickPinyin")
        public String nickPinyin;

        public static GetUserProfileCallbackResponseBodyResultUserProfileList build(java.util.Map<String, ?> map) throws Exception {
            GetUserProfileCallbackResponseBodyResultUserProfileList self = new GetUserProfileCallbackResponseBodyResultUserProfileList();
            return TeaModel.build(map, self);
        }

        public GetUserProfileCallbackResponseBodyResultUserProfileList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserProfileCallbackResponseBodyResultUserProfileList setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetUserProfileCallbackResponseBodyResultUserProfileList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetUserProfileCallbackResponseBodyResultUserProfileList setNickPinyin(String nickPinyin) {
            this.nickPinyin = nickPinyin;
            return this;
        }
        public String getNickPinyin() {
            return this.nickPinyin;
        }

    }

    public static class GetUserProfileCallbackResponseBodyResult extends TeaModel {
        @NameInMap("UserProfileList")
        public java.util.List<GetUserProfileCallbackResponseBodyResultUserProfileList> userProfileList;

        public static GetUserProfileCallbackResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserProfileCallbackResponseBodyResult self = new GetUserProfileCallbackResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetUserProfileCallbackResponseBodyResult setUserProfileList(java.util.List<GetUserProfileCallbackResponseBodyResultUserProfileList> userProfileList) {
            this.userProfileList = userProfileList;
            return this;
        }
        public java.util.List<GetUserProfileCallbackResponseBodyResultUserProfileList> getUserProfileList() {
            return this.userProfileList;
        }

    }

}
