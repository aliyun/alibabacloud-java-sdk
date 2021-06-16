// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class HeartBeatResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public HeartBeatResponseBodyData data;

    // 错误详情
    @NameInMap("message")
    public String message;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static HeartBeatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HeartBeatResponseBody self = new HeartBeatResponseBody();
        return TeaModel.build(map, self);
    }

    public HeartBeatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HeartBeatResponseBody setData(HeartBeatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HeartBeatResponseBodyData getData() {
        return this.data;
    }

    public HeartBeatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HeartBeatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HeartBeatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class HeartBeatResponseBodyData extends TeaModel {
        // session 状态
        @NameInMap("sessionStatus")
        public String sessionStatus;

        public static HeartBeatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HeartBeatResponseBodyData self = new HeartBeatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HeartBeatResponseBodyData setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

    }

}
