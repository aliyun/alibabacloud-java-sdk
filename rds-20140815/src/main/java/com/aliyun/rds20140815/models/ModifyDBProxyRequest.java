// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable the database proxy feature. Valid values:</p>
     * <br>
     * <p>*   **Startup**: enables the database proxy feature.</p>
     * <p>*   **Shutdown**: disables the database proxy feature.</p>
     */
    @NameInMap("ConfigDBProxyService")
    public String configDBProxyService;

    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>An internal parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The number of proxy instances that are enabled. Valid values: **1** to **60**. Default value: **1**.</p>
     * <br>
     * <p>> The capability to process requests increases in proportion with the number of proxy instances. You can specify a proper number of proxy instances based on the monitoring information of database loads.</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    /**
     * <p>The network type of the instance. Set the value to **VPC**.</p>
     * <br>
     * <p>> This parameter is required if you enable the database proxy feature for an ApsaraDB RDS for MySQL instance that uses cloud disks or an ApsaraDB RDS for PostgreSQL instance.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the instance belongs. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the VPC ID of the instance.</p>
     * <br>
     * <p>> This parameter is required if you enable the database proxy feature for an ApsaraDB RDS for MySQL instance that uses cloud disks or an ApsaraDB RDS for PostgreSQL instance.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch that is associated with the specified VPC. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the VPC ID of the instance.</p>
     * <br>
     * <p>> This parameter is required if you enable the database proxy feature for an ApsaraDB RDS for MySQL instance that uses cloud disks or an ApsaraDB RDS for PostgreSQL instance.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ModifyDBProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyRequest self = new ModifyDBProxyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyRequest setConfigDBProxyService(String configDBProxyService) {
        this.configDBProxyService = configDBProxyService;
        return this;
    }
    public String getConfigDBProxyService() {
        return this.configDBProxyService;
    }

    public ModifyDBProxyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public ModifyDBProxyRequest setDBProxyInstanceNum(String DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public ModifyDBProxyRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public ModifyDBProxyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBProxyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDBProxyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBProxyRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public ModifyDBProxyRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
