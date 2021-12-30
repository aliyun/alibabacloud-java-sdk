// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostGroupRequest extends TeaModel {
    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostGroupRequest self = new DeleteHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHostGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public DeleteHostGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteHostGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
