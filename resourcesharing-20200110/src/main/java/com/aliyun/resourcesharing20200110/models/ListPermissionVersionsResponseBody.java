// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListPermissionVersionsResponseBody extends TeaModel {
    /**
     * <p>The version of the permission.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The creation time.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<ListPermissionVersionsResponseBodyPermissions> permissions;

    /**
     * <p>Indicates whether the version is the default version. Valid values:</p>
     * <br>
     * <p>*   false: The version is not the default version.</p>
     * <p>*   true: The version is the default version.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPermissionVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionVersionsResponseBody self = new ListPermissionVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPermissionVersionsResponseBody setPermissions(java.util.List<ListPermissionVersionsResponseBodyPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<ListPermissionVersionsResponseBodyPermissions> getPermissions() {
        return this.permissions;
    }

    public ListPermissionVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPermissionVersionsResponseBodyPermissions extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DefaultPermission")
        public Boolean defaultPermission;

        /**
         * <p>Indicates whether the permission is the default permission. Valid values:</p>
         * <br>
         * <p>*   false: The permission is not the default permission.</p>
         * <p>*   true: The permission is the default permission.</p>
         */
        @NameInMap("DefaultVersion")
        public Boolean defaultVersion;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("PermissionName")
        public String permissionName;

        /**
         * <p>The type of the shared resources.</p>
         * <br>
         * <p>For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).</p>
         */
        @NameInMap("PermissionVersion")
        public String permissionVersion;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListPermissionVersionsResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionVersionsResponseBodyPermissions self = new ListPermissionVersionsResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public ListPermissionVersionsResponseBodyPermissions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPermissionVersionsResponseBodyPermissions setDefaultPermission(Boolean defaultPermission) {
            this.defaultPermission = defaultPermission;
            return this;
        }
        public Boolean getDefaultPermission() {
            return this.defaultPermission;
        }

        public ListPermissionVersionsResponseBodyPermissions setDefaultVersion(Boolean defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListPermissionVersionsResponseBodyPermissions setPermissionName(String permissionName) {
            this.permissionName = permissionName;
            return this;
        }
        public String getPermissionName() {
            return this.permissionName;
        }

        public ListPermissionVersionsResponseBodyPermissions setPermissionVersion(String permissionVersion) {
            this.permissionVersion = permissionVersion;
            return this;
        }
        public String getPermissionVersion() {
            return this.permissionVersion;
        }

        public ListPermissionVersionsResponseBodyPermissions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListPermissionVersionsResponseBodyPermissions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
