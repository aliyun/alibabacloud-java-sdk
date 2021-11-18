// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfRequest extends TeaModel {
    @NameInMap("CycleTime")
    public String cycleTime;

    @NameInMap("CycleType")
    public String cycleType;

    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public Integer status;

    public static ModifyActiveOperationMaintainConfRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfRequest self = new ModifyActiveOperationMaintainConfRequest();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfRequest setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public String getCycleTime() {
        return this.cycleTime;
    }

    public ModifyActiveOperationMaintainConfRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public ModifyActiveOperationMaintainConfRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public ModifyActiveOperationMaintainConfRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public ModifyActiveOperationMaintainConfRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyActiveOperationMaintainConfRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
