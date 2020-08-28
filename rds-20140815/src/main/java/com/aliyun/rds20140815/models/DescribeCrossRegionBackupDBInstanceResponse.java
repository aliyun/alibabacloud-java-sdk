// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TotalRecords")
    @Validation(required = true)
    public Integer totalRecords;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("ItemsNumbers")
    @Validation(required = true)
    public Integer itemsNumbers;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeCrossRegionBackupDBInstanceResponseItems items;

    public static DescribeCrossRegionBackupDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionBackupDBInstanceResponse self = new DescribeCrossRegionBackupDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCrossRegionBackupDBInstanceResponseItemsItem extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        @NameInMap("DBInstanceStatusDesc")
        @Validation(required = true)
        public String DBInstanceStatusDesc;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("CrossBackupRegion")
        @Validation(required = true)
        public String crossBackupRegion;

        @NameInMap("CrossBackupType")
        @Validation(required = true)
        public String crossBackupType;

        @NameInMap("BackupEnabled")
        @Validation(required = true)
        public String backupEnabled;

        @NameInMap("LogBackupEnabled")
        @Validation(required = true)
        public String logBackupEnabled;

        @NameInMap("LogBackupEnabledTime")
        @Validation(required = true)
        public String logBackupEnabledTime;

        @NameInMap("BackupEnabledTime")
        @Validation(required = true)
        public String backupEnabledTime;

        @NameInMap("RetentType")
        @Validation(required = true)
        public Integer retentType;

        @NameInMap("Retention")
        @Validation(required = true)
        public Integer retention;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("RelService")
        @Validation(required = true)
        public String relService;

        @NameInMap("RelServiceId")
        @Validation(required = true)
        public String relServiceId;

        public static DescribeCrossRegionBackupDBInstanceResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupDBInstanceResponseItemsItem self = new DescribeCrossRegionBackupDBInstanceResponseItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCrossRegionBackupDBInstanceResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeCrossRegionBackupDBInstanceResponseItemsItem> item;

        public static DescribeCrossRegionBackupDBInstanceResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupDBInstanceResponseItems self = new DescribeCrossRegionBackupDBInstanceResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
