// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableClassesRequest extends TeaModel {
    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li><p>Regular instances</p>
     * <ul>
     * <li><strong>Basic</strong>: Basic Edition</li>
     * <li><strong>HighAvailability</strong>: high-availability series</li>
     * <li><strong>cluster</strong>: Cluster Edition (applicable only to MySQL and PostgreSQL)</li>
     * <li><strong>AlwaysOn</strong>: SQL Server Cluster Edition</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
     * </ul>
     * </li>
     * <li><p>Serverless instances</p>
     * <ul>
     * <li><strong>serverless_basic</strong>: Serverless Basic Edition (applicable only to MySQL and PostgreSQL)</li>
     * <li><strong>serverless_standard</strong>: Serverless high availability series (applicable only to MySQL and PostgreSQL)</li>
     * <li><strong>serverless_ha</strong>: SQL Server Serverless high availability series</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a serverless instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The commodity code of the instance. Valid values:</p>
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
     * <blockquote>
     * <p>This parameter is required when you query a read-only instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bards</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The instance storage type. Valid values:</p>
     * <ul>
     * <li><strong>general_essd</strong>: premium performance disk</li>
     * <li><strong>local_ssd</strong>: local SSD</li>
     * <li><strong>cloud_ssd</strong>: standard SSD</li>
     * <li><strong>cloud_essd0</strong>: PL0 ESSD cloud disk</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSD cloud disk</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD cloud disk</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD cloud disk</li>
     * </ul>
     * <blockquote>
     * <p>Serverless instances support only PL1 ESSD cloud disks. Set this parameter to <strong>cloud_essd</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

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
     * <p>The database engine version of the instance. Valid values:</p>
     * <ul>
     * <li><p>Regular instances</p>
     * <ul>
     * <li>MySQL: <strong>5.5, 5.6, 5.7, 8.0</strong></li>
     * <li>SQL Server: <strong>2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, 2019_ent</strong></li>
     * <li>PostgreSQL: <strong>10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0</strong></li>
     * <li>MariaDB: <strong>10.3</strong></li>
     * </ul>
     * </li>
     * <li><p>Serverless instances</p>
     * <ul>
     * <li>MySQL: <strong>5.7</strong>, <strong>8.0</strong></li>
     * <li>SQL Server: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, <strong>2019_std_sl</strong></li>
     * <li>PostgreSQL: <strong>14.0, 15.0, 16.0, 17.0</strong></li>
     * </ul>
     * <blockquote>
     * <p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Prepaid</strong>: subscription</li>
     * <li><strong>Postpaid</strong>: pay-as-you-go</li>
     * <li><strong>Serverless</strong>: serverless</li>
     * </ul>
     * <blockquote>
     * <p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The order type. The only valid value is <strong>BUY</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the region ID.</p>
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
     * <p>The zone ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the zone ID.</p>
     * <blockquote>
     * <p>If DescribeDBInstanceAttribute returns a multi-zone value (such as <code>cn-hangzhou-MAZ9(g,h)</code>), specify a single zone. Example: <code>cn-hangzhou-g</code> or <code>cn-hangzhou-j</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
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
