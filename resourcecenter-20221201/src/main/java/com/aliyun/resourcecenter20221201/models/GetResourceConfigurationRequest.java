// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationRequest extends TeaModel {
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static GetResourceConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationRequest self = new GetResourceConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetResourceConfigurationRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public GetResourceConfigurationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
