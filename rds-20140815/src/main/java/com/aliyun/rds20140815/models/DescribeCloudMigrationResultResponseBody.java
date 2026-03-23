// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationResultResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeCloudMigrationResultResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Detail")
        public String detail;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MigrateStage")
        public String migrateStage;

        @NameInMap("ReplicationInfo")
        public String replicationInfo;

        @NameInMap("ReplicationState")
        public String replicationState;

        @NameInMap("SourceAccount")
        public String sourceAccount;

        @NameInMap("SourceCategory")
        public String sourceCategory;

        @NameInMap("SourceIpAddress")
        public String sourceIpAddress;

        @NameInMap("SourcePassword")
        public String sourcePassword;

        @NameInMap("SourcePort")
        public Long sourcePort;

        @NameInMap("SwitchTime")
        public String switchTime;

        @NameInMap("TargetEip")
        public String targetEip;

        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        @NameInMap("TaskId")
        public Long taskId;

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
