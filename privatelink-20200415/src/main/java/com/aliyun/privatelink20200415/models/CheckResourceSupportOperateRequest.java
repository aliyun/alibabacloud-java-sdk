// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckResourceSupportOperateRequest extends TeaModel {
    // The ID of the resource.
    @NameInMap("ResourceId")
    public String resourceId;

    // The type of the service resource. Valid values:
    // 
    // *   **NLB**: Network Load Balancer.
    // *   **CLB**: Classic Load Balancer.
    // *   **ALB**: Application Load Balancer.
    @NameInMap("ResourceType")
    public String resourceType;

    // The ID of the zone.
    // 
    // You can call the [DescribeZones](~~120502~~) operation to query the most recent zone list.
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
