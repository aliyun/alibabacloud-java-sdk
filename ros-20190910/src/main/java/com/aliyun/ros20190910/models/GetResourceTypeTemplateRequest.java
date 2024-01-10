// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeTemplateRequest extends TeaModel {
    /**
     * <p>The resource type.</p>
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

    public static GetResourceTypeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeTemplateRequest self = new GetResourceTypeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeTemplateRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetResourceTypeTemplateRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
