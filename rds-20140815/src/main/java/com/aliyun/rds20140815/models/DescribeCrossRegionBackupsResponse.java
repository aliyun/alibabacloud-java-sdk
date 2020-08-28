// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeCrossRegionBackupsResponseItems items;

    public static DescribeCrossRegionBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionBackupsResponse self = new DescribeCrossRegionBackupsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCrossRegionBackupsResponseItemsItemRestoreRegions extends TeaModel {
        @NameInMap("RestoreRegion")
        @Validation(required = true)
        public java.util.List<String> restoreRegion;

        public static DescribeCrossRegionBackupsResponseItemsItemRestoreRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupsResponseItemsItemRestoreRegions self = new DescribeCrossRegionBackupsResponseItemsItemRestoreRegions();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCrossRegionBackupsResponseItemsItem extends TeaModel {
        @NameInMap("CrossBackupId")
        @Validation(required = true)
        public Integer crossBackupId;

        @NameInMap("CrossBackupRegion")
        @Validation(required = true)
        public String crossBackupRegion;

        @NameInMap("BackupSetStatus")
        @Validation(required = true)
        public Integer backupSetStatus;

        @NameInMap("BackupStartTime")
        @Validation(required = true)
        public String backupStartTime;

        @NameInMap("BackupEndTime")
        @Validation(required = true)
        public String backupEndTime;

        @NameInMap("BackupType")
        @Validation(required = true)
        public String backupType;

        @NameInMap("BackupMethod")
        @Validation(required = true)
        public String backupMethod;

        @NameInMap("CrossBackupSetSize")
        @Validation(required = true)
        public Long crossBackupSetSize;

        @NameInMap("CrossBackupSetFile")
        @Validation(required = true)
        public String crossBackupSetFile;

        @NameInMap("CrossBackupDownloadLink")
        @Validation(required = true)
        public String crossBackupDownloadLink;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("CrossBackupSetLocation")
        @Validation(required = true)
        public String crossBackupSetLocation;

        @NameInMap("BackupSetScale")
        @Validation(required = true)
        public Integer backupSetScale;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Integer instanceId;

        @NameInMap("DBInstanceStorageType")
        @Validation(required = true)
        public String DBInstanceStorageType;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("ConsistentTime")
        @Validation(required = true)
        public String consistentTime;

        @NameInMap("HasBackupTableMeta")
        @Validation(required = true)
        public String hasBackupTableMeta;

        @NameInMap("RestoreRegions")
        @Validation(required = true)
        public DescribeCrossRegionBackupsResponseItemsItemRestoreRegions restoreRegions;

        public static DescribeCrossRegionBackupsResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupsResponseItemsItem self = new DescribeCrossRegionBackupsResponseItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCrossRegionBackupsResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeCrossRegionBackupsResponseItemsItem> item;

        public static DescribeCrossRegionBackupsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupsResponseItems self = new DescribeCrossRegionBackupsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
