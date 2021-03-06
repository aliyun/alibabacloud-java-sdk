// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupsResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Items")
    public DescribeCrossRegionBackupsResponseBodyItems items;

    public static DescribeCrossRegionBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionBackupsResponseBody self = new DescribeCrossRegionBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionBackupsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCrossRegionBackupsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCrossRegionBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossRegionBackupsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCrossRegionBackupsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeCrossRegionBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionBackupsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionBackupsResponseBody setItems(DescribeCrossRegionBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossRegionBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeCrossRegionBackupsResponseBodyItemsItemRestoreRegions extends TeaModel {
        @NameInMap("RestoreRegion")
        public java.util.List<String> restoreRegion;

        public static DescribeCrossRegionBackupsResponseBodyItemsItemRestoreRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupsResponseBodyItemsItemRestoreRegions self = new DescribeCrossRegionBackupsResponseBodyItemsItemRestoreRegions();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItemRestoreRegions setRestoreRegion(java.util.List<String> restoreRegion) {
            this.restoreRegion = restoreRegion;
            return this;
        }
        public java.util.List<String> getRestoreRegion() {
            return this.restoreRegion;
        }

    }

    public static class DescribeCrossRegionBackupsResponseBodyItemsItem extends TeaModel {
        @NameInMap("ConsistentTime")
        public String consistentTime;

        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        @NameInMap("CrossBackupId")
        public Integer crossBackupId;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("CrossBackupSetLocation")
        public String crossBackupSetLocation;

        @NameInMap("InstanceId")
        public Integer instanceId;

        @NameInMap("CrossBackupDownloadLink")
        public String crossBackupDownloadLink;

        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("BackupSetStatus")
        public Integer backupSetStatus;

        @NameInMap("CrossBackupSetFile")
        public String crossBackupSetFile;

        @NameInMap("BackupSetScale")
        public Integer backupSetScale;

        @NameInMap("CrossBackupSetSize")
        public Long crossBackupSetSize;

        @NameInMap("CrossBackupRegion")
        public String crossBackupRegion;

        @NameInMap("Category")
        public String category;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("RestoreRegions")
        public DescribeCrossRegionBackupsResponseBodyItemsItemRestoreRegions restoreRegions;

        public static DescribeCrossRegionBackupsResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupsResponseBodyItemsItem self = new DescribeCrossRegionBackupsResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setConsistentTime(String consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public String getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupId(Integer crossBackupId) {
            this.crossBackupId = crossBackupId;
            return this;
        }
        public Integer getCrossBackupId() {
            return this.crossBackupId;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupSetLocation(String crossBackupSetLocation) {
            this.crossBackupSetLocation = crossBackupSetLocation;
            return this;
        }
        public String getCrossBackupSetLocation() {
            return this.crossBackupSetLocation;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupDownloadLink(String crossBackupDownloadLink) {
            this.crossBackupDownloadLink = crossBackupDownloadLink;
            return this;
        }
        public String getCrossBackupDownloadLink() {
            return this.crossBackupDownloadLink;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupSetStatus(Integer backupSetStatus) {
            this.backupSetStatus = backupSetStatus;
            return this;
        }
        public Integer getBackupSetStatus() {
            return this.backupSetStatus;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupSetFile(String crossBackupSetFile) {
            this.crossBackupSetFile = crossBackupSetFile;
            return this;
        }
        public String getCrossBackupSetFile() {
            return this.crossBackupSetFile;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupSetScale(Integer backupSetScale) {
            this.backupSetScale = backupSetScale;
            return this;
        }
        public Integer getBackupSetScale() {
            return this.backupSetScale;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupSetSize(Long crossBackupSetSize) {
            this.crossBackupSetSize = crossBackupSetSize;
            return this;
        }
        public Long getCrossBackupSetSize() {
            return this.crossBackupSetSize;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setRestoreRegions(DescribeCrossRegionBackupsResponseBodyItemsItemRestoreRegions restoreRegions) {
            this.restoreRegions = restoreRegions;
            return this;
        }
        public DescribeCrossRegionBackupsResponseBodyItemsItemRestoreRegions getRestoreRegions() {
            return this.restoreRegions;
        }

    }

    public static class DescribeCrossRegionBackupsResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeCrossRegionBackupsResponseBodyItemsItem> item;

        public static DescribeCrossRegionBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupsResponseBodyItems self = new DescribeCrossRegionBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionBackupsResponseBodyItems setItem(java.util.List<DescribeCrossRegionBackupsResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeCrossRegionBackupsResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
