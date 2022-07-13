// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckResourceSupportOperateRequest extends TeaModel {
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CheckResourceSupportOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceSupportOperateRequest self = new CheckResourceSupportOperateRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceSupportOperateRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CheckResourceSupportOperateRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CheckResourceSupportOperateRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
