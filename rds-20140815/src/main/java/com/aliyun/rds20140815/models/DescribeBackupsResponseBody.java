// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeBackupsResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of backup sets on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The size of the snapshot chain of the instance. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalEcsSnapshotSize")
    public Long totalEcsSnapshotSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponseBody self = new DescribeBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponseBody setItems(DescribeBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
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

    public DescribeBackupsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB extends TeaModel {
        @NameInMap("DataBase")
        public String dataBase;

        @NameInMap("DownloadLink")
        public String downloadLink;

        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        public static DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB self = new DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB();
            return TeaModel.build(map, self);
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

        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDBBackupDownloadLinkByDB setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
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
        @NameInMap("BackupDownloadLinkByDB")
        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB backupDownloadLinkByDB;

        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("BackupInitiator")
        public String backupInitiator;

        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("BackupSize")
        public Long backupSize;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("Checksum")
        public String checksum;

        @NameInMap("ConsistentTime")
        public Long consistentTime;

        @NameInMap("CopyOnlyBackup")
        public String copyOnlyBackup;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("Encryption")
        public String encryption;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpectExpireTime")
        public String expectExpireTime;

        @NameInMap("HostInstanceID")
        public String hostInstanceID;

        @NameInMap("IsAvail")
        public Integer isAvail;

        @NameInMap("MetaStatus")
        public String metaStatus;

        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("StoreStatus")
        public String storeStatus;

        public static DescribeBackupsResponseBodyItemsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyItemsBackup self = new DescribeBackupsResponseBodyItemsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupDownloadLinkByDB(DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB backupDownloadLinkByDB) {
            this.backupDownloadLinkByDB = backupDownloadLinkByDB;
            return this;
        }
        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB getBackupDownloadLinkByDB() {
            return this.backupDownloadLinkByDB;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
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

        public DescribeBackupsResponseBodyItemsBackup setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupsResponseBodyItemsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupsResponseBodyItemsBackup setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

        public DescribeBackupsResponseBodyItemsBackup setConsistentTime(Long consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setCopyOnlyBackup(String copyOnlyBackup) {
            this.copyOnlyBackup = copyOnlyBackup;
            return this;
        }
        public String getCopyOnlyBackup() {
            return this.copyOnlyBackup;
        }

        public DescribeBackupsResponseBodyItemsBackup setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeBackupsResponseBodyItemsBackup setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public DescribeBackupsResponseBodyItemsBackup setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeBackupsResponseBodyItemsBackup setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeBackupsResponseBodyItemsBackup setExpectExpireTime(String expectExpireTime) {
            this.expectExpireTime = expectExpireTime;
            return this;
        }
        public String getExpectExpireTime() {
            return this.expectExpireTime;
        }

        public DescribeBackupsResponseBodyItemsBackup setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
            return this;
        }
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public DescribeBackupsResponseBodyItemsBackup setIsAvail(Integer isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public Integer getIsAvail() {
            return this.isAvail;
        }

        public DescribeBackupsResponseBodyItemsBackup setMetaStatus(String metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public String getMetaStatus() {
            return this.metaStatus;
        }

        public DescribeBackupsResponseBodyItemsBackup setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeBackupsResponseBodyItemsBackup setStoreStatus(String storeStatus) {
            this.storeStatus = storeStatus;
            return this;
        }
        public String getStoreStatus() {
            return this.storeStatus;
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
