// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupsResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: 实例所在地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 查询开始时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    // description: 查询结束时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    // description: 总记录数。; 
    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    // description: 本页备份文件个数。; 
    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    // description: 页码，取值：大于0且不超过Integer的最大值。默认值：**1**。; 
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    // description: 跨地域备份列表。
    @NameInMap("Items")
    @Validation(required = true)
    public DescribeCrossRegionBackupsResponseItems items;

    public static DescribeCrossRegionBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionBackupsResponse self = new DescribeCrossRegionBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionBackupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossRegionBackupsResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionBackupsResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCrossRegionBackupsResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCrossRegionBackupsResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeCrossRegionBackupsResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCrossRegionBackupsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionBackupsResponse setItems(DescribeCrossRegionBackupsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossRegionBackupsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeCrossRegionBackupsResponseItemsItemRestoreRegions extends TeaModel {
        // RestoreRegion
        @NameInMap("RestoreRegion")
        @Validation(required = true)
        public java.util.List<String> restoreRegion;

        public static DescribeCrossRegionBackupsResponseItemsItemRestoreRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupsResponseItemsItemRestoreRegions self = new DescribeCrossRegionBackupsResponseItemsItemRestoreRegions();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionBackupsResponseItemsItemRestoreRegions setRestoreRegion(java.util.List<String> restoreRegion) {
            this.restoreRegion = restoreRegion;
            return this;
        }
        public java.util.List<String> getRestoreRegion() {
            return this.restoreRegion;
        }

    }

    public static class DescribeCrossRegionBackupsResponseItemsItem extends TeaModel {
        // description: 跨地域备份文件ID。; 
        @NameInMap("CrossBackupId")
        @Validation(required = true)
        public Integer crossBackupId;

        // description: 跨地域备份的目的地域ID。; 
        @NameInMap("CrossBackupRegion")
        @Validation(required = true)
        public String crossBackupRegion;

        // description: 备份文件状态，取值：* **0**：完成备份；* **1**：备份失败。; 
        @NameInMap("BackupSetStatus")
        @Validation(required = true)
        public Integer backupSetStatus;

        // description: 跨地域备份开始时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
        @NameInMap("BackupStartTime")
        @Validation(required = true)
        public String backupStartTime;

        // description: 跨地域备份结束时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
        @NameInMap("BackupEndTime")
        @Validation(required = true)
        public String backupEndTime;

        // description: 跨地域备份类型，取值：* **F**：全量；* **I**：增量。; 
        @NameInMap("BackupType")
        @Validation(required = true)
        public String backupType;

        // description: 跨地域备份方式，取值：* **L**：逻辑备份；* **P**：物理备份。; 
        @NameInMap("BackupMethod")
        @Validation(required = true)
        public String backupMethod;

        // description: 跨地域备份文件大小，单位：Byte。; 
        @NameInMap("CrossBackupSetSize")
        @Validation(required = true)
        public Long crossBackupSetSize;

        // description: 跨地域备份文件压缩包名称。; 
        @NameInMap("CrossBackupSetFile")
        @Validation(required = true)
        public String crossBackupSetFile;

        // description: 跨地域备份文件外网下载链接。; 
        @NameInMap("CrossBackupDownloadLink")
        @Validation(required = true)
        public String crossBackupDownloadLink;

        // description: 数据库类型。; 
        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        // description: 数据库版本。; 
        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        // description: 备份文件存储位置。; 
        @NameInMap("CrossBackupSetLocation")
        @Validation(required = true)
        public String crossBackupSetLocation;

        // description: 备份文件的备份策略，取值：* **0**：实例备份；* **1**：单库备份。; 
        @NameInMap("BackupSetScale")
        @Validation(required = true)
        public Integer backupSetScale;

        // description: 实例编号。用于区分该备份集产生于主实例或备实例。; 
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Integer instanceId;

        // description: 存储类型。; 
        @NameInMap("DBInstanceStorageType")
        @Validation(required = true)
        public String DBInstanceStorageType;

        // description: 实例系列，取值：* **Basic**：基础版；* **HighAvailability**：高可用版；* **Finance**：金融版（仅中国站支持）。; 
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        // description: 备份文件里数据的时间点。; 
        @NameInMap("ConsistentTime")
        @Validation(required = true)
        public String consistentTime;

        @NameInMap("RestoreRegions")
        @Validation(required = true)
        public DescribeCrossRegionBackupsResponseItemsItemRestoreRegions restoreRegions;

        public static DescribeCrossRegionBackupsResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionBackupsResponseItemsItem self = new DescribeCrossRegionBackupsResponseItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionBackupsResponseItemsItem setCrossBackupId(Integer crossBackupId) {
            this.crossBackupId = crossBackupId;
            return this;
        }
        public Integer getCrossBackupId() {
            return this.crossBackupId;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setCrossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setBackupSetStatus(Integer backupSetStatus) {
            this.backupSetStatus = backupSetStatus;
            return this;
        }
        public Integer getBackupSetStatus() {
            return this.backupSetStatus;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setCrossBackupSetSize(Long crossBackupSetSize) {
            this.crossBackupSetSize = crossBackupSetSize;
            return this;
        }
        public Long getCrossBackupSetSize() {
            return this.crossBackupSetSize;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setCrossBackupSetFile(String crossBackupSetFile) {
            this.crossBackupSetFile = crossBackupSetFile;
            return this;
        }
        public String getCrossBackupSetFile() {
            return this.crossBackupSetFile;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setCrossBackupDownloadLink(String crossBackupDownloadLink) {
            this.crossBackupDownloadLink = crossBackupDownloadLink;
            return this;
        }
        public String getCrossBackupDownloadLink() {
            return this.crossBackupDownloadLink;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setCrossBackupSetLocation(String crossBackupSetLocation) {
            this.crossBackupSetLocation = crossBackupSetLocation;
            return this;
        }
        public String getCrossBackupSetLocation() {
            return this.crossBackupSetLocation;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setBackupSetScale(Integer backupSetScale) {
            this.backupSetScale = backupSetScale;
            return this;
        }
        public Integer getBackupSetScale() {
            return this.backupSetScale;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setConsistentTime(String consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public String getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeCrossRegionBackupsResponseItemsItem setRestoreRegions(DescribeCrossRegionBackupsResponseItemsItemRestoreRegions restoreRegions) {
            this.restoreRegions = restoreRegions;
            return this;
        }
        public DescribeCrossRegionBackupsResponseItemsItemRestoreRegions getRestoreRegions() {
            return this.restoreRegions;
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

        public DescribeCrossRegionBackupsResponseItems setItem(java.util.List<DescribeCrossRegionBackupsResponseItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeCrossRegionBackupsResponseItemsItem> getItem() {
            return this.item;
        }

    }

}
