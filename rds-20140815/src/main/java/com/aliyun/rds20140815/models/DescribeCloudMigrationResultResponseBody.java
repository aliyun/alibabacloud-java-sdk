// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationResultResponseBody extends TeaModel {
    /**
     * <p>The details about the cloud migration task.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeCloudMigrationResultResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    public static DescribeCloudMigrationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMigrationResultResponseBody self = new DescribeCloudMigrationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMigrationResultResponseBody setItems(java.util.List<DescribeCloudMigrationResultResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCloudMigrationResultResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeCloudMigrationResultResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudMigrationResultResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudMigrationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudMigrationResultResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class DescribeCloudMigrationResultResponseBodyItems extends TeaModel {
        /**
         * <p>The details about the migration task.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the task was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The migration phase of the migration task.</p>
         * <br>
         * <p>*   **precheck**: precheck</p>
         * <p>*   **basebackup**: full data backup</p>
         * <p>*   **startup**: link establishment</p>
         * <p>*   **increment**: incremental data synchronization</p>
         * <p>*   **switch**: cloud migration-triggered switchover</p>
         * <p>*   **success**: cloud migration completed</p>
         */
        @NameInMap("MigrateStage")
        public String migrateStage;

        /**
         * <p>The information about the replication link.</p>
         */
        @NameInMap("ReplicationInfo")
        public String replicationInfo;

        /**
         * <p>The status of data replication.</p>
         * <br>
         * <p>*   **unstarted**</p>
         * <p>*   **catchup**</p>
         * <p>*   **streaming**</p>
         * <p>*   **disconnect**</p>
         * <p>*   **finish**</p>
         */
        @NameInMap("ReplicationState")
        public String replicationState;

        /**
         * <p>The username.</p>
         */
        @NameInMap("SourceAccount")
        public String sourceAccount;

        /**
         * <p>The environment in which the self-managed PostgreSQL instance runs.</p>
         * <br>
         * <p>*   **idcOnVpc**: The self-managed PostgreSQL instance resides in a data center. The data center can communicate with the VPC to which the ApsaraDB RDS for PostgreSQL instance belongs.</p>
         * <p>*   **ecsOnVpc**: The self-managed PostgreSQL instance resides on an ECS instance.</p>
         */
        @NameInMap("SourceCategory")
        public String sourceCategory;

        /**
         * <p>The private IP address that is used to connect to the self-managed PostgreSQL instance.</p>
         */
        @NameInMap("SourceIpAddress")
        public String sourceIpAddress;

        /**
         * <p>The password.</p>
         */
        @NameInMap("SourcePassword")
        public String sourcePassword;

        /**
         * <p>The port number that is used to connect to the self-managed PostgreSQL instance.</p>
         */
        @NameInMap("SourcePort")
        public Long sourcePort;

        /**
         * <p>The time when the switchover was performed.</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>A reserved parameter. The return value of this parameter is empty.</p>
         */
        @NameInMap("TargetEip")
        public String targetEip;

        /**
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The task name.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static DescribeCloudMigrationResultResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudMigrationResultResponseBodyItems self = new DescribeCloudMigrationResultResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCloudMigrationResultResponseBodyItems setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeCloudMigrationResultResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCloudMigrationResultResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCloudMigrationResultResponseBodyItems setMigrateStage(String migrateStage) {
            this.migrateStage = migrateStage;
            return this;
        }
        public String getMigrateStage() {
            return this.migrateStage;
        }

        public DescribeCloudMigrationResultResponseBodyItems setReplicationInfo(String replicationInfo) {
            this.replicationInfo = replicationInfo;
            return this;
        }
        public String getReplicationInfo() {
            return this.replicationInfo;
        }

        public DescribeCloudMigrationResultResponseBodyItems setReplicationState(String replicationState) {
            this.replicationState = replicationState;
            return this;
        }
        public String getReplicationState() {
            return this.replicationState;
        }

        public DescribeCloudMigrationResultResponseBodyItems setSourceAccount(String sourceAccount) {
            this.sourceAccount = sourceAccount;
            return this;
        }
        public String getSourceAccount() {
            return this.sourceAccount;
        }

        public DescribeCloudMigrationResultResponseBodyItems setSourceCategory(String sourceCategory) {
            this.sourceCategory = sourceCategory;
            return this;
        }
        public String getSourceCategory() {
            return this.sourceCategory;
        }

        public DescribeCloudMigrationResultResponseBodyItems setSourceIpAddress(String sourceIpAddress) {
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }
        public String getSourceIpAddress() {
            return this.sourceIpAddress;
        }

        public DescribeCloudMigrationResultResponseBodyItems setSourcePassword(String sourcePassword) {
            this.sourcePassword = sourcePassword;
            return this;
        }
        public String getSourcePassword() {
            return this.sourcePassword;
        }

        public DescribeCloudMigrationResultResponseBodyItems setSourcePort(Long sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public Long getSourcePort() {
            return this.sourcePort;
        }

        public DescribeCloudMigrationResultResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribeCloudMigrationResultResponseBodyItems setTargetEip(String targetEip) {
            this.targetEip = targetEip;
            return this;
        }
        public String getTargetEip() {
            return this.targetEip;
        }

        public DescribeCloudMigrationResultResponseBodyItems setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public DescribeCloudMigrationResultResponseBodyItems setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeCloudMigrationResultResponseBodyItems setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
