// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyUserGroupRequest extends TeaModel {
    /**
     * <p>The new description of the user group. The value can be up to 500 characters in length.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the Bastionhost instance where you want to modify the information of the user group.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance where you want to modify the information of the user group.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group that you want to modify.</p>
     * <br>
     * <p>>  You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The new name of the user group. The value can be up to 128 characters in length.</p>
     */
    @NameInMap("UserGroupName")
    public String userGroupName;

    public static ModifyUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserGroupRequest self = new ModifyUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserGroupRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public ModifyUserGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

}
