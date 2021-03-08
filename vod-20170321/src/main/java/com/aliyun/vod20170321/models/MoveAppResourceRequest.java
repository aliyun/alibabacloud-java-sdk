// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class MoveAppResourceRequest extends TeaModel {
    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("TargetAppId")
    public String targetAppId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceIds")
    public String resourceIds;

    public static MoveAppResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveAppResourceRequest self = new MoveAppResourceRequest();
        return TeaModel.build(map, self);
    }

    public MoveAppResourceRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public MoveAppResourceRequest setTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
        return this;
    }
    public String getTargetAppId() {
        return this.targetAppId;
    }

    public MoveAppResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public MoveAppResourceRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

}
