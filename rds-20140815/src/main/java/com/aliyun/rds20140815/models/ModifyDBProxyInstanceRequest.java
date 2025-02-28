// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n3a****</p>
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
     * <p>The number of database proxies. If you set this parameter to 0, the database proxy feature is disabled for the instance. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
     * <blockquote>
     * <p> The capability of the database proxy feature to process requests increases with the number of database proxies that are enabled. You can monitor the load on the instance and specify an appropriate number of database proxies based on the load monitoring data.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    /**
     * <p>The database proxy type. Valid values:</p>
     * <ul>
     * <li><strong>common</strong>: general-purpose database proxy</li>
     * <li><strong>exclusive</strong> (default): dedicated database proxy</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DedicatedProxy</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    /**
     * <p>List of proxy nodes.</p>
     * <blockquote>
     * <p>This parameter must be passed when the current proxy instance is deployed in multiple availability zones.</p>
     * </blockquote>
     */
    @NameInMap("DBProxyNodes")
    public java.util.List<ModifyDBProxyInstanceRequestDBProxyNodes> DBProxyNodes;

    /**
     * <p>The point in time that you want to specify. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> If the <strong>EffectiveTime</strong> parameter is set to <strong>SpecificTime</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-07-10T13:15:12Z</p>
     */
    @NameInMap("EffectiveSpecificTime")
    public String effectiveSpecificTime;

    /**
     * <p>The effective time. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The effective time is immediate.</li>
     * <li><strong>MaintainTime</strong>: The effective time is within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>SpecificTime</strong>: The effective time is a specified point in time.</li>
     * </ul>
     * <p>Default value: <strong>MaintainTime</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The list of available zones for migration agents.</p>
     * <blockquote>
     * <p>Currently, only RDS MySQL cloud disk version agent instance migration is supported.</p>
     * </blockquote>
     */
    @NameInMap("MigrateAZ")
    public java.util.List<ModifyDBProxyInstanceRequestMigrateAZ> migrateAZ;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
     * <p>The ID of the vSwitch in the destination zone. You can call the <a href="https://help.aliyun.com/document_detail/610431.html">DescribeVSwitches</a> operation to query existing vSwitches.</p>
     * <blockquote>
     * <p> Only database proxies for ApsaraDB RDS for MySQL instances that use cloud disks can be migrated to different zones.</p>
     * </blockquote>
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
         * <p>The number of cpu cores for the node, valid values: <strong>1</strong> to <strong>16</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when selecting <strong>DBProxyNodes</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cpuCores")
        public String cpuCores;

        /**
         * <p>The number of proxy nodes in the availability zone, valid values: <strong>1</strong> to <strong>16</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when selecting <strong>DBProxyNodes</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodeCounts")
        public String nodeCounts;

        /**
         * <p>The id of the availability zone where the node is located.</p>
         * <blockquote>
         * <p>This parameter is required when selecting <strong>DBProxyNodes</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hagnzhou-c</p>
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
         * <p>The proxy connection address ID. You can obtain it through the DescribeDBProxyEndpoint interface.</p>
         * <blockquote>
         * <p>This parameter is required when MigrateAZ is selected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>yhw429********</p>
         */
        @NameInMap("dbProxyEndpointId")
        public String dbProxyEndpointId;

        /**
         * <p>The target VSwitchId corresponding to the proxy instance migration.</p>
         * <blockquote>
         * <p>This parameter is required when MigrateAZ is selected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-sw0qq49d1m****</p>
         */
        @NameInMap("destVSwitchId")
        public String destVSwitchId;

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
