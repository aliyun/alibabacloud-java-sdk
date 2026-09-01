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
     * <p>The paginated result of the user list. The detailed information of organization members is stored in the Data response parameter.</p>
     */
    @NameInMap("Result")
    public QueryUserListResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
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
         * <p>The Alibaba Cloud account ID. For users who are not added through RAM self-service, the Alibaba Cloud ID can only be obtained after they log on.</p>
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
         * <p>Indicates whether the user is bound to the organization administrator role. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * <p><notice>This parameter is deprecated. Use the RoleIdList parameter instead.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdminUser")
        public Boolean adminUser;

        /**
         * <p>Indicates whether the user is attached to the permission management administrator role. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * <p><notice>This parameter has expired and is no longer recommended. Use the RoleIdList parameter instead.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        /**
         * <p>The intelligent module quota of the user.</p>
         * <ul>
         * <li>qreport: Q report</li>
         * <li>qExploreNum: Q exploration edition</li>
         * <li>smartQAskNum: Q data inquiry</li>
         * <li>smartQDevNum: Q builder</li>
         * </ul>
         */
        @NameInMap("CopilotModules")
        public java.util.List<String> copilotModules;

        /**
         * <p>The user status. Valid values: </p>
         * <ul>
         * <li>false: active</li>
         * <li>true: inactive</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The date when the member joined the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>1718691704000</p>
         */
        @NameInMap("JoinedDate")
        public Long joinedDate;

        /**
         * <p>The last logon time.</p>
         * 
         * <strong>example:</strong>
         * <p>1718761320681</p>
         */
        @NameInMap("LastLoginTime")
        public Long lastLoginTime;

        /**
         * <p>The nickname of the organization member.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The list of organization role IDs bound to the user.</p>
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
         * <li>1: developer</li>
         * <li>2: visitor</li>
         * <li>3: analyst</li>
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
         * <p>The list of users returned by the request.</p>
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
         * <p>The number of rows per page specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of rows.</p>
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
