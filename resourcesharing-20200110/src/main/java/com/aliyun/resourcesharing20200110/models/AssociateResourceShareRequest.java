// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceShareRequest extends TeaModel {
    @NameInMap("PermissionNames")
    public java.util.List<String> permissionNames;

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
    public java.util.List<AssociateResourceShareRequestResources> resources;

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
         * <p>The name of a permission. If you do not configure this parameter, the system automatically associates the default permission for the specified resource type with the resource share. For more information, see [Permission library](~~465474~~).</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of a principal.</p>
         * <br>
         * <p>*   If the value of `AllowExternalTargets` for the resource share is `false` in the response of the ListResourceShares operation, the resource share supports only resource sharing within a resource directory. In this case, you can set this parameter to the ID of the resource directory, ID of a folder in the resource directory, or ID of a member in the resource directory.</p>
         * <p>*   If the value of `AllowExternalTargets` for the resource share is `true` in the response of the ListResourceShares operation, the resource share supports both resource sharing within a resource directory and resource sharing outside a resource directory. In this case, you can set this parameter to the ID of an independent Alibaba Cloud account, ID of the resource directory, ID of a folder in the resource directory, or ID of a member in the resource directory.</p>
         * <br>
         * <p>For more information, see [Resource sharing modes](~~160622~~), [View the ID of a resource directory](~~111217~~), [View the ID of a folder](~~111223~~), or [View the ID of a member](~~111624~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five principals can be specified at a time.</p>
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
