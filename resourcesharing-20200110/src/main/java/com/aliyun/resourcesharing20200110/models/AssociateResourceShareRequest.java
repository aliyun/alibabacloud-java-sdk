// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceShareRequest extends TeaModel {
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    @NameInMap("Resources")
    public java.util.List<AssociateResourceShareRequestResources> resources;

    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static AssociateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourceShareRequest self = new AssociateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public AssociateResourceShareRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public AssociateResourceShareRequest setResources(java.util.List<AssociateResourceShareRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<AssociateResourceShareRequestResources> getResources() {
        return this.resources;
    }

    public AssociateResourceShareRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public static class AssociateResourceShareRequestResources extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static AssociateResourceShareRequestResources build(java.util.Map<String, ?> map) throws Exception {
            AssociateResourceShareRequestResources self = new AssociateResourceShareRequestResources();
            return TeaModel.build(map, self);
        }

        public AssociateResourceShareRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AssociateResourceShareRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
