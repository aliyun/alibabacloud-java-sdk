// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    /**
     * <p>The ID of the bastion host on which you want to query the user.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host on which you want to query the user.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user.</p>
     * <br>
     * <p>> You can call the [ListUsers](~~204522~~) operation to query the ID of the user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
