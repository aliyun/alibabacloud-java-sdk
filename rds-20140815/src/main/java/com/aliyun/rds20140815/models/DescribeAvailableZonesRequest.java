// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesRequest extends TeaModel {
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
     * <p>The commodity code of the instance. This operation can return the resources that you can purchase based on the specified commodity code. Valid values:</p>
     * <br>
     * <p>*   **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).</p>
     * <p>*   **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).</p>
     * <p>*   **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).</p>
     * <p>*   **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).</p>
     * <p>*   **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).</p>
     * <p>*   **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).</p>
     * <p>*   **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).</p>
     * <p>*   **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The ID of the primary RDS instance. If you want to query the read-only instances that you can purchase for a primary instance, you can specify this parameter.</p>
     * <br>
     * <p>If you set the **CommodityCode** parameter to one of the following values, you must specify this parameter:</p>
     * <br>
     * <p>*   **rords_intl**</p>
     * <p>*   **rds_rordspre_public_intl**</p>
     * <p>*   **rords**</p>
     * <p>*   **rds_rordspre_public_cn**</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Specifies whether to return the zones in which the single-zone deployment method is supported. Valid values:</p>
     * <br>
     * <p>*   **1**: returns the zones.</p>
     * <br>
     * <p>*   **0**: does not return the zones.</p>
     * <br>
     * <p>    Default value: **0**.</p>
     * <br>
     * <p>>  The single-zone deployment method allows you to deploy an instance that runs RDS Enterprise Edition in a single zone.</p>
     */
    @NameInMap("DispenseMode")
    public String dispenseMode;

    /**
     * <p>The database engine that is run by the instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **MariaDB**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine that is run by the instance. Valid values:</p>
     * <br>
     * <p>*   Valid values when you set the Engine parameter to MySQL: **5.5, 5.6, 5.7, and 8.0**</p>
     * <p>*   Valid values when you set the Engine parameter to SQLServer: **2008r2, 08r2\_ent_ha, 2012, 2012\_ent_ha, 2012\_std_ha, 2012\_web, 2014\_std_ha, 2016\_ent_ha, 2016\_std_ha, 2016\_web, 2017\_std_ha, 2017\_ent, 2019\_std_ha, and 2019\_ent**</p>
     * <p>*   Valid values when you set the Engine parameter to PostgreSQL: **9.4, 10.0, 11.0, 12.0, 13.0 and 14.0**</p>
     * <p>*   Valid values when you set the Engine parameter to MariaDB: **10.3**</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the zone in which the instance is located. If the instance spans more than one zone, the value of this parameter contains an `MAZ` part, such as `cn-hangzhou-MAZ6(b,f)` and `cn-hangzhou-MAZ5(b,e,f)`. You can call the [DescribeRegions](~~26243~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZonesRequest self = new DescribeAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZonesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeAvailableZonesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeAvailableZonesRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeAvailableZonesRequest setDispenseMode(String dispenseMode) {
        this.dispenseMode = dispenseMode;
        return this;
    }
    public String getDispenseMode() {
        return this.dispenseMode;
    }

    public DescribeAvailableZonesRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAvailableZonesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeAvailableZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableZonesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailableZonesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
