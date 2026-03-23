// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReplicationLinkLogsResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Items")
    public java.util.List<DescribeReplicationLinkLogsResponseBodyItems> items;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalSize")
    public Integer totalSize;

    public static DescribeReplicationLinkLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationLinkLogsResponseBody self = new DescribeReplicationLinkLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationLinkLogsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeReplicationLinkLogsResponseBody setItems(java.util.List<DescribeReplicationLinkLogsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeReplicationLinkLogsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeReplicationLinkLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReplicationLinkLogsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class DescribeReplicationLinkLogsResponseBodyItems extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ReplicationInfo")
        public String replicationInfo;

        @NameInMap("ReplicationState")
        public String replicationState;

        @NameInMap("ReplicatorAccount")
        public String replicatorAccount;

        @NameInMap("ReplicatorPassword")
        public String replicatorPassword;

        @NameInMap("SourceAddress")
        public String sourceAddress;

        @NameInMap("SourceCategory")
        public String sourceCategory;

        @NameInMap("SourcePort")
        public Long sourcePort;

        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStage")
        public String taskStage;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskType")
        public String taskType;

        public static DescribeReplicationLinkLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationLinkLogsResponseBodyItems self = new DescribeReplicationLinkLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationLinkLogsResponseBodyItems setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setReplicationInfo(String replicationInfo) {
            this.replicationInfo = replicationInfo;
            return this;
        }
        public String getReplicationInfo() {
            return this.replicationInfo;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setReplicationState(String replicationState) {
            this.replicationState = replicationState;
            return this;
        }
        public String getReplicationState() {
            return this.replicationState;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setReplicatorAccount(String replicatorAccount) {
            this.replicatorAccount = replicatorAccount;
            return this;
        }
        public String getReplicatorAccount() {
            return this.replicatorAccount;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setReplicatorPassword(String replicatorPassword) {
            this.replicatorPassword = replicatorPassword;
            return this;
        }
        public String getReplicatorPassword() {
            return this.replicatorPassword;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setSourceAddress(String sourceAddress) {
            this.sourceAddress = sourceAddress;
            return this;
        }
        public String getSourceAddress() {
            return this.sourceAddress;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setSourceCategory(String sourceCategory) {
            this.sourceCategory = sourceCategory;
            return this;
        }
        public String getSourceCategory() {
            return this.sourceCategory;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setSourcePort(Long sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public Long getSourcePort() {
            return this.sourcePort;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setTaskStage(String taskStage) {
            this.taskStage = taskStage;
            return this;
        }
        public String getTaskStage() {
            return this.taskStage;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeReplicationLinkLogsResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
