// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The paginated list of users. The <code>Data</code> parameter contains the details of each organization member.</p>
     */
    @NameInMap("Result")
    public QueryUserListResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The Alibaba Cloud account ID. For users not added through RAM, this ID is available only after they log in.</p>
         * 
         * <strong>example:</strong>
         * <p>1355********</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The Alibaba Cloud account name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Indicates whether the user is an organization administrator. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Yes</p>
         * </li>
         * <li><p><code>false</code>: No</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is deprecated. Use the <code>RoleIdList</code> parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdminUser")
        public Boolean adminUser;

        /**
         * <p>Indicates whether the user is a permission administrator. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Yes</p>
         * </li>
         * <li><p><code>false</code>: No</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is deprecated. Use the <code>RoleIdList</code> parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        @NameInMap("CopilotModules")
        public java.util.List<String> copilotModules;

        /**
         * <p>Indicates whether the user is inactive.</p>
         * <ul>
         * <li><p><code>false</code>: Active</p>
         * </li>
         * <li><p><code>true</code>: Inactive</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The Unix timestamp (in milliseconds) that indicates when the user joined the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>1718691704000</p>
         */
        @NameInMap("JoinedDate")
        public Long joinedDate;

        /**
         * <p>The Unix timestamp (in milliseconds) of the user\&quot;s last login.</p>
         * 
         * <strong>example:</strong>
         * <p>1718761320681</p>
         */
        @NameInMap("LastLoginTime")
        public Long lastLoginTime;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The IDs of the organization roles assigned to the user.</p>
         */
        @NameInMap("RoleIdList")
        public java.util.List<Long> roleIdList;

        /**
         * <p>The user ID in Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>fe67f61a35a94b7da1a34ba174a7****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The user type of the organization member. Valid values:</p>
         * <ul>
         * <li><p><code>1</code>: developer</p>
         * </li>
         * <li><p><code>2</code>: viewer</p>
         * </li>
         * <li><p><code>3</code>: analyst</p>
         * </li>
         * </ul>
         * 
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

        public QueryUserListResponseBodyResultData setCopilotModules(java.util.List<String> copilotModules) {
            this.copilotModules = copilotModules;
            return this;
        }
        public java.util.List<String> getCopilotModules() {
            return this.copilotModules;
        }

        public QueryUserListResponseBodyResultData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
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
        /**
         * <p>The list of users.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryUserListResponseBodyResultData> data;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of matching users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages.</p>
         * 
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
