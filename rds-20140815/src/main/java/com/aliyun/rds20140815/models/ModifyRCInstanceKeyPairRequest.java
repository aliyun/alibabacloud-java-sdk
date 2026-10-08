// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceKeyPairRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("Reboot")
    public Boolean reboot;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRCInstanceKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceKeyPairRequest self = new ModifyRCInstanceKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceKeyPairRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRCInstanceKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ModifyRCInstanceKeyPairRequest setReboot(Boolean reboot) {
        this.reboot = reboot;
        return this;
    }
    public Boolean getReboot() {
        return this.reboot;
    }

    public ModifyRCInstanceKeyPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
