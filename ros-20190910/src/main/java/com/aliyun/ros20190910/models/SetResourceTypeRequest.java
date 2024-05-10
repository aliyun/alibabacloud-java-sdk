// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetResourceTypeRequest extends TeaModel {
    /**
     * <p>The ID of the default version. You can use this parameter to specify the default version of the resource type.</p>
     * <br>
     * <p>> You can specify only one of the VersionId and DefaultVersionId parameters.</p>
     */
    @NameInMap("DefaultVersionId")
    public String defaultVersionId;

    /**
     * <p>The description of the resource type or resource type version. The description can be up to 512 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The resource type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The version ID. If you want to modify a version of the resource type, you must specify this parameter. If you do not specify this parameter, only the resource type is modified.</p>
     * <br>
     * <p>> You can specify only one of the VersionId and DefaultVersionId parameters.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static SetResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResourceTypeRequest self = new SetResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public SetResourceTypeRequest setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
        return this;
    }
    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    public SetResourceTypeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetResourceTypeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public SetResourceTypeRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
