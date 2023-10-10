// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeregisterResourceTypeRequest extends TeaModel {
    /**
     * <p>The resource type.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The version ID. If you want to delete a version of the resource type, you must specify this parameter.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static DeregisterResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeregisterResourceTypeRequest self = new DeregisterResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public DeregisterResourceTypeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DeregisterResourceTypeRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
