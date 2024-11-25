// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyRequest extends TeaModel {
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
    public java.util.List<ModifyDBProxyRequestDBProxyNodes> DBProxyNodes;

    /**
     * <p>The network type of the instance. Set the value to <strong>VPC</strong>.</p>
     * <blockquote>
     * <p>This parameter is required if you enable the database proxy feature for an ApsaraDB RDS for MySQL instance that uses cloud disks or an ApsaraDB RDS for PostgreSQL instance.</p>
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
     * <p>The ID of the virtual private cloud (VPC) to which the instance belongs. You can call the DescribeDBInstanceAttribute operation to query the VPC ID.</p>
     * <blockquote>
     * <p> This parameter is required if you enable the database proxy feature for an ApsaraDB RDS for MySQL instance that uses cloud disks or an ApsaraDB RDS for PostgreSQL instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxxxxxxxxxx</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the instance. You can call the DescribeDBInstanceAttribute operation to query the vSwitch ID.</p>
     * <blockquote>
     * <p> This parameter is required if you enable the database proxy feature for an ApsaraDB RDS for MySQL instance that uses cloud disks or an ApsaraDB RDS for PostgreSQL instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxxxxxx</p>
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

    public ModifyDBProxyRequest setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public ModifyDBProxyRequest setDBProxyNodes(java.util.List<ModifyDBProxyRequestDBProxyNodes> DBProxyNodes) {
        this.DBProxyNodes = DBProxyNodes;
        return this;
    }
    public java.util.List<ModifyDBProxyRequestDBProxyNodes> getDBProxyNodes() {
        return this.DBProxyNodes;
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

    public ModifyDBProxyRequest setPersistentConnectionStatus(String persistentConnectionStatus) {
        this.persistentConnectionStatus = persistentConnectionStatus;
        return this;
    }
    public String getPersistentConnectionStatus() {
        return this.persistentConnectionStatus;
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

    public static class ModifyDBProxyRequestDBProxyNodes extends TeaModel {
        /**
         * <p>The number of CPU cores of the node. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
         * <blockquote>
         * <p> This parameter is required when you configure the <strong>DBProxyNodes</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cpuCores")
        public String cpuCores;

        /**
         * <p>The number of proxy nodes in the zone. Valid values: <strong>1</strong> and <strong>2</strong>.</p>
         * <blockquote>
         * <p> This parameter is required when you configure the <strong>DBProxyNodes</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodeCounts")
        public String nodeCounts;

        /**
         * <p>The ID of the zone in which the node resides.</p>
         * <blockquote>
         * <p> This parameter is required when you configure the <strong>DBProxyNodes</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hagnzhou-c</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ModifyDBProxyRequestDBProxyNodes build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBProxyRequestDBProxyNodes self = new ModifyDBProxyRequestDBProxyNodes();
            return TeaModel.build(map, self);
        }

        public ModifyDBProxyRequestDBProxyNodes setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public ModifyDBProxyRequestDBProxyNodes setNodeCounts(String nodeCounts) {
            this.nodeCounts = nodeCounts;
            return this;
        }
        public String getNodeCounts() {
            return this.nodeCounts;
        }

        public ModifyDBProxyRequestDBProxyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
