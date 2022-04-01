// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationTasksResponseBody extends TeaModel {
    // 一次获取的最大记录数。 一次获取的最大记录数。 ```20```
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 下一页TOKEN。 下一页TOKEN。 ```DD6B1B2A-5837-5237-ABE4-FF0C89568980```
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OperationTasks")
    public java.util.List<OperationTasks> operationTasks;

    // 请求ID。 请求ID。 ```DD6B1B2A-5837-5237-ABE4-FF0C8944****```
    @NameInMap("RequestId")
    public String requestId;

    // 记录总数。 记录总数。 ```200```
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListClusterOperationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationTasksResponseBody self = new ListClusterOperationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListClusterOperationTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClusterOperationTasksResponseBody setOperationTasks(java.util.List<OperationTasks> operationTasks) {
        this.operationTasks = operationTasks;
        return this;
    }
    public java.util.List<OperationTasks> getOperationTasks() {
        return this.operationTasks;
    }

    public ListClusterOperationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterOperationTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class OperationTasks extends TeaModel {
        // 结束时间。 结束时间。 ```1592837465784```
        @NameInMap("EndTime")
        public Long endTime;

        // 创建时间。 创建时间。 ```1592837465784```
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // 修改时间。 修改时间。 ```1592837465784```
        @NameInMap("GmtModified")
        public Long gmtModified;

        // 执行节点ID。 执行节点ID。 ```i-xxx```
        @NameInMap("NodeId")
        public String nodeId;

        // 任务ID。 任务ID。 ```1592837465784```
        @NameInMap("OperationTaskId")
        public Long operationTaskId;

        // 任务名称。 任务名称。 ``` Install@Flink@FlinkRunime```
        @NameInMap("OperationTaskName")
        public String operationTaskName;

        // 开始时间。 开始时间。 ```1592837465784```
        @NameInMap("StartTime")
        public Long startTime;

        // 状态。 状态。 ```RUNNING```
        @NameInMap("Status")
        public String status;

        public static OperationTasks build(java.util.Map<String, ?> map) throws Exception {
            OperationTasks self = new OperationTasks();
            return TeaModel.build(map, self);
        }

        public OperationTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public OperationTasks setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public OperationTasks setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public OperationTasks setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public OperationTasks setOperationTaskId(Long operationTaskId) {
            this.operationTaskId = operationTaskId;
            return this;
        }
        public Long getOperationTaskId() {
            return this.operationTaskId;
        }

        public OperationTasks setOperationTaskName(String operationTaskName) {
            this.operationTaskName = operationTaskName;
            return this;
        }
        public String getOperationTaskName() {
            return this.operationTaskName;
        }

        public OperationTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public OperationTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
