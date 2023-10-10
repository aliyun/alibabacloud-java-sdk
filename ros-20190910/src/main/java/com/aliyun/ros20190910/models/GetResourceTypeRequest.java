// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The version ID. If you want to query a specific version of the resource type, you must specify this parameter. If you do not specify this parameter, only the resource type is queried.</p>
     * <br>
     * <p>> This parameter is supported only for modules.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static GetResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeRequest self = new GetResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetResourceTypeRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
