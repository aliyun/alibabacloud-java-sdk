// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUserPermissionsResponseBody extends TeaModel {
    /**
     * <p>The permissions that are granted to an entity.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<DescribeUserPermissionsResponseBodyPermissions> permissions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A7C9E37-C171-584F-9A99-869B48C4196D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserPermissionsResponseBody self = new DescribeUserPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserPermissionsResponseBody setPermissions(java.util.List<DescribeUserPermissionsResponseBodyPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<DescribeUserPermissionsResponseBodyPermissions> getPermissions() {
        return this.permissions;
    }

    public DescribeUserPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserPermissionsResponseBodyPermissions extends TeaModel {
        /**
         * <p>The entity to which the permissions are granted. A value of <code>true</code> indicates that the permissions are granted to a RAM user. A value of <code>false</code> indicates that the permissions are granted to a RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsRamRole")
        public String isRamRole;

        /**
         * <p>The value is fixed as <code>0</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The ID of the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c57b848115458460583a4260cb713****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The value is fixed as <code>cluster</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The name of the permissions. Valid values:</p>
         * <ul>
         * <li><code>istio-admin</code>: the permissions of ASM administrators.</li>
         * <li><code>istio-ops</code>: the permissions of ASM restricted users.</li>
         * <li><code>istio-readonly</code>: the read-only permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>istio-admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The value is fixed as <code>custom</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static DescribeUserPermissionsResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserPermissionsResponseBodyPermissions self = new DescribeUserPermissionsResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public DescribeUserPermissionsResponseBodyPermissions setIsRamRole(String isRamRole) {
            this.isRamRole = isRamRole;
            return this;
        }
        public String getIsRamRole() {
            return this.isRamRole;
        }

        public DescribeUserPermissionsResponseBodyPermissions setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeUserPermissionsResponseBodyPermissions setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeUserPermissionsResponseBodyPermissions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeUserPermissionsResponseBodyPermissions setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeUserPermissionsResponseBodyPermissions setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
