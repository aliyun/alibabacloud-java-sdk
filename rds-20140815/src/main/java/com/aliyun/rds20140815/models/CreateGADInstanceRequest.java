// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGADInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the primary instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of instance. The primary instance serves as the central node of the global active database cluster.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   A primary instance can serve as the central node only of a single global active database cluster.</p>
     * <br>
     * <p>*   Only a primary instance that is created in one of the following regions can serve as the central node of a global active database cluster: China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), China (Zhangjiakou), China (Shenzhen), and China (Chengdu).</p>
     */
    @NameInMap("CentralDBInstanceId")
    public String centralDBInstanceId;

    /**
     * <p>The username of the privileged account of the central node. You can call the [DescribeAccounts](~~26265~~) operation to query the privileged account of the central node.</p>
     */
    @NameInMap("CentralRdsDtsAdminAccount")
    public String centralRdsDtsAdminAccount;

    /**
     * <p>The password of the privileged account of the central node.</p>
     */
    @NameInMap("CentralRdsDtsAdminPassword")
    public String centralRdsDtsAdminPassword;

    /**
     * <p>The region ID of the central node. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("CentralRegionId")
    public String centralRegionId;

    /**
     * <p>A JSON array that consists of the information about a specified database on the central node. All database information that you specify in this array is synchronized to the unit nodes of the global active database cluster. The JSON array contains the following fields:</p>
     * <br>
     * <p>*   **name**: the name of the database.</p>
     * <p>*   **all**: specifies whether to synchronize all data in the database or the table. Valid values: **true** and **false**.</p>
     * <p>*   **Table**: the name of the table. If you set the **all** field to **false**, you must nest the name of the table that you want to synchronize into the JSON array.</p>
     * <br>
     * <p>Example: `{ "testdb": { "name": "testdb", "all": false, "Table": { "order": { "name": "order", "all": true }, "ordernew": { "name": "ordernew", "all": true } } } }`</p>
     */
    @NameInMap("DBList")
    public String DBList;

    /**
     * <p>The name of the global active database cluster.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>An array that consists of the details about the tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateGADInstanceRequestTag> tag;

    /**
     * <p>An array that consists of the details about the unit node.</p>
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
         * <p>The key of the tag. You can create N tag keys at a time. Valid values of N: **1 to 20**. The value of this parameter cannot be an empty string.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can create N tag values at a time. Valid values of N: **1 to 20**. The value of this parameter can be an empty string.</p>
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
         * <br>
         * <p>*   The name must be **2 to 255** characters in length.</p>
         * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-) and must start with a letter.</p>
         * <p>*   It cannot start with `http://` or `https://`.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The storage capacity of the unit node that you want to create. Unit: GB. The storage capacity increases in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can also call the [DescribeAvailableResource](~~134039~~) operation to query the storage capacity range that is supported for a specified instance type in a region.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        /**
         * <p>The storage type that is used by the instance. Valid values:</p>
         * <br>
         * <p>*   **local_ssd**: local SSD (recommended).</p>
         * <p>*   **cloud_ssd**: standard SSD. This storage type is not recommended. Standard SSDs are no longer available for purchase in some Alibaba Cloud regions.</p>
         * <p>*   **cloud_essd**: ESSD of performance level 1 (PL1).</p>
         * <p>*   **cloud_essd2**: ESSD of PL2.</p>
         * <p>*   **cloud_essd3**: ESSDs of PL3.</p>
         * <br>
         * <p>The default value of this parameter is determined by the instance type specified by the **DBInstanceClass** parameter.</p>
         * <br>
         * <p>*   If the instance type specifies the local disk storage type, the default value of this parameter is **local_ssd**.</p>
         * <p>*   If the instance type specifies the cloud disk storage type, the default value of this parameter is **cloud_essd**.</p>
         */
        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        /**
         * <p>The instance type of the unit node that you want to create. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can call the [DescribeAvailableResource](~~134039~~) operation to query the available instance types in a region.</p>
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
         * <p>*   **ignore**: DTS hides the conflicting primary key on the node.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
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
         * <p>> For more information, see [Specifications of data synchronization tasks](~~26605~~).</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
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
         * <p>The billing method of the unit node that you want to create. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: pay-as-you-go.</p>
         * <p>*   **Prepaid**: subscription.</p>
         * <br>
         * <p>> The system automatically generates a purchase order and completes the payment.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID of the unit node that you want to create. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>The IP address whitelist of the unit node that you want to create. For more information, see [IP address whitelist](~~43185~~). If you want to add more than one entry to the IP address whitelist, separate the entries with commas (,). Each entry must be unique. The IP address whitelist can contain up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:</p>
         * <br>
         * <p>*   IP addresses, such as `10.10.10.10`.</p>
         * <p>*   CIDR blocks, such as `10.10.10.10/24`. In this example, **24** indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of **1 to 32**.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The vSwitch ID of the unit node that you want to create.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("VSwitchID")
        public String vSwitchID;

        /**
         * <p>The virtual private cloud (VPC) ID of the unit node that you want to create.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("VpcID")
        public String vpcID;

        /**
         * <p>The zone ID of the unit node that you want to create. You can call the [DescribeRegions](~~26243~~) operation to query the ID of the zone.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("ZoneID")
        public String zoneID;

        /**
         * <p>The zone ID of the secondary node of the unit node that you want to create. You can call the [DescribeRegions](~~26243~~) operation to query the ID of the zone.</p>
         * <br>
         * <p>*   If the value of this parameter is the same as the **zone ID** of the unit node that you want to create, the single-zone deployment method is used.</p>
         * <p>*   If the value of this parameter is different from the **zone ID** of the unit node that you want to create, the multiple-zone deployment method is used.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
         */
        @NameInMap("ZoneIDSlave1")
        public String zoneIDSlave1;

        /**
         * <p>The zone ID of the logger node of the unit node that you want to create. You can call the [DescribeRegions](~~26243~~) operation to query the ID of the zone.</p>
         * <br>
         * <p>*   If the value of this parameter is the same as the **zone ID** of the unit node that you want to create, the single-zone deployment method is used.</p>
         * <p>*   If the value of this parameter is different from the **zone ID** of the unit node that you want to create, the multiple-zone deployment method is used.</p>
         * <br>
         * <p>**N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.</p>
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
