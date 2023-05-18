// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CreateResourceShareRequest extends TeaModel {
    /**
     * <p>The information of the resource share.</p>
     */
    @NameInMap("AllowExternalTargets")
    public Boolean allowExternalTargets;

    @NameInMap("PermissionNames")
    public java.util.List<String> permissionNames;

    /**
     * <p>The ID of a shared resource.</p>
     * <br>
     * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
     * <br>
     * <p>>  `Resources.N.ResourceId` and `Resources.N.ResourceType` must be used in pairs.</p>
     */
    @NameInMap("ResourceShareName")
    public String resourceShareName;

    @NameInMap("Resources")
    public java.util.List<CreateResourceShareRequestResources> resources;

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
         * <p>The name of a permission. If you do not configure this parameter, the system automatically associates the default permission for the specified resource type with the resource share. For more information, see [Permission library](~~465474~~).</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of a principal. Valid values:</p>
         * <br>
         * <p>*   If you set `AllowExternalTargets` to `false`, set this parameter to the ID of a resource directory, ID of a folder in a resource directory, or ID of a member in a resource directory.</p>
         * <p>*   If you set `AllowExternalTargets` to `true`, set this parameter to the ID of an independent Alibaba Cloud account, ID of a resource directory, ID of a folder in a resource directory, or ID of a member in a resource directory.</p>
         * <br>
         * <p>For more information, see [Resource sharing modes](~~160622~~), [View the ID of a resource directory](~~111217~~), [View the ID of a folder](~~111223~~), or [View the ID of a member](~~111624~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five principals can be specified at a time.</p>
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
