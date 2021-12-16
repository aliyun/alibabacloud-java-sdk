// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAuthInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAuthInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAuthInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthInfoResponseBody self = new GetAuthInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAuthInfoResponseBody setData(GetAuthInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAuthInfoResponseBodyData getData() {
        return this.data;
    }

    public GetAuthInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAuthInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAuthInfoResponseBodyData extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Code")
        public String code;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Time")
        public Long time;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static GetAuthInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAuthInfoResponseBodyData self = new GetAuthInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAuthInfoResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public GetAuthInfoResponseBodyData setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetAuthInfoResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAuthInfoResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAuthInfoResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetAuthInfoResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetAuthInfoResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetAuthInfoResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetAuthInfoResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
