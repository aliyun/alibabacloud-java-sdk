// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationRoleConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryOrganizationRoleConfigResponseBodyResult result;

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
        @NameInMap("AuthConfigList")
        public java.util.List<QueryOrganizationRoleConfigResponseBodyResultAuthConfigList> authConfigList;

        @NameInMap("IsSystemRole")
        public Boolean isSystemRole;

        @NameInMap("RoleId")
        public Long roleId;

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
