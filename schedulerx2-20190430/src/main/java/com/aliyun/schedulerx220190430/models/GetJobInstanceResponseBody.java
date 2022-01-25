// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetJobInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DataTime")
        public String dataTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Executor")
        public String executor;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Result")
        public String result;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TimeType")
        public Integer timeType;

        @NameInMap("TriggerType")
        public Integer triggerType;

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
