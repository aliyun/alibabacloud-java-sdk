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

    public DescribeCrossRegionBackupDBInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossRegionBackupDBInstanceResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionBackupDBInstanceResponse setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public DescribeCrossRegionBackupDBInstanceResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCrossRegionBackupDBInstanceResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionBackupDBInstanceResponse setItemsNumbers(Integer itemsNumbers) {
        this.itemsNumbers = itemsNumbers;
        return this;
    }
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    public DescribeCrossRegionBackupDBInstanceResponse setItems(DescribeCrossRegionBackupDBInstanceResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossRegionBackupDBInstanceResponseItems getItems() {
        return this.items;
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

        public static DescribeCrossRegionBackupDBInstanceResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupDBInstanceResponseItemsItem self = new DescribeCrossRegionBackupDBInstanceResponseItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setCrossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setCrossBackupType(String crossBackupType) {
            this.crossBackupType = crossBackupType;
            return this;
        }
        public String getCrossBackupType() {
            return this.crossBackupType;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setBackupEnabled(String backupEnabled) {
            this.backupEnabled = backupEnabled;
            return this;
        }
        public String getBackupEnabled() {
            return this.backupEnabled;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setLogBackupEnabled(String logBackupEnabled) {
            this.logBackupEnabled = logBackupEnabled;
            return this;
        }
        public String getLogBackupEnabled() {
            return this.logBackupEnabled;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setLogBackupEnabledTime(String logBackupEnabledTime) {
            this.logBackupEnabledTime = logBackupEnabledTime;
            return this;
        }
        public String getLogBackupEnabledTime() {
            return this.logBackupEnabledTime;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setBackupEnabledTime(String backupEnabledTime) {
            this.backupEnabledTime = backupEnabledTime;
            return this;
        }
        public String getBackupEnabledTime() {
            return this.backupEnabledTime;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setRetentType(Integer retentType) {
            this.retentType = retentType;
            return this;
        }
        public Integer getRetentType() {
            return this.retentType;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setRetention(Integer retention) {
            this.retention = retention;
            return this;
        }
        public Integer getRetention() {
            return this.retention;
        }

        public DescribeCrossRegionBackupDBInstanceResponseItemsItem setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
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

        public DescribeCrossRegionBackupDBInstanceResponseItems setItem(java.util.List<DescribeCrossRegionBackupDBInstanceResponseItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeCrossRegionBackupDBInstanceResponseItemsItem> getItem() {
            return this.item;
        }

    }

}
