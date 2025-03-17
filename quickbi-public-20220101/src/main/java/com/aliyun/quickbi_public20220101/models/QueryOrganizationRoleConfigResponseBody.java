// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationRoleConfigResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BCE45E6D-9304-4F94-86BB-5A772B1615FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the organization role configuration.</p>
     */
    @NameInMap("Result")
    public QueryOrganizationRoleConfigResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: The request was successful </li>
     * <li>false: The request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryOrganizationRoleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationRoleConfigResponseBody self = new QueryOrganizationRoleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationRoleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrganizationRoleConfigResponseBody setResult(QueryOrganizationRoleConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryOrganizationRoleConfigResponseBodyResult getResult() {
        return this.result;
    }

    public QueryOrganizationRoleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOrganizationRoleConfigResponseBodyResultAuthConfigList extends TeaModel {
        /**
         * <p>Permission type:</p>
         * <ul>
         * <li>quick_monitor: Metric Monitoring</li>
         * <li>subscription: Subscription Management</li>
         * <li>offline_download: Self-service Data Retrieval</li>
         * <li>resource_package: Resource Package Management</li>
         * <li>organization_ask: Organization Access Key/Secret (AK/SK)</li>
         * <li>developer_openapi: Open API</li>
         * <li>data_service: Data Service</li>
         * <li>admin_authorize3rd: Embedded Analysis</li>
         * <li>component_manage: Custom Component</li>
         * <li>template_open: Custom Template</li>
         * <li>custom_driver: Custom Driver (supported only in standalone deployment)</li>
         * <li>open_platform_custom_plugin: Custom Plugin (supported only in standalone deployment)</li>
         * <li>enterprise_safety: Enterprise Security</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>quick_monitor</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        public static QueryOrganizationRoleConfigResponseBodyResultAuthConfigList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrganizationRoleConfigResponseBodyResultAuthConfigList self = new QueryOrganizationRoleConfigResponseBodyResultAuthConfigList();
            return TeaModel.build(map, self);
        }

        public QueryOrganizationRoleConfigResponseBodyResultAuthConfigList setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

    }

    public static class QueryOrganizationRoleConfigResponseBodyResult extends TeaModel {
        /**
         * <p>List of role permission configurations.</p>
         */
        @NameInMap("AuthConfigList")
        public java.util.List<QueryOrganizationRoleConfigResponseBodyResultAuthConfigList> authConfigList;

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
         * <p>Organization role ID, including predefined roles and custom roles:</p>
         * <ul>
         * <li>Organization Administrator (predefined role): 111111111</li>
         * <li>Permission Administrator (predefined role): 111111112</li>
         * <li>Regular User (predefined role): 111111113</li>
         * <li>Custom Role: The corresponding role ID of the custom role</li>
         * </ul>
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

        public static QueryOrganizationRoleConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryOrganizationRoleConfigResponseBodyResult self = new QueryOrganizationRoleConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryOrganizationRoleConfigResponseBodyResult setAuthConfigList(java.util.List<QueryOrganizationRoleConfigResponseBodyResultAuthConfigList> authConfigList) {
            this.authConfigList = authConfigList;
            return this;
        }
        public java.util.List<QueryOrganizationRoleConfigResponseBodyResultAuthConfigList> getAuthConfigList() {
            return this.authConfigList;
        }

        public QueryOrganizationRoleConfigResponseBodyResult setIsSystemRole(Boolean isSystemRole) {
            this.isSystemRole = isSystemRole;
            return this;
        }
        public Boolean getIsSystemRole() {
            return this.isSystemRole;
        }

        public QueryOrganizationRoleConfigResponseBodyResult setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public QueryOrganizationRoleConfigResponseBodyResult setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
