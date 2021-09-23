// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    @NameInMap("Hosts")
    public String hosts;

    public static AttachHostAccountsToUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToUserGroupRequest self = new AttachHostAccountsToUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachHostAccountsToUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachHostAccountsToUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public AttachHostAccountsToUserGroupRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

}
