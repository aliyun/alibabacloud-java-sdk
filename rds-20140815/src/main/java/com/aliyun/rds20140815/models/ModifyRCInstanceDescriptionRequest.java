// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceDescriptionRequest extends TeaModel {
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRCInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceDescriptionRequest self = new ModifyRCInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceDescriptionRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public ModifyRCInstanceDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRCInstanceDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
