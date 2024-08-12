// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class SetDeviceOtaAutoStatusRequest extends TeaModel {
    @NameInMap("AutoUpdate")
    public Integer autoUpdate;

    @NameInMap("AutoUpdateTimeSchedule")
    public String autoUpdateTimeSchedule;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("ForceUpgrade")
    public Integer forceUpgrade;

    @NameInMap("Status")
    public String status;

    public static SetDeviceOtaAutoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceOtaAutoStatusRequest self = new SetDeviceOtaAutoStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceOtaAutoStatusRequest setAutoUpdate(Integer autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }
    public Integer getAutoUpdate() {
        return this.autoUpdate;
    }

    public SetDeviceOtaAutoStatusRequest setAutoUpdateTimeSchedule(String autoUpdateTimeSchedule) {
        this.autoUpdateTimeSchedule = autoUpdateTimeSchedule;
        return this;
    }
    public String getAutoUpdateTimeSchedule() {
        return this.autoUpdateTimeSchedule;
    }

    public SetDeviceOtaAutoStatusRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public SetDeviceOtaAutoStatusRequest setForceUpgrade(Integer forceUpgrade) {
        this.forceUpgrade = forceUpgrade;
        return this;
    }
    public Integer getForceUpgrade() {
        return this.forceUpgrade;
    }

    public SetDeviceOtaAutoStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
