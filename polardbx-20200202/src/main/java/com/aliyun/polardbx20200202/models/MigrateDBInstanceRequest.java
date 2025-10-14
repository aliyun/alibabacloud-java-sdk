// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou-b</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

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
     * <p>cn-beijing-l</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("TertiaryZoneId")
    public String tertiaryZoneId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3azones</p>
     */
    @NameInMap("TopologyType")
    public String topologyType;

    /**
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>vsw-****</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    public static MigrateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBInstanceRequest self = new MigrateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public MigrateDBInstanceRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public MigrateDBInstanceRequest setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public MigrateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MigrateDBInstanceRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    public MigrateDBInstanceRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

    public MigrateDBInstanceRequest setTertiaryZoneId(String tertiaryZoneId) {
        this.tertiaryZoneId = tertiaryZoneId;
        return this;
    }
    public String getTertiaryZoneId() {
        return this.tertiaryZoneId;
    }

    public MigrateDBInstanceRequest setTopologyType(String topologyType) {
        this.topologyType = topologyType;
        return this;
    }
    public String getTopologyType() {
        return this.topologyType;
    }

    public MigrateDBInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public MigrateDBInstanceRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
