// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReplicationLinkLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pgm-bp1trqb4p1xd****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Items")
    public java.util.List<DescribeReplicationLinkLogsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>16C62438-491B-5C02-9B49-BA924A1372A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>[Check rds empty]\nCheck rds databases: success\n[Check source connectivity]\nCheck ip connectable: success\nCheck port connectable: success\nCheck database connectable: success\nCheck account replication privilege: success\nCheck account createrole privilege: success\nCheck account monitor privilege: success\n[Check source version]\nCheck major version consistent: success\n[Check source glibc version]\nCheck source glibc version compatible: warning(warning:source glibc version is not compatible with rds pg)\n[Check disk size]\nCheck disk size enough: success\n[Check wal keep size]\nCheck wal keep size large enough: success\n[Check spec params]\nCheck if spec params too large: success\n [Check triggers]\nCheck triggers compatible: success\n[Check user functions]\nCheck user functions compatible: success\n<em>Migrate check success</em></p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>2022-02-25T06:57:41Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2022-03-01T06:39:51Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("ReplicationInfo")
        public String replicationInfo;

        /**
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("ReplicationState")
        public String replicationState;

        /**
         * <strong>example:</strong>
         * <p>testdbuser</p>
         */
        @NameInMap("ReplicatorAccount")
        public String replicatorAccount;

        /**
         * <strong>example:</strong>
         * <p>testpassword</p>
         */
        @NameInMap("ReplicatorPassword")
        public String replicatorPassword;

        /**
         * <strong>example:</strong>
         * <p>pgm-****.pg.rds.aliyuncs.com</p>
         */
        @NameInMap("SourceAddress")
        public String sourceAddress;

        /**
         * <strong>example:</strong>
         * <p>aliyunRDS</p>
         */
        @NameInMap("SourceCategory")
        public String sourceCategory;

        /**
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("SourcePort")
        public Long sourcePort;

        /**
         * <strong>example:</strong>
         * <p>pgm-bp1l4dutw453****</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <strong>example:</strong>
         * <p>8413252</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>increment</p>
         */
        @NameInMap("TaskStage")
        public String taskStage;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>create</p>
         */
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
