// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceLDAPAuthServerRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetInstanceLDAPAuthServerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLDAPAuthServerRequest self = new GetInstanceLDAPAuthServerRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceLDAPAuthServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceLDAPAuthServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
