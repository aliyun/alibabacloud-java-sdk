// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceShareRequest extends TeaModel {
    /**
     * <p>The information about the permissions. If you do not configure this parameter, the system automatically associates the default permission for the specified resource type with the resource share. For more information, see [Permission library](~~465474~~).</p>
     */
    @NameInMap("PermissionNames")
    public java.util.List<String> permissionNames;

    /**
     * <p>The ID of the resource share.</p>
     */
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    /**
     * <p>The information about the resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<AssociateResourceShareRequestResources> resources;

    /**
     * <p>The information about the principals.</p>
     */
    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static AssociateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourceShareRequest self = new AssociateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public AssociateResourceShareRequest setPermissionNames(java.util.List<String> permissionNames) {
        this.permissionNames = permissionNames;
        return this;
    }
    public java.util.List<String> getPermissionNames() {
        return this.permissionNames;
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
        /**
         * <p>The ID of a shared resource.</p>
         * <br>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
         * <br>
         * <p>>  Resources.N.ResourceId and Resources.N.ResourceType must be used in pairs.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of a shared resource.</p>
         * <br>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
         * <br>
         * <p>For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).</p>
         * <br>
         * <p>>  `Resources.N.ResourceId` and `Resources.N.ResourceType` must be used in pairs.</p>
         */
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
