// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CreateResourceShareRequest extends TeaModel {
    /**
     * <p>Specifies whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:</p>
     * <br>
     * <p>*   false (default): Resources in the resource share can be shared only with accounts in the resource directory.</p>
     * <p>*   true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.</p>
     */
    @NameInMap("AllowExternalTargets")
    public Boolean allowExternalTargets;

    /**
     * <p>The information about the permissions. If you do not configure this parameter, the system automatically associates the default permission for the specified resource type with the resource share. For more information, see [Permission library](~~465474~~).</p>
     */
    @NameInMap("PermissionNames")
    public java.util.List<String> permissionNames;

    /**
     * <p>The name of the resource share.</p>
     * <br>
     * <p>The name must be 1 to 50 characters in length.</p>
     * <br>
     * <p>The name can contain letters, digits, periods (.), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("ResourceShareName")
    public String resourceShareName;

    /**
     * <p>The information about the shared resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<CreateResourceShareRequestResources> resources;

    /**
     * <p>The information about the principals.</p>
     */
    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static CreateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceShareRequest self = new CreateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceShareRequest setAllowExternalTargets(Boolean allowExternalTargets) {
        this.allowExternalTargets = allowExternalTargets;
        return this;
    }
    public Boolean getAllowExternalTargets() {
        return this.allowExternalTargets;
    }

    public CreateResourceShareRequest setPermissionNames(java.util.List<String> permissionNames) {
        this.permissionNames = permissionNames;
        return this;
    }
    public java.util.List<String> getPermissionNames() {
        return this.permissionNames;
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
        /**
         * <p>The ID of a shared resource.</p>
         * <br>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
         * <br>
         * <p>>  `Resources.N.ResourceId` and `Resources.N.ResourceType` must be used in pairs.</p>
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
