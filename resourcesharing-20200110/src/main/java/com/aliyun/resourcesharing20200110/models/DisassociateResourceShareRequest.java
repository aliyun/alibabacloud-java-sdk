// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DisassociateResourceShareRequest extends TeaModel {
    /**
     * <p>The information of the entities that are associated with the resource share.</p>
     */
    @NameInMap("ResourceOwner")
    public String resourceOwner;

    /**
     * <p>The ID of a shared resource.</p>
     * <br>
     * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
     * <br>
     * <p>>  Resources.N.ResourceId and Resources.N.ResourceType must be used in pairs.</p>
     */
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    @NameInMap("Resources")
    public java.util.List<DisassociateResourceShareRequestResources> resources;

    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static DisassociateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourceShareRequest self = new DisassociateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateResourceShareRequest setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public String getResourceOwner() {
        return this.resourceOwner;
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
        /**
         * <p>The owner of the resource share. Valid values:</p>
         * <br>
         * <p>*   Self: The resource share belongs to the current account. This is the default value. If you are the management account or a member of a resource directory and you want to remove resources or principals from a resource share, set this parameter to Self.</p>
         * <p>*   OtherAccounts: The resource share belongs to another account. If you are not the management account or a member of a resource directory and you want to exit a resource share, set this parameter to OtherAccounts.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of a principal.</p>
         * <br>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five principals can be specified at a time.</p>
         */
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
