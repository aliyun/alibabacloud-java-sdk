// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The commodity code of the instance. Valid values:</p>
     * <br>
     * <p>*   **bards**: The instance is a pay-as-you-go primary instance. This value is available at the China site (aliyun.com).</p>
     * <p>*   **rds**: The instance is a subscription primary instance. This is the default value. This value is available at the China site (aliyun.com).</p>
     * <p>*   **rords**: The instance is a pay-as-you-go read-only instance. This value is available at the China site (aliyun.com).</p>
     * <p>*   **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available at the China site (aliyun.com).</p>
     * <p>*   **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available at the International site (alibabacloud.com).</p>
     * <p>*   **rds_intl**: The instance is a subscription primary instance. This value is available at the International site (alibabacloud.com).</p>
     * <p>*   **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available at the International site (alibabacloud.com).</p>
     * <p>*   **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).</p>
     * <br>
     * <p>> If you want to query the price of a read-only instance, you must specify this parameter.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the instance for which you want to change the specifications or the instance that you want to renew.</p>
     * <br>
     * <p>> *   If you want to query the price of a specification change order or a renewal order, you must specify this parameter.</p>
     * <p>> *   If the instance is a read-only instance, you must set this parameter to the ID of its primary instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the instance. Unit: GB. You can increase the storage capacity at a step size of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **local_ssd**: local SSD</p>
     * <p>*   **cloud_ssd**: standard SSD</p>
     * <p>*   **cloud_essd**: PL1 ESSD</p>
     * <p>*   **cloud_essd2**: PL2 ESSD</p>
     * <p>*   **cloud_essd3**: PL3 ESSD</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The information about the node.</p>
     * <br>
     * <p>>  This parameter is supported for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<DescribePriceRequestDBNode> DBNode;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **MariaDB**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance.</p>
     * <br>
     * <p>*   Valid values if you set Engine to **MySQL**: **5.5**, **5.6**, **5.7**, and **8.0**</p>
     * <p>*   Valid values if you set Engine to **SQLServer**: **08r2\_ent_ha** (cloud disks, discontinued), **2008r2**(local disks, discontinued), **2012** (SQL Server EE Basic), **2012\_ent_ha**, **2012\_std_ha**, **2012\_web**, **2016\_ent_ha**, **2016\_std_ha**, **2016\_web**, **2017\_ent**, **2017\_std_ha**, **2017\_web**, **2019\_ent**, **2019\_std_ha**, **2019\_web**, **2022\_ent**, **2022\_std_ha**, and **2022\_web**</p>
     * <p>*   Valid values if you set Engine to **PostgreSQL**: **10.0**, **11.0**, **12.0**, **13.0**, **14.0**, and **15.0**</p>
     * <p>*   Valid value if you set Engine to **MariaDB**: **10.3**</p>
     * <br>
     * <p>>  The following information describes the valid values when you set Engine to SQLServer: `_ent` specifies SQL Server EE on RDS Cluster Edition, `_ent_ha` specifies SQL Server EE, `_std_ha` specifies SQL Server SE, and `_web` specifies SQL Server Web.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The role of the instance. Valid values:</p>
     * <br>
     * <p>*   **0**: primary instance</p>
     * <p>*   **3**: read-only instance</p>
     */
    @NameInMap("InstanceUsedType")
    public Integer instanceUsedType;

    /**
     * <p>The order type. Valid values:</p>
     * <br>
     * <p>*   **BUY**: purchase order</p>
     * <p>*   **UPGRADE**: specification change order</p>
     * <p>*   **RENEW**: renewal order</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Prepaid**: subscription</p>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The number of instances that you want to purchase. Valid values: **0 to 30**.</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The settings of the serverless instance.</p>
     * <br>
     * <p>> ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     */
    @NameInMap("ServerlessConfig")
    public DescribePriceRequestServerlessConfig serverlessConfig;

    /**
     * <p>The billing cycle of the subscription instance. This parameter is required when **CommodityCode** is set to **rds**, **rds_rordspre_public_cn**, **rds_intl**, or **rds_rordspre_public_intl**. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     */
    @NameInMap("TimeType")
    public String timeType;

    /**
     * <p>The subscription duration of the instance.</p>
     * <br>
     * <p>*   If you set the **TimeType** parameter to **Year**, the value of the UsedTime parameter ranges from **1 to 100**.</p>
     * <p>*   If you set the **TimeType** parameter to **Month**, the value of the UsedTime parameter ranges from **1 to 999**.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The zone ID of the primary instance. You can call the DescribeRegions operation to query the most recent zone list.</p>
     * <br>
     * <p>>  If you specify a virtual private cloud (VPC) and a vSwitch, this parameter is required to identify the zone for the vSwitch.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribePriceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribePriceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public DescribePriceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribePriceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public DescribePriceRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public DescribePriceRequest setDBNode(java.util.List<DescribePriceRequestDBNode> DBNode) {
        this.DBNode = DBNode;
        return this;
    }
    public java.util.List<DescribePriceRequestDBNode> getDBNode() {
        return this.DBNode;
    }

    public DescribePriceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribePriceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribePriceRequest setInstanceUsedType(Integer instanceUsedType) {
        this.instanceUsedType = instanceUsedType;
        return this;
    }
    public Integer getInstanceUsedType() {
        return this.instanceUsedType;
    }

    public DescribePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePriceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePriceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribePriceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public DescribePriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePriceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePriceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePriceRequest setServerlessConfig(DescribePriceRequestServerlessConfig serverlessConfig) {
        this.serverlessConfig = serverlessConfig;
        return this;
    }
    public DescribePriceRequestServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    public DescribePriceRequest setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

    public DescribePriceRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public DescribePriceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribePriceRequestDBNode extends TeaModel {
        /**
         * <p>The instance type of the node.</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The zone ID of the node.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribePriceRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestDBNode self = new DescribePriceRequestDBNode();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestDBNode setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribePriceRequestDBNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribePriceRequestServerlessConfig extends TeaModel {
        /**
         * <p>The maximum number of RDS Capacity Units (RCUs).</p>
         */
        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        /**
         * <p>The minimum number of RCUs.</p>
         */
        @NameInMap("MinCapacity")
        public Double minCapacity;

        public static DescribePriceRequestServerlessConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestServerlessConfig self = new DescribePriceRequestServerlessConfig();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestServerlessConfig setMaxCapacity(Double maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Double getMaxCapacity() {
            return this.maxCapacity;
        }

        public DescribePriceRequestServerlessConfig setMinCapacity(Double minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Double getMinCapacity() {
            return this.minCapacity;
        }

    }

}
