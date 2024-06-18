// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableClassesRequest extends TeaModel {
    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <ul>
     * <li><p>Regular instance</p>
     * <ul>
     * <li><strong>Basic</strong>: RDS Basic Edition</li>
     * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
     * <li><strong>cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL</li>
     * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
     * </ul>
     * </li>
     * <li><p>Serverless instance</p>
     * <ul>
     * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
     * <li><strong>serverless_standard</strong>: RDS High-availability Edition for ApsaraDB RDS for MySQL.</li>
     * <li><strong>serverless_ha</strong>: RDS High-availability Edition for ApsaraDB RDS for SQL Server.</li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you must specify this parameter.</p>
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
     * <blockquote>
     * <p>If you want to query the price of a read-only instance, you must specify this parameter.</p>
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
     * <p>rm-uf6wjk5xxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: local SSD. This is the recommended storage type.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD.</li>
     * <li><strong>cloud_essd</strong>: enhanced SSDs (ESSDs) of performance level 1 (PL1)</li>
     * <li><strong>cloud_essd2</strong>: ESSDs of PL2</li>
     * <li><strong>cloud_essd3</strong>: ESSD of PL3</li>
     * </ul>
     * <blockquote>
     * <p>Serverless instances support only ESSDs of PL 1. For a serverless instance, you must set this parameter to <strong>cloud_essd</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The database engine that is run by the instance. Valid values:</p>
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
     * <li><p>Regular instance</p>
     * <ul>
     * <li>Valid values if you set Engine to MySQL: <strong>5.5, 5.6, 5.7, and 8.0</strong></li>
     * <li>Valid values if you set Engine to SQLServer: <strong>2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, and 2019_ent</strong></li>
     * <li>Valid values if you set Engine to PostgreSQL: <strong>10.0, 11.0, 12.0, 13.0, 14.0, and 15.0</strong></li>
     * <li>Valid value when you set Engine to MariaDB: <strong>10.3</strong></li>
     * </ul>
     * </li>
     * <li><p>Serverless instance</p>
     * <ul>
     * <li>Valid values if you set Engine to MySQL: <strong>5.7</strong> and <strong>8.0</strong></li>
     * <li>Valid values if you set Engine to SQLServer: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, and <strong>2019_std_sl</strong></li>
     * <li>Valid value if you set Engine to PostgreSQL: <strong>14.0</strong></li>
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
     * <p>The type of the order. Set the value to <strong>BUY</strong></p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the region ID of the instance.</p>
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
     * <p>The zone ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the zone ID of the instance.</p>
     * <blockquote>
     * <p> If the DescribeDBInstanceAttribute operation returns multiple zones, you must specify only one of the returned zones. For example, if the DescribeDBInstanceAttribute operation returns <code>cn-hangzhou-MAZ9(g,h)</code>, you can set this parameter to <code>cn-hangzhou-g</code> or <code>cn-hangzhou-h</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
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
