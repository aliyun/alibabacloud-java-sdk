// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class EnableInstancePublicAccessRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableInstancePublicAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableInstancePublicAccessRequest self = new EnableInstancePublicAccessRequest();
        return TeaModel.build(map, self);
    }

    public EnableInstancePublicAccessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableInstancePublicAccessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
