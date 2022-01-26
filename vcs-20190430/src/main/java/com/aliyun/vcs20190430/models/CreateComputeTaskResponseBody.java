// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class CreateComputeTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateComputeTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateComputeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskResponseBody self = new CreateComputeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateComputeTaskResponseBody setData(CreateComputeTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateComputeTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateComputeTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateComputeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateComputeTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static CreateComputeTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeTaskResponseBodyData self = new CreateComputeTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateComputeTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
