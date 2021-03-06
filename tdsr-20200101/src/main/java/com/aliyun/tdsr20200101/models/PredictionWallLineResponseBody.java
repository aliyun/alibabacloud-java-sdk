// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PredictionWallLineResponseBody extends TeaModel {
    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 任务ID
    @NameInMap("TaskId")
    public String taskId;

    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static PredictionWallLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PredictionWallLineResponseBody self = new PredictionWallLineResponseBody();
        return TeaModel.build(map, self);
    }

    public PredictionWallLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PredictionWallLineResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public PredictionWallLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PredictionWallLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PredictionWallLineResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public PredictionWallLineResponseBody setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
