// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMarketingActivityResponseBody extends TeaModel {
    /**
     * <p>The unique ID (UID) of the Alibaba Cloud account.</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>The BID of the account to which the Anycast EIP belongs.</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeMarketingActivityResponseBodyItems> items;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Id of the request</p>
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
         * <p>*   **HighAvailability**: High-availability Edition</p>
         * <p>*   **Finance**: RDS Enterprise Edition</p>
         * <br>
         * <p>> This parameter is returned only when **InstanceLevel** is set to **1**.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **PostPaid** (default): pay-as-you-go</p>
         * <p>*   **PrePaid**: subscription</p>
         * <br>
         * <p>> **Period** is required if you set the value of this parameter to **PrePaid**.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The code of the instance type. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~) and [Read-only ApsaraDB RDS instance types](~~145759~~).</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The instance family. For more information, see [Overview of instance families](~~57184~~).</p>
         */
        @NameInMap("ClassGroup")
        public String classGroup;

        /**
         * <p>The number of vCPU cores. Unit: cores.</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The disk size. Unit: GB.</p>
         * <br>
         * <p>*   The disk size that you specify must be greater than or equal to the current disk size of the instance.</p>
         * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <br>
         * <p>*   **MySQL**</p>
         * <p>*   **PostgreSQL**</p>
         * <p>*   **SQLServer**</p>
         * <p>*   **MariaDB**</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version.</p>
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
         * <p>MaxIombps</p>
         */
        @NameInMap("MaxIombps")
        public Integer maxIombps;

        /**
         * <p>MaxIops</p>
         */
        @NameInMap("MaxIops")
        public Integer maxIops;

        /**
         * <p>The memory size that you applied for each instance. Unit: MB.</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <br>
         * <p>*   **local_ssd**: local SSD</p>
         * <p>*   **cloud_ssd**: standard SSD</p>
         * <p>*   **cloud_essd**: enhanced SSD (ESSD) of performance level 1 (PL1)</p>
         * <p>*   **cloud_essd2**: ESSD of PL2</p>
         * <p>*   **cloud_essd3**: ESSD of PL3</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>UpgradeCategory</p>
         */
        @NameInMap("UpgradeCategory")
        public String upgradeCategory;

        /**
         * <p>UpgradeClassCode</p>
         */
        @NameInMap("UpgradeClassCode")
        public String upgradeClassCode;

        /**
         * <p>UpgradeClassGroup</p>
         */
        @NameInMap("UpgradeClassGroup")
        public String upgradeClassGroup;

        /**
         * <p>UpgradeCpu</p>
         */
        @NameInMap("UpgradeCpu")
        public String upgradeCpu;

        /**
         * <p>UpgradeDescContent</p>
         */
        @NameInMap("UpgradeDescContent")
        public String upgradeDescContent;

        /**
         * <p>UpgradeDiskSize</p>
         */
        @NameInMap("UpgradeDiskSize")
        public Integer upgradeDiskSize;

        /**
         * <p>UpgradeMaxConnections</p>
         */
        @NameInMap("UpgradeMaxConnections")
        public Integer upgradeMaxConnections;

        /**
         * <p>UpgradeMaxIombps</p>
         */
        @NameInMap("UpgradeMaxIombps")
        public Integer upgradeMaxIombps;

        /**
         * <p>UpgradeMaxIops</p>
         */
        @NameInMap("UpgradeMaxIops")
        public Integer upgradeMaxIops;

        /**
         * <p>UpgradeMemory</p>
         */
        @NameInMap("UpgradeMemory")
        public Long upgradeMemory;

        /**
         * <p>UpgradeReferencePrice</p>
         */
        @NameInMap("UpgradeReferencePrice")
        public String upgradeReferencePrice;

        /**
         * <p>UpgradeStorageType</p>
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
