// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class UpgradeInstanceImageVersionRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpgradeInstanceImageVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceImageVersionRequest self = new UpgradeInstanceImageVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceImageVersionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpgradeInstanceImageVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeInstanceImageVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
