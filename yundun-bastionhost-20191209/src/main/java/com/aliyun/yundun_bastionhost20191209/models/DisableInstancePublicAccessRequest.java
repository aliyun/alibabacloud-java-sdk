// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DisableInstancePublicAccessRequest extends TeaModel {
    /**
     * <p>The ID of the bastion host whose Internet access you want to disable.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to obtain the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
     */
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
