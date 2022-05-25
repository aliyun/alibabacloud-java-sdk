// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PackSourceResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public PackSourceResponseBodyData data;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static PackSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PackSourceResponseBody self = new PackSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public PackSourceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public PackSourceResponseBody setData(PackSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PackSourceResponseBodyData getData() {
        return this.data;
    }

    public PackSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PackSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PackSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PackSourceResponseBodyData extends TeaModel {
        // 任务ID
        @NameInMap("TaskId")
        public String taskId;

        public static PackSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PackSourceResponseBodyData self = new PackSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PackSourceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
