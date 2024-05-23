// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGadInstanceMemberRequest extends TeaModel {
    /**
     * <p>The ID of the central node . You can call the DescribeGadInstances operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CentralDBInstanceId")
    public String centralDBInstanceId;

    /**
     * <p>The username of the privileged account of the central node. You can call the DescribeAccounts operation to query the privileged account of the central node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CentralRdsDtsAdminAccount")
    public String centralRdsDtsAdminAccount;

    /**
     * <p>The password of the privileged account of the central node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CentralRdsDtsAdminPassword")
    public String centralRdsDtsAdminPassword;

    /**
     * <p>The region ID of the central node. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CentralRegionId")
    public String centralRegionId;

    /**
     * <p>A JSON array that consists of the information about the databases on the central node. All database information that you specify in this array is synchronized to the unit nodes of the global active database cluster. The JSON array contains the following fields:</p>
     * <br>
     * <p>*   **name**: the name of the database.</p>
     * <p>*   **all**: specifies whether to synchronize all data in the database or the table. Valid values: **true** and **false**.</p>
     * <p>*   **Table**: the name of the table. If you set the **all** field to **false**, you must nest the name of the table that you want to synchronize into the JSON array.</p>
     * <br>
     * <p>Example: `{ "testdb": { "name": "testdb", "all": false, "Table": { "order": { "name": "order", "all": true }, "ordernew": { "name": "ordernew", "all": true } } } }`</p>
     * <br>
     * <p>>  For more information, see [Objects of DTS tasks](https://help.aliyun.com/document_detail/209545.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBList")
    public String DBList;

    /**
     * <p>The ID of the global active database cluster. You can call the DescribeGadInstances operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GadInstanceId")
    public String gadInstanceId;

    /**
     * <p>The information about the unit node.</p>
     * <br>
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
         * <p>The name of the unit node that you want to create. The name must meet the following requirements:</p>
         * <br>
         * <p>*   The name must be **2 to 255** characters in length.</p>
         * <p>*   The name can contain letters, digits, underscores (_), and hyphens (-) and must start with a letter.</p>
         * <p>*   The name cannot start with `http://` or `https://`.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The storage capacity of the unit node that you want to create. Unit: GB. You can adjust the storage capacity in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](https://help.aliyun.com/document_detail/26312.html). You can also call the DescribeAvailableResource operation to query the storage capacity range that is available for a specific instance type in a region.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        /**
         * <p>The storage type of the new instance. Valid values:</p>
         * <br>
         * <p>*   **local_ssd**: local SSDs</p>
         * <p>*   **cloud_ssd**: standard SSDs</p>
         * <p>*   **cloud_essd**: PL1 ESSDs</p>
         * <p>*   **cloud_essd2**: PL2 ESSDs</p>
         * <p>*   **cloud_essd3**: PL3 ESSD</p>
         */
        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        /**
         * <p>The instance type of the unit node that you want to create. For more information, see [Primary ApsaraDB RDS instance types](https://help.aliyun.com/document_detail/26312.html). You can call the DescribeAvailableResource operation to query the available instance types in a region.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("DbInstanceClass")
        public String dbInstanceClass;

        /**
         * <p>The conflict resolution policy based on which Data Transmission Service (DTS) responds to primary key conflicts during data synchronization to the unit node that you want to create. Valid values:</p>
         * <br>
         * <p>*   **overwrite**: DTS overwrites the conflicting primary key on the destination node.</p>
         * <p>*   **interrupt**: DTS stops the synchronization task, reports an error, and then exits.</p>
         * <p>*   **ignore**: DTS overwrites the conflicting primary key on the logger node.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DtsConflict")
        public String dtsConflict;

        /**
         * <p>The specifications of the data synchronization task for the unit node that you want to create. Valid values:</p>
         * <br>
         * <p>*   **small**</p>
         * <p>*   **medium**</p>
         * <p>*   **large**</p>
         * <p>*   **micro**</p>
         * <br>
         * <p>>  For more information, see [Specifications of data synchronization instances](https://help.aliyun.com/document_detail/26605.html).</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DtsInstanceClass")
        public String dtsInstanceClass;

        /**
         * <p>The database engine of the unit node that you want to create. Set the value to **MySQL**.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the unit node that you want to create. Valid values:</p>
         * <br>
         * <p>*   **8.0**</p>
         * <p>*   **5.7**</p>
         * <p>*   **5.6**</p>
         * <p>*   **5.5**</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The region ID of the unit node that you want to create. You can call the DescribeRegions operation to query the most recent region list.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>The IP address whitelist of the unit node that you want to create. For more information, see [IP address whitelist](https://help.aliyun.com/document_detail/43185.html). If you want to add more than one entry to the IP address whitelist, separate the entries with commas (,). Each entry must be unique. The IP address whitelist can contain up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:</p>
         * <br>
         * <p>*   IP addresses, such as `10.10.XX.XX`.</p>
         * <p>*   CIDR blocks, such as `10.10.XX.XX/24`. In this example, **24** indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of **1 to 32**.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The vSwitch ID of the unit node that you want to create.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("VSwitchID")
        public String vSwitchID;

        /**
         * <p>The virtual private cloud (VPC) ID of the unit node that you want to create.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("VpcID")
        public String vpcID;

        /**
         * <p>The zone ID of the unit node that you want to create. You can call the DescribeRegions operation to query zone ID.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("ZoneID")
        public String zoneID;

        /**
         * <p>The zone ID of the secondary node of the unit node that you want to create. You can call the DescribeRegions operation to query the zone ID.</p>
         * <br>
         * <p>*   If the value of this parameter is the same as the **zone ID** of the unit node that you want to create, the single-zone deployment method is used.</p>
         * <p>*   If the value of this parameter is different from the **zone ID** of the unit node that you want to create, the multiple-zone deployment method is used.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("ZoneIDSlave1")
        public String zoneIDSlave1;

        /**
         * <p>The zone ID of the logger node of the unit node that you want to create. You can call the DescribeRegions operation to query the zone ID.</p>
         * <br>
         * <p>*   If the value of this parameter is the same as the **zone ID** of the unit node that you want to create, the single-zone deployment method is used.</p>
         * <p>*   If the value of this parameter is different from the **zone ID** of the unit node that you want to create, the multiple-zone deployment method is used.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
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
