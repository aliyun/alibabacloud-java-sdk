// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetCopySceneTaskStatusResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetCopySceneTaskStatusResponseBodyData data;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static GetCopySceneTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCopySceneTaskStatusResponseBody self = new GetCopySceneTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCopySceneTaskStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetCopySceneTaskStatusResponseBody setData(GetCopySceneTaskStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCopySceneTaskStatusResponseBodyData getData() {
        return this.data;
    }

    public GetCopySceneTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCopySceneTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCopySceneTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCopySceneTaskStatusResponseBodyData extends TeaModel {
        // 任务进度
        @NameInMap("Progress")
        public Long progress;

        // 任务状态
        @NameInMap("Status")
        public String status;

        public static GetCopySceneTaskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCopySceneTaskStatusResponseBodyData self = new GetCopySceneTaskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCopySceneTaskStatusResponseBodyData setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public GetCopySceneTaskStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
