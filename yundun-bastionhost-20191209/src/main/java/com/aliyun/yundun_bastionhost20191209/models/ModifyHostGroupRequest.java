// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("HostGroupName")
    public String hostGroupName;

    @NameInMap("Comment")
    public String comment;

    public static ModifyHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostGroupRequest self = new ModifyHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHostGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public ModifyHostGroupRequest setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
        return this;
    }
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    public ModifyHostGroupRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
