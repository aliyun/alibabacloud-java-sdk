// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class CreateTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskResponseBody self = new CreateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTaskResponseBody setData(CreateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTaskResponseBodyData extends TeaModel {
        @NameInMap("MeetingJoinUrl")
        public String meetingJoinUrl;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskKey")
        public String taskKey;

        public static CreateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskResponseBodyData self = new CreateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTaskResponseBodyData setMeetingJoinUrl(String meetingJoinUrl) {
            this.meetingJoinUrl = meetingJoinUrl;
            return this;
        }
        public String getMeetingJoinUrl() {
            return this.meetingJoinUrl;
        }

        public CreateTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateTaskResponseBodyData setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

    }

}
