// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSharedBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeSharedBackupsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>2020-05-12T03:25:55Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <strong>example:</strong>
         * <p>4639948800</p>
         */
        @NameInMap("BackupSetSize")
        public String backupSetSize;

        /**
         * <strong>example:</strong>
         * <p>2020-11-15T07:30:05Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <strong>example:</strong>
         * <p>Level-2</p>
         */
        @NameInMap("BackupsLevel")
        public String backupsLevel;

        /**
         * <strong>example:</strong>
         * <p>1589253947</p>
         */
        @NameInMap("ConsistentTime")
        public String consistentTime;

        /**
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>cn-hongzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <strong>example:</strong>
         * <p>ShareIncoming</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
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
