// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeTemplateRequest extends TeaModel {
    /**
     * <p>The type of the resource. Call the <a href="https://help.aliyun.com/document_detail/133957.html">ListResourceTypes</a> operation to query supported resource types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::ECS::VPC</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The version ID. Specify this parameter to query a specific version of the resource type. If you do not specify this parameter, the default version of the resource type is queried.</p>
     * <blockquote>
     * <p>This parameter is supported only for modules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
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
