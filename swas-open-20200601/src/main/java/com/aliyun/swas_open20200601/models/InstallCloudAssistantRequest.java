// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class InstallCloudAssistantRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("RegionId")
    public String regionId;

    public static InstallCloudAssistantRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudAssistantRequest self = new InstallCloudAssistantRequest();
        return TeaModel.build(map, self);
    }

    public InstallCloudAssistantRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public InstallCloudAssistantRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
