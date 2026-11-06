// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationBackupsResponseBody extends TeaModel {
    /**
     * <p>The list of application backup sets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeApplicationBackupsResponseBodyItems> items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumbers")
    public String pageNumbers;

    /**
     * <p>The number of backup sets returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of backup sets that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeApplicationBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationBackupsResponseBody self = new DescribeApplicationBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationBackupsResponseBody setItems(java.util.List<DescribeApplicationBackupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeApplicationBackupsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeApplicationBackupsResponseBody setPageNumbers(String pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public String getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeApplicationBackupsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeApplicationBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationBackupsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeApplicationBackupsResponseBodyItems extends TeaModel {
        /**
         * <p>The end time of the backup. The time is displayed in UTC in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-15T07:30:20Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The backup set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>61*******</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The start time of the backup. The time is displayed in UTC in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-15T07:30:05Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The backup status. A value of Success indicates that the backup is completed, and a value of Failed indicates that the backup failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The backup type. A value of FullBackup indicates a full backup, and a value of IncrementalBackup indicates an incremental backup.</p>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The backup mode. A value of Automated indicates an automatic backup, and a value of Manual indicates a manual backup.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("JobMode")
        public String jobMode;

        public static DescribeApplicationBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationBackupsResponseBodyItems self = new DescribeApplicationBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationBackupsResponseBodyItems setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeApplicationBackupsResponseBodyItems setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeApplicationBackupsResponseBodyItems setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeApplicationBackupsResponseBodyItems setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeApplicationBackupsResponseBodyItems setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeApplicationBackupsResponseBodyItems setJobMode(String jobMode) {
            this.jobMode = jobMode;
            return this;
        }
        public String getJobMode() {
            return this.jobMode;
        }

    }

}
