// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DisableInstancePublicAccessRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DisableInstancePublicAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableInstancePublicAccessRequest self = new DisableInstancePublicAccessRequest();
        return TeaModel.build(map, self);
    }

    public DisableInstancePublicAccessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableInstancePublicAccessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
