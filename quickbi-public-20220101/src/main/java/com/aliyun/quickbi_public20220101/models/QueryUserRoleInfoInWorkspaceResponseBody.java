// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserRoleInfoInWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryUserRoleInfoInWorkspaceResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUserRoleInfoInWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserRoleInfoInWorkspaceResponseBody self = new QueryUserRoleInfoInWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserRoleInfoInWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserRoleInfoInWorkspaceResponseBody setResult(QueryUserRoleInfoInWorkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryUserRoleInfoInWorkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public QueryUserRoleInfoInWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserRoleInfoInWorkspaceResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>role_workspace_admin</p>
         */
        @NameInMap("RoleCode")
        public String roleCode;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("RoleId")
        public Long roleId;

        @NameInMap("RoleName")
        public String roleName;

        public static QueryUserRoleInfoInWorkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserRoleInfoInWorkspaceResponseBodyResult self = new QueryUserRoleInfoInWorkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserRoleInfoInWorkspaceResponseBodyResult setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public QueryUserRoleInfoInWorkspaceResponseBodyResult setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public QueryUserRoleInfoInWorkspaceResponseBodyResult setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
