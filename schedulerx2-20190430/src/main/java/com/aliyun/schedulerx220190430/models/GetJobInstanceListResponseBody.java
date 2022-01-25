// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInstanceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetJobInstanceListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
