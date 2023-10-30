// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class EnableInstancePublicAccessRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **EnableInstancePublicAccess**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the bastion host whose Internet access is enabled.</p>
     */
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
