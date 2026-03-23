// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    @NameInMap("DBProxyNodes")
    public java.util.List<ModifyDBProxyInstanceRequestDBProxyNodes> DBProxyNodes;

    @NameInMap("EffectiveSpecificTime")
    public String effectiveSpecificTime;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("MigrateAZ")
    public java.util.List<ModifyDBProxyInstanceRequestMigrateAZ> migrateAZ;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cpuCores")
        public String cpuCores;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodeCounts")
        public String nodeCounts;

        /**
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
        @NameInMap("dbProxyEndpointId")
        public String dbProxyEndpointId;

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
