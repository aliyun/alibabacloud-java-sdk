// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationPrecheckResultResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeCloudMigrationPrecheckResultResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalSize")
    public Integer totalSize;

    public static DescribeCloudMigrationPrecheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMigrationPrecheckResultResponseBody self = new DescribeCloudMigrationPrecheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMigrationPrecheckResultResponseBody setItems(java.util.List<DescribeCloudMigrationPrecheckResultResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCloudMigrationPrecheckResultResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeCloudMigrationPrecheckResultResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudMigrationPrecheckResultResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudMigrationPrecheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudMigrationPrecheckResultResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class DescribeCloudMigrationPrecheckResultResponseBodyItems extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

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

        @NameInMap("TargetEip")
        public String targetEip;

        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static DescribeCloudMigrationPrecheckResultResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudMigrationPrecheckResultResponseBodyItems self = new DescribeCloudMigrationPrecheckResultResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setSourceAccount(String sourceAccount) {
            this.sourceAccount = sourceAccount;
            return this;
        }
        public String getSourceAccount() {
            return this.sourceAccount;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setSourceCategory(String sourceCategory) {
            this.sourceCategory = sourceCategory;
            return this;
        }
        public String getSourceCategory() {
            return this.sourceCategory;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setSourceIpAddress(String sourceIpAddress) {
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }
        public String getSourceIpAddress() {
            return this.sourceIpAddress;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setSourcePassword(String sourcePassword) {
            this.sourcePassword = sourcePassword;
            return this;
        }
        public String getSourcePassword() {
            return this.sourcePassword;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setSourcePort(Long sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public Long getSourcePort() {
            return this.sourcePort;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setTargetEip(String targetEip) {
            this.targetEip = targetEip;
            return this;
        }
        public String getTargetEip() {
            return this.targetEip;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeCloudMigrationPrecheckResultResponseBodyItems setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
