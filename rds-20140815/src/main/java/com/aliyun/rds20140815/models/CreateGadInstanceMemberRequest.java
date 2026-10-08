// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGadInstanceMemberRequest extends TeaModel {
    /**
     * <p>The ID of the central node. You can call DescribeGadInstances to query the central node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp190h8y69tad****</p>
     */
    @NameInMap("CentralDBInstanceId")
    public String centralDBInstanceId;

    /**
     * <p>The privileged account of the central node. You can call DescribeAccounts to query the account.</p>
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
     * <p>The region ID of the central node (primary node). You can call DescribeRegions to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CentralRegionId")
    public String centralRegionId;

    /**
     * <p>A JSON array of database information from the central node. All databases in the array are synchronized to the current unit node. Metric description:</p>
     * <ul>
     * <li><strong>name</strong>: the database name.</li>
     * <li><strong>all</strong>: specifies whether to synchronize all data in the current database or table. Valid values: <strong>true</strong> | <strong>false</strong>.</li>
     * <li><strong>Table</strong>: the table name. If the <strong>all</strong> parameter is set to <strong>false</strong>, you must also specify the table names to be synchronized in the JSON array.</li>
     * </ul>
     * <p>Example: <code>{    &quot;testdb&quot;: {     &quot;name&quot;: &quot;testdb&quot;,     &quot;all&quot;: false,     &quot;Table&quot;: {       &quot;order&quot;: {         &quot;name&quot;: &quot;order&quot;,         &quot;all&quot;: true       },       &quot;ordernew&quot;: {         &quot;name&quot;: &quot;ordernew&quot;,         &quot;all&quot;: true       }     }   } }</code></p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects for migration, synchronization, or subscribe</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{    &quot;testdb&quot;: {     &quot;name&quot;: &quot;testdb&quot;,     &quot;all&quot;: false,     &quot;Table&quot;: {       &quot;order&quot;: {         &quot;name&quot;: &quot;order&quot;,         &quot;all&quot;: true       },       &quot;ordernew&quot;: {         &quot;name&quot;: &quot;ordernew&quot;,         &quot;all&quot;: true       }     }   } }</p>
     */
    @NameInMap("DBList")
    public String DBList;

    /**
     * <p>The ID of the ApsaraDB RDS global active database cluster. You can call DescribeGadInstances to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-rm-bp1npi2j8****</p>
     */
    @NameInMap("GadInstanceId")
    public String gadInstanceId;

    /**
     * <p>The list of unit node (secondary node) information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UnitNode")
    public java.util.List<CreateGadInstanceMemberRequestUnitNode> unitNode;

    public static CreateGadInstanceMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGadInstanceMemberRequest self = new CreateGadInstanceMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateGadInstanceMemberRequest setCentralDBInstanceId(String centralDBInstanceId) {
        this.centralDBInstanceId = centralDBInstanceId;
        return this;
    }
    public String getCentralDBInstanceId() {
        return this.centralDBInstanceId;
    }

    public CreateGadInstanceMemberRequest setCentralRdsDtsAdminAccount(String centralRdsDtsAdminAccount) {
        this.centralRdsDtsAdminAccount = centralRdsDtsAdminAccount;
        return this;
    }
    public String getCentralRdsDtsAdminAccount() {
        return this.centralRdsDtsAdminAccount;
    }

    public CreateGadInstanceMemberRequest setCentralRdsDtsAdminPassword(String centralRdsDtsAdminPassword) {
        this.centralRdsDtsAdminPassword = centralRdsDtsAdminPassword;
        return this;
    }
    public String getCentralRdsDtsAdminPassword() {
        return this.centralRdsDtsAdminPassword;
    }

    public CreateGadInstanceMemberRequest setCentralRegionId(String centralRegionId) {
        this.centralRegionId = centralRegionId;
        return this;
    }
    public String getCentralRegionId() {
        return this.centralRegionId;
    }

    public CreateGadInstanceMemberRequest setDBList(String DBList) {
        this.DBList = DBList;
        return this;
    }
    public String getDBList() {
        return this.DBList;
    }

    public CreateGadInstanceMemberRequest setGadInstanceId(String gadInstanceId) {
        this.gadInstanceId = gadInstanceId;
        return this;
    }
    public String getGadInstanceId() {
        return this.gadInstanceId;
    }

    public CreateGadInstanceMemberRequest setUnitNode(java.util.List<CreateGadInstanceMemberRequestUnitNode> unitNode) {
        this.unitNode = unitNode;
        return this;
    }
    public java.util.List<CreateGadInstanceMemberRequestUnitNode> getUnitNode() {
        return this.unitNode;
    }

    public static class CreateGadInstanceMemberRequestUnitNode extends TeaModel {
        /**
         * <p>The name of the new unit node. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be <strong>2 to 255</strong> characters in length.</li>
         * <li>The name must start with a Chinese character or a letter. It can contain digits, Chinese characters, letters, underscores (_), and hyphens (-).</li>
         * <li>The name cannot start with <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The storage capacity of the new unit node. Unit: GB. The value is incremented in steps of 5 GB. For the value range, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>. You can also call the DescribeAvailableResource operation to query the available storage capacity range for the target instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        /**
         * <p>The instance storage type. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local SSD</li>
         * <li><strong>cloud_ssd</strong>: standard SSD cloud disk</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD cloud disk</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD cloud disk</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD cloud disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
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
         * <li><strong>overwrite</strong>: Overwrites the conflicting primary key on the destination node.</li>
         * <li><strong>interrupt</strong>: Stops the synchronization task and reports an error.</li>
         * <li><strong>ignore</strong>: Overwrites the conflicting primary key on the current node.</li>
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
         * <p>The region ID of the new unit node (secondary node). You can call DescribeRegions to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP whitelist</a> of the new unit node. Separate multiple entries with commas (,). Entries cannot be duplicated. A maximum of 1,000 entries are allowed. The following two formats are supported:</p>
         * <ul>
         * <li>IP address format, such as <code>10.10.XX.XX</code>.</li>
         * <li>CIDR format, such as <code>10.10.XX.XX/24</code> (Classless Inter-Domain Routing, where <strong>24</strong> indicates the prefix length, ranging from <strong>1 to 32</strong>).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.10.XX.XX</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The vSwitch ID of the new unit node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1tg609m5j85****</p>
         */
        @NameInMap("VSwitchID")
        public String vSwitchID;

        /**
         * <p>The virtual private cloud (VPC) ID of the new unit node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19ame5m1r3o****</p>
         */
        @NameInMap("VpcID")
        public String vpcID;

        /**
         * <p>The zone ID of the new unit node. You can call DescribeRegions to query the zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneID")
        public String zoneID;

        /**
         * <p>The zone ID of the secondary node for the new unit node. You can call DescribeRegions to query the zone ID.</p>
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
         * <p>The zone ID of the logger node for the new unit node. You can call DescribeRegions to query the zone ID.</p>
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

        public static CreateGadInstanceMemberRequestUnitNode build(java.util.Map<String, ?> map) throws Exception {
            CreateGadInstanceMemberRequestUnitNode self = new CreateGadInstanceMemberRequestUnitNode();
            return TeaModel.build(map, self);
        }

        public CreateGadInstanceMemberRequestUnitNode setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public CreateGadInstanceMemberRequestUnitNode setDBInstanceStorage(Long DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public CreateGadInstanceMemberRequestUnitNode setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public CreateGadInstanceMemberRequestUnitNode setDbInstanceClass(String dbInstanceClass) {
            this.dbInstanceClass = dbInstanceClass;
            return this;
        }
        public String getDbInstanceClass() {
            return this.dbInstanceClass;
        }

        public CreateGadInstanceMemberRequestUnitNode setDtsConflict(String dtsConflict) {
            this.dtsConflict = dtsConflict;
            return this;
        }
        public String getDtsConflict() {
            return this.dtsConflict;
        }

        public CreateGadInstanceMemberRequestUnitNode setDtsInstanceClass(String dtsInstanceClass) {
            this.dtsInstanceClass = dtsInstanceClass;
            return this;
        }
        public String getDtsInstanceClass() {
            return this.dtsInstanceClass;
        }

        public CreateGadInstanceMemberRequestUnitNode setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public CreateGadInstanceMemberRequestUnitNode setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public CreateGadInstanceMemberRequestUnitNode setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

        public CreateGadInstanceMemberRequestUnitNode setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public CreateGadInstanceMemberRequestUnitNode setVSwitchID(String vSwitchID) {
            this.vSwitchID = vSwitchID;
            return this;
        }
        public String getVSwitchID() {
            return this.vSwitchID;
        }

        public CreateGadInstanceMemberRequestUnitNode setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public CreateGadInstanceMemberRequestUnitNode setZoneID(String zoneID) {
            this.zoneID = zoneID;
            return this;
        }
        public String getZoneID() {
            return this.zoneID;
        }

        public CreateGadInstanceMemberRequestUnitNode setZoneIDSlave1(String zoneIDSlave1) {
            this.zoneIDSlave1 = zoneIDSlave1;
            return this;
        }
        public String getZoneIDSlave1() {
            return this.zoneIDSlave1;
        }

        public CreateGadInstanceMemberRequestUnitNode setZoneIDSlave2(String zoneIDSlave2) {
            this.zoneIDSlave2 = zoneIDSlave2;
            return this;
        }
        public String getZoneIDSlave2() {
            return this.zoneIDSlave2;
        }

    }

}
