// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupsResponseBody extends TeaModel {
    /**
     * <p>The end of the time range that is queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>An array that consists of details of the cross-region data backup files.</p>
     */
    @NameInMap("Items")
    public DescribeCrossRegionBackupsResponseBodyItems items;

    /**
     * <p>The page number of the returned page. Valid values: any non-zero positive integer.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of cross-region data backup files on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range that is queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

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

    public DescribeCrossRegionBackupsResponseBody setItems(DescribeCrossRegionBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossRegionBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeCrossRegionBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionBackupsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCrossRegionBackupsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossRegionBackupsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCrossRegionBackupsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
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
        /**
         * <p>The time when the cross-region data backup file was generated.</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The method that is used to generate the cross-region data backup file. Valid values:</p>
         * <br>
         * <p>*   **L**: logical backup</p>
         * <p>*   **P**: physical backup</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The level at which the cross-region data backup file is generated.</p>
         * <br>
         * <p>*   **0**: instance-level backup</p>
         * <p>*   **1**: database-level backup</p>
         */
        @NameInMap("BackupSetScale")
        public Integer backupSetScale;

        /**
         * <p>The status of the cross-region data backup. Valid values:</p>
         * <br>
         * <p>*   **0**: The cross-region data backup is successful.</p>
         * <p>*   **1**: The cross-region data backup failed.</p>
         */
        @NameInMap("BackupSetStatus")
        public Integer backupSetStatus;

        /**
         * <p>The time when the cross-region data backup started.</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The type of the cross-region data backup. Valid values:</p>
         * <br>
         * <p>*   **F**: full data backup</p>
         * <p>*   **I**: incremental data backup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <br>
         * <p>*   **Basic**: Basic Edition.</p>
         * <p>*   **HighAvailability**: High-availability Edition.</p>
         * <p>*   **Finance**: Enterprise Edition. This edition is supported only by the China site (aliyun.com).</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The point in time that is indicated by the data in the cross-region data backup file.</p>
         */
        @NameInMap("ConsistentTime")
        public String consistentTime;

        /**
         * <p>The external URL from which you can download the cross-region data backup file.</p>
         */
        @NameInMap("CrossBackupDownloadLink")
        public String crossBackupDownloadLink;

        /**
         * <p>The ID of the cross-region data backup file.</p>
         */
        @NameInMap("CrossBackupId")
        public Integer crossBackupId;

        /**
         * <p>The ID of the destination region where the cross-region data backup file of the instance is stored.</p>
         */
        @NameInMap("CrossBackupRegion")
        public String crossBackupRegion;

        /**
         * <p>The name of the compressed package that contains the cross-region data backup file.</p>
         */
        @NameInMap("CrossBackupSetFile")
        public String crossBackupSetFile;

        /**
         * <p>The location where the cross-region data backup file is stored.</p>
         */
        @NameInMap("CrossBackupSetLocation")
        public String crossBackupSetLocation;

        /**
         * <p>The size of the cross-region data backup file. Unit: bytes.</p>
         */
        @NameInMap("CrossBackupSetSize")
        public Long crossBackupSetSize;

        /**
         * <p>The storage type. Valid values:</p>
         * <br>
         * <p>*   **local_ssd**: local SSD. This is the recommended storage type.</p>
         * <p>*   **cloud_ssd**: standard SSD.</p>
         * <p>*   **cloud_essd**: enhanced SSD (ESSD).</p>
         */
        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        /**
         * <p>The engine of the database.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The version of the database engine.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The ID of the instance. This parameter is used to determine whether the instance that generates the cross-region data backup file is a primary or secondary instance.</p>
         */
        @NameInMap("InstanceId")
        public Integer instanceId;

        /**
         * <p>An array that consists of the regions to which the cross-region data backup file can be restored.</p>
         */
        @NameInMap("RestoreRegions")
        public DescribeCrossRegionBackupsResponseBodyItemsItemRestoreRegions restoreRegions;

        public static DescribeCrossRegionBackupsResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupsResponseBodyItemsItem self = new DescribeCrossRegionBackupsResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupSetScale(Integer backupSetScale) {
            this.backupSetScale = backupSetScale;
            return this;
        }
        public Integer getBackupSetScale() {
            return this.backupSetScale;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupSetStatus(Integer backupSetStatus) {
            this.backupSetStatus = backupSetStatus;
            return this;
        }
        public Integer getBackupSetStatus() {
            return this.backupSetStatus;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setConsistentTime(String consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public String getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupDownloadLink(String crossBackupDownloadLink) {
            this.crossBackupDownloadLink = crossBackupDownloadLink;
            return this;
        }
        public String getCrossBackupDownloadLink() {
            return this.crossBackupDownloadLink;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupId(Integer crossBackupId) {
            this.crossBackupId = crossBackupId;
            return this;
        }
        public Integer getCrossBackupId() {
            return this.crossBackupId;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupSetFile(String crossBackupSetFile) {
            this.crossBackupSetFile = crossBackupSetFile;
            return this;
        }
        public String getCrossBackupSetFile() {
            return this.crossBackupSetFile;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupSetLocation(String crossBackupSetLocation) {
            this.crossBackupSetLocation = crossBackupSetLocation;
            return this;
        }
        public String getCrossBackupSetLocation() {
            return this.crossBackupSetLocation;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setCrossBackupSetSize(Long crossBackupSetSize) {
            this.crossBackupSetSize = crossBackupSetSize;
            return this;
        }
        public Long getCrossBackupSetSize() {
            return this.crossBackupSetSize;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeCrossRegionBackupsResponseBodyItemsItem setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
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
