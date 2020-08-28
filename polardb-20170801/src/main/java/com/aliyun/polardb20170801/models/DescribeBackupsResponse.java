// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

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

        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

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

        @NameInMap("StoreStatus")
        @Validation(required = true)
        public String storeStatus;

        @NameInMap("BackupSetSize")
        @Validation(required = true)
        public String backupSetSize;

        @NameInMap("ConsistentTime")
        @Validation(required = true)
        public String consistentTime;

        @NameInMap("BackupsLevel")
        @Validation(required = true)
        public String backupsLevel;

        @NameInMap("IsAvail")
        @Validation(required = true)
        public String isAvail;

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
