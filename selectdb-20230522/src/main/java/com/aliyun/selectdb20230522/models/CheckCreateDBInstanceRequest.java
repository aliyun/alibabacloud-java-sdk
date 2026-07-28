// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CheckCreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The reserved cache size, in GB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CacheSize")
    public Integer cacheSize;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: subscription.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. The token must be unique among different requests. The token can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>AB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection string of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213c8y****-public.selectdbfe.pre.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><p><strong>selectdb.xlarge</strong>: 4 cores, 32 GB.</p>
     * </li>
     * <li><p><strong>selectdb.2xlarge</strong>: 8 cores, 64 GB.</p>
     * </li>
     * <li><p><strong>selectdb.4xlarge</strong>: 16 cores, 128 GB.</p>
     * </li>
     * <li><p><strong>selectdb.8xlarge</strong>: 32 cores, 256 GB.</p>
     * </li>
     * <li><p><strong>selectdb.16xlarge</strong>: 64 cores, 512 GB.</p>
     * </li>
     * <li><p><strong>selectdb.24xlarge</strong>: 96 cores, 768 GB.</p>
     * </li>
     * <li><p><strong>selectdb.32xlarge</strong>: 128 cores, 1024 GB.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb.xlarge</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>New instance test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The database engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>SelectDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><p><strong>Year</strong></p>
     * </li>
     * <li><p><strong>Month</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required and takes effect only when <strong>ChargeType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4690g37929****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address whitelist for the instance. Separate multiple IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX/12,192.168.XX.XX/22</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li><p>If Period is set to Year, valid values are 1, 2, 3, 4, and 5.</p>
     * </li>
     * <li><p>If Period is set to Month, valid values are integers from 1 to 12.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required and takes effect only when ChargeType is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp175iuvg8nxqraf2****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CheckCreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateDBInstanceRequest self = new CheckCreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CheckCreateDBInstanceRequest setCacheSize(Integer cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }
    public Integer getCacheSize() {
        return this.cacheSize;
    }

    public CheckCreateDBInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CheckCreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CheckCreateDBInstanceRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CheckCreateDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CheckCreateDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CheckCreateDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CheckCreateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CheckCreateDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CheckCreateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckCreateDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CheckCreateDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckCreateDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CheckCreateDBInstanceRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CheckCreateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CheckCreateDBInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CheckCreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
