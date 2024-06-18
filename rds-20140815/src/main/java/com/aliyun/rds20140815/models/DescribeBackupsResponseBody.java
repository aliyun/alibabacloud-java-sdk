// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    /**
     * <p>The queried backup sets.</p>
     */
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
        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>dbs</p>
         */
        @NameInMap("DataBase")
        public String dataBase;

        /**
         * <p>The public URL from which you can download the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou.bak.rds.aliyuncs.com/custins53664665/hins18676859_2021072909473127987849.zip?Expires=*****&dbList=tb1">https://cn-hangzhou.bak.rds.aliyuncs.com/custins53664665/hins18676859_2021072909473127987849.zip?Expires=*****&amp;dbList=tb1</a></p>
         */
        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <p>The internal URL from which you can download the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou-internal.bak.rds.aliyuncs.com/custins53664665/hins18676859_2021072909473127987849.zip?Expires=*****&dbList=tb1">https://cn-hangzhou-internal.bak.rds.aliyuncs.com/custins53664665/hins18676859_2021072909473127987849.zip?Expires=*****&amp;dbList=tb1</a></p>
         */
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
        /**
         * <p>An array consisting of URLs from which you can download backup sets of individual databases.</p>
         */
        @NameInMap("BackupDownloadLinkByDB")
        public DescribeBackupsResponseBodyItemsBackupBackupDownloadLinkByDB backupDownloadLinkByDB;

        /**
         * <p>The URL that is used to download the backup set over the Internet. If the backup set cannot be downloaded, null is returned.</p>
         * <blockquote>
         * <p> For example, if BackupMethod of an ApsaraDB RDS for SQL Server instance is set to <strong>Snapshot</strong>, a null string is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://rdsbak-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx">http://rdsbak-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx</a></p>
         */
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        /**
         * <p>The end time of the backup task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-13T12:20:00Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>321020562</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The initiator of the backup task. Valid values:</p>
         * <ul>
         * <li><strong>System</strong></li>
         * <li><strong>User</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("BackupInitiator")
        public String backupInitiator;

        /**
         * <p>The URL that is used to download the backup set over an internal network. If the backup set cannot be downloaded, null is returned.</p>
         * <blockquote>
         * <p> For example, if BackupMethod of an ApsaraDB RDS for SQL Server instance is set to <strong>Snapshot</strong>, a null string is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://rdsbak-hz-v3.oss-cn-hangzhou-internal.aliyuncs.com/xxxxx">http://rdsbak-hz-v3.oss-cn-hangzhou-internal.aliyuncs.com/xxxxx</a></p>
         */
        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        /**
         * <p>The method that is used to generate the backup set. Valid values:</p>
         * <ul>
         * <li><strong>Logical</strong>: logical backup</li>
         * <li><strong>Physical</strong>: physical backup</li>
         * <li><strong>Snapshot</strong>: snapshot backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Physical</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup mode of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong></li>
         * <li><strong>Manual</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The size of the data backup file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2167808</p>
         */
        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <p>The start time of the backup. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-03T12:20:00Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The state of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The backup type of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>FullBackup</strong></li>
         * <li><strong>IncrementalBackup</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The checksum. The value of this parameter is calculated by using the CRC64 algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>1835830439**********</p>
         */
        @NameInMap("Checksum")
        public String checksum;

        /**
         * <p>The point in time at which the data in the backup set is consistent. The return value of this parameter is a timestamp.</p>
         * <blockquote>
         * <p> If the instance runs MySQL 5.6, a timestamp is returned. Otherwise, the value 0 is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1576506856</p>
         */
        @NameInMap("ConsistentTime")
        public Long consistentTime;

        /**
         * <p>The backup mode of the backup set. Valid values:</p>
         * <ul>
         * <li>0: the standard mode. This mode supports full backups and incremental backups.</li>
         * <li>1: the copy-only mode. This mode supports only full backups.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only when the instance runs SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CopyOnlyBackup")
        public String copyOnlyBackup;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The encryption information about the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Encryption")
        public String encryption;

        /**
         * <p>The ID of the instance that generates the backup set. This parameter is used to indicate whether the instance that generates the backup set is a primary instance or a secondary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5882781</p>
         */
        @NameInMap("HostInstanceID")
        public String hostInstanceID;

        /**
         * <p>Indicates whether the backup set is available. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The backup set is unavailable.</li>
         * <li><strong>1</strong>: The backup set is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAvail")
        public Integer isAvail;

        /**
         * <p>The status of the backup set that is used to restore individual databases or tables. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The data backup file is normal.</li>
         * <li><strong>LARGE</strong>: The data backup file contains an abnormally large number of tables. It cannot be used to restore individual databases or tables.</li>
         * <li><strong>EMPTY</strong>: The data backup file is generated from a failed backup task.</li>
         * </ul>
         * <blockquote>
         * <p> If an empty string is returned, the data backup file cannot be used to restore individual databases or tables.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("MetaStatus")
        public String metaStatus;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The storage class of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: regular storage</li>
         * <li><strong>1</strong>: archive storage</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>Indicates whether the backup set can be deleted. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: The backup set can be deleted.</li>
         * <li><strong>Disabled</strong>: The backup set cannot be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
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

        public DescribeBackupsResponseBodyItemsBackup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
