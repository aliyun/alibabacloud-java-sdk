// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGADInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the primary instance. You can call the DescribeDBInstances operation to query the instance ID. The primary instance serves as the central node of the global active database cluster.</p>
     * <blockquote>
     * <ul>
     * <li>A primary instance can serve only as the central node of a single global active database cluster.</li>
     * <li>The primary instance can serve as the central node of the global active database cluster only in the following regions: China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), China (Zhangjiakou), China (Shenzhen), and China (Chengdu).</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*******</p>
     */
    @NameInMap("CentralDBInstanceId")
    public String centralDBInstanceId;

    /**
     * <p>The username of the privileged account of the central node. You can call the DescribeAccounts operation to query the privileged account of the central node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CentralRdsDtsAdminAccount")
    public String centralRdsDtsAdminAccount;

    /**
     * <p>The password of the privileged account of the central node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test12345</p>
     */
    @NameInMap("CentralRdsDtsAdminPassword")
    public String centralRdsDtsAdminPassword;

    /**
     * <p>The region ID of the central node. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CentralRegionId")
    public String centralRegionId;

    /**
     * <p>A JSON array that consists of the information about a specified database on the central node. All database information that you specify in this array is synchronized to the unit nodes of the global active database cluster. The JSON array contains the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: the name of the database.</li>
     * <li><strong>all</strong>: specifies whether to synchronize all data in the database or the table. Valid values: <strong>true</strong> and <strong>false</strong>.</li>
     * <li><strong>Table</strong>: the name of the table. If you set the <strong>all</strong> field to <strong>false</strong>, you must nest the name of the table that you want to synchronize into the JSON array.</li>
     * </ul>
     * <p>Example: <code>{ &quot;testdb&quot;: { &quot;name&quot;: &quot;testdb&quot;, &quot;all&quot;: false, &quot;Table&quot;: { &quot;order&quot;: { &quot;name&quot;: &quot;order&quot;, &quot;all&quot;: true }, &quot;ordernew&quot;: { &quot;name&quot;: &quot;ordernew&quot;, &quot;all&quot;: true } } } }</code></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{    &quot;testdb&quot;: {     &quot;name&quot;: &quot;testdb&quot;,     &quot;all&quot;: false,     &quot;Table&quot;: {       &quot;order&quot;: {         &quot;name&quot;: &quot;order&quot;,         &quot;all&quot;: true       },       &quot;ordernew&quot;: {         &quot;name&quot;: &quot;ordernew&quot;,         &quot;all&quot;: true       }     }   } }</p>
     */
    @NameInMap("DBList")
    public String DBList;

    /**
     * <p>The name of the global active database cluster.</p>
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
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>An array that consists of the details about the tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateGADInstanceRequestTag> tag;

    /**
     * <p>The information about the unit node.</p>
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
         * <p>The key of the tag. You can create N tag keys at a time. Valid values of N: <strong>1 to 20</strong>. The value of this parameter cannot be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can create N tag values at a time. Valid values of N: <strong>1 to 20</strong>. The value of this parameter can be an empty string.</p>
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
         * <p>The name of the unit node that you want to create. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be <strong>2 to 255</strong> characters in length.</li>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-) and must start with a letter.</li>
         * <li>The name cannot start with <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The storage capacity of the unit node that you want to create. Unit: GB You can adjust the storage capacity in increments of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>. You can also call the DescribeAvailableResource operation to query the storage capacity range that is supported by the new instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local SSD. This is the recommended storage type.</li>
         * <li><strong>cloud_ssd</strong>: standard SSD. This storage type is not recommended. Standard SSDs are no longer available for purchase in some Alibaba Cloud regions.</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
         * </ul>
         * <p>The default value of this parameter is determined by the instance type specified by the <strong>DBInstanceClass</strong> parameter.</p>
         * <ul>
         * <li>If the instance type specifies the local SSD storage type, the default value of this parameter is <strong>local_ssd</strong>.</li>
         * <li>If the instance type specifies the cloud disk storage type, the default value of this parameter is <strong>cloud_essd</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd2</p>
         */
        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        /**
         * <p>The instance type of the unit node that you want to create. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>. You can call the DescribeAvailableResource operation to query the available instance types in a region.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.t1.small</p>
         */
        @NameInMap("DbInstanceClass")
        public String dbInstanceClass;

        /**
         * <p>The conflict resolution policy based on which Data Transmission Service (DTS) responds to primary key conflicts during data synchronization to the unit node that you want to create. Valid values:</p>
         * <ul>
         * <li><strong>overwrite</strong>: DTS overwrites the conflicting primary key on the destination node.</li>
         * <li><strong>interrupt</strong>: DTS stops the synchronization task, reports an error, and then exits.</li>
         * <li><strong>ignore</strong>: DTS hides the conflicting primary key on the node.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>overwrite</p>
         */
        @NameInMap("DtsConflict")
        public String dtsConflict;

        /**
         * <p>The specifications of the data synchronization task for the unit node that you want to create. Valid values:</p>
         * <ul>
         * <li><strong>small</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>large</strong></li>
         * <li><strong>micro</strong></li>
         * </ul>
         * <blockquote>
         * <p> For more information, see <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization tasks</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("DtsInstanceClass")
        public String dtsInstanceClass;

        /**
         * <p>The database engine of the unit node that you want to create. Set the value to <strong>MySQL</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the unit node that you want to create. Valid values:</p>
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
         * <p>The billing method of the unit node that you want to create. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription</li>
         * </ul>
         * <blockquote>
         * <p> The system automatically generates a purchase order and completes the payment. You do not need to manually confirm the purchase order or complete the payment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID of the unit node that you want to create. You can call the DescribeRegions operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP address whitelist</a> of the unit node that you want to create. If you want to add more than one entry to the IP address whitelist, separate the entries with commas (,). Each entry must be unique. The IP address whitelist can contain up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:</p>
         * <ul>
         * <li>IP addresses, such as <code>10.10.10.10</code>.</li>
         * <li>CIDR blocks, such as <code>10.10.10.10/24</code>. In this example, <strong>24</strong> indicates that the prefix of the IP address in the whitelist is 24 bits in length. You can replace 24 with a value within the range of <strong>1 to 32</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.10</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The vSwitch ID of the unit node that you want to create.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1tg609m5j85********</p>
         */
        @NameInMap("VSwitchID")
        public String vSwitchID;

        /**
         * <p>The virtual private cloud (VPC) ID of the unit node that you want to create.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19ame5m1r3o********</p>
         */
        @NameInMap("VpcID")
        public String vpcID;

        /**
         * <p>The zone ID of the unit node that you want to create. You can call the DescribeRegions operation to query the zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneID")
        public String zoneID;

        /**
         * <p>The zone ID of the secondary node of the unit node that you want to create. You can call the DescribeRegions operation to query the zone ID.</p>
         * <ul>
         * <li>If the value of this parameter is the same as the <strong>zone ID</strong> of the unit node that you want to create, the single-zone deployment method is used.</li>
         * <li>If the value of this parameter is different from the <strong>zone ID</strong> of the unit node that you want to create, the multiple-zone deployment method is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneIDSlave1")
        public String zoneIDSlave1;

        /**
         * <p>The zone ID of the logger node of the unit node that you want to create. You can call the DescribeRegions operation to query the zone ID.</p>
         * <ul>
         * <li>If the value of this parameter is the same as the <strong>zone ID</strong> of the unit node that you want to create, the single-zone deployment method is used.</li>
         * <li>If the value of this parameter is different from the <strong>zone ID</strong> of the unit node that you want to create, the multiple-zone deployment method is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
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
