// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetPackSceneTaskStatusResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetPackSceneTaskStatusResponseBodyData data;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static GetPackSceneTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPackSceneTaskStatusResponseBody self = new GetPackSceneTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPackSceneTaskStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetPackSceneTaskStatusResponseBody setData(GetPackSceneTaskStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPackSceneTaskStatusResponseBodyData getData() {
        return this.data;
    }

    public GetPackSceneTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPackSceneTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPackSceneTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPackSceneTaskStatusResponseBodyData extends TeaModel {
        // 任务进度
        @NameInMap("Progress")
        public String progress;

        // 任务状态
        @NameInMap("Status")
        public String status;

        public static GetPackSceneTaskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPackSceneTaskStatusResponseBodyData self = new GetPackSceneTaskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPackSceneTaskStatusResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetPackSceneTaskStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
