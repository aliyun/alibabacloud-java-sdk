// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceUpgradePeriodRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UpgradeStartTime")
    public String upgradeStartTime;

    @NameInMap("UpgradeMode")
    public String upgradeMode;

    public static ModifyInstanceUpgradePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceUpgradePeriodRequest self = new ModifyInstanceUpgradePeriodRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceUpgradePeriodRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyInstanceUpgradePeriodRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceUpgradePeriodRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceUpgradePeriodRequest setUpgradeStartTime(String upgradeStartTime) {
        this.upgradeStartTime = upgradeStartTime;
        return this;
    }
    public String getUpgradeStartTime() {
        return this.upgradeStartTime;
    }

    public ModifyInstanceUpgradePeriodRequest setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

}
