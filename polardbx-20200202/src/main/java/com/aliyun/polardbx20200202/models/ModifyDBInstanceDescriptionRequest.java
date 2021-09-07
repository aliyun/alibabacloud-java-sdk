// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    public static ModifyDBInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDescriptionRequest self = new ModifyDBInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBInstanceDescriptionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyDBInstanceDescriptionRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

}
