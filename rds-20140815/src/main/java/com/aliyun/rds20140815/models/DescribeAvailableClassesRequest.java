// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableClassesRequest extends TeaModel {
    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   Regular instance</p>
     * <br>
     * <p>    *   **Basic**: RDS Basic Edition</p>
     * <p>    *   **HighAvailability**: RDS High-availability Edition</p>
     * <p>    *   **cluster**: RDS Cluster Edition for ApsaraDB RDS for MySQL</p>
     * <p>    *   **AlwaysOn**: RDS Cluster Edition for ApsaraDB RDS for SQL Server</p>
     * <p>    *   **Finance**: RDS Enterprise Edition</p>
     * <br>
     * <p>*   Serverless instance</p>
     * <br>
     * <p>    *   **serverless_basic**: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</p>
     * <p>    *   **serverless_standard**: RDS High-availability Edition for ApsaraDB RDS for MySQL.</p>
     * <p>    *   **serverless_ha**: RDS High-availability Edition for ApsaraDB RDS for SQL Server.</p>
     * <br>
     * <p>    > If you create a serverless instance, you must specify this parameter.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The commodity code of the instance. Valid values:</p>
     * <br>
     * <p>*   **bards**: The instance is a pay-as-you-go primary instance. This value is available at the China site (aliyun.com).</p>
     * <p>*   **rds**: The instance is a subscription primary instance. This value is available at the China site (aliyun.com).</p>
     * <p>*   **rords**: The instance is a pay-as-you-go read-only instance. This value is available at the China site (aliyun.com).</p>
     * <p>*   **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available at the China site (aliyun.com).</p>
     * <p>*   **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available at the International site (alibabacloud.com).</p>
     * <p>*   **rds_intl**: The instance is a subscription primary instance. This value is available at the International site (alibabacloud.com).</p>
     * <p>*   **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available at the International site (alibabacloud.com).</p>
     * <p>*   **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available at the International site (alibabacloud.com).</p>
     * <p>*   **rds_serverless_public_cn**: The instance is a serverless instance. This value is available at the China site (aliyun.com).</p>
     * <p>*   **rds_serverless_public_intl**: The instance is a serverless instance. This value is available at the International site (alibabacloud.com).</p>
     * <br>
     * <p>> If you want to query the price of a read-only instance, you must specify this parameter.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **local_ssd**: local SSD. This is the recommended storage type.</p>
     * <p>*   **cloud_ssd**: standard SSD.</p>
     * <p>*   **cloud_essd**: enhanced SSDs (ESSDs) of performance level 1 (PL1)</p>
     * <p>*   **cloud_essd2**: ESSDs of PL2</p>
     * <p>*   **cloud_essd3**: ESSD of PL3</p>
     * <br>
     * <p>> Serverless instances support only ESSDs of PL 1. For a serverless instance, you must set this parameter to **cloud_essd**.</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The database engine that is run by the instance. Valid values:</p>
     * <br>
     * <p>* **MySQL**</p>
     * <p>* **SQLServer**</p>
     * <p>* **PostgreSQL**</p>
     * <p>* **MariaDB**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. Valid values:</p>
     * <br>
     * <p>*   Regular instance</p>
     * <br>
     * <p>    *   Valid values if you set Engine to MySQL: **5.5, 5.6, 5.7, and 8.0**</p>
     * <p>    *   Valid values if you set Engine to SQLServer: **2008r2, 08r2\_ent_ha, 2012, 2012\_ent_ha, 2012\_std_ha, 2012\_web, 2014\_std_ha, 2016\_ent_ha, 2016\_std_ha, 2016\_web, 2017\_std_ha, 2017\_ent, 2019\_std_ha, and 2019\_ent**</p>
     * <p>    *   Valid values if you set Engine to PostgreSQL: **10.0, 11.0, 12.0, 13.0, 14.0, and 15.0**</p>
     * <p>    *   Valid value when you set Engine to MariaDB: **10.3**</p>
     * <br>
     * <p>*   Serverless instance</p>
     * <br>
     * <p>    *   Valid values if you set Engine to MySQL: **5.7** and **8.0**</p>
     * <p>    *   Valid values if you set Engine to SQLServer: **2016\_std_sl**, **2017\_std_sl**, and **2019\_std_sl**</p>
     * <p>    *   Valid value if you set Engine to PostgreSQL: **14.0**</p>
     * <br>
     * <p>    > ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Prepaid**: subscription</p>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Serverless**: serverless</p>
     * <br>
     * <p>> ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The type of the order. Set the value to **BUY**</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the zone ID of the instance.</p>
     * <br>
     * <p>> If the DescribeDBInstanceAttribute operation returns multiple zones, you must specify only one of the returned zones.`` For example, if the DescribeDBInstanceAttribute operation returns `cn-hangzhou-MAZ9(g,h)`, you can set this parameter to `cn-hangzhou-g` or cn-hangzhou-h.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableClassesRequest self = new DescribeAvailableClassesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableClassesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeAvailableClassesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeAvailableClassesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeAvailableClassesRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public DescribeAvailableClassesRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAvailableClassesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeAvailableClassesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAvailableClassesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeAvailableClassesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableClassesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailableClassesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
