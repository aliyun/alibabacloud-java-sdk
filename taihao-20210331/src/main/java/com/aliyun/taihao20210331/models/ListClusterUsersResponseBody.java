// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterUsersResponseBody extends TeaModel {
    @NameInMap("data")
    public Data data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListClusterUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterUsersResponseBody self = new ListClusterUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterUsersResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListClusterUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Items extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("ldapUrl")
        public String ldapUrl;

        @NameInMap("status")
        public String status;

        @NameInMap("userGroup")
        public String userGroup;

        @NameInMap("userId")
        public String userId;

        @NameInMap("userName")
        public String userName;

        @NameInMap("userType")
        public String userType;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public Items setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Items setLdapUrl(String ldapUrl) {
            this.ldapUrl = ldapUrl;
            return this;
        }
        public String getLdapUrl() {
            return this.ldapUrl;
        }

        public Items setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public Items setUserGroup(String userGroup) {
            this.userGroup = userGroup;
            return this;
        }
        public String getUserGroup() {
            return this.userGroup;
        }

        public Items setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public Items setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public Items setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        @NameInMap("maxResults")
        public Integer maxResults;

        @NameInMap("nextToken")
        public String nextToken;

        @NameInMap("pageNumber")
        public Long pageNumber;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public Data setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public Data setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public Data setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
