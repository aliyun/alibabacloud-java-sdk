// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class InstallCloudAssistantShrinkRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("RegionId")
    public String regionId;

    public static InstallCloudAssistantShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudAssistantShrinkRequest self = new InstallCloudAssistantShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InstallCloudAssistantShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public InstallCloudAssistantShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
