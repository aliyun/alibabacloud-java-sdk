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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>1B983C48-9793-5EAA-8F7F-00EAEC517675</p>
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
         * 
         * <strong>example:</strong>
         * <p>[Check rds empty]\nCheck rds databases: success\n[Check source connectivity]\nCheck ip connectable: success\nCheck port connectable: success\nCheck database connectable: success\nCheck account replication privilege: success\nCheck account createrole privilege: success\nCheck account monitor privilege: success\n[Check source version]\nCheck major version consistent: success\n[Check source glibc version]\nCheck source glibc version compatible: warning(warning:source glibc version is not compatible with rds pg)\n[Check disk size]\nCheck disk size enough: success\n[Check wal keep size]\nCheck wal keep size large enough: success\n[Check spec params]\nCheck if spec params too large: success\n[Start RDS instance]\n2022-02-25 17:00:29 --- Start RDS instance as slave for data replication\n[Synchronize data]\n2022-02-25 17:01:05 --- Synchronize data from source to RDS by streaming replication \n</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-25T08:53:13Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-01T06:39:51Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The migration phase of the migration task.</p>
         * <ul>
         * <li><strong>precheck</strong>: precheck</li>
         * <li><strong>basebackup</strong>: full data backup</li>
         * <li><strong>startup</strong>: link establishment</li>
         * <li><strong>increment</strong>: incremental data synchronization</li>
         * <li><strong>switch</strong>: cloud migration-triggered switchover</li>
         * <li><strong>success</strong>: cloud migration completed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>switch</p>
         */
        @NameInMap("MigrateStage")
        public String migrateStage;

        /**
         * <p>The information about the replication link.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Status\&quot;:\&quot;streaming\&quot;,\&quot;ReceiveStartLsn\&quot;:\&quot;0/3000000\&quot;,\&quot;ReceivedTli\&quot;:\&quot;1\&quot;,\&quot;LatestEndTime\&quot;:\&quot;2022-02-25 17:03:59.3344+08\&quot;,\&quot;Synced\&quot;:\&quot;true\&quot;,\&quot;IsSlave\&quot;:\&quot;true\&quot;,\&quot;ReplayTimestamp\&quot;:\&quot;null\&quot;,\&quot;LastMsgSendTime\&quot;:\&quot;2022-03-01 14:42:57.967537+08\&quot;,\&quot;Conninfo\&quot;:\&quot;user=migratetest password=******** channel_binding=prefer dbname=replication host=172.16.254.203 port=5432 application_name=rds_db_instance fallback_application_name=walreceiver sslmode=prefer sslcompression=1 sslsni=1 ssl_min_protocol_version=TLSv1.2 gssencmode=prefer krbsrvname=postgres target_session_attrs=any\&quot;,\&quot;LastMsgReceiptTime\&quot;:\&quot;2022-03-01 14:42:57.96727+08\&quot;,\&quot;LatestEndLsn\&quot;:\&quot;0/3000148\&quot;,\&quot;ReceivedLsn\&quot;:\&quot;0/3000148\&quot;,\&quot;ReplayLsn\&quot;:\&quot;0/3000148\&quot;,\&quot;ReceiveStartTli\&quot;:\&quot;1\&quot;,\&quot;ReplayLag\&quot;:\&quot;0\&quot;}</p>
         */
        @NameInMap("ReplicationInfo")
        public String replicationInfo;

        /**
         * <p>The status of data replication.</p>
         * <ul>
         * <li><strong>unstarted</strong></li>
         * <li><strong>catchup</strong></li>
         * <li><strong>streaming</strong></li>
         * <li><strong>disconnect</strong></li>
         * <li><strong>finish</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>streaming</p>
         */
        @NameInMap("ReplicationState")
        public String replicationState;

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
         * <p>172.16.XX.XX</p>
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
         * <p>The time when the switchover was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-01T06:40:51Z</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>A reserved parameter. The return value of this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TargetEip")
        public String targetEip;

        /**
         * <p>The ID of the destination instance.</p>
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
         * <p>440437220</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>362c6c7a-4d20-4eac-898c-1495ceab374c</p>
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
