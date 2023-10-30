// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetUserGroupRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the user group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>All Bastionhost API requests must include common request parameters. For more information about common request parameters, see [Common parameters](~~315526~~).</p>
     * <br>
     * <p>For more information about sample requests, see the "Examples" section of this topic.</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static GetUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupRequest self = new GetUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
