// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesRequest extends TeaModel {
    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <ul>
     * <li><p>Regular instance</p>
     * <ul>
     * <li><strong>Basic</strong>: RDS Basic Edition.</li>
     * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
     * <li><strong>cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL.</li>
     * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition.</li>
     * </ul>
     * </li>
     * <li><p>Serverless instance</p>
     * <ul>
     * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for instances that run MySQL and PostgreSQL.</li>
     * <li><strong>serverless_standard</strong>: RDS High-availability Edition for ApsaraDB RDS for MySQL.</li>
     * <li><strong>serverless_ha</strong>: RDS High-availability Edition for ApsaraDB RDS for SQL Server.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The commodity code of the instance. This operation can return the resources that you can purchase based on the specified commodity code. Valid values:</p>
     * <ul>
     * <li><strong>bards</strong>: The instance is a pay-as-you-go primary instance. This value is available at the China site (aliyun.com).</li>
     * <li><strong>rds</strong>: The instance is a subscription primary instance. This value is available at the China site (aliyun.com).</li>
     * <li><strong>rords</strong>: The instance is a pay-as-you-go read-only instance. This value is available at the China site (aliyun.com).</li>
     * <li><strong>rds_rordspre_public_cn</strong>: The instance is a subscription read-only instance. This value is available at the China site (aliyun.com).</li>
     * <li><strong>bards_intl</strong>: The instance is a pay-as-you-go primary instance. This value is available at the International site (alibabacloud.com).</li>
     * <li><strong>rds_intl</strong>: The instance is a subscription primary instance. This value is available at the International site (alibabacloud.com).</li>
     * <li><strong>rords_intl</strong>: The instance is a pay-as-you-go read-only instance. This value is available at the International site (alibabacloud.com).</li>
     * <li><strong>rds_rordspre_public_intl</strong>: The instance is a subscription read-only instance. This value is available at the International site (alibabacloud.com).</li>
     * <li><strong>rds_serverless_public_cn</strong>: The instance is a serverless instance. This value is available at the China site (aliyun.com).</li>
     * <li><strong>rds_serverless_public_intl</strong>: The instance is a serverless instance. This value is available at the International site (alibabacloud.com).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bards</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The ID of the primary instance. If you want to query the read-only instances that you can purchase for a primary instance, you can specify this parameter.</p>
     * <p>If you set <strong>CommodityCode</strong> to one of the following values, you must specify this parameter:</p>
     * <ul>
     * <li><strong>rords_intl</strong></li>
     * <li><strong>rds_rordspre_public_intl</strong></li>
     * <li><strong>rords</strong></li>
     * <li><strong>rds_rordspre_public_cn</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Specifies whether to return the zones in which the single-zone deployment method is supported. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> (default): returns the zones.</li>
     * <li><strong>0</strong>: does not return the zones.</li>
     * </ul>
     * <blockquote>
     * <p> The single-zone deployment method allows you to deploy an instance that runs RDS Enterprise Edition in a single zone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DispenseMode")
    public String dispenseMode;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>MariaDB</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version. Valid values:</p>
     * <ul>
     * <li><p>Regular instance</p>
     * <ul>
     * <li>Valid values if you set Engine to MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
     * <li>Valid values if you set Engine to SQLServer: <strong>2008r2</strong>, <strong>08r2_ent_ha</strong>, <strong>2012</strong>, <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_std_ha</strong>, <strong>2017_ent</strong>, <strong>2019_std_ha</strong>, and <strong>2019_ent</strong></li>
     * <li>Valid values if you set Engine to PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, and <strong>15.0</strong></li>
     * <li>Valid value when you set Engine to MariaDB: <strong>10.3</strong></li>
     * </ul>
     * </li>
     * <li><p>Serverless instance</p>
     * <ul>
     * <li>Valid values if you set Engine to MySQL: <strong>5.7</strong> and <strong>8.0</strong></li>
     * <li>Valid values if you set Engine to SQLServer: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, and <strong>2019_std_sl</strong></li>
     * <li>Valid value if you set Engine to PostgreSQL: <strong>14.0</strong></li>
     * </ul>
     * <p>**</p>
     * <p><strong>Note</strong>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID. If the instance spans more than one zone, the value of this parameter contains an <code>MAZ</code> part, such as <code>cn-hangzhou-MAZ6(b,f)</code> and <code>cn-hangzhou-MAZ5(b,e,f)</code>. You can call the DescribeRegions operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
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
