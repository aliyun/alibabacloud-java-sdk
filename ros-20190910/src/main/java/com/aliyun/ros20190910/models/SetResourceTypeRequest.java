// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetResourceTypeRequest extends TeaModel {
    @NameInMap("DefaultVersionId")
    public String defaultVersionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ResourceType")
    public String resourceType;

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
