// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationPrecheckResultResponseBody extends TeaModel {
    /**
     * <p>The details about the assessment report.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeCloudMigrationPrecheckResultResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7E4A6E1B-789B-5F16-9736-39AA57FC7374</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The content of the assessment report.</p>
         * 
         * <strong>example:</strong>
         * <p>[Check rds empty]\nCheck rds databases: success\n[Check source connectivity]\nCheck ip connectable: success\nCheck port connectable: success\nCheck database connectable: success\nCheck account replication privilege: success\nCheck account createrole privilege: success\nCheck account monitor privilege: success\n[Check source version]\nCheck major version consistent: success\n[Check source glibc version]\nCheck source glibc version compatible: warning(warning:source glibc version is not compatible with rds pg)\n[Check disk size]\nCheck disk size enough: success\n[Check wal keep size]\nCheck wal keep size large enough: success\n[Check spec params]\nCheck if spec params too large: success\n [Check triggers]\nCheck triggers compatible: success\n[Check user functions]\nCheck user functions compatible: success\n<em>Migrate check success</em></p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-25T06:57:41Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-25T06:58:00Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>migratetest</p>
         */
        @NameInMap("SourceAccount")
        public String sourceAccount;

        /**
         * <p>The environment in which the self-managed PostgreSQL instance runs.</p>
         * <ul>
         * <li><strong>idcOnVpc</strong>: The self-managed PostgreSQL instance resides in a data center. The data center can communicate with the VPC to which the ApsaraDB RDS for PostgreSQL instance belongs.</li>
         * <li><strong>ecsOnVpc</strong>: The self-managed PostgreSQL instance resides on an ECS instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecsonvpc</p>
         */
        @NameInMap("SourceCategory")
        public String sourceCategory;

        /**
         * <p>The private IP address that is used to connect to the self-managed PostgreSQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.2.XX.XX</p>
         */
        @NameInMap("SourceIpAddress")
        public String sourceIpAddress;

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("SourcePassword")
        public String sourcePassword;

        /**
         * <p>The port number that is used to connect to the self-managed PostgreSQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("SourcePort")
        public Long sourcePort;

        /**
         * <p>A reserved parameter. The return value of this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TargetEip")
        public String targetEip;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp102g323jd4****</p>
         */
        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>440420798</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>lxbv6rtxno8</p>
         */
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
