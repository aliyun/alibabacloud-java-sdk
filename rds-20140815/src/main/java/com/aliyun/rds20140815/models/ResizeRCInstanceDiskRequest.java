// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResizeRCInstanceDiskRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NewSize")
    public Long newSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    public static ResizeRCInstanceDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeRCInstanceDiskRequest self = new ResizeRCInstanceDiskRequest();
        return TeaModel.build(map, self);
    }

    public ResizeRCInstanceDiskRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ResizeRCInstanceDiskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ResizeRCInstanceDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResizeRCInstanceDiskRequest setNewSize(Long newSize) {
        this.newSize = newSize;
        return this;
    }
    public Long getNewSize() {
        return this.newSize;
    }

    public ResizeRCInstanceDiskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResizeRCInstanceDiskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
