// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveHostsFromGroupRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("HostIds")
    public String hostIds;

    public static RemoveHostsFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveHostsFromGroupRequest self = new RemoveHostsFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveHostsFromGroupRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public RemoveHostsFromGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveHostsFromGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveHostsFromGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public RemoveHostsFromGroupRequest setHostIds(String hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public String getHostIds() {
        return this.hostIds;
    }

}
