// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class OptimizeRightAngleResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 任务ID
    @NameInMap("TaskId")
    public String taskId;

    public static OptimizeRightAngleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OptimizeRightAngleResponseBody self = new OptimizeRightAngleResponseBody();
        return TeaModel.build(map, self);
    }

    public OptimizeRightAngleResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public OptimizeRightAngleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OptimizeRightAngleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OptimizeRightAngleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OptimizeRightAngleResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
