// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class DeleteSessionResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public DeleteSessionResponseBodyData data;

    // 错误详情
    @NameInMap("message")
    public String message;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static DeleteSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSessionResponseBody self = new DeleteSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSessionResponseBody setData(DeleteSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSessionResponseBodyData getData() {
        return this.data;
    }

    public DeleteSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteSessionResponseBodyData extends TeaModel {
        // session ID
        @NameInMap("sessionId")
        public String sessionId;

        public static DeleteSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSessionResponseBodyData self = new DeleteSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
