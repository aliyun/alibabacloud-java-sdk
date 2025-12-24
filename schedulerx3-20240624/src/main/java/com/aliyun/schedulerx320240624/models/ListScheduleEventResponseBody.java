// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListScheduleEventResponseBody extends TeaModel {
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
    public ListScheduleEventResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B880122A-B0E4-52E8-8F54-87DB7779EB74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListScheduleEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleEventResponseBody self = new ListScheduleEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduleEventResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListScheduleEventResponseBody setData(ListScheduleEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListScheduleEventResponseBodyData getData() {
        return this.data;
    }

    public ListScheduleEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScheduleEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduleEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScheduleEventResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-app</p>
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
         * <p>INFO</p>
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
         * <p>130</p>
         * 
         * <strong>example:</strong>
         * <p>1310630367761285120</p>
         */
        @NameInMap("JobExecutionId")
        public String jobExecutionId;

        /**
         * <strong>example:</strong>
         * <p>test-job</p>
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
         * <p><a href="http://192.168.1.5:9999/">http://192.168.1.5:9999/</a></p>
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

        public static ListScheduleEventResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleEventResponseBodyDataRecords self = new ListScheduleEventResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListScheduleEventResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListScheduleEventResponseBodyDataRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListScheduleEventResponseBodyDataRecords setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public ListScheduleEventResponseBodyDataRecords setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListScheduleEventResponseBodyDataRecords setJobExecutionId(String jobExecutionId) {
            this.jobExecutionId = jobExecutionId;
            return this;
        }
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

        public ListScheduleEventResponseBodyDataRecords setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListScheduleEventResponseBodyDataRecords setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListScheduleEventResponseBodyDataRecords setWorkerAddr(String workerAddr) {
            this.workerAddr = workerAddr;
            return this;
        }
        public String getWorkerAddr() {
            return this.workerAddr;
        }

        public ListScheduleEventResponseBodyDataRecords setWorkflowExecutionId(String workflowExecutionId) {
            this.workflowExecutionId = workflowExecutionId;
            return this;
        }
        public String getWorkflowExecutionId() {
            return this.workflowExecutionId;
        }

        public ListScheduleEventResponseBodyDataRecords setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

    public static class ListScheduleEventResponseBodyData extends TeaModel {
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

        @NameInMap("Records")
        public java.util.List<ListScheduleEventResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListScheduleEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleEventResponseBodyData self = new ListScheduleEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListScheduleEventResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListScheduleEventResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListScheduleEventResponseBodyData setRecords(java.util.List<ListScheduleEventResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListScheduleEventResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListScheduleEventResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
