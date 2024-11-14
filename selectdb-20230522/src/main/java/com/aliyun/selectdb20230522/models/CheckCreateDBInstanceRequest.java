// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CheckCreateDBInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CacheSize")
    public Integer cacheSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <strong>example:</strong>
     * <p>AB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>selectdb-cn-7213c8y****-public.selectdbfe.pre.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The specifications of the instance. Valid values:</p>
     * <ul>
     * <li><strong>selectdb.xlarge</strong>: 4 CPU cores and 32 GB of memory.</li>
     * <li><strong>selectdb.2xlarge</strong>: 8 CPU cores and 64 GB of memory.</li>
     * <li><strong>selectdb.4xlarge</strong>: 16 CPU cores and 128 GB of memory.</li>
     * <li><strong>selectdb.8xlarge</strong>: 32 CPU cores and 256 GB of memory.</li>
     * <li><strong>selectdb.16xlarge</strong>: 64 CPU cores and 512 GB of memory.</li>
     * <li><strong>selectdb.24xlarge</strong>: 96 CPU cores and 768 GB of memory.</li>
     * <li><strong>selectdb.32xlarge</strong>: 128 CPU cores and 1,024 GB of memory.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb.xlarge</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <strong>example:</strong>
     * <p>SelectDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-4690g37929****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>172.16.XX.XX/12,192.168.XX.XX/22</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The subscription duration of the instance. Valid values:</p>
     * <ul>
     * <li>If Period is set to Year, valid values of UsedTime are 1, 2, 3, 4, and 5.</li>
     * <li>If Period is set to Month, valid values of UsedTime are 1 to 12.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect and is required only if ChargeType is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>VPC ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp175iuvg8nxqraf2****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
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
