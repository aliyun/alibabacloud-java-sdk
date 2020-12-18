// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CreateResourceShareRequest extends TeaModel {
    @NameInMap("ResourceShareName")
    @Validation(required = true)
    public String resourceShareName;

    @NameInMap("Resources")
    public java.util.List<CreateResourceShareRequestResources> resources;

    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static CreateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceShareRequest self = new CreateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceShareRequest setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
        return this;
    }
    public String getResourceShareName() {
        return this.resourceShareName;
    }

    public CreateResourceShareRequest setResources(java.util.List<CreateResourceShareRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CreateResourceShareRequestResources> getResources() {
        return this.resources;
    }

    public CreateResourceShareRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public static class CreateResourceShareRequestResources extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateResourceShareRequestResources build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceShareRequestResources self = new CreateResourceShareRequestResources();
            return TeaModel.build(map, self);
        }

        public CreateResourceShareRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateResourceShareRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
