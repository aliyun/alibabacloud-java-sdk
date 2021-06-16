// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class CreateSessionResponseBody extends TeaModel {
    // ErrorCode
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateSessionResponseBodyData data;

    // 错误信息
    @NameInMap("message")
    public String message;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static CreateSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionResponseBody self = new CreateSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSessionResponseBody setData(CreateSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSessionResponseBodyData getData() {
        return this.data;
    }

    public CreateSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSessionResponseBodyData extends TeaModel {
        // 本地实例ID
        @NameInMap("localInstanceId")
        public String localInstanceId;

        // 远端实例ID
        @NameInMap("remoteInstanceId")
        public String remoteInstanceId;

        // Session ID
        @NameInMap("sessionId")
        public String sessionId;

        // Session名字
        @NameInMap("sessionName")
        public String sessionName;

        public static CreateSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSessionResponseBodyData self = new CreateSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSessionResponseBodyData setLocalInstanceId(String localInstanceId) {
            this.localInstanceId = localInstanceId;
            return this;
        }
        public String getLocalInstanceId() {
            return this.localInstanceId;
        }

        public CreateSessionResponseBodyData setRemoteInstanceId(String remoteInstanceId) {
            this.remoteInstanceId = remoteInstanceId;
            return this;
        }
        public String getRemoteInstanceId() {
            return this.remoteInstanceId;
        }

        public CreateSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreateSessionResponseBodyData setSessionName(String sessionName) {
            this.sessionName = sessionName;
            return this;
        }
        public String getSessionName() {
            return this.sessionName;
        }

    }

}
