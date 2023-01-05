// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetTaskByUuidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Task")
    public GetTaskByUuidResponseBodyTask task;

    public static GetTaskByUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskByUuidResponseBody self = new GetTaskByUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskByUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskByUuidResponseBody setTask(GetTaskByUuidResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskByUuidResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskByUuidResponseBodyTask extends TeaModel {
        @NameInMap("ActualTime")
        public Long actualTime;

        @NameInMap("CallId")
        public String callId;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("EndReason")
        public Integer endReason;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PlannedTime")
        public Long plannedTime;

        public static GetTaskByUuidResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskByUuidResponseBodyTask self = new GetTaskByUuidResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskByUuidResponseBodyTask setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public GetTaskByUuidResponseBodyTask setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetTaskByUuidResponseBodyTask setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public GetTaskByUuidResponseBodyTask setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public GetTaskByUuidResponseBodyTask setEndReason(Integer endReason) {
            this.endReason = endReason;
            return this;
        }
        public Integer getEndReason() {
            return this.endReason;
        }

        public GetTaskByUuidResponseBodyTask setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetTaskByUuidResponseBodyTask setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTaskByUuidResponseBodyTask setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTaskByUuidResponseBodyTask setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public GetTaskByUuidResponseBodyTask setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetTaskByUuidResponseBodyTask setPlannedTime(Long plannedTime) {
            this.plannedTime = plannedTime;
            return this;
        }
        public Long getPlannedTime() {
            return this.plannedTime;
        }

    }

}
