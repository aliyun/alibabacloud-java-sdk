// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupDBInstanceResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeCrossRegionBackupDBInstanceResponseBodyItems items;

    @NameInMap("ItemsNumbers")
    public Integer itemsNumbers;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecords")
    public Integer totalRecords;

    public static DescribeCrossRegionBackupDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionBackupDBInstanceResponseBody self = new DescribeCrossRegionBackupDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionBackupDBInstanceResponseBody setItems(DescribeCrossRegionBackupDBInstanceResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossRegionBackupDBInstanceResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeCrossRegionBackupDBInstanceResponseBody setItemsNumbers(Integer itemsNumbers) {
        this.itemsNumbers = itemsNumbers;
        return this;
    }
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    public DescribeCrossRegionBackupDBInstanceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionBackupDBInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCrossRegionBackupDBInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionBackupDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossRegionBackupDBInstanceResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static class DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem extends TeaModel {
        @NameInMap("BackupEnabled")
        public String backupEnabled;

        @NameInMap("BackupEnabledTime")
        public String backupEnabledTime;

        @NameInMap("CrossBackupRegion")
        public String crossBackupRegion;

        @NameInMap("CrossBackupType")
        public String crossBackupType;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LogBackupEnabled")
        public String logBackupEnabled;

        @NameInMap("LogBackupEnabledTime")
        public String logBackupEnabledTime;

        @NameInMap("RetentType")
        public Integer retentType;

        @NameInMap("Retention")
        public Integer retention;

        public static DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem self = new DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setBackupEnabled(String backupEnabled) {
            this.backupEnabled = backupEnabled;
            return this;
        }
        public String getBackupEnabled() {
            return this.backupEnabled;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setBackupEnabledTime(String backupEnabledTime) {
            this.backupEnabledTime = backupEnabledTime;
            return this;
        }
        public String getBackupEnabledTime() {
            return this.backupEnabledTime;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setCrossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setCrossBackupType(String crossBackupType) {
            this.crossBackupType = crossBackupType;
            return this;
        }
        public String getCrossBackupType() {
            return this.crossBackupType;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setLogBackupEnabled(String logBackupEnabled) {
            this.logBackupEnabled = logBackupEnabled;
            return this;
        }
        public String getLogBackupEnabled() {
            return this.logBackupEnabled;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setLogBackupEnabledTime(String logBackupEnabledTime) {
            this.logBackupEnabledTime = logBackupEnabledTime;
            return this;
        }
        public String getLogBackupEnabledTime() {
            return this.logBackupEnabledTime;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setRetentType(Integer retentType) {
            this.retentType = retentType;
            return this;
        }
        public Integer getRetentType() {
            return this.retentType;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem setRetention(Integer retention) {
            this.retention = retention;
            return this;
        }
        public Integer getRetention() {
            return this.retention;
        }

    }

    public static class DescribeCrossRegionBackupDBInstanceResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem> item;

        public static DescribeCrossRegionBackupDBInstanceResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupDBInstanceResponseBodyItems self = new DescribeCrossRegionBackupDBInstanceResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionBackupDBInstanceResponseBodyItems setItem(java.util.List<DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeCrossRegionBackupDBInstanceResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
