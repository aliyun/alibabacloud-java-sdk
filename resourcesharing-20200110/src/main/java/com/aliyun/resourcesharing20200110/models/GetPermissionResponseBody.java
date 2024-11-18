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
     * 
     * <strong>example:</strong>
     * <p>2F23CFB6-A721-4E90-AC1E-0E30FA8B45DA</p>
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
         * 
         * <strong>example:</strong>
         * <p>2020-12-07T07:39:01.818Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the permission is the default permission. Valid values:</p>
         * <ul>
         * <li>false: The permission is not the default permission.</li>
         * <li>true: The permission is the default permission.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultPermission")
        public Boolean defaultPermission;

        /**
         * <p>Indicates whether the version is the default version. Valid values:</p>
         * <ul>
         * <li>false: The version is not the default version.</li>
         * <li>true: The version is the default version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultVersion")
        public Boolean defaultVersion;

        /**
         * <p>The document of the policy related to the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:[&quot;vpc:DescribeVSwitches&quot;,&quot;vpc:DescribeVSwitchAttributes&quot;]}</p>
         */
        @NameInMap("Permission")
        public String permission;

        /**
         * <p>The name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunRSDefaultPermissionVSwitch</p>
         */
        @NameInMap("PermissionName")
        public String permissionName;

        /**
         * <p>The version of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("PermissionVersion")
        public String permissionVersion;

        /**
         * <p>The type of the shared resources.</p>
         * <p>For more information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>VSwitch</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-07T07:39:01.818Z</p>
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
