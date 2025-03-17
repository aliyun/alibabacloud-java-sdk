// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorkspaceRoleConfigResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the query result of the interface.</p>
     */
    @NameInMap("Result")
    public QueryWorkspaceRoleConfigResponseBodyResult result;

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

    public static QueryWorkspaceRoleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspaceRoleConfigResponseBody self = new QueryWorkspaceRoleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorkspaceRoleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorkspaceRoleConfigResponseBody setResult(QueryWorkspaceRoleConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryWorkspaceRoleConfigResponseBodyResult getResult() {
        return this.result;
    }

    public QueryWorkspaceRoleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWorkspaceRoleConfigResponseBodyResultAuthConfigList extends TeaModel {
        /**
         * <p>Permission scope.</p>
         */
        @NameInMap("ActionAuthKeys")
        public java.util.List<String> actionAuthKeys;

        /**
         * <p>Permission type:</p>
         * <ul>
         * <li>portal_create: Data Portal</li>
         * <li>dashboard_create: Dashboard</li>
         * <li>report_create: Spreadsheet</li>
         * <li>screen_create: Data Screen</li>
         * <li>analysis: Ad-hoc Analysis</li>
         * <li>offline_download: Self-service Data Retrieval</li>
         * <li>data_form: Data Entry</li>
         * <li>quick_etl: Data Preparation</li>
         * <li>cube: Dataset</li>
         * <li>datasource: Data Source</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>portal_create</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        public static QueryWorkspaceRoleConfigResponseBodyResultAuthConfigList build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkspaceRoleConfigResponseBodyResultAuthConfigList self = new QueryWorkspaceRoleConfigResponseBodyResultAuthConfigList();
            return TeaModel.build(map, self);
        }

        public QueryWorkspaceRoleConfigResponseBodyResultAuthConfigList setActionAuthKeys(java.util.List<String> actionAuthKeys) {
            this.actionAuthKeys = actionAuthKeys;
            return this;
        }
        public java.util.List<String> getActionAuthKeys() {
            return this.actionAuthKeys;
        }

        public QueryWorkspaceRoleConfigResponseBodyResultAuthConfigList setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

    }

    public static class QueryWorkspaceRoleConfigResponseBodyResult extends TeaModel {
        /**
         * <p>List of role permission configurations.</p>
         */
        @NameInMap("AuthConfigList")
        public java.util.List<QueryWorkspaceRoleConfigResponseBodyResultAuthConfigList> authConfigList;

        /**
         * <p>Whether it is a predefined role. Value range:</p>
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
         * <p>Workspace role ID, including predefined roles and custom roles:</p>
         * <ul>
         * <li>25: Workspace Administrator (predefined role)</li>
         * <li>26: Developer (predefined role)</li>
         * <li>27: Analyst (predefined role)</li>
         * <li>30: Viewer (predefined role)</li>
         * <li>Custom role: The corresponding role ID for the custom role</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("RoleId")
        public Long roleId;

        /**
         * <p>Role name.</p>
         * 
         * <strong>example:</strong>
         * <p>pace administrator</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static QueryWorkspaceRoleConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkspaceRoleConfigResponseBodyResult self = new QueryWorkspaceRoleConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryWorkspaceRoleConfigResponseBodyResult setAuthConfigList(java.util.List<QueryWorkspaceRoleConfigResponseBodyResultAuthConfigList> authConfigList) {
            this.authConfigList = authConfigList;
            return this;
        }
        public java.util.List<QueryWorkspaceRoleConfigResponseBodyResultAuthConfigList> getAuthConfigList() {
            return this.authConfigList;
        }

        public QueryWorkspaceRoleConfigResponseBodyResult setIsSystemRole(Boolean isSystemRole) {
            this.isSystemRole = isSystemRole;
            return this;
        }
        public Boolean getIsSystemRole() {
            return this.isSystemRole;
        }

        public QueryWorkspaceRoleConfigResponseBodyResult setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public QueryWorkspaceRoleConfigResponseBodyResult setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
