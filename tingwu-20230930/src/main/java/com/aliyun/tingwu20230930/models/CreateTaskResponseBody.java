// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class CreateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>35124E1C-AE99-5D6C-A52E-BD689D8D****</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>c5394c6ee0fb474899d42215a3925c7e</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>task_tingwu_123</p>
         */
        @NameInMap("TaskKey")
        public String taskKey;

        @NameInMap("TaskStatus")
        public String taskStatus;

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

        public CreateTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
