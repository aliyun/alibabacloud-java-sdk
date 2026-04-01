// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable the database proxy feature. Valid values:</p>
     * <ul>
     * <li><strong>Startup</strong>: enables the feature.</li>
     * <li><strong>Shutdown</strong>: disables the feature.</li>
     * <li><strong>Modify</strong>: modifies the configuration of the feature.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Startup</p>
     */
    @NameInMap("ConfigDBProxyService")
    public String configDBProxyService;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The number of proxy instances that are enabled. Valid values: <strong>1</strong> to <strong>16</strong>. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p> The capability of the database proxy to process requests increases with the number of proxy instances that are enabled. You can monitor the load on the instance and specify an appropriate number of proxy instances based on the load monitoring data.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    /**
     * <p>The database proxy type. Valid values:</p>
     * <ul>
     * <li><strong>common</strong>: general-purpose database proxy</li>
     * <li><strong>exclusive</strong> (default): dedicated database proxy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    /**
     * <p>The proxy nodes.</p>
     */
    @NameInMap("DBProxyNodes")
    public String DBProxyNodesShrink;

    /**
     * <p>The network type of the instance. Only the VPC network type is supported. Set the value to <strong>VPC</strong>.</p>
     * <blockquote>
     * <p> If you enable the database proxy feature for the instance, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable persistent connections. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong></li>
     * <li><strong>Disabled</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is available only for instances that run MySQL.</p>
     * </li>
     * <li><p>If you want to modify persistent connections, you must set the <strong>ConfigDBProxyService</strong> parameter to <strong>Modify</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("PersistentConnectionStatus")
    public String persistentConnectionStatus;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the instance belongs. You can call the DescribeDBInstanceAttribute operation to query the ID.</p>
     * <blockquote>
     * <p> If you enable the database proxy feature for the instance, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxxxxxxxxxx</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch to which the instance belongs. You can call the DescribeDBInstanceAttribute operation to query the ID.</p>
     * <blockquote>
     * <p> If you enable the database proxy feature for the instance, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxxxxxx</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ModifyDBProxyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyShrinkRequest self = new ModifyDBProxyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyShrinkRequest setConfigDBProxyService(String configDBProxyService) {
        this.configDBProxyService = configDBProxyService;
        return this;
    }
    public String getConfigDBProxyService() {
        return this.configDBProxyService;
    }

    public ModifyDBProxyShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyShrinkRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public ModifyDBProxyShrinkRequest setDBProxyInstanceNum(String DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public ModifyDBProxyShrinkRequest setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public ModifyDBProxyShrinkRequest setDBProxyNodesShrink(String DBProxyNodesShrink) {
        this.DBProxyNodesShrink = DBProxyNodesShrink;
        return this;
    }
    public String getDBProxyNodesShrink() {
        return this.DBProxyNodesShrink;
    }

    public ModifyDBProxyShrinkRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public ModifyDBProxyShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyShrinkRequest setPersistentConnectionStatus(String persistentConnectionStatus) {
        this.persistentConnectionStatus = persistentConnectionStatus;
        return this;
    }
    public String getPersistentConnectionStatus() {
        return this.persistentConnectionStatus;
    }

    public ModifyDBProxyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBProxyShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDBProxyShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBProxyShrinkRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public ModifyDBProxyShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
