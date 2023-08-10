// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharePermissionsResponseBody extends TeaModel {
    /**
     * <p>The `token` that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the permissions.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<ListResourceSharePermissionsResponseBodyPermissions> permissions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListResourceSharePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharePermissionsResponseBody self = new ListResourceSharePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceSharePermissionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceSharePermissionsResponseBody setPermissions(java.util.List<ListResourceSharePermissionsResponseBodyPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<ListResourceSharePermissionsResponseBodyPermissions> getPermissions() {
        return this.permissions;
    }

    public ListResourceSharePermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourceSharePermissionsResponseBodyPermissions extends TeaModel {
        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the permission is the default permission. Valid values:</p>
         * <br>
         * <p>*   false: The permission is not the default permission.</p>
         * <p>*   true: The permission is the default permission.</p>
         */
        @NameInMap("DefaultPermission")
        public Boolean defaultPermission;

        /**
         * <p>Indicates whether the version is the default version. Valid values:</p>
         * <br>
         * <p>*   false: The version is not the default version.</p>
         * <p>*   true: The version is the default version.</p>
         */
        @NameInMap("DefaultVersion")
        public Boolean defaultVersion;

        /**
         * <p>The name of the permission.</p>
         */
        @NameInMap("PermissionName")
        public String permissionName;

        /**
         * <p>The version of the permission.</p>
         */
        @NameInMap("PermissionVersion")
        public String permissionVersion;

        /**
         * <p>The type of the shared resources.</p>
         * <br>
         * <p>For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListResourceSharePermissionsResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListResourceSharePermissionsResponseBodyPermissions self = new ListResourceSharePermissionsResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public ListResourceSharePermissionsResponseBodyPermissions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceSharePermissionsResponseBodyPermissions setDefaultPermission(Boolean defaultPermission) {
            this.defaultPermission = defaultPermission;
            return this;
        }
        public Boolean getDefaultPermission() {
            return this.defaultPermission;
        }

        public ListResourceSharePermissionsResponseBodyPermissions setDefaultVersion(Boolean defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListResourceSharePermissionsResponseBodyPermissions setPermissionName(String permissionName) {
            this.permissionName = permissionName;
            return this;
        }
        public String getPermissionName() {
            return this.permissionName;
        }

        public ListResourceSharePermissionsResponseBodyPermissions setPermissionVersion(String permissionVersion) {
            this.permissionVersion = permissionVersion;
            return this;
        }
        public String getPermissionVersion() {
            return this.permissionVersion;
        }

        public ListResourceSharePermissionsResponseBodyPermissions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceSharePermissionsResponseBodyPermissions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
