// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CopySceneResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public CopySceneResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CopySceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopySceneResponseBody self = new CopySceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CopySceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CopySceneResponseBody setData(CopySceneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CopySceneResponseBodyData getData() {
        return this.data;
    }

    public CopySceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CopySceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopySceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CopySceneResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static CopySceneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CopySceneResponseBodyData self = new CopySceneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CopySceneResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
