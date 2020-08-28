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

    @NameInMap("TotalBackupSize")
    @Validation(required = true)
    public Long totalBackupSize;

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

        @NameInMap("BackupLocation")
        @Validation(required = true)
        public String backupLocation;

        @NameInMap("BackupExtractionStatus")
        @Validation(required = true)
        public String backupExtractionStatus;

        @NameInMap("BackupScale")
        @Validation(required = true)
        public String backupScale;

        @NameInMap("BackupDBNames")
        @Validation(required = true)
        public String backupDBNames;

        @NameInMap("TotalBackupSize")
        @Validation(required = true)
        public Long totalBackupSize;

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

        @NameInMap("SlaveStatus")
        @Validation(required = true)
        public String slaveStatus;

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

        public static DescribeBackupsResponseItemsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseItemsBackup self = new DescribeBackupsResponseItemsBackup();
            return TeaModel.build(map, self);
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

    }

}
