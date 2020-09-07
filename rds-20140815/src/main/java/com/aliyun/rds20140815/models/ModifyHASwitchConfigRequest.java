// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHASwitchConfigRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("HAConfig")
    public String HAConfig;

    @NameInMap("ManualHATime")
    public String manualHATime;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ModifyHASwitchConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHASwitchConfigRequest self = new ModifyHASwitchConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHASwitchConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyHASwitchConfigRequest setHAConfig(String HAConfig) {
        this.HAConfig = HAConfig;
        return this;
    }
    public String getHAConfig() {
        return this.HAConfig;
    }

    public ModifyHASwitchConfigRequest setManualHATime(String manualHATime) {
        this.manualHATime = manualHATime;
        return this;
    }
    public String getManualHATime() {
        return this.manualHATime;
    }

    public ModifyHASwitchConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
