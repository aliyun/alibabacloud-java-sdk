// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryUserListResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1355********</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdminUser")
        public Boolean adminUser;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        @NameInMap("JoinedDate")
        public Long joinedDate;

        @NameInMap("LastLoginTime")
        public Long lastLoginTime;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RoleIdList")
        public java.util.List<Long> roleIdList;

        /**
         * <strong>example:</strong>
         * <p>fe67f61a35a94b7da1a34ba174a7****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public QueryUserListResponseBodyResultData setJoinedDate(Long joinedDate) {
            this.joinedDate = joinedDate;
            return this;
        }
        public Long getJoinedDate() {
            return this.joinedDate;
        }

        public QueryUserListResponseBodyResultData setLastLoginTime(Long lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public Long getLastLoginTime() {
            return this.lastLoginTime;
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
