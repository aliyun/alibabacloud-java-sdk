// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInstanceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>jobid: 92583 not match groupId: testSchedulerx.defaultGroup</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F68ABED-AC31-4412-9297-D9A8F0401108</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>2020-07-27 11:52:10</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <p>The end time of the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-27 11:52:10</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The user who executes the job.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <p>The job instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11111111</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>92583</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The progress of the job instance.</p>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The execution results of the job instance.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The time when the job was scheduled to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-27 11:52:10</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The start time of the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-27 11:52:10</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the job instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The job instance is waiting for execution.</li>
         * <li><strong>3</strong>: The job instance is running.</li>
         * <li><strong>4</strong>: The job instance is successful.</li>
         * <li><strong>5</strong>: The job instance failed.</li>
         * <li><strong>9</strong>: The job instance is rejected.</li>
         * </ul>
         * <p>Enumeration class: com.alibaba.schedulerx.common.domain.InstanceStatus</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The method that is used to specify the time when to schedule the job instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: cron</li>
         * <li><strong>3</strong>: fix_rate</li>
         * <li><strong>4</strong>: second_delay</li>
         * <li><strong>100</strong>: api</li>
         * </ul>
         * <p>Enumeration class: com.alibaba.schedulerx.common.domain.TimeType</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>The trigger type of the job instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The job instance was triggered at the scheduled time.</li>
         * <li><strong>2</strong>: The job instance was triggered due to data update.</li>
         * <li><strong>3</strong>: The job instance was triggered by an API call.</li>
         * <li><strong>4</strong>: The job instance was triggered because it is manually rerun.</li>
         * <li><strong>5</strong>: The job instance was triggered because the system automatically reruns the job instance upon a system exception, such as a database exception.</li>
         * </ul>
         * <p>Enumeration class: com.alibaba.schedulerx.common.domain.TriggerType</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TriggerType")
        public Integer triggerType;

        /**
         * <p>The endpoint of the triggered client. The value is in the IP address:Port number format.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0:16</p>
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
