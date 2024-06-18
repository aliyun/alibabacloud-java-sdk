// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The commodity code of the instance. Valid values:</p>
     * <ul>
     * <li><strong>bards</strong>: The instance is a pay-as-you-go primary instance. This value is available at the China site (aliyun.com).</li>
     * <li><strong>rds</strong>: The instance is a subscription primary instance. This is the default value. This value is available at the China site (aliyun.com).</li>
     * <li><strong>rords</strong>: The instance is a pay-as-you-go read-only instance. This value is available at the China site (aliyun.com).</li>
     * <li><strong>rds_rordspre_public_cn</strong>: The instance is a subscription read-only instance. This value is available at the China site (aliyun.com).</li>
     * <li><strong>bards_intl</strong>: The instance is a pay-as-you-go primary instance. This value is available at the International site (alibabacloud.com).</li>
     * <li><strong>rds_intl</strong>: The instance is a subscription primary instance. This value is available at the International site (alibabacloud.com).</li>
     * <li><strong>rords_intl</strong>: The instance is a pay-as-you-go read-only instance. This value is available at the International site (alibabacloud.com).</li>
     * <li><strong>rds_rordspre_public_intl</strong>: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).</li>
     * </ul>
     * <blockquote>
     * <p>If you want to query the price of a read-only instance, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds.mysql.s1.small</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the instance for which you want to change the specifications or the instance that you want to renew.</p>
     * <blockquote>
     * <ul>
     * <li>If you want to query the price of a specification change order or a renewal order, you must specify this parameter.</li>
     * <li>If the instance is a read-only instance, you must set this parameter to the ID of its primary instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the instance. Unit: GB. You can increase the storage capacity at a step size of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: local SSD</li>
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
     * <p>The information about the node.</p>
     * <blockquote>
     * <p> This parameter is supported for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("DBNode")
    public java.util.List<DescribePriceRequestDBNode> DBNode;

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
     * <p>The database engine version of the instance.</p>
     * <ul>
     * <li>Valid values if you set Engine to <strong>MySQL</strong>: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
     * <li>Valid values if you set Engine to <strong>SQLServer</strong>: <strong>08r2_ent_ha</strong> (cloud disks, discontinued), <strong>2008r2</strong>(local disks, discontinued), <strong>2012</strong> (SQL Server EE Basic), <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_ent</strong>, <strong>2017_std_ha</strong>, <strong>2017_web</strong>, <strong>2019_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_web</strong>, <strong>2022_ent</strong>, <strong>2022_std_ha</strong>, and <strong>2022_web</strong></li>
     * <li>Valid values if you set Engine to <strong>PostgreSQL</strong>: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, and <strong>15.0</strong></li>
     * <li>Valid value if you set Engine to <strong>MariaDB</strong>: <strong>10.3</strong></li>
     * </ul>
     * <blockquote>
     * <p> The following information describes the valid values when you set Engine to SQLServer: <code>_ent</code> specifies SQL Server EE on RDS Cluster Edition, <code>_ent_ha</code> specifies SQL Server EE, <code>_std_ha</code> specifies SQL Server SE, and <code>_web</code> specifies SQL Server Web.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.5</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The role of the instance. Valid values:</p>
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
     * <li><strong>BUY</strong>: purchase order</li>
     * <li><strong>UPGRADE</strong>: specification change order</li>
     * <li><strong>RENEW</strong>: renewal order</li>
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
     * <p>The number of instances that you want to purchase. Valid values: <strong>0 to 30</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
     * <p>The settings of the serverless instance.</p>
     * <blockquote>
     * <p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * </blockquote>
     */
    @NameInMap("ServerlessConfig")
    public DescribePriceRequestServerlessConfig serverlessConfig;

    /**
     * <p>The billing cycle of the subscription instance. This parameter is required when <strong>CommodityCode</strong> is set to <strong>rds</strong>, <strong>rds_rordspre_public_cn</strong>, <strong>rds_intl</strong>, or <strong>rds_rordspre_public_intl</strong>. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong></li>
     * <li><strong>Month</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("TimeType")
    public String timeType;

    /**
     * <p>The subscription duration of the instance.</p>
     * <ul>
     * <li>If you set the <strong>TimeType</strong> parameter to <strong>Year</strong>, the value of the UsedTime parameter ranges from <strong>1 to 100</strong>.</li>
     * <li>If you set the <strong>TimeType</strong> parameter to <strong>Month</strong>, the value of the UsedTime parameter ranges from <strong>1 to 999</strong>.</li>
     * </ul>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The zone ID of the primary instance. You can call the DescribeRegions operation to query the most recent zone list.</p>
     * <blockquote>
     * <p> If you specify a virtual private cloud (VPC) and a vSwitch, this parameter is required to identify the zone for the vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
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
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.small.xc</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The zone ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
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
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        /**
         * <p>The minimum number of RCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
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
