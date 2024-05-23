// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMarketingActivityResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>*   China site: 26842</p>
     * <p>*   International site: 26888</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>The activity parameters</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeMarketingActivityResponseBodyItems> items;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMarketingActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMarketingActivityResponseBody self = new DescribeMarketingActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMarketingActivityResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeMarketingActivityResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeMarketingActivityResponseBody setItems(java.util.List<DescribeMarketingActivityResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeMarketingActivityResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeMarketingActivityResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMarketingActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMarketingActivityResponseBodyItems extends TeaModel {
        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <br>
         * <p>*   **Basic**: RDS Basic Edition</p>
         * <p>*   **HighAvailability**: RDS High-availability Edition</p>
         * <p>*   **AlwaysOn**: RDS Cluster Edition</p>
         * <p>*   **Finance**: RDS Enterprise Edition</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The payment type. Valid values:</p>
         * <br>
         * <p>*   POSTPAY: pay-as-you-go</p>
         * <p>*   PREPAY: subscription</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The instance type. For more information, see [Primary ApsaraDB RDS instance types](https://help.aliyun.com/document_detail/26312.html) and [Read-only ApsaraDB RDS instance types](https://help.aliyun.com/document_detail/145759.html).</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The instance family. For more information, see [Overview of instance families](https://help.aliyun.com/document_detail/57184.html).</p>
         */
        @NameInMap("ClassGroup")
        public String classGroup;

        /**
         * <p>The number of CPU cores that are supported by the instance type. Unit: cores.</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The disk capacity per node. Unit: GB.</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <br>
         * <p>*   MySQL</p>
         * <p>*   SQLServer</p>
         * <p>*   PostgreSQL</p>
         * <p>*   PPAS</p>
         * <p>*   MariaDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The version of the database engine.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The maximum number of concurrent connections.</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum I/O throughput. Unit: Mbit/s.</p>
         */
        @NameInMap("MaxIombps")
        public Integer maxIombps;

        /**
         * <p>The maximum IOPS.</p>
         */
        @NameInMap("MaxIops")
        public Integer maxIops;

        /**
         * <p>The memory size.</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <br>
         * <p>*   **local_ssd**: local SSD</p>
         * <p>*   **cloud_ssd**: standard SSD</p>
         * <p>*   **cloud_essd**: performance level 1 (PL1) enhanced SSD (ESSD)</p>
         * <p>*   **cloud_essd2**: PL2 ESSD</p>
         * <p>*   **cloud_essd3**: PL3 ESSD</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The RDS edition after the upgrade.</p>
         */
        @NameInMap("UpgradeCategory")
        public String upgradeCategory;

        /**
         * <p>The instance type after the upgrade.</p>
         */
        @NameInMap("UpgradeClassCode")
        public String upgradeClassCode;

        /**
         * <p>The instance family after the upgrade.</p>
         */
        @NameInMap("UpgradeClassGroup")
        public String upgradeClassGroup;

        /**
         * <p>The number of CPU cores after the upgrade.</p>
         */
        @NameInMap("UpgradeCpu")
        public String upgradeCpu;

        /**
         * <p>The description of the upgrade.</p>
         */
        @NameInMap("UpgradeDescContent")
        public String upgradeDescContent;

        /**
         * <p>The disk capacity after the upgrade.</p>
         */
        @NameInMap("UpgradeDiskSize")
        public Integer upgradeDiskSize;

        /**
         * <p>The maximum number of concurrent connections after the upgrade.</p>
         */
        @NameInMap("UpgradeMaxConnections")
        public Integer upgradeMaxConnections;

        /**
         * <p>The maximum I/O throughput after the upgrade. Unit: Mbit/s.</p>
         */
        @NameInMap("UpgradeMaxIombps")
        public Integer upgradeMaxIombps;

        /**
         * <p>The maximum IOPS after the upgrade.</p>
         */
        @NameInMap("UpgradeMaxIops")
        public Integer upgradeMaxIops;

        /**
         * <p>The memory size after the upgrade.</p>
         */
        @NameInMap("UpgradeMemory")
        public Long upgradeMemory;

        /**
         * <p>The reference price of the upgrade.</p>
         */
        @NameInMap("UpgradeReferencePrice")
        public String upgradeReferencePrice;

        /**
         * <p>The storage type after the upgrade.</p>
         */
        @NameInMap("UpgradeStorageType")
        public String upgradeStorageType;

        public static DescribeMarketingActivityResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMarketingActivityResponseBodyItems self = new DescribeMarketingActivityResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeMarketingActivityResponseBodyItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMarketingActivityResponseBodyItems setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeMarketingActivityResponseBodyItems setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeMarketingActivityResponseBodyItems setClassGroup(String classGroup) {
            this.classGroup = classGroup;
            return this;
        }
        public String getClassGroup() {
            return this.classGroup;
        }

        public DescribeMarketingActivityResponseBodyItems setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeMarketingActivityResponseBodyItems setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeMarketingActivityResponseBodyItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeMarketingActivityResponseBodyItems setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeMarketingActivityResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMarketingActivityResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeMarketingActivityResponseBodyItems setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeMarketingActivityResponseBodyItems setMaxIombps(Integer maxIombps) {
            this.maxIombps = maxIombps;
            return this;
        }
        public Integer getMaxIombps() {
            return this.maxIombps;
        }

        public DescribeMarketingActivityResponseBodyItems setMaxIops(Integer maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Integer getMaxIops() {
            return this.maxIops;
        }

        public DescribeMarketingActivityResponseBodyItems setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeMarketingActivityResponseBodyItems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeCategory(String upgradeCategory) {
            this.upgradeCategory = upgradeCategory;
            return this;
        }
        public String getUpgradeCategory() {
            return this.upgradeCategory;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeClassCode(String upgradeClassCode) {
            this.upgradeClassCode = upgradeClassCode;
            return this;
        }
        public String getUpgradeClassCode() {
            return this.upgradeClassCode;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeClassGroup(String upgradeClassGroup) {
            this.upgradeClassGroup = upgradeClassGroup;
            return this;
        }
        public String getUpgradeClassGroup() {
            return this.upgradeClassGroup;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeCpu(String upgradeCpu) {
            this.upgradeCpu = upgradeCpu;
            return this;
        }
        public String getUpgradeCpu() {
            return this.upgradeCpu;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeDescContent(String upgradeDescContent) {
            this.upgradeDescContent = upgradeDescContent;
            return this;
        }
        public String getUpgradeDescContent() {
            return this.upgradeDescContent;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeDiskSize(Integer upgradeDiskSize) {
            this.upgradeDiskSize = upgradeDiskSize;
            return this;
        }
        public Integer getUpgradeDiskSize() {
            return this.upgradeDiskSize;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeMaxConnections(Integer upgradeMaxConnections) {
            this.upgradeMaxConnections = upgradeMaxConnections;
            return this;
        }
        public Integer getUpgradeMaxConnections() {
            return this.upgradeMaxConnections;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeMaxIombps(Integer upgradeMaxIombps) {
            this.upgradeMaxIombps = upgradeMaxIombps;
            return this;
        }
        public Integer getUpgradeMaxIombps() {
            return this.upgradeMaxIombps;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeMaxIops(Integer upgradeMaxIops) {
            this.upgradeMaxIops = upgradeMaxIops;
            return this;
        }
        public Integer getUpgradeMaxIops() {
            return this.upgradeMaxIops;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeMemory(Long upgradeMemory) {
            this.upgradeMemory = upgradeMemory;
            return this;
        }
        public Long getUpgradeMemory() {
            return this.upgradeMemory;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeReferencePrice(String upgradeReferencePrice) {
            this.upgradeReferencePrice = upgradeReferencePrice;
            return this;
        }
        public String getUpgradeReferencePrice() {
            return this.upgradeReferencePrice;
        }

        public DescribeMarketingActivityResponseBodyItems setUpgradeStorageType(String upgradeStorageType) {
            this.upgradeStorageType = upgradeStorageType;
            return this;
        }
        public String getUpgradeStorageType() {
            return this.upgradeStorageType;
        }

    }

}
