// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePriceShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and can be up to 64 ASCII characters in length. The value cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The commodity code of the instance. Valid values:</p>
     * <ul>
     * <li><strong>bards</strong>: pay-as-you-go primary instance (Alibaba Cloud China site)</li>
     * <li><strong>rds</strong> (default): subscription primary instance (Alibaba Cloud China site)</li>
     * <li><strong>rords</strong>: pay-as-you-go read-only instance (Alibaba Cloud China site)</li>
     * <li><strong>rds_rordspre_public_cn</strong>: subscription read-only instance (Alibaba Cloud China site)</li>
     * <li><strong>bards_intl</strong>: pay-as-you-go primary instance (Alibaba Cloud International site)</li>
     * <li><strong>rds_intl</strong>: subscription primary instance (Alibaba Cloud International site)</li>
     * <li><strong>rords_intl</strong>: pay-as-you-go read-only instance (Alibaba Cloud International site)</li>
     * <li><strong>rds_rordspre_public_intl</strong>: subscription read-only instance (Alibaba Cloud International site)</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you query the pricing of a read-only instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.x2.medium.xc</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>Instance ID of the instance whose specifications you want to change or that you want to renew.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when you query the price for changing the specifications or renewing an instance.</li>
     * <li>If the instance is a read-only instance, you must specify instance ID of its primary instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Instance storage capacity of the instance. Unit: GB. Instance storage capacity increases in increments of 5 GB. For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The instance storage type. Valid values:</p>
     * <ul>
     * <li><strong>general_essd</strong>: Premium ESSD</li>
     * <li><strong>local_ssd</strong>: Premium Local SSD</li>
     * <li><strong>cloud_ssd</strong>: standard SSD</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSD</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The node information.</p>
     * <blockquote>
     * <p>This parameter is applicable to ApsaraDB RDS for MySQL Cluster Edition instances.</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("DBNode")
    public String DBNodeShrink;

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
     * <p>&lt;props=&quot;china&quot;&gt;The database engine version. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong>: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
     * <li><strong>SQL Server</strong>: <strong>08r2_ent_ha</strong> (cloud disk edition, discontinued), <strong>2008r2</strong> (Premium Local SSD, discontinued), <strong>2012</strong> (Enterprise Edition Standalone), <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_ent_ha</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_ent</strong>, <strong>2017_std_ha</strong>, <strong>2017_web</strong>, <strong>2019_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_web</strong>, <strong>2022_ent</strong>, <strong>2022_std_ha</strong>, and <strong>2022_web</strong></li>
     * <li><strong>PostgreSQL</strong>: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, and <strong>15.0</strong></li>
     * <li><strong>MariaDB</strong>: <strong>10.3</strong></li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;The database engine version. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong>: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
     * <li><strong>SQL Server</strong>: <strong>08r2_ent_ha</strong> (cloud disk edition, discontinued), <strong>2008r2</strong> (Premium Local SSD, discontinued), <strong>2012</strong> (Enterprise Edition Standalone), <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_ent</strong>, <strong>2017_std_ha</strong>, <strong>2017_web</strong>, <strong>2019_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_web</strong>, <strong>2022_ent</strong>, <strong>2022_std_ha</strong>, and <strong>2022_web</strong></li>
     * <li><strong>PostgreSQL</strong>: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, and <strong>15.0</strong></li>
     * <li><strong>MariaDB</strong>: <strong>10.3</strong></li>
     * </ul>
     * <blockquote>
     * <p>For SQL Server instances, <code>_ent</code> indicates the Enterprise Cluster Edition, <code>_ent_ha</code> indicates the Enterprise Edition, <code>_std_ha</code> indicates the Standard Edition, and <code>_web</code> indicates the Web Edition.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The instance role. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: primary instance</li>
     * <li><strong>3</strong>: read-only instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InstanceUsedType")
    public Integer instanceUsedType;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li><strong>BUY</strong>: purchase</li>
     * <li><strong>RENEW</strong>: renewal</li>
     * <li><strong>UPGRADE</strong>: upgrade</li>
     * <li><strong>DOWNGRADE</strong>: downgrade</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Prepaid</strong>: subscription</li>
     * <li><strong>Postpaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The number of instances that you want to purchase. Valid values: <strong>0</strong> to <strong>30</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The settings of the serverless ApsaraDB RDS instance.</p>
     * <blockquote>
     * <p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * </blockquote>
     */
    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    /**
     * <p>The subscription period unit. This parameter is required when the <strong>CommodityCode</strong> parameter is set to <strong>rds</strong>, <strong>rds_rordspre_public_cn</strong>, <strong>rds_intl</strong>, or <strong>rds_rordspre_public_intl</strong>. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: year</li>
     * <li><strong>Month</strong>: month</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("TimeType")
    public String timeType;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>If the <strong>TimeType</strong> parameter is set to <strong>Year</strong>, the value ranges from <strong>1</strong> to <strong>100</strong>.</li>
     * <li>If the <strong>TimeType</strong> parameter is set to <strong>Month</strong>, the value ranges from <strong>1</strong> to <strong>999</strong>.</li>
     * </ul>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The zone ID of the primary node. You can call the DescribeRegions operation to query the zone ID.</p>
     * <blockquote>
     * <p>If you specify a VPC and a vSwitch, this parameter is required to match the zone of the vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribePriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceShrinkRequest self = new DescribePriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribePriceShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribePriceShrinkRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public DescribePriceShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribePriceShrinkRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public DescribePriceShrinkRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public DescribePriceShrinkRequest setDBNodeShrink(String DBNodeShrink) {
        this.DBNodeShrink = DBNodeShrink;
        return this;
    }
    public String getDBNodeShrink() {
        return this.DBNodeShrink;
    }

    public DescribePriceShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribePriceShrinkRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribePriceShrinkRequest setInstanceUsedType(Integer instanceUsedType) {
        this.instanceUsedType = instanceUsedType;
        return this;
    }
    public Integer getInstanceUsedType() {
        return this.instanceUsedType;
    }

    public DescribePriceShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePriceShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePriceShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePriceShrinkRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribePriceShrinkRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public DescribePriceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePriceShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePriceShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePriceShrinkRequest setServerlessConfigShrink(String serverlessConfigShrink) {
        this.serverlessConfigShrink = serverlessConfigShrink;
        return this;
    }
    public String getServerlessConfigShrink() {
        return this.serverlessConfigShrink;
    }

    public DescribePriceShrinkRequest setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

    public DescribePriceShrinkRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public DescribePriceShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
