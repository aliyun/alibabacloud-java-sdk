// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The zone ID of the primary zone for a multi-zone instance. <strong>This parameter is required if you want to create a multi-zone instance.</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou-b</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The secondary zone ID.</p>
     * <blockquote>
     * <p>This parameter cannot be set to the same value as ZoneId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-l</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The switchover mode. Valid values:</p>
     * <ul>
     * <li>0: immediately switches over.</li>
     * <li>1: switches over within the O&amp;M window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    /**
     * <p>The zone ID for Three-zone deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("TertiaryZoneId")
    public String tertiaryZoneId;

    /**
     * <p>The topology type. Valid values:</p>
     * <ul>
     * <li><strong>3azones</strong>: three-zone deployment.</li>
     * <li><strong>1azone</strong>: single-zone deployment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3azones</p>
     */
    @NameInMap("TopologyType")
    public String topologyType;

    /**
     * <p>The ID of the virtual private cloud (VPC) where the access endpoint resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The vSwitch ID. This parameter is required when you create a DRDS instance of the VPC network type.</p>
     * 
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
