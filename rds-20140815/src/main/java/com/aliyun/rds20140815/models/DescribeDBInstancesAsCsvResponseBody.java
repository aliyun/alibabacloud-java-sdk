// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesAsCsvResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the fields in <strong>DBInstanceAttribute</strong>.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstancesAsCsvResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A444291****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstancesAsCsvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesAsCsvResponseBody self = new DescribeDBInstancesAsCsvResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesAsCsvResponseBody setItems(DescribeDBInstancesAsCsvResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesAsCsvResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstancesAsCsvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttributeSlaveZones extends TeaModel {
        @NameInMap("slaveRegion")
        public java.util.List<String> slaveRegion;

        public static DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttributeSlaveZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttributeSlaveZones self = new DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttributeSlaveZones();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttributeSlaveZones setSlaveRegion(java.util.List<String> slaveRegion) {
            this.slaveRegion = slaveRegion;
            return this;
        }
        public java.util.List<String> getSlaveRegion() {
            return this.slaveRegion;
        }

    }

    public static class DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute extends TeaModel {
        /**
         * <p>The maximum number of accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("AccountMaxQuantity")
        public Integer accountMaxQuantity;

        /**
         * <p>The type of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>super</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The service availability of the instance in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AvailabilityValue")
        public String availabilityValue;

        /**
         * <p>The category of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The connection mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Performance</strong>: standard mode.</li>
         * <li><strong>Safety</strong>: enhanced mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        @NameInMap("ConnectionMode")
        public String connectionMode;

        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2011-05-30T12:11:04Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DBInstanceCPU")
        public String DBInstanceCPU;

        /**
         * <p>The instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mys2.small</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>s</p>
         */
        @NameInMap("DBInstanceClassType")
        public String DBInstanceClassType;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The memory capacity of the instance. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("DBInstanceMemory")
        public Long DBInstanceMemory;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong></li>
         * <li><strong>Intranet</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The storage capacity of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>Primary</strong>: primary instance</li>
         * <li><strong>ReadOnly</strong>: read-only instance</li>
         * <li><strong>Guard</strong>: disaster recovery instance</li>
         * <li><strong>Temp</strong>: temporary instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The maximum number of databases that can be created on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DBMaxQuantity")
        public Integer DBMaxQuantity;

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-27T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>A deprecated parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("ExportKey")
        public String exportKey;

        /**
         * <p>The ID of the disaster recovery instance that is attached to the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf64zsuxxxxxxxxxx</p>
         */
        @NameInMap("GuardDBInstanceId")
        public String guardDBInstanceId;

        /**
         * <p>The ID of the instance from which incremental data comes. The incremental data of a disaster recovery instance comes from its primary instance. The incremental data of a read-only instance comes from its primary instance. If this parameter is not returned, the instance is a primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        @NameInMap("IncrementSourceDBInstanceId")
        public String incrementSourceDBInstanceId;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        /**
         * <p>The lock mode of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason why the instance was locked.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_expired</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The maintenance window of the instance. The time follows the ISO 8601 standard and is displayed in UTC. In the ApsaraDB RDS console, the maintenance window is displayed in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00Z-02:00Z</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The primary instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        /**
         * <p>The maximum number of concurrent connections.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum number of I/O requests per second.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>The billing method of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port that is used to connect to the instance over an internal network.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The latency of data replication from the primary instance to the read-only instance. This parameter is valid for read-only instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReadDelayTime")
        public String readDelayTime;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP addresses in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>42.xx.xx.xx</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>A deprecated parameter. You do not need to specify this parameter.</p>
         */
        @NameInMap("SlaveZones")
        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttributeSlaveZones slaveZones;

        /**
         * <p>N/A.</p>
         * 
         * <strong>example:</strong>
         * <p>No</p>
         */
        @NameInMap("SupportUpgradeAccountType")
        public String supportUpgradeAccountType;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The ID of the temporary instance that is attached to the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf64zsuxxxxxxxxxx</p>
         */
        @NameInMap("TempDBInstanceId")
        public String tempDBInstanceId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6adz52c2pxxxxxxxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6f7l4fg90xxxxxxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute self = new DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setAccountMaxQuantity(Integer accountMaxQuantity) {
            this.accountMaxQuantity = accountMaxQuantity;
            return this;
        }
        public Integer getAccountMaxQuantity() {
            return this.accountMaxQuantity;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setAvailabilityValue(String availabilityValue) {
            this.availabilityValue = availabilityValue;
            return this;
        }
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setDBMaxQuantity(Integer DBMaxQuantity) {
            this.DBMaxQuantity = DBMaxQuantity;
            return this;
        }
        public Integer getDBMaxQuantity() {
            return this.DBMaxQuantity;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setExportKey(String exportKey) {
            this.exportKey = exportKey;
            return this;
        }
        public String getExportKey() {
            return this.exportKey;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setGuardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
            this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
            return this;
        }
        public String getIncrementSourceDBInstanceId() {
            return this.incrementSourceDBInstanceId;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setReadDelayTime(String readDelayTime) {
            this.readDelayTime = readDelayTime;
            return this;
        }
        public String getReadDelayTime() {
            return this.readDelayTime;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setSlaveZones(DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttributeSlaveZones slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }
        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttributeSlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setSupportUpgradeAccountType(String supportUpgradeAccountType) {
            this.supportUpgradeAccountType = supportUpgradeAccountType;
            return this;
        }
        public String getSupportUpgradeAccountType() {
            return this.supportUpgradeAccountType;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setTempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstancesAsCsvResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        public java.util.List<DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeDBInstancesAsCsvResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesAsCsvResponseBodyItems self = new DescribeDBInstancesAsCsvResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesAsCsvResponseBodyItems setDBInstanceAttribute(java.util.List<DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute) {
            this.DBInstanceAttribute = DBInstanceAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstancesAsCsvResponseBodyItemsDBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

    }

}
