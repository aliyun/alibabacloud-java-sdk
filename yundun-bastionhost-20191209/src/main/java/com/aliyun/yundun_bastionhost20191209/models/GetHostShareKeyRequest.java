// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostShareKeyRequest extends TeaModel {
    /**
     * <p>The time when the information about the shared key was last modified.</p>
     */
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    /**
     * <p>The ID of the shared key whose details you want to query.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the shared key.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetHostShareKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHostShareKeyRequest self = new GetHostShareKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetHostShareKeyRequest setHostShareKeyId(String hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public GetHostShareKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHostShareKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
