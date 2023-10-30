// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class UnlockUsersRequest extends TeaModel {
    /**
     * <p>The ID of the bastion host to which the users to be unlocked belong.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host to which the users to be unlocked belong.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user that you want to unlock. The value is a JSON string. You can add up to 100 user IDs. If you specify multiple IDs, separate the IDs with commas (,).</p>
     * <br>
     * <p>> You can call the [ListUsers](~~204522~~) operation to query the ID of the user.</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static UnlockUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        UnlockUsersRequest self = new UnlockUsersRequest();
        return TeaModel.build(map, self);
    }

    public UnlockUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnlockUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnlockUsersRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
