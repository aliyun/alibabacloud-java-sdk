// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHARequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SwitchTime")
    public String switchTime;

    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    @NameInMap("TargetPrimaryAzoneId")
    public String targetPrimaryAzoneId;

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
