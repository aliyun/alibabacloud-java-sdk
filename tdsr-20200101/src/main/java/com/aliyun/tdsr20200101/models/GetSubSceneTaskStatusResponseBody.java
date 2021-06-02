// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSubSceneTaskStatusResponseBody extends TeaModel {
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

    // 任务信息
    @NameInMap("List")
    public java.util.List<GetSubSceneTaskStatusResponseBodyList> list;

    public static GetSubSceneTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubSceneTaskStatusResponseBody self = new GetSubSceneTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubSceneTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubSceneTaskStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSubSceneTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSubSceneTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubSceneTaskStatusResponseBody setList(java.util.List<GetSubSceneTaskStatusResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GetSubSceneTaskStatusResponseBodyList> getList() {
        return this.list;
    }

    public static class GetSubSceneTaskStatusResponseBodyList extends TeaModel {
        // 任务ID
        @NameInMap("Id")
        public String id;

        // 场景ID
        @NameInMap("SceneId")
        public String sceneId;

        // 子场景ID
        @NameInMap("SubSceneId")
        public String subSceneId;

        // 未开始  init 处理中   processing   失败     failure  完成     succeed  取消     canceled
        @NameInMap("Status")
        public String status;

        // 墙线预测: wall_line   切图: cut_image 重建: build  直角优化：right_angle_optimization 其他：other
        @NameInMap("Type")
        public String type;

        // 任务失败错误码
        @NameInMap("ErrorCode")
        public String errorCode;

        // 任务失败错误信息
        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static GetSubSceneTaskStatusResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            GetSubSceneTaskStatusResponseBodyList self = new GetSubSceneTaskStatusResponseBodyList();
            return TeaModel.build(map, self);
        }

        public GetSubSceneTaskStatusResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSubSceneTaskStatusResponseBodyList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public GetSubSceneTaskStatusResponseBodyList setSubSceneId(String subSceneId) {
            this.subSceneId = subSceneId;
            return this;
        }
        public String getSubSceneId() {
            return this.subSceneId;
        }

        public GetSubSceneTaskStatusResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubSceneTaskStatusResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSubSceneTaskStatusResponseBodyList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetSubSceneTaskStatusResponseBodyList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

}
