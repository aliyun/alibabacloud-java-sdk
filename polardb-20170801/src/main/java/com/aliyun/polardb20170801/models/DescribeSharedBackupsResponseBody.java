// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSharedBackupsResponseBody extends TeaModel {
    /**
     * <p>A list of shared backup sets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSharedBackupsResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
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
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total record count.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeSharedBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSharedBackupsResponseBody self = new DescribeSharedBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSharedBackupsResponseBody setItems(java.util.List<DescribeSharedBackupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSharedBackupsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSharedBackupsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSharedBackupsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSharedBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSharedBackupsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSharedBackupsResponseBodyItems extends TeaModel {
        /**
         * <p>The end time of the backup, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12T03:25:55Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The backup set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The backup method. Only snapshot backup is supported. The value is fixed to <strong>Snapshot</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><p><strong>Automated</strong>: automated backup</p>
         * </li>
         * <li><p><strong>Manual</strong>: manual backup</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The size of the backup set, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4639948800</p>
         */
        @NameInMap("BackupSetSize")
        public String backupSetSize;

        /**
         * <p>The start time of the backup, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-15T07:30:05Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The backup status. Valid values:</p>
         * <ul>
         * <li><p><strong>Success</strong>: The backup is complete.</p>
         * </li>
         * <li><p><strong>Failed</strong>: The backup failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The backup type. Only full backups are supported. The value is fixed to <strong>FullBackup</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The backup level. Valid values:</p>
         * <ul>
         * <li><p><strong>Level-1</strong>: Level-1 backup.</p>
         * </li>
         * <li><p><strong>Level-2</strong>: Level-2 backup.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Level-2</p>
         */
        @NameInMap("BackupsLevel")
        public String backupsLevel;

        /**
         * <p>The UNIX timestamp of the consistent snapshot, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1589253947</p>
         */
        @NameInMap("ConsistentTime")
        public String consistentTime;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
         * </li>
         * <li><p><strong>Prepaid</strong>: prepaid (subscription)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Serverless type. A value of <strong>AgileServerless</strong> indicates a Serverless cluster, while an empty value indicates a standard cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>The share type.</p>
         * 
         * <strong>example:</strong>
         * <p>ShareIncoming</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The UID of the account that shared the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>170*************</p>
         */
        @NameInMap("SharerUID")
        public String sharerUID;

        public static DescribeSharedBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSharedBackupsResponseBodyItems self = new DescribeSharedBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSharedBackupsResponseBodyItems setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeSharedBackupsResponseBodyItems setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeSharedBackupsResponseBodyItems setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeSharedBackupsResponseBodyItems setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeSharedBackupsResponseBodyItems setBackupSetSize(String backupSetSize) {
            this.backupSetSize = backupSetSize;
            return this;
        }
        public String getBackupSetSize() {
            return this.backupSetSize;
        }

        public DescribeSharedBackupsResponseBodyItems setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeSharedBackupsResponseBodyItems setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeSharedBackupsResponseBodyItems setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeSharedBackupsResponseBodyItems setBackupsLevel(String backupsLevel) {
            this.backupsLevel = backupsLevel;
            return this;
        }
        public String getBackupsLevel() {
            return this.backupsLevel;
        }

        public DescribeSharedBackupsResponseBodyItems setConsistentTime(String consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public String getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeSharedBackupsResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSharedBackupsResponseBodyItems setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeSharedBackupsResponseBodyItems setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeSharedBackupsResponseBodyItems setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeSharedBackupsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSharedBackupsResponseBodyItems setServerlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }
        public String getServerlessType() {
            return this.serverlessType;
        }

        public DescribeSharedBackupsResponseBodyItems setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public DescribeSharedBackupsResponseBodyItems setSharerUID(String sharerUID) {
            this.sharerUID = sharerUID;
            return this;
        }
        public String getSharerUID() {
            return this.sharerUID;
        }

    }

}
