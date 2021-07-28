// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalEcsSnapshotSize")
    public Long totalEcsSnapshotSize;

    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("Items")
    public DescribeBackupsResponseBodyItems items;

    public static DescribeBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponseBody self = new DescribeBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupsResponseBody setTotalEcsSnapshotSize(Long totalEcsSnapshotSize) {
        this.totalEcsSnapshotSize = totalEcsSnapshotSize;
        return this;
    }
    public Long getTotalEcsSnapshotSize() {
        return this.totalEcsSnapshotSize;
    }

    public DescribeBackupsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeBackupsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeBackupsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupsResponseBody setItems(DescribeBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB extends TeaModel {
        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        @NameInMap("DataBase")
        public String dataBase;

        @NameInMap("DownloadLink")
        public String downloadLink;

        public static DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB self = new DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB setDataBase(String dataBase) {
            this.dataBase = dataBase;
            return this;
        }
        public String getDataBase() {
            return this.dataBase;
        }

        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

    }

    public static class DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB extends TeaModel {
        @NameInMap("BackupDownloadLinkByDB")
        public java.util.List<DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB> backupDownloadLinkByDB;

        public static DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB self = new DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB setBackupDownloadLinkByDB(java.util.List<DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB> backupDownloadLinkByDB) {
            this.backupDownloadLinkByDB = backupDownloadLinkByDB;
            return this;
        }
        public java.util.List<DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB> getBackupDownloadLinkByDB() {
            return this.backupDownloadLinkByDB;
        }

    }

    public static class DescribeBackupsResponseBodyItemsBackup extends TeaModel {
        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("Encryption")
        public String encryption;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("StoreStatus")
        public String storeStatus;

        @NameInMap("ConsistentTime")
        public Long consistentTime;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("CopyOnlyBackup")
        public String copyOnlyBackup;

        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("MetaStatus")
        public String metaStatus;

        @NameInMap("BackupInitiator")
        public String backupInitiator;

        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        @NameInMap("IsAvail")
        public Integer isAvail;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("HostInstanceID")
        public String hostInstanceID;

        @NameInMap("BackupSize")
        public Long backupSize;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("BackupDownloadLinkByDB")
        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB backupDownloadLinkByDB;

        public static DescribeBackupsResponseBodyItemsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItemsBackup self = new DescribeBackupsResponseBodyItemsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItemsBackup setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeBackupsResponseBodyItemsBackup setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupsResponseBodyItemsBackup setStoreStatus(String storeStatus) {
            this.storeStatus = storeStatus;
            return this;
        }
        public String getStoreStatus() {
            return this.storeStatus;
        }

        public DescribeBackupsResponseBodyItemsBackup setConsistentTime(Long consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupsResponseBodyItemsBackup setCopyOnlyBackup(String copyOnlyBackup) {
            this.copyOnlyBackup = copyOnlyBackup;
            return this;
        }
        public String getCopyOnlyBackup() {
            return this.copyOnlyBackup;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setMetaStatus(String metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public String getMetaStatus() {
            return this.metaStatus;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupInitiator(String backupInitiator) {
            this.backupInitiator = backupInitiator;
            return this;
        }
        public String getBackupInitiator() {
            return this.backupInitiator;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
            return this;
        }
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeBackupsResponseBodyItemsBackup setIsAvail(Integer isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public Integer getIsAvail() {
            return this.isAvail;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeBackupsResponseBodyItemsBackup setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
            return this;
        }
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupsResponseBodyItemsBackup setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupDownloadLinkByDB(DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB backupDownloadLinkByDB) {
            this.backupDownloadLinkByDB = backupDownloadLinkByDB;
            return this;
        }
        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB getBackupDownloadLinkByDB() {
            return this.backupDownloadLinkByDB;
        }

    }

    public static class DescribeBackupsResponseBodyItems extends TeaModel {
        @NameInMap("Backup")
        public java.util.List<DescribeBackupsResponseBodyItemsBackup> backup;

        public static DescribeBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItems self = new DescribeBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItems setBackup(java.util.List<DescribeBackupsResponseBodyItemsBackup> backup) {
            this.backup = backup;
            return this;
        }
        public java.util.List<DescribeBackupsResponseBodyItemsBackup> getBackup() {
            return this.backup;
        }

    }

}
