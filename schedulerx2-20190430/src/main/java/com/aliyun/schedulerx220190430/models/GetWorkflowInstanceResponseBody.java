// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the workflow instance.</p>
     */
    @NameInMap("Data")
    public GetWorkflowInstanceResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>workflowId=xxx is not existed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The upstream job instance of the current job instance. The value 0 indicates that the upstream job instance is the root node.</p>
         * 
         * <strong>example:</strong>
         * <p>24058798</p>
         */
        @NameInMap("Source")
        public Long source;

        /**
         * <p>The downstream job instance of the current job instance.</p>
         * 
         * <strong>example:</strong>
         * <p>24058796</p>
         */
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
        /**
         * <p>The number of retries when the job instance failed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Attempt")
        public Integer attempt;

        /**
         * <p>The data timestamp of the job instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:00</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <p>The time when the job instance stopped running.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:21</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1472</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The job instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24058796</p>
         */
        @NameInMap("JobInstanceId")
        public Long jobInstanceId;

        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The state of the job instance.</p>
         * 
         * <strong>example:</strong>
         * <p>code=200</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The time when the job instance was scheduled to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:03</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The time when the job instance started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:03</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The server on which the job instance was run.</p>
         * 
         * <strong>example:</strong>
         * <p>10.163.0.101:34027</p>
         */
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

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
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

        public GetWorkflowInstanceResponseBodyDataWfInstanceDagNodes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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
        /**
         * <p>The dependencies between job instances.</p>
         */
        @NameInMap("Edges")
        public java.util.List<GetWorkflowInstanceResponseBodyDataWfInstanceDagEdges> edges;

        /**
         * <p>The job instances.</p>
         */
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
        /**
         * <p>The data timestamp of the workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:00</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <p>The time when the workflow instance stopped running.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:21</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the workflow instance was scheduled to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:00</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The time when the workflow instance started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:01</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the workflow instance. Valid values:</p>
         * <ul>
         * <li>1: pending</li>
         * <li>2: preparing</li>
         * <li>3: running</li>
         * <li>4: successful</li>
         * <li>5: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <p>The directed acyclic graph (DAG) of the workflow instance, including job instances and dependencies.</p>
         */
        @NameInMap("WfInstanceDag")
        public GetWorkflowInstanceResponseBodyDataWfInstanceDag wfInstanceDag;

        /**
         * <p>The details of the workflow instance, including the state of the workflow instance, the time when the workflow instance started to run, the time when the workflow instance stopped running, the state of each job instance, and the dependencies between job instances.</p>
         */
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
