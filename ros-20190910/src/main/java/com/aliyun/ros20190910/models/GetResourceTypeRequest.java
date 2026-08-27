// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeRequest extends TeaModel {
    /**
     * <p>The resource type.<br>For more information about the resource types supported by ROS, see <a href="https://help.aliyun.com/document_detail/127039.html">Resource type index</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::ROS::WaitConditionHandle</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The version ID. To query a specific version of the resource type, specify this parameter. Otherwise, the resource type is queried.</p>
     * <blockquote>
     * <p>Only modules support versions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
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
