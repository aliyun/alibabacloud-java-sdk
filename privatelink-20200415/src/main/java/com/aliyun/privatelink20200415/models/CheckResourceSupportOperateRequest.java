// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckResourceSupportOperateRequest extends TeaModel {
    /**
     * <p>The resource ID.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the service resource. Valid values:</p>
     * <br>
     * <p>*   **NLB**: a Network Load Balancer (NLB) instance</p>
     * <p>*   **CLB**: a Classic Load Balancer (CLB) instance</p>
     * <p>*   **ALB**: an Application Load Balancer (ALB) instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the zone where the service resource is deployed.</p>
     * <br>
     * <p>You can call the [DescribeZones](~~120502~~) operation to obtain the zone ID.</p>
     */
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
