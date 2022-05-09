// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PackSceneResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public PackSceneResponseBodyData data;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static PackSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PackSceneResponseBody self = new PackSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public PackSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public PackSceneResponseBody setData(PackSceneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PackSceneResponseBodyData getData() {
        return this.data;
    }

    public PackSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PackSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PackSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PackSceneResponseBodyData extends TeaModel {
        // 任务ID
        @NameInMap("TaskId")
        public String taskId;

        public static PackSceneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PackSceneResponseBodyData self = new PackSceneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PackSceneResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
