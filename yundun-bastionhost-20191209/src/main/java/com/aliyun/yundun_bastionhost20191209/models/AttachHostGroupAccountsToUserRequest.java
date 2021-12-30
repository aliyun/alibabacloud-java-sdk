// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserRequest extends TeaModel {
    @NameInMap("HostGroups")
    public String hostGroups;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserId")
    public String userId;

    public static AttachHostGroupAccountsToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserRequest self = new AttachHostGroupAccountsToUserRequest();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserRequest setHostGroups(String hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public String getHostGroups() {
        return this.hostGroups;
    }

    public AttachHostGroupAccountsToUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachHostGroupAccountsToUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachHostGroupAccountsToUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
