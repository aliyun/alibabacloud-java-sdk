// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The region ID of the resource.</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>For more information about the resource types supported by Resource Center, see [Services that work with Resource Center](~~477798~~).</p>
     */
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
