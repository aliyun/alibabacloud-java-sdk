// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSceneBuildTaskStatusResponseBody extends TeaModel {
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
    @NameInMap("Id")
    public String id;

    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    // 未开始  init 处理中 失败     failure   processing  完成     succeed 取消     canceled
    @NameInMap("Status")
    public String status;

    // 墙线预测: wall_line  切图: cut_image  重建: build  直角优化：right_angle_optimization 其他：other
    @NameInMap("Type")
    public String type;

    // 任务失败错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 任务失败错误消息
    @NameInMap("ErrorMsg")
    public String errorMsg;

    public static GetSceneBuildTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSceneBuildTaskStatusResponseBody self = new GetSceneBuildTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSceneBuildTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSceneBuildTaskStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSceneBuildTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSceneBuildTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSceneBuildTaskStatusResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetSceneBuildTaskStatusResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public GetSceneBuildTaskStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSceneBuildTaskStatusResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetSceneBuildTaskStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSceneBuildTaskStatusResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
