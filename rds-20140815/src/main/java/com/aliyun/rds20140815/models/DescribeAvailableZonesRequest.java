// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesRequest extends TeaModel {
    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li>Regular instances<ul>
     * <li><strong>Basic</strong>: Basic Edition</li>
     * <li><strong>HighAvailability</strong>: High-availability Edition</li>
     * <li><strong>cluster</strong>: MySQL Cluster Edition</li>
     * <li><strong>AlwaysOn</strong>: SQL Server Cluster Edition</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
     * </ul>
     * </li>
     * <li>Serverless instances<ul>
     * <li><strong>serverless_basic</strong>: Serverless Basic Edition (applicable only to MySQL and PostgreSQL)</li>
     * <li><strong>serverless_standard</strong>: MySQL Serverless High-availability Edition</li>
     * <li><strong>serverless_ha</strong>: SQL Server Serverless High-availability Edition</li>
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
     * <p>The commodity code of the instance. The operation queries available resources for sale based on the specified commodity code. Valid values:</p>
     * <ul>
     * <li><strong>bards</strong>: pay-as-you-go primary instance (China site)</li>
     * <li><strong>rds</strong>: subscription primary instance (China site)</li>
     * <li><strong>rords</strong>: pay-as-you-go read-only instance (China site)</li>
     * <li><strong>rds_rordspre_public_cn</strong>: subscription read-only instance (China site)</li>
     * <li><strong>bards_intl</strong>: pay-as-you-go primary instance (international site)</li>
     * <li><strong>rds_intl</strong>: subscription primary instance (international site)</li>
     * <li><strong>rords_intl</strong>: pay-as-you-go read-only instance (international site)</li>
     * <li><strong>rds_rordspre_public_intl</strong>: subscription read-only instance (international site)</li>
     * <li><strong>rds_serverless_public_cn</strong>: serverless (China site)</li>
     * <li><strong>rds_serverless_public_intl</strong>: serverless (international site)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bards</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance ID of the primary instance. This parameter is used to query available read-only instance resources for the specified primary instance.</p>
     * <p>This parameter is required when <strong>CommodityCode</strong> is set to one of the following values:</p>
     * <ul>
     * <li><strong>rords_intl</strong></li>
     * <li><strong>rds_rordspre_public_intl</strong></li>
     * <li><strong>rords</strong></li>
     * <li><strong>rds_rordspre_public_cn</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Specifies whether to return the list of zones that support single-zone deployment. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> (default): Returns the list.</li>
     * <li><strong>0</strong>: Does not return the list.</li>
     * </ul>
     * <blockquote>
     * <p>The single-zone deployment feature allows you to deploy RDS Enterprise Edition instances in a single zone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DispenseMode")
    public String dispenseMode;

    /**
     * <p>The database engine. Valid values:</p>
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
     * <li><p>Regular instances</p>
     * <ul>
     * <li>MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, <strong>8.0</strong></li>
     * <li>SQL Server: <strong>2008r2</strong>, <strong>08r2_ent_ha</strong>, <strong>2012</strong>, <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_std_ha</strong>, <strong>2017_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_ent</strong></li>
     * <li>PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, <strong>15.0</strong></li>
     * <li>MariaDB: <strong>10.3</strong></li>
     * </ul>
     * </li>
     * <li><p>Serverless instances</p>
     * <ul>
     * <li>MySQL: <strong>5.7</strong>, <strong>8.0</strong></li>
     * <li>SQL Server: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, <strong>2019_std_sl</strong></li>
     * <li>PostgreSQL: <strong>14.0</strong></li>
     * </ul>
     * <blockquote>
     * <p>MariaDB does not support serverless instances.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The region ID. You can call DescribeRegions to query the region ID.</p>
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
     * <p>The zone ID. The format of multi-zone IDs differs from that of single-zone IDs and contains <code>MAZ</code>, such as <code>cn-hangzhou-MAZ6(b,f)</code> and <code>cn-hangzhou-MAZ5(b,e,f)</code>. You can call DescribeRegions to query zone IDs.</p>
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
