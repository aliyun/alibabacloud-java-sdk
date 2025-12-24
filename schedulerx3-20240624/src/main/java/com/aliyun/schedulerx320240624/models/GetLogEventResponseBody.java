// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetLogEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public GetLogEventResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BAC1ADB5-EEB5-5834-93D8-522E067AF8D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLogEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogEventResponseBody self = new GetLogEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogEventResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLogEventResponseBody setData(GetLogEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLogEventResponseBodyData getData() {
        return this.data;
    }

    public GetLogEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLogEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLogEventResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>portal-dev</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>hello word</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>JOB</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("JobExecutionId")
        public String jobExecutionId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>2024-10-31 16:43:51</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:030225016025_9357_60125@127.0.0.1">030225016025_9357_60125@127.0.0.1</a>:51363</p>
         */
        @NameInMap("WorkerAddr")
        public String workerAddr;

        /**
         * <strong>example:</strong>
         * <p>1450568762586578000</p>
         */
        @NameInMap("WorkflowExecutionId")
        public String workflowExecutionId;

        /**
         * <strong>example:</strong>
         * <p>工作流0001</p>
         */
        @NameInMap("WorkflowName")
        public String workflowName;

        public static GetLogEventResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetLogEventResponseBodyDataRecords self = new GetLogEventResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetLogEventResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLogEventResponseBodyDataRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetLogEventResponseBodyDataRecords setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetLogEventResponseBodyDataRecords setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetLogEventResponseBodyDataRecords setJobExecutionId(String jobExecutionId) {
            this.jobExecutionId = jobExecutionId;
            return this;
        }
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

        public GetLogEventResponseBodyDataRecords setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetLogEventResponseBodyDataRecords setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetLogEventResponseBodyDataRecords setWorkerAddr(String workerAddr) {
            this.workerAddr = workerAddr;
            return this;
        }
        public String getWorkerAddr() {
            return this.workerAddr;
        }

        public GetLogEventResponseBodyDataRecords setWorkflowExecutionId(String workflowExecutionId) {
            this.workflowExecutionId = workflowExecutionId;
            return this;
        }
        public String getWorkflowExecutionId() {
            return this.workflowExecutionId;
        }

        public GetLogEventResponseBodyDataRecords setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

    public static class GetLogEventResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<GetLogEventResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetLogEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLogEventResponseBodyData self = new GetLogEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLogEventResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetLogEventResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetLogEventResponseBodyData setRecords(java.util.List<GetLogEventResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetLogEventResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetLogEventResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
