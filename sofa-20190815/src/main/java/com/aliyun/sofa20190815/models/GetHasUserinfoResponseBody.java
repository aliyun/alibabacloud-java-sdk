// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasUserinfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasUserinfoResponseBodyResultContent resultContent;

    public static GetHasUserinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasUserinfoResponseBody self = new GetHasUserinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasUserinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasUserinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasUserinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasUserinfoResponseBody setResultContent(GetHasUserinfoResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasUserinfoResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasUserinfoResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("UserType")
        public String userType;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("LastLoginTime")
        public Long lastLoginTime;

        @NameInMap("RecentOperationTime")
        public Long recentOperationTime;

        public static GetHasUserinfoResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasUserinfoResponseBodyResultContentData self = new GetHasUserinfoResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasUserinfoResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHasUserinfoResponseBodyResultContentData setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetHasUserinfoResponseBodyResultContentData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetHasUserinfoResponseBodyResultContentData setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public GetHasUserinfoResponseBodyResultContentData setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetHasUserinfoResponseBodyResultContentData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetHasUserinfoResponseBodyResultContentData setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public GetHasUserinfoResponseBodyResultContentData setLastLoginTime(Long lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public Long getLastLoginTime() {
            return this.lastLoginTime;
        }

        public GetHasUserinfoResponseBodyResultContentData setRecentOperationTime(Long recentOperationTime) {
            this.recentOperationTime = recentOperationTime;
            return this;
        }
        public Long getRecentOperationTime() {
            return this.recentOperationTime;
        }

    }

    public static class GetHasUserinfoResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static GetHasUserinfoResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasUserinfoResponseBodyResultContentTopErrorCode self = new GetHasUserinfoResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasUserinfoResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasUserinfoResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasUserinfoResponseBodyResultContentTopErrorReason self = new GetHasUserinfoResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasUserinfoResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasUserinfoResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasUserinfoResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasUserinfoResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasUserinfoResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasUserinfoResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasUserinfoResponseBodyResultContent self = new GetHasUserinfoResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasUserinfoResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasUserinfoResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasUserinfoResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasUserinfoResponseBodyResultContent setData(GetHasUserinfoResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasUserinfoResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasUserinfoResponseBodyResultContent setTopErrorCode(GetHasUserinfoResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasUserinfoResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasUserinfoResponseBodyResultContent setTopErrorReason(GetHasUserinfoResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasUserinfoResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
