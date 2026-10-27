// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHARequest extends TeaModel {
    /**
     * <p>The name of the PolarDB-X instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-htri0ori2r****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

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
     * <p>The specified switchover time. This parameter is required when SwitchTimeMode is set to 2. The time must be in UTC and in the YYYY-MM-DDThh:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-02-05T09:12:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The switchover mode. Valid values: 0: Immediate switchover. 1: Switchover during the O&amp;M window. 2: Switchover at a specified time.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    /**
     * <p>The zone ID of the primary node after the switchover.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
     */
    @NameInMap("TargetPrimaryAzoneId")
    public String targetPrimaryAzoneId;

    /**
     * <p>The region ID of the primary node after the switchover.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("TargetPrimaryRegionId")
    public String targetPrimaryRegionId;

    public static SwitchDBInstanceHARequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceHARequest self = new SwitchDBInstanceHARequest();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceHARequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public SwitchDBInstanceHARequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchDBInstanceHARequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public SwitchDBInstanceHARequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    public SwitchDBInstanceHARequest setTargetPrimaryAzoneId(String targetPrimaryAzoneId) {
        this.targetPrimaryAzoneId = targetPrimaryAzoneId;
        return this;
    }
    public String getTargetPrimaryAzoneId() {
        return this.targetPrimaryAzoneId;
    }

    public SwitchDBInstanceHARequest setTargetPrimaryRegionId(String targetPrimaryRegionId) {
        this.targetPrimaryRegionId = targetPrimaryRegionId;
        return this;
    }
    public String getTargetPrimaryRegionId() {
        return this.targetPrimaryRegionId;
    }

}
