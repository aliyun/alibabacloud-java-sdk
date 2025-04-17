// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchOverMajorVersionUpgradeRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public byte[] regionId;

    @NameInMap("SwitchoverTimeout")
    public Integer switchoverTimeout;

    @NameInMap("Type")
    public String type;

    public static SwitchOverMajorVersionUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchOverMajorVersionUpgradeRequest self = new SwitchOverMajorVersionUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public SwitchOverMajorVersionUpgradeRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public SwitchOverMajorVersionUpgradeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SwitchOverMajorVersionUpgradeRequest setRegionId(byte[] regionId) {
        this.regionId = regionId;
        return this;
    }
    public byte[] getRegionId() {
        return this.regionId;
    }

    public SwitchOverMajorVersionUpgradeRequest setSwitchoverTimeout(Integer switchoverTimeout) {
        this.switchoverTimeout = switchoverTimeout;
        return this;
    }
    public Integer getSwitchoverTimeout() {
        return this.switchoverTimeout;
    }

    public SwitchOverMajorVersionUpgradeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
