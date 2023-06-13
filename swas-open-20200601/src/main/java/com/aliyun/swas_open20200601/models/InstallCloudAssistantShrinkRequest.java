// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class InstallCloudAssistantShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the simple application servers.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
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
