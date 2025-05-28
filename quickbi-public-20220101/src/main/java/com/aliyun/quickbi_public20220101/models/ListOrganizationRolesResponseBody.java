// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListOrganizationRolesResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7AAB95D7-2E11-4FE2-94BC-858E4FC0C976</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the list of organization roles.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListOrganizationRolesResponseBodyResult> result;

    /**
     * <p>是否请求成功。取值范围：</p>
     * <ul>
     * <li>true：请求成功</li>
     * <li>false：请求失败</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListOrganizationRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationRolesResponseBody self = new ListOrganizationRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationRolesResponseBody setResult(java.util.List<ListOrganizationRolesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListOrganizationRolesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListOrganizationRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOrganizationRolesResponseBodyResultAuthConfigList extends TeaModel {
        /**
         * <p>Permission type:</p>
         * <ul>
         * <li>quick_monitor: Metric monitoring</li>
         * <li>subscription: Subscription management</li>
         * <li>offline_download: Self-service data retrieval</li>
         * <li>resource_package: Resource package management</li>
         * <li>organization_ask: Organization identification code (AK/SK)</li>
         * <li>developer_openapi: OpenAPI</li>
         * <li>data_service: Data service</li>
         * <li>admin_authorize3rd: Embedded analysis</li>
         * <li>component_manage: Custom component</li>
         * <li>template_open: Custom template</li>
         * <li>custom_driver: Custom driver (supported only in standalone deployment)</li>
         * <li>open_platform_custom_plugin: Custom plugin (supported only in standalone deployment)</li>
         * <li>enterprise_safety: Enterprise security</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise_safety</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        public static ListOrganizationRolesResponseBodyResultAuthConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationRolesResponseBodyResultAuthConfigList self = new ListOrganizationRolesResponseBodyResultAuthConfigList();
            return TeaModel.build(map, self);
        }

        public ListOrganizationRolesResponseBodyResultAuthConfigList setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

    }

    public static class ListOrganizationRolesResponseBodyResult extends TeaModel {
        /**
         * <p>List of role permission configurations.</p>
         */
        @NameInMap("AuthConfigList")
        public java.util.List<ListOrganizationRolesResponseBodyResultAuthConfigList> authConfigList;

        /**
         * <p>Whether it is a predefined role. Possible values:</p>
         * <ul>
         * <li>true: Yes</li>
         * <li>false: No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSystemRole")
        public Boolean isSystemRole;

        /**
         * <p>Role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("RoleId")
        public Long roleId;

        /**
         * <p>Role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Organization Admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static ListOrganizationRolesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationRolesResponseBodyResult self = new ListOrganizationRolesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListOrganizationRolesResponseBodyResult setAuthConfigList(java.util.List<ListOrganizationRolesResponseBodyResultAuthConfigList> authConfigList) {
            this.authConfigList = authConfigList;
            return this;
        }
        public java.util.List<ListOrganizationRolesResponseBodyResultAuthConfigList> getAuthConfigList() {
            return this.authConfigList;
        }

        public ListOrganizationRolesResponseBodyResult setIsSystemRole(Boolean isSystemRole) {
            this.isSystemRole = isSystemRole;
            return this;
        }
        public Boolean getIsSystemRole() {
            return this.isSystemRole;
        }

        public ListOrganizationRolesResponseBodyResult setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public ListOrganizationRolesResponseBodyResult setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
