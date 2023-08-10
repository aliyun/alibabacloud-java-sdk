// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class GetPermissionResponseBody extends TeaModel {
    /**
     * <p>The information about the permission.</p>
     */
    @NameInMap("Permission")
    public GetPermissionResponseBodyPermission permission;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionResponseBody self = new GetPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPermissionResponseBody setPermission(GetPermissionResponseBodyPermission permission) {
        this.permission = permission;
        return this;
    }
    public GetPermissionResponseBodyPermission getPermission() {
        return this.permission;
    }

    public GetPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPermissionResponseBodyPermission extends TeaModel {
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
         * <p>The document of the policy related to the permission.</p>
         */
        @NameInMap("Permission")
        public String permission;

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

        public static GetPermissionResponseBodyPermission build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionResponseBodyPermission self = new GetPermissionResponseBodyPermission();
            return TeaModel.build(map, self);
        }

        public GetPermissionResponseBodyPermission setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPermissionResponseBodyPermission setDefaultPermission(Boolean defaultPermission) {
            this.defaultPermission = defaultPermission;
            return this;
        }
        public Boolean getDefaultPermission() {
            return this.defaultPermission;
        }

        public GetPermissionResponseBodyPermission setDefaultVersion(Boolean defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        public GetPermissionResponseBodyPermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public GetPermissionResponseBodyPermission setPermissionName(String permissionName) {
            this.permissionName = permissionName;
            return this;
        }
        public String getPermissionName() {
            return this.permissionName;
        }

        public GetPermissionResponseBodyPermission setPermissionVersion(String permissionVersion) {
            this.permissionVersion = permissionVersion;
            return this;
        }
        public String getPermissionVersion() {
            return this.permissionVersion;
        }

        public GetPermissionResponseBodyPermission setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetPermissionResponseBodyPermission setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
