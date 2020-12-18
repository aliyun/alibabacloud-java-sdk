// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DisassociateResourceShareRequest extends TeaModel {
    @NameInMap("ResourceShareId")
    @Validation(required = true)
    public String resourceShareId;

    @NameInMap("Resources")
    public java.util.List<DisassociateResourceShareRequestResources> resources;

    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static DisassociateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourceShareRequest self = new DisassociateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateResourceShareRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public DisassociateResourceShareRequest setResources(java.util.List<DisassociateResourceShareRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<DisassociateResourceShareRequestResources> getResources() {
        return this.resources;
    }

    public DisassociateResourceShareRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public static class DisassociateResourceShareRequestResources extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static DisassociateResourceShareRequestResources build(java.util.Map<String, ?> map) throws Exception {
            DisassociateResourceShareRequestResources self = new DisassociateResourceShareRequestResources();
            return TeaModel.build(map, self);
        }

        public DisassociateResourceShareRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DisassociateResourceShareRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
