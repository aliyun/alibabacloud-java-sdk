// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521.models;

import com.aliyun.tea.*;

public class GetUserAliUidByInstanceIdRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>PodId</p>
     */
    @NameInMap("ResourceOwnerUid")
    public String resourceOwnerUid;

    @NameInMap("ResourceType")
    public String resourceType;

    public static GetUserAliUidByInstanceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserAliUidByInstanceIdRequest self = new GetUserAliUidByInstanceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserAliUidByInstanceIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUserAliUidByInstanceIdRequest setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public GetUserAliUidByInstanceIdRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
