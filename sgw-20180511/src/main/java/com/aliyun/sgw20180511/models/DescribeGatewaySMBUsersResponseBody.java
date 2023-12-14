// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewaySMBUsersResponseBody extends TeaModel {
    @NameInMap("ActiveDirectory")
    public Boolean activeDirectory;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Users")
    public DescribeGatewaySMBUsersResponseBodyUsers users;

    public static DescribeGatewaySMBUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaySMBUsersResponseBody self = new DescribeGatewaySMBUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaySMBUsersResponseBody setActiveDirectory(Boolean activeDirectory) {
        this.activeDirectory = activeDirectory;
        return this;
    }
    public Boolean getActiveDirectory() {
        return this.activeDirectory;
    }

    public DescribeGatewaySMBUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewaySMBUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewaySMBUsersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewaySMBUsersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewaySMBUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewaySMBUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewaySMBUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGatewaySMBUsersResponseBody setUsers(DescribeGatewaySMBUsersResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public DescribeGatewaySMBUsersResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class DescribeGatewaySMBUsersResponseBodyUsersUser extends TeaModel {
        @NameInMap("Username")
        public String username;

        public static DescribeGatewaySMBUsersResponseBodyUsersUser build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaySMBUsersResponseBodyUsersUser self = new DescribeGatewaySMBUsersResponseBodyUsersUser();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaySMBUsersResponseBodyUsersUser setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeGatewaySMBUsersResponseBodyUsers extends TeaModel {
        @NameInMap("User")
        public java.util.List<DescribeGatewaySMBUsersResponseBodyUsersUser> user;

        public static DescribeGatewaySMBUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaySMBUsersResponseBodyUsers self = new DescribeGatewaySMBUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaySMBUsersResponseBodyUsers setUser(java.util.List<DescribeGatewaySMBUsersResponseBodyUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<DescribeGatewaySMBUsersResponseBodyUsersUser> getUser() {
            return this.user;
        }

    }

}
