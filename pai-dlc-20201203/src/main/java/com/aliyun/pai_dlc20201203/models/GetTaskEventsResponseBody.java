// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTaskEventsResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public Integer requestId;

    @NameInMap("Data")
    public GetTaskEventsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetTaskEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskEventsResponseBody self = new GetTaskEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskEventsResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetTaskEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskEventsResponseBody setRequestId(Integer requestId) {
        this.requestId = requestId;
        return this;
    }
    public Integer getRequestId() {
        return this.requestId;
    }

    public GetTaskEventsResponseBody setData(GetTaskEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskEventsResponseBodyData getData() {
        return this.data;
    }

    public GetTaskEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetTaskEventsResponseBodyData extends TeaModel {
        @NameInMap("JobName")
        public String jobName;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("Events")
        public java.util.List<String> events;

        public static GetTaskEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskEventsResponseBodyData self = new GetTaskEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskEventsResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetTaskEventsResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTaskEventsResponseBodyData setEvents(java.util.List<String> events) {
            this.events = events;
            return this;
        }
        public java.util.List<String> getEvents() {
            return this.events;
        }

    }

}
