// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceTwoFactorRequest extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operation that you want to perform. Set the value to **GetInstanceTwoFactor**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetInstanceTwoFactorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTwoFactorRequest self = new GetInstanceTwoFactorRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceTwoFactorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceTwoFactorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
