// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInstanceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the job instance.</p>
     */
    @NameInMap("Data")
    public GetJobInstanceResponseBodyData data;

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

    public static GetJobInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceResponseBody self = new GetJobInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJobInstanceResponseBody setData(GetJobInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetJobInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobInstanceResponseBodyDataJobInstanceDetail extends TeaModel {
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

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Parameters")
        public String parameters;

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

        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>The trigger type of the job instance. Valid values:</p>
         * <br>
         * <p>*   **1**: The job instance was triggered at the scheduled time.</p>
         * <p>*   **2**: The job instance was triggered due to data update.</p>
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

        public static GetJobInstanceResponseBodyDataJobInstanceDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceResponseBodyDataJobInstanceDetail self = new GetJobInstanceResponseBodyDataJobInstanceDetail();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setTriggerType(Integer triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Integer getTriggerType() {
            return this.triggerType;
        }

        public GetJobInstanceResponseBodyDataJobInstanceDetail setWorkAddr(String workAddr) {
            this.workAddr = workAddr;
            return this;
        }
        public String getWorkAddr() {
            return this.workAddr;
        }

    }

    public static class GetJobInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The details of the job instance.</p>
         */
        @NameInMap("JobInstanceDetail")
        public GetJobInstanceResponseBodyDataJobInstanceDetail jobInstanceDetail;

        public static GetJobInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceResponseBodyData self = new GetJobInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceResponseBodyData setJobInstanceDetail(GetJobInstanceResponseBodyDataJobInstanceDetail jobInstanceDetail) {
            this.jobInstanceDetail = jobInstanceDetail;
            return this;
        }
        public GetJobInstanceResponseBodyDataJobInstanceDetail getJobInstanceDetail() {
            return this.jobInstanceDetail;
        }

    }

}
