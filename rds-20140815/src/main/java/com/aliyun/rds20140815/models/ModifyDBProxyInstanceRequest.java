// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n3a****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A deprecated parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The number of proxy instances. If this parameter is set to 0, the proxy service of this type is disabled for the instance. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
     * <blockquote>
     * <p>More proxy instances can handle more requests. You can check the load of proxy instances based on monitoring data and then specify an appropriate number of proxy instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    /**
     * <p>The type of the database proxy instance. Valid values:</p>
     * <ul>
     * <li><strong>common</strong>: general-purpose database proxy</li>
     * <li><strong>exclusive</strong>: dedicated database proxy (default)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exclusive</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    /**
     * <p>The list of proxy nodes.</p>
     * <blockquote>
     * <p>This parameter is required when the current proxy instance uses multi-active zone deployment.</p>
     * </blockquote>
     */
    @NameInMap("DBProxyNodes")
    public java.util.List<ModifyDBProxyInstanceRequestDBProxyNodes> DBProxyNodes;

    /**
     * <p>The specified time for the modification to take effect. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <p>This parameter is required when <strong>EffectiveTime</strong> is set to <strong>SpecificTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-07-10T13:15:12Z</p>
     */
    @NameInMap("EffectiveSpecificTime")
    public String effectiveSpecificTime;

    /**
     * <p>The effective period. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The modification takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The modification takes effect during the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>SpecificTime</strong>: The modification takes effect at a specified time.</li>
     * </ul>
     * <p>Default value: <strong>MaintainTime</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The list of active zones for proxy migration.</p>
     * <blockquote>
     * <p>Currently, only ApsaraDB RDS for MySQL proxy instances with cloud disks support active zone migration.</p>
     * </blockquote>
     */
    @NameInMap("MigrateAZ")
    public java.util.List<ModifyDBProxyInstanceRequestMigrateAZ> migrateAZ;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call DescribeRegions to obtain the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A deprecated parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p****</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    public static ModifyDBProxyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyInstanceRequest self = new ModifyDBProxyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyInstanceRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public ModifyDBProxyInstanceRequest setDBProxyInstanceNum(String DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public ModifyDBProxyInstanceRequest setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public ModifyDBProxyInstanceRequest setDBProxyNodes(java.util.List<ModifyDBProxyInstanceRequestDBProxyNodes> DBProxyNodes) {
        this.DBProxyNodes = DBProxyNodes;
        return this;
    }
    public java.util.List<ModifyDBProxyInstanceRequestDBProxyNodes> getDBProxyNodes() {
        return this.DBProxyNodes;
    }

    public ModifyDBProxyInstanceRequest setEffectiveSpecificTime(String effectiveSpecificTime) {
        this.effectiveSpecificTime = effectiveSpecificTime;
        return this;
    }
    public String getEffectiveSpecificTime() {
        return this.effectiveSpecificTime;
    }

    public ModifyDBProxyInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBProxyInstanceRequest setMigrateAZ(java.util.List<ModifyDBProxyInstanceRequestMigrateAZ> migrateAZ) {
        this.migrateAZ = migrateAZ;
        return this;
    }
    public java.util.List<ModifyDBProxyInstanceRequestMigrateAZ> getMigrateAZ() {
        return this.migrateAZ;
    }

    public ModifyDBProxyInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBProxyInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBProxyInstanceRequest setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static class ModifyDBProxyInstanceRequestDBProxyNodes extends TeaModel {
        /**
         * <p>The number of CPU cores for the node. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>DBProxyNodes</strong> is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cpuCores")
        public String cpuCores;

        /**
         * <p>The number of proxy nodes in the zone. Valid values: <strong>1</strong> to <strong>2</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>DBProxyNodes</strong> is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodeCounts")
        public String nodeCounts;

        /**
         * <p>The zone ID of the node.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>DBProxyNodes</strong> is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-c</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ModifyDBProxyInstanceRequestDBProxyNodes build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBProxyInstanceRequestDBProxyNodes self = new ModifyDBProxyInstanceRequestDBProxyNodes();
            return TeaModel.build(map, self);
        }

        public ModifyDBProxyInstanceRequestDBProxyNodes setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public ModifyDBProxyInstanceRequestDBProxyNodes setNodeCounts(String nodeCounts) {
            this.nodeCounts = nodeCounts;
            return this;
        }
        public String getNodeCounts() {
            return this.nodeCounts;
        }

        public ModifyDBProxyInstanceRequestDBProxyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ModifyDBProxyInstanceRequestMigrateAZ extends TeaModel {
        /**
         * <p>The proxy endpoint ID. You can call DescribeDBProxyEndpoint to obtain the proxy endpoint ID.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>MigrateAZ</strong> is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>yhw429********</p>
         */
        @NameInMap("dbProxyEndpointId")
        public String dbProxyEndpointId;

        /**
         * <p>The ID of the destination vSwitch for the proxy instance migration.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>MigrateAZ</strong> is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-sw0qq49d1m****</p>
         */
        @NameInMap("destVSwitchId")
        public String destVSwitchId;

        /**
         * <p>The ID of the destination VPC for the proxy instance migration.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>MigrateAZ</strong> is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-2vcicu73rdylp****</p>
         */
        @NameInMap("destVpcId")
        public String destVpcId;

        public static ModifyDBProxyInstanceRequestMigrateAZ build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBProxyInstanceRequestMigrateAZ self = new ModifyDBProxyInstanceRequestMigrateAZ();
            return TeaModel.build(map, self);
        }

        public ModifyDBProxyInstanceRequestMigrateAZ setDbProxyEndpointId(String dbProxyEndpointId) {
            this.dbProxyEndpointId = dbProxyEndpointId;
            return this;
        }
        public String getDbProxyEndpointId() {
            return this.dbProxyEndpointId;
        }

        public ModifyDBProxyInstanceRequestMigrateAZ setDestVSwitchId(String destVSwitchId) {
            this.destVSwitchId = destVSwitchId;
            return this;
        }
        public String getDestVSwitchId() {
            return this.destVSwitchId;
        }

        public ModifyDBProxyInstanceRequestMigrateAZ setDestVpcId(String destVpcId) {
            this.destVpcId = destVpcId;
            return this;
        }
        public String getDestVpcId() {
            return this.destVpcId;
        }

    }

}
