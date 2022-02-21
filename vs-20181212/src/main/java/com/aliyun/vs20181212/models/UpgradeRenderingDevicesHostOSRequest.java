// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingDevicesHostOSRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RomName")
    public String romName;

    @NameInMap("RomPath")
    public String romPath;

    @NameInMap("RomVersion")
    public String romVersion;

    public static UpgradeRenderingDevicesHostOSRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingDevicesHostOSRequest self = new UpgradeRenderingDevicesHostOSRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingDevicesHostOSRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public UpgradeRenderingDevicesHostOSRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeRenderingDevicesHostOSRequest setRomName(String romName) {
        this.romName = romName;
        return this;
    }
    public String getRomName() {
        return this.romName;
    }

    public UpgradeRenderingDevicesHostOSRequest setRomPath(String romPath) {
        this.romPath = romPath;
        return this;
    }
    public String getRomPath() {
        return this.romPath;
    }

    public UpgradeRenderingDevicesHostOSRequest setRomVersion(String romVersion) {
        this.romVersion = romVersion;
        return this;
    }
    public String getRomVersion() {
        return this.romVersion;
    }

}
