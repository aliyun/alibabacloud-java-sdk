// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetWorkflowInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceResponseBody self = new GetWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWorkflowInstanceResponseBody setData(GetWorkflowInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkflowInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetWorkflowInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges extends TeaModel {
        @NameInMap("Source")
        public Long source;

        @NameInMap("Target")
        public Long target;

        public static GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges self = new GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges setSource(Long source) {
            this.source = source;
            return this;
        }
        public Long getSource() {
            return this.source;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

    }

    public static class GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes extends TeaModel {
        @NameInMap("Attempt")
        public Integer attempt;

        @NameInMap("DataTime")
        public String dataTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobInstanceId")
        public Long jobInstanceId;

        @NameInMap("Result")
        public String result;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("WorkAddr")
        public String workAddr;

        public static GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes self = new GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }
        public Integer getAttempt() {
            return this.attempt;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setJobInstanceId(Long jobInstanceId) {
            this.jobInstanceId = jobInstanceId;
            return this;
        }
        public Long getJobInstanceId() {
            return this.jobInstanceId;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setWorkAddr(String workAddr) {
            this.workAddr = workAddr;
            return this;
        }
        public String getWorkAddr() {
            return this.workAddr;
        }

    }

    public static class GetWorkflowInstanceResponseBodyDataWfInstanceDag extends TeaModel {
        @NameInMap("Edges")
        public java.util.List<GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges> edges;

        @NameInMap("Nodes")
        public java.util.List<GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes> nodes;

        public static GetWorkflowInstanceResponseBodyDataWfInstanceDag build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyDataWfInstanceDag self = new GetWorkflowInstanceResponseBodyDataWfInstanceDag();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDag setEdges(java.util.List<GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges> getEdges() {
            return this.edges;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceDag setNodes(java.util.List<GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class GetWorkflowInstanceResponseBodyDataWfInstanceInfo extends TeaModel {
        @NameInMap("DataTime")
        public String dataTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        public static GetWorkflowInstanceResponseBodyDataWfInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyDataWfInstanceInfo self = new GetWorkflowInstanceResponseBodyDataWfInstanceInfo();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceInfo setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceInfo setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetWorkflowInstanceResponseBodyDataWfInstanceInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetWorkflowInstanceResponseBodyData extends TeaModel {
        @NameInMap("WfInstanceDag")
        public GetWorkflowInstanceResponseBodyDataWfInstanceDag wfInstanceDag;

        @NameInMap("WfInstanceInfo")
        public GetWorkflowInstanceResponseBodyDataWfInstanceInfo wfInstanceInfo;

        public static GetWorkflowInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyData self = new GetWorkflowInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyData setWfInstanceDag(GetWorkflowInstanceResponseBodyDataWfInstanceDag wfInstanceDag) {
            this.wfInstanceDag = wfInstanceDag;
            return this;
        }
        public GetWorkflowInstanceResponseBodyDataWfInstanceDag getWfInstanceDag() {
            return this.wfInstanceDag;
        }

        public GetWorkflowInstanceResponseBodyData setWfInstanceInfo(GetWorkflowInstanceResponseBodyDataWfInstanceInfo wfInstanceInfo) {
            this.wfInstanceInfo = wfInstanceInfo;
            return this;
        }
        public GetWorkflowInstanceResponseBodyDataWfInstanceInfo getWfInstanceInfo() {
            return this.wfInstanceInfo;
        }

    }

}
