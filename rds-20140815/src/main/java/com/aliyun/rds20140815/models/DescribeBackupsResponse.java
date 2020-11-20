// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public String totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public String pageRecordCount;

    @NameInMap("TotalEcsSnapshotSize")
    @Validation(required = true)
    public Long totalEcsSnapshotSize;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeBackupsResponseItems items;

    public static DescribeBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponse self = new DescribeBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupsResponse setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeBackupsResponse setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupsResponse setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeBackupsResponse setTotalEcsSnapshotSize(Long totalEcsSnapshotSize) {
        this.totalEcsSnapshotSize = totalEcsSnapshotSize;
        return this;
    }
    public Long getTotalEcsSnapshotSize() {
        return this.totalEcsSnapshotSize;
    }

    public DescribeBackupsResponse setItems(DescribeBackupsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeBackupsResponseItemsBackup extends TeaModel {
        @NameInMap("BackupId")
        @Validation(required = true)
        public String backupId;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("BackupStatus")
        @Validation(required = true)
        public String backupStatus;

        @NameInMap("BackupStartTime")
        @Validation(required = true)
        public String backupStartTime;

        @NameInMap("BackupEndTime")
        @Validation(required = true)
        public String backupEndTime;

        @NameInMap("BackupType")
        @Validation(required = true)
        public String backupType;

        @NameInMap("BackupMode")
        @Validation(required = true)
        public String backupMode;

        @NameInMap("BackupMethod")
        @Validation(required = true)
        public String backupMethod;

        @NameInMap("BackupDownloadURL")
        @Validation(required = true)
        public String backupDownloadURL;

        @NameInMap("BackupIntranetDownloadURL")
        @Validation(required = true)
        public String backupIntranetDownloadURL;

        @NameInMap("BackupSize")
        @Validation(required = true)
        public Long backupSize;

        @NameInMap("HostInstanceID")
        @Validation(required = true)
        public String hostInstanceID;

        @NameInMap("StoreStatus")
        @Validation(required = true)
        public String storeStatus;

        @NameInMap("MetaStatus")
        @Validation(required = true)
        public String metaStatus;

        @NameInMap("ConsistentTime")
        @Validation(required = true)
        public Long consistentTime;

        @NameInMap("BackupInitiator")
        @Validation(required = true)
        public String backupInitiator;

        @NameInMap("CopyOnlyBackup")
        @Validation(required = true)
        public String copyOnlyBackup;

        @NameInMap("StorageClass")
        @Validation(required = true)
        public String storageClass;

        @NameInMap("IsAvail")
        @Validation(required = true)
        public Integer isAvail;

        @NameInMap("Encryption")
        @Validation(required = true)
        public String encryption;

        public static DescribeBackupsResponseItemsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseItemsBackup self = new DescribeBackupsResponseItemsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseItemsBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeBackupsResponseItemsBackup setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeBackupsResponseItemsBackup setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupsResponseItemsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupsResponseItemsBackup setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupsResponseItemsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupsResponseItemsBackup setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupsResponseItemsBackup setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupsResponseItemsBackup setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeBackupsResponseItemsBackup setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
            return this;
        }
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public DescribeBackupsResponseItemsBackup setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeBackupsResponseItemsBackup setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
            return this;
        }
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public DescribeBackupsResponseItemsBackup setStoreStatus(String storeStatus) {
            this.storeStatus = storeStatus;
            return this;
        }
        public String getStoreStatus() {
            return this.storeStatus;
        }

        public DescribeBackupsResponseItemsBackup setMetaStatus(String metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public String getMetaStatus() {
            return this.metaStatus;
        }

        public DescribeBackupsResponseItemsBackup setConsistentTime(Long consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeBackupsResponseItemsBackup setBackupInitiator(String backupInitiator) {
            this.backupInitiator = backupInitiator;
            return this;
        }
        public String getBackupInitiator() {
            return this.backupInitiator;
        }

        public DescribeBackupsResponseItemsBackup setCopyOnlyBackup(String copyOnlyBackup) {
            this.copyOnlyBackup = copyOnlyBackup;
            return this;
        }
        public String getCopyOnlyBackup() {
            return this.copyOnlyBackup;
        }

        public DescribeBackupsResponseItemsBackup setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeBackupsResponseItemsBackup setIsAvail(Integer isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public Integer getIsAvail() {
            return this.isAvail;
        }

        public DescribeBackupsResponseItemsBackup setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

    }

    public static class DescribeBackupsResponseItems extends TeaModel {
        @NameInMap("Backup")
        @Validation(required = true)
        public java.util.List<DescribeBackupsResponseItemsBackup> backup;

        public static DescribeBackupsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseItems self = new DescribeBackupsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseItems setBackup(java.util.List<DescribeBackupsResponseItemsBackup> backup) {
            this.backup = backup;
            return this;
        }
        public java.util.List<DescribeBackupsResponseItemsBackup> getBackup() {
            return this.backup;
        }

    }

}
