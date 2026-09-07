// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListAgentMJobInfoResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Other values indicate failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAgentMJobInfoResponseBodyData> data;

    /**
     * <p>The error message, if an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D10B9203-1A6A-49DA-AE56-4D160DD37DBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false/null: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAgentMJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentMJobInfoResponseBody self = new ListAgentMJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentMJobInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentMJobInfoResponseBody setData(java.util.List<ListAgentMJobInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentMJobInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListAgentMJobInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentMJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentMJobInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentMJobInfoResponseBodyData extends TeaModel {
        /**
         * <p>The end time of the scan range.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26 20:00:00</p>
         */
        @NameInMap("DataEndTime")
        public String dataEndTime;

        /**
         * <p>The start time of the scan range.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26 19:00:00</p>
         */
        @NameInMap("DataStartTime")
        public String dataStartTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The error message, if an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>queing: The task is queued.</li>
         * <li>readyAnalysis: The task is pending analysis.</li>
         * <li>running: The task is running.</li>
         * <li>error: The task failed.</li>
         * <li>finish: The task is complete.</li>
         * <li>fileUploadUser: The user-specified file is uploaded.</li>
         * <li>fileUploadSystem: The system-generated file is uploaded.</li>
         * <li>expired: The task has expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The actual end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26 20:00:00</p>
         */
        @NameInMap("TaskEndTime")
        public String taskEndTime;

        /**
         * <p>The scheduled task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20250728-8B43DF47-24DB-1CED-8D74-2AB204187D45</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The actual start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26 19:00:00</p>
         */
        @NameInMap("TaskStartTime")
        public String taskStartTime;

        public static ListAgentMJobInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentMJobInfoResponseBodyData self = new ListAgentMJobInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentMJobInfoResponseBodyData setDataEndTime(String dataEndTime) {
            this.dataEndTime = dataEndTime;
            return this;
        }
        public String getDataEndTime() {
            return this.dataEndTime;
        }

        public ListAgentMJobInfoResponseBodyData setDataStartTime(String dataStartTime) {
            this.dataStartTime = dataStartTime;
            return this;
        }
        public String getDataStartTime() {
            return this.dataStartTime;
        }

        public ListAgentMJobInfoResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAgentMJobInfoResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAgentMJobInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAgentMJobInfoResponseBodyData setTaskEndTime(String taskEndTime) {
            this.taskEndTime = taskEndTime;
            return this;
        }
        public String getTaskEndTime() {
            return this.taskEndTime;
        }

        public ListAgentMJobInfoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListAgentMJobInfoResponseBodyData setTaskStartTime(String taskStartTime) {
            this.taskStartTime = taskStartTime;
            return this;
        }
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

    }

}
