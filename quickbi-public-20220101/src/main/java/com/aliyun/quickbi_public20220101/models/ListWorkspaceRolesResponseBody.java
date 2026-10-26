// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceRolesResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of workspace roles.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListWorkspaceRolesResponseBodyResult> result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: The request was successful. </li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWorkspaceRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRolesResponseBody self = new ListWorkspaceRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceRolesResponseBody setResult(java.util.List<ListWorkspaceRolesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListWorkspaceRolesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListWorkspaceRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkspaceRolesResponseBodyResultAuthConfigList extends TeaModel {
        /**
         * <p>Authorization scope.</p>
         */
        @NameInMap("ActionAuthKeys")
        public java.util.List<String> actionAuthKeys;

        /**
         * <p>Authorization type:</p>
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

        public static ListWorkspaceRolesResponseBodyResultAuthConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRolesResponseBodyResultAuthConfigList self = new ListWorkspaceRolesResponseBodyResultAuthConfigList();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRolesResponseBodyResultAuthConfigList setActionAuthKeys(java.util.List<String> actionAuthKeys) {
            this.actionAuthKeys = actionAuthKeys;
            return this;
        }
        public java.util.List<String> getActionAuthKeys() {
            return this.actionAuthKeys;
        }

        public ListWorkspaceRolesResponseBodyResultAuthConfigList setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

    }

    public static class ListWorkspaceRolesResponseBodyResult extends TeaModel {
        /**
         * <p>List of role authorization configurations.</p>
         */
        @NameInMap("AuthConfigList")
        public java.util.List<ListWorkspaceRolesResponseBodyResultAuthConfigList> authConfigList;

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
         * <p>Workspace role ID, including predefined and custom roles:</p>
         * <ul>
         * <li>25: Workspace Administrator (predefined role)</li>
         * <li>26: Developer (predefined role)</li>
         * <li>27: Analyst (predefined role)</li>
         * <li>30: Viewer (predefined role)</li>
         * <li>Custom role: The corresponding role ID for a custom role</li>
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
         * <p>Space administrator</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static ListWorkspaceRolesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRolesResponseBodyResult self = new ListWorkspaceRolesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRolesResponseBodyResult setAuthConfigList(java.util.List<ListWorkspaceRolesResponseBodyResultAuthConfigList> authConfigList) {
            this.authConfigList = authConfigList;
            return this;
        }
        public java.util.List<ListWorkspaceRolesResponseBodyResultAuthConfigList> getAuthConfigList() {
            return this.authConfigList;
        }

        public ListWorkspaceRolesResponseBodyResult setIsSystemRole(Boolean isSystemRole) {
            this.isSystemRole = isSystemRole;
            return this;
        }
        public Boolean getIsSystemRole() {
            return this.isSystemRole;
        }

        public ListWorkspaceRolesResponseBodyResult setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public ListWorkspaceRolesResponseBodyResult setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
