// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInstanceListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the job instances.</p>
     */
    @NameInMap("Data")
    public GetJobInstanceListResponseBodyData data;

    /**
     * <p>The error message that is returned only if the corresponding error occurs.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetJobInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceListResponseBody self = new GetJobInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJobInstanceListResponseBody setData(GetJobInstanceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobInstanceListResponseBodyData getData() {
        return this.data;
    }

    public GetJobInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobInstanceListResponseBodyDataJobInstanceDetails extends TeaModel {
        /**
         * <p>The data timestamp of the job instance.</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <p>The end time of the job execution.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The user who executes the job.</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <p>The job instance ID.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The job ID.</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The progress of the job instance.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The execution results of the job instance.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The time when the job was scheduled to run.</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The start time of the job execution.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the job instance. Valid values:</p>
         * <br>
         * <p>*   **1**: The job instance is waiting for execution.</p>
         * <p>*   **3**: The job instance is running.</p>
         * <p>*   **4**: The job instance is successful.</p>
         * <p>*   **5**: The job instance failed.</p>
         * <p>*   **9**: The job instance is rejected.</p>
         * <br>
         * <p>Enumeration class: com.alibaba.schedulerx.common.domain.InstanceStatus</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The method that is used to specify the time when to schedule the job instance. Valid values:</p>
         * <br>
         * <p>*   **1**: cron</p>
         * <p>*   **3**: fix_rate</p>
         * <p>*   **4**: second_delay</p>
         * <p>*   **100**: api</p>
         * <br>
         * <p>Enumeration class: com.alibaba.schedulerx.common.domain.TimeType</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        /**
         * <p>The trigger type of the job instance. Valid values:</p>
         * <br>
         * <p>*   **1**: The job instance was triggered at the scheduled time.</p>
         * <p>*   **2**: The job instance was triggered due to data updates.</p>
         * <p>*   **3**: The job instance was triggered by an API call.</p>
         * <p>*   **4**: The job instance was triggered because it is manually rerun.</p>
         * <p>*   **5**: The job instance was triggered because the system automatically reruns the job instance upon a system exception, such as a database exception.</p>
         * <br>
         * <p>Enumeration class: com.alibaba.schedulerx.common.domain.TriggerType</p>
         */
        @NameInMap("TriggerType")
        public Integer triggerType;

        /**
         * <p>The endpoint of the triggered client. The value is in the IP address:Port number format.</p>
         */
        @NameInMap("WorkAddr")
        public String workAddr;

        public static GetJobInstanceListResponseBodyDataJobInstanceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceListResponseBodyDataJobInstanceDetails self = new GetJobInstanceListResponseBodyDataJobInstanceDetails();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setTriggerType(Integer triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Integer getTriggerType() {
            return this.triggerType;
        }

        public GetJobInstanceListResponseBodyDataJobInstanceDetails setWorkAddr(String workAddr) {
            this.workAddr = workAddr;
            return this;
        }
        public String getWorkAddr() {
            return this.workAddr;
        }

    }

    public static class GetJobInstanceListResponseBodyData extends TeaModel {
        /**
         * <p>The details of the job instance.</p>
         */
        @NameInMap("JobInstanceDetails")
        public java.util.List<GetJobInstanceListResponseBodyDataJobInstanceDetails> jobInstanceDetails;

        public static GetJobInstanceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceListResponseBodyData self = new GetJobInstanceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceListResponseBodyData setJobInstanceDetails(java.util.List<GetJobInstanceListResponseBodyDataJobInstanceDetails> jobInstanceDetails) {
            this.jobInstanceDetails = jobInstanceDetails;
            return this;
        }
        public java.util.List<GetJobInstanceListResponseBodyDataJobInstanceDetails> getJobInstanceDetails() {
            return this.jobInstanceDetails;
        }

    }

}
