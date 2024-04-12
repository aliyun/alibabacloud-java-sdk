// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostGroupRequest extends TeaModel {
    /**
     * <p>The new description of the host group. The value can be up to 500 characters in length.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the host group that you want to modify.</p>
     * <br>
     * <p>> You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group.</p>
     */
    @NameInMap("HostGroupId")
    public String hostGroupId;

    /**
     * <p>The new name of the host group. The name can be up to 128 characters in length.</p>
     */
    @NameInMap("HostGroupName")
    public String hostGroupName;

    /**
     * <p>The ID of the bastion host on which you want to modify the information about the host group.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host on which you want to modify the information about the host group.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostGroupRequest self = new ModifyHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostGroupRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
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

}
