// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryUserListResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserListResponseBody self = new QueryUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserListResponseBody setResult(QueryUserListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryUserListResponseBodyResult getResult() {
        return this.result;
    }

    public QueryUserListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserListResponseBodyResultData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AdminUser")
        public Boolean adminUser;

        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RoleIdList")
        public java.util.List<Long> roleIdList;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserType")
        public Integer userType;

        public static QueryUserListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserListResponseBodyResultData self = new QueryUserListResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryUserListResponseBodyResultData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public QueryUserListResponseBodyResultData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryUserListResponseBodyResultData setAdminUser(Boolean adminUser) {
            this.adminUser = adminUser;
            return this;
        }
        public Boolean getAdminUser() {
            return this.adminUser;
        }

        public QueryUserListResponseBodyResultData setAuthAdminUser(Boolean authAdminUser) {
            this.authAdminUser = authAdminUser;
            return this;
        }
        public Boolean getAuthAdminUser() {
            return this.authAdminUser;
        }

        public QueryUserListResponseBodyResultData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryUserListResponseBodyResultData setRoleIdList(java.util.List<Long> roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public java.util.List<Long> getRoleIdList() {
            return this.roleIdList;
        }

        public QueryUserListResponseBodyResultData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryUserListResponseBodyResultData setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class QueryUserListResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryUserListResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryUserListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserListResponseBodyResult self = new QueryUserListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserListResponseBodyResult setData(java.util.List<QueryUserListResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryUserListResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryUserListResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryUserListResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryUserListResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryUserListResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
