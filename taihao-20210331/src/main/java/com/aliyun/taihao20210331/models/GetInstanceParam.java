// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetInstanceParam extends TeaModel {
    // instanceIds
    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    // resourceType
    @NameInMap("resourceType")
    public String resourceType;

    // userId
    @NameInMap("userId")
    public Long userId;

    public static GetInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceParam self = new GetInstanceParam();
        return TeaModel.build(map, self);
    }

    public GetInstanceParam setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public GetInstanceParam setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetInstanceParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
