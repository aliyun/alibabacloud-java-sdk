// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableClassesRequest extends TeaModel {
    /**
     * <p>The RDS edition that is run by the instance. Valid values:</p>
     * <br>
     * <p>* **Basic**: Basic Edition</p>
     * <p>* **HighAvailability**: High-availability Edition</p>
     * <p>* **AlwaysOn**: Cluster Edition</p>
     * <p>* **Finance**: Enterprise Edition</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The commodity code of the instance. Valid values:</p>
     * <br>
     * <p>* **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).</p>
     * <p>* **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).</p>
     * <p>* **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).</p>
     * <p>* **rds\_rordspre\_public\_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).</p>
     * <p>* **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).</p>
     * <p>* **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).</p>
     * <p>* **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).</p>
     * <p>* **rds\_rordspre\_public\_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).</p>
     * <br>
     * <p>> If the instance is a read-only instance, you must specify the CommodityCode parameter.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The type of storage media that is used for the instance. Valid values:</p>
     * <br>
     * <p>* **local_ssd**: local SSDs. This is the recommended storage type.</p>
     * <p>* **cloud_ssd**: standard SSDs.</p>
     * <p>* **cloud_essd**: enhanced SSDs (ESSDs) of performance level 1 (PL1).</p>
     * <p>* **cloud_essd2**: ESSDs of PL2.</p>
     * <p>* **cloud_essd3**: ESSDs of PL3.</p>
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
     * <p>The version of the database engine that is run by the instance. Valid values:</p>
     * <br>
     * <p>* Values that are valid if you set the Engine parameter to MySQL: **5.5, 5.6, 5.7, and 8.0**</p>
     * <p>* Values that are valid if you set the Engine parameter to SQL Server: **2008r2, 08r2\_ent\_ha, 2012, 2012\_ent\_ha, 2012\_std\_ha, 2012\_web, 2014\_std\_ha, 2016\_ent_ha, 2016\_std\_ha, 2016\_web, 2017\_std\_ha, 2017\_ent, 2019\_std\_ha, and 2019\_ent**</p>
     * <p>* Values that are valid if you set the Engine parameter to PostgreSQL: **10.0, 11.0, 12.0, 13.0 and 14.0**</p>
     * <p>* Values that are valid if you set the Engine parameter to MariaDB: **10.3**</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>* **Prepaid**: subscription</p>
     * <p>* **Postpaid**: pay-as-you-go</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The type of the order. Set the value to **BUY**</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID of the instance. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the region ID of an instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID of the instance. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the zone ID of an instance.</p>
     * <br>
     * <p>> If the DescribeDBInstanceAttribute operation returns multiple zones, you must specify only one of the returned zones. For example, if the DescribeDBInstanceAttribute operation returns `cn-hangzhou-MAZ9(g,h)`, you can set the ZoneId parameter to `cn-hangzhou-g` or `cn-hangzhou-h`.</p>
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
