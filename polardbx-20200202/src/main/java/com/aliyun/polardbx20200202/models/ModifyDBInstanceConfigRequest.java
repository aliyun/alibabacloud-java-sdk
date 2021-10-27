// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConfigRequest extends TeaModel {
    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("ConfigValue")
    public String configValue;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDBInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConfigRequest self = new ModifyDBInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public ModifyDBInstanceConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public ModifyDBInstanceConfigRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyDBInstanceConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
