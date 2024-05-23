// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesRequest extends TeaModel {
    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   Regular instance</p>
     * <br>
     * <p>    *   **Basic**: RDS Basic Edition.</p>
     * <p>    *   **HighAvailability**: RDS High-availability Edition.</p>
     * <p>    *   **cluster**: RDS Cluster Edition for ApsaraDB RDS for MySQL.</p>
     * <p>    *   **AlwaysOn**: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</p>
     * <p>    *   **Finance**: RDS Enterprise Edition.</p>
     * <br>
     * <p>*   Serverless instance</p>
     * <br>
     * <p>    *   **serverless_basic**: RDS Basic Edition. This edition is available only for instances that run MySQL and PostgreSQL.</p>
     * <p>    *   **serverless_standard**: RDS High-availability Edition for ApsaraDB RDS for MySQL.</p>
     * <p>    *   **serverless_ha**: RDS High-availability Edition for ApsaraDB RDS for SQL Server.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The commodity code of the instance. This operation can return the resources that you can purchase based on the specified commodity code. Valid values:</p>
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
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The ID of the primary instance. If you want to query the read-only instances that you can purchase for a primary instance, you can specify this parameter.</p>
     * <br>
     * <p>If you set **CommodityCode** to one of the following values, you must specify this parameter:</p>
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
     * <p>*   **1** (default): returns the zones.</p>
     * <p>*   **0**: does not return the zones.</p>
     * <br>
     * <p>>  The single-zone deployment method allows you to deploy an instance that runs RDS Enterprise Edition in a single zone.</p>
     */
    @NameInMap("DispenseMode")
    public String dispenseMode;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **MariaDB**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version. Valid values:</p>
     * <br>
     * <p>*   Regular instance</p>
     * <br>
     * <p>    *   Valid values if you set Engine to MySQL: **5.5**, **5.6**, **5.7**, and **8.0**</p>
     * <p>    *   Valid values if you set Engine to SQLServer: **2008r2**, **08r2_ent_ha**, **2012**, **2012_ent_ha**, **2012_std_ha**, **2012_web**, **2014_std_ha**, **2016_ent_ha**, **2016_std_ha**, **2016_web**, **2017_std_ha**, **2017_ent**, **2019_std_ha**, and **2019_ent**</p>
     * <p>    *   Valid values if you set Engine to PostgreSQL: **10.0**, **11.0**, **12.0**, **13.0**, **14.0**, and **15.0**</p>
     * <p>    *   Valid value when you set Engine to MariaDB: **10.3**</p>
     * <br>
     * <p>*   Serverless instance</p>
     * <br>
     * <p>    *   Valid values if you set Engine to MySQL: **5.7** and **8.0**</p>
     * <p>    *   Valid values if you set Engine to SQLServer: **2016_std_sl**, **2017_std_sl**, and **2019_std_sl**</p>
     * <p>    *   Valid value if you set Engine to PostgreSQL: **14.0**</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID. If the instance spans more than one zone, the value of this parameter contains an `MAZ` part, such as `cn-hangzhou-MAZ6(b,f)` and `cn-hangzhou-MAZ5(b,e,f)`. You can call the DescribeRegions operation to query the most recent zone list.</p>
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
