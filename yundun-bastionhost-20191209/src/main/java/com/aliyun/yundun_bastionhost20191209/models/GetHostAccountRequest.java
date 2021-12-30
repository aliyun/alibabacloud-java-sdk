// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostAccountRequest extends TeaModel {
    @NameInMap("HostAccountId")
    public String hostAccountId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHostAccountRequest self = new GetHostAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetHostAccountRequest setHostAccountId(String hostAccountId) {
        this.hostAccountId = hostAccountId;
        return this;
    }
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    public GetHostAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHostAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
