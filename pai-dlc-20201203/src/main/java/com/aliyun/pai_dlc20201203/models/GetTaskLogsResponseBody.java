// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTaskLogsResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public Integer requestId;

    @NameInMap("Data")
    public GetTaskLogsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetTaskLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskLogsResponseBody self = new GetTaskLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskLogsResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetTaskLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskLogsResponseBody setRequestId(Integer requestId) {
        this.requestId = requestId;
        return this;
    }
    public Integer getRequestId() {
        return this.requestId;
    }

    public GetTaskLogsResponseBody setData(GetTaskLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskLogsResponseBodyData getData() {
        return this.data;
    }

    public GetTaskLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetTaskLogsResponseBodyData extends TeaModel {
        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Logs")
        public java.util.List<String> logs;

        @NameInMap("TaskName")
        public String taskName;

        public static GetTaskLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskLogsResponseBodyData self = new GetTaskLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskLogsResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetTaskLogsResponseBodyData setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        public GetTaskLogsResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
