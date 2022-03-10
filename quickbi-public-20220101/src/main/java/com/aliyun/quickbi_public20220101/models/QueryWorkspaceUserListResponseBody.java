// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorkspaceUserListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryWorkspaceUserListResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryWorkspaceUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspaceUserListResponseBody self = new QueryWorkspaceUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorkspaceUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorkspaceUserListResponseBody setResult(QueryWorkspaceUserListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryWorkspaceUserListResponseBodyResult getResult() {
        return this.result;
    }

    public QueryWorkspaceUserListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWorkspaceUserListResponseBodyResultDataRole extends TeaModel {
        @NameInMap("RoleCode")
        public String roleCode;

        @NameInMap("RoleId")
        public Long roleId;

        @NameInMap("RoleName")
        public String roleName;

        public static QueryWorkspaceUserListResponseBodyResultDataRole build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkspaceUserListResponseBodyResultDataRole self = new QueryWorkspaceUserListResponseBodyResultDataRole();
            return TeaModel.build(map, self);
        }

        public QueryWorkspaceUserListResponseBodyResultDataRole setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public QueryWorkspaceUserListResponseBodyResultDataRole setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public QueryWorkspaceUserListResponseBodyResultDataRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class QueryWorkspaceUserListResponseBodyResultData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Role")
        public QueryWorkspaceUserListResponseBodyResultDataRole role;

        @NameInMap("UserId")
        public String userId;

        public static QueryWorkspaceUserListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkspaceUserListResponseBodyResultData self = new QueryWorkspaceUserListResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryWorkspaceUserListResponseBodyResultData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public QueryWorkspaceUserListResponseBodyResultData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryWorkspaceUserListResponseBodyResultData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryWorkspaceUserListResponseBodyResultData setRole(QueryWorkspaceUserListResponseBodyResultDataRole role) {
            this.role = role;
            return this;
        }
        public QueryWorkspaceUserListResponseBodyResultDataRole getRole() {
            return this.role;
        }

        public QueryWorkspaceUserListResponseBodyResultData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryWorkspaceUserListResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryWorkspaceUserListResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryWorkspaceUserListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkspaceUserListResponseBodyResult self = new QueryWorkspaceUserListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryWorkspaceUserListResponseBodyResult setData(java.util.List<QueryWorkspaceUserListResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryWorkspaceUserListResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryWorkspaceUserListResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryWorkspaceUserListResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryWorkspaceUserListResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryWorkspaceUserListResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
