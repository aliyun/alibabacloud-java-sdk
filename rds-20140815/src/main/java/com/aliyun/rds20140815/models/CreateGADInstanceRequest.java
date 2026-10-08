// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGADInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the primary instance. You can call the DescribeDBInstances operation to query the instance ID. This instance serves as the central node (primary node) of the GAD cluster.</p>
     * <blockquote>
     * <ul>
     * <li>A primary instance ID can serve as the central node of only one GAD cluster.</li>
     * <li>Only ApsaraDB RDS for MySQL primary instances in the China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), China (Zhangjiakou), China (Shenzhen), and China (Chengdu) regions can serve as the central node of a GAD cluster.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("CentralDBInstanceId")
    public String centralDBInstanceId;

    /**
     * <p>The privileged account of the central node. You can call the DescribeAccounts operation to query the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CentralRdsDtsAdminAccount")
    public String centralRdsDtsAdminAccount;

    /**
     * <p>The password of the privileged account for the central node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test12345</p>
     */
    @NameInMap("CentralRdsDtsAdminPassword")
    public String centralRdsDtsAdminPassword;

    /**
     * <p>The region ID of the central node. You can call the DescribeRegions operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CentralRegionId")
    public String centralRegionId;

    /**
     * <p>A JSON array that contains the database information of the central node. All database information in this array is synchronized to the current unit node (secondary node). Parameter description:</p>
     * <ul>
     * <li><strong>name</strong>: the database name.</li>
     * <li><strong>all</strong>: specifies whether to synchronize all data in the current database or table. Valid values: <strong>true</strong> | <strong>false</strong>.</li>
     * <li><strong>Table</strong>: the table name. If the <strong>all</strong> parameter is set to <strong>false</strong>, you must also specify the names of the tables to be synchronized in the JSON array.</li>
     * </ul>
     * <p>Example: <code>{    &quot;testdb&quot;: {     &quot;name&quot;: &quot;testdb&quot;,     &quot;all&quot;: false,     &quot;Table&quot;: {       &quot;order&quot;: {         &quot;name&quot;: &quot;order&quot;,         &quot;all&quot;: true       },       &quot;ordernew&quot;: {         &quot;name&quot;: &quot;ordernew&quot;,         &quot;all&quot;: true       }     }   } }</code></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{    &quot;testdb&quot;: {     &quot;name&quot;: &quot;testdb&quot;,     &quot;all&quot;: false,     &quot;Table&quot;: {       &quot;order&quot;: {         &quot;name&quot;: &quot;order&quot;,         &quot;all&quot;: true       },       &quot;ordernew&quot;: {         &quot;name&quot;: &quot;ordernew&quot;,         &quot;all&quot;: true       }     }   } }</p>
     */
    @NameInMap("DBList")
    public String DBList;

    /**
     * <p>The name of the GAD cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateGADInstanceRequestTag> tag;

    /**
     * <p>The unit node information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UnitNode")
    public java.util.List<CreateGADInstanceRequestUnitNode> unitNode;

    public static CreateGADInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGADInstanceRequest self = new CreateGADInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGADInstanceRequest setCentralDBInstanceId(String centralDBInstanceId) {
        this.centralDBInstanceId = centralDBInstanceId;
        return this;
    }
    public String getCentralDBInstanceId() {
        return this.centralDBInstanceId;
    }

    public CreateGADInstanceRequest setCentralRdsDtsAdminAccount(String centralRdsDtsAdminAccount) {
        this.centralRdsDtsAdminAccount = centralRdsDtsAdminAccount;
        return this;
    }
    public String getCentralRdsDtsAdminAccount() {
        return this.centralRdsDtsAdminAccount;
    }

    public CreateGADInstanceRequest setCentralRdsDtsAdminPassword(String centralRdsDtsAdminPassword) {
        this.centralRdsDtsAdminPassword = centralRdsDtsAdminPassword;
        return this;
    }
    public String getCentralRdsDtsAdminPassword() {
        return this.centralRdsDtsAdminPassword;
    }

    public CreateGADInstanceRequest setCentralRegionId(String centralRegionId) {
        this.centralRegionId = centralRegionId;
        return this;
    }
    public String getCentralRegionId() {
        return this.centralRegionId;
    }

    public CreateGADInstanceRequest setDBList(String DBList) {
        this.DBList = DBList;
        return this;
    }
    public String getDBList() {
        return this.DBList;
    }

    public CreateGADInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGADInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGADInstanceRequest setTag(java.util.List<CreateGADInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateGADInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateGADInstanceRequest setUnitNode(java.util.List<CreateGADInstanceRequestUnitNode> unitNode) {
        this.unitNode = unitNode;
        return this;
    }
    public java.util.List<CreateGADInstanceRequestUnitNode> getUnitNode() {
        return this.unitNode;
    }

    public static class CreateGADInstanceRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can create up to N tag keys at a time. Valid values of N: <strong>1 to 20</strong>. The tag key cannot be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that corresponds to the tag key. You can create up to N tag values at a time. Valid values of N: <strong>1 to 20</strong>. The tag value can be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateGADInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateGADInstanceRequestTag self = new CreateGADInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateGADInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateGADInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateGADInstanceRequestUnitNode extends TeaModel {
        /**
         * <p>The name of the new unit node. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be <strong>2 to 255</strong> characters in length.</li>
         * <li>The name must start with a letter or a Chinese character. It can contain digits, Chinese characters, letters, underscores (_), and hyphens (-).</li>
         * <li>The name cannot start with <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The storage capacity of the new unit node. Unit: GB. The value is incremented in 5 GB increments. For the value range, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a>. You can also call the DescribeAvailableResource operation to query the available storage capacity range for the target instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        /**
         * <p>The instance storage type. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: Premium Local SSD (recommended).</li>
         * <li><strong>cloud_ssd</strong>: standard SSD (not recommended because standard SSDs are no longer available for purchase in some regions).</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
         * </ul>
         * <p>The default value of this parameter is determined by the instance type specified in the <strong>DBInstanceClass</strong> parameter:</p>
         * <ul>
         * <li>If the instance type is a Premium Local SSD instance type, the default value is <strong>local_ssd</strong>.</li>
         * <li>If the instance type is a cloud disk instance type, the default value is <strong>cloud_essd</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd2</p>
         */
        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        /**
         * <p>The instance type of the new unit node. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a>. You can also call the DescribeAvailableResource operation to query the available instance types in the target region.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.t1.small</p>
         */
        @NameInMap("DbInstanceClass")
        public String dbInstanceClass;

        /**
         * <p>The conflict resolution policy used when a primary key conflict occurs during data synchronization for the new unit node. Valid values:</p>
         * <ul>
         * <li><strong>overwrite</strong>: overwrites the conflicting primary key on the destination node.</li>
         * <li><strong>interrupt</strong>: stops the synchronization task and reports an error.</li>
         * <li><strong>ignore</strong>: ignores the conflicting primary key on the current node.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>overwrite</p>
         */
        @NameInMap("DtsConflict")
        public String dtsConflict;

        /**
         * <p>The specification of the data synchronization link for the new unit node. Valid values:</p>
         * <ul>
         * <li><strong>small</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>large</strong></li>
         * <li><strong>micro</strong></li>
         * </ul>
         * <blockquote>
         * <p>For more information about the differences between specifications, see <a href="https://help.aliyun.com/document_detail/26605.html">Data synchronization link specifications</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("DtsInstanceClass")
        public String dtsInstanceClass;

        /**
         * <p>The database engine of the new unit node. Only <strong>MySQL</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the new unit node. Valid values:</p>
         * <ul>
         * <li><strong>8.0</strong></li>
         * <li><strong>5.7</strong></li>
         * <li><strong>5.6</strong></li>
         * <li><strong>5.5</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The billing method of the new unit node. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * <blockquote>
         * <p>The system automatically generates and completes the payment for the order. You do not need to manually confirm the payment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID of the new unit node. You can call the DescribeRegions operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP address whitelist</a> of the new unit node. Separate multiple entries with commas (,). Entries cannot be duplicated. A maximum of 1,000 entries are allowed. The following two formats are supported:</p>
         * <ul>
         * <li>IP address format, such as <code>10.10.10.10</code>.</li>
         * <li>CIDR format, such as <code>10.10.10.10/24</code> (Classless Inter-Domain Routing, where <strong>24</strong> indicates the length of the prefix, ranging from <strong>1 to 32</strong>).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.10</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The vSwitch ID of the new unit node.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1tg609m5j85****</p>
         */
        @NameInMap("VSwitchID")
        public String vSwitchID;

        /**
         * <p>The virtual private cloud (VPC) ID of the new unit node.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19ame5m1r3o****</p>
         */
        @NameInMap("VpcID")
        public String vpcID;

        /**
         * <p>The zone ID of the new unit node. You can call the DescribeRegions operation to query the zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneID")
        public String zoneID;

        /**
         * <p>The zone ID of the secondary node for the new unit node. You can call the DescribeRegions operation to query the zone ID.</p>
         * <ul>
         * <li>If this value is the same as the <strong>ZoneId</strong> of the current unit node, the single-zone deployment is used.</li>
         * <li>If this value is different from the <strong>ZoneId</strong> of the current unit node, the multi-zone deployment is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneIDSlave1")
        public String zoneIDSlave1;

        /**
         * <p>The zone ID of the logger node for the new unit node. You can call the DescribeRegions operation to query the zone ID.</p>
         * <ul>
         * <li>If this value is the same as the <strong>ZoneId</strong> of the current unit node, the single-zone deployment is used.</li>
         * <li>If this value is different from the <strong>ZoneId</strong> of the current unit node, the multi-zone deployment is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneIDSlave2")
        public String zoneIDSlave2;

        public static CreateGADInstanceRequestUnitNode build(java.util.Map<String, ?> map) throws Exception {
            CreateGADInstanceRequestUnitNode self = new CreateGADInstanceRequestUnitNode();
            return TeaModel.build(map, self);
        }

        public CreateGADInstanceRequestUnitNode setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public CreateGADInstanceRequestUnitNode setDBInstanceStorage(Long DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public CreateGADInstanceRequestUnitNode setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public CreateGADInstanceRequestUnitNode setDbInstanceClass(String dbInstanceClass) {
            this.dbInstanceClass = dbInstanceClass;
            return this;
        }
        public String getDbInstanceClass() {
            return this.dbInstanceClass;
        }

        public CreateGADInstanceRequestUnitNode setDtsConflict(String dtsConflict) {
            this.dtsConflict = dtsConflict;
            return this;
        }
        public String getDtsConflict() {
            return this.dtsConflict;
        }

        public CreateGADInstanceRequestUnitNode setDtsInstanceClass(String dtsInstanceClass) {
            this.dtsInstanceClass = dtsInstanceClass;
            return this;
        }
        public String getDtsInstanceClass() {
            return this.dtsInstanceClass;
        }

        public CreateGADInstanceRequestUnitNode setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public CreateGADInstanceRequestUnitNode setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public CreateGADInstanceRequestUnitNode setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public CreateGADInstanceRequestUnitNode setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

        public CreateGADInstanceRequestUnitNode setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public CreateGADInstanceRequestUnitNode setVSwitchID(String vSwitchID) {
            this.vSwitchID = vSwitchID;
            return this;
        }
        public String getVSwitchID() {
            return this.vSwitchID;
        }

        public CreateGADInstanceRequestUnitNode setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public CreateGADInstanceRequestUnitNode setZoneID(String zoneID) {
            this.zoneID = zoneID;
            return this;
        }
        public String getZoneID() {
            return this.zoneID;
        }

        public CreateGADInstanceRequestUnitNode setZoneIDSlave1(String zoneIDSlave1) {
            this.zoneIDSlave1 = zoneIDSlave1;
            return this;
        }
        public String getZoneIDSlave1() {
            return this.zoneIDSlave1;
        }

        public CreateGADInstanceRequestUnitNode setZoneIDSlave2(String zoneIDSlave2) {
            this.zoneIDSlave2 = zoneIDSlave2;
            return this;
        }
        public String getZoneIDSlave2() {
            return this.zoneIDSlave2;
        }

    }

}
