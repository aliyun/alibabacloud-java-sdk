// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSubSceneTaskStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("List")
    public java.util.List<GetSubSceneTaskStatusResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSubSceneTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubSceneTaskStatusResponseBody self = new GetSubSceneTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubSceneTaskStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSubSceneTaskStatusResponseBody setList(java.util.List<GetSubSceneTaskStatusResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GetSubSceneTaskStatusResponseBodyList> getList() {
        return this.list;
    }

    public GetSubSceneTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubSceneTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubSceneTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubSceneTaskStatusResponseBodyList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Id")
        public String id;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubSceneId")
        public String subSceneId;

        @NameInMap("Type")
        public String type;

        public static GetSubSceneTaskStatusResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            GetSubSceneTaskStatusResponseBodyList self = new GetSubSceneTaskStatusResponseBodyList();
            return TeaModel.build(map, self);
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

        public GetSubSceneTaskStatusResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubSceneTaskStatusResponseBodyList setSubSceneId(String subSceneId) {
            this.subSceneId = subSceneId;
            return this;
        }
        public String getSubSceneId() {
            return this.subSceneId;
        }

        public GetSubSceneTaskStatusResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
