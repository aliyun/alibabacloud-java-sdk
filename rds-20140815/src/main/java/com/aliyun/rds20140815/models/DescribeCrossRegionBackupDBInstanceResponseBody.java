// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The cross-region backup settings.</p>
     */
    @NameInMap("Items")
    public DescribeCrossRegionBackupDBInstanceResponseBodyItems items;

    /**
     * <p>The total number of items returned for cross-region backup settings.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ItemsNumbers")
    public Integer itemsNumbers;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33517002-182D-40BE-93EC-610BD3381045</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The status of the cross-region backup feature on the instance. Valid values:</p>
         * <ul>
         * <li><strong>Disable</strong></li>
         * <li><strong>Enable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("BackupEnabled")
        public String backupEnabled;

        /**
         * <p>The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-12T05:44:21Z</p>
         */
        @NameInMap("BackupEnabledTime")
        public String backupEnabledTime;

        /**
         * <p>The ID of the destination region within which the cross-region backup file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("CrossBackupRegion")
        public String crossBackupRegion;

        /**
         * <p>The policy that is used to save the cross-region backup files of the instance. Default value: <strong>1</strong>. The value 1 indicates that all cross-region backup files are saved.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CrossBackupType")
        public String crossBackupType;

        /**
         * <p>The name of the instance. It must be 2 to 256 characters in length. The value can contain letters, digits, underscores (_), and hyphens (-), and must start with a letter.</p>
         * <blockquote>
         * <p> The value cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test database</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance statuses</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The lock status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The instance is not locked.</li>
         * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The instance is automatically locked after it expires.</li>
         * <li><strong>LockByRestoration</strong>: The instance is automatically locked before it is rolled back.</li>
         * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked because its storage capacity is exhausted and the instance is inaccessible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The status of the cross-region log backup feature on the instance. Valid values:</p>
         * <ul>
         * <li><strong>Disable</strong></li>
         * <li><strong>Enable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("LogBackupEnabled")
        public String logBackupEnabled;

        /**
         * <p>The time when the cross-region log backup feature was enabled on the instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-12T05:44:21Z</p>
         */
        @NameInMap("LogBackupEnabledTime")
        public String logBackupEnabledTime;

        /**
         * <p>The policy that is used to retain the cross-region backup files of the instance. Cross-region backups can be retained only based on the specified retention period. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetentType")
        public Integer retentType;

        /**
         * <p>The number of days for which the cross-region backup files of the instance are retained. Valid values: <strong>7 to 1825</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
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
