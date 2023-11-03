// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class GetTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTaskInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInfoResponseBody self = new GetTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskInfoResponseBody setData(GetTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public GetTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskKey")
        public String taskKey;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInfoResponseBodyData self = new GetTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskInfoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskInfoResponseBodyData setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

        public GetTaskInfoResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
