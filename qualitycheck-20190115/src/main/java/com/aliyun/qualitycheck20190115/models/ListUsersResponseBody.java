// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Data")
    public ListUsersResponseBodyData data;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUsersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersResponseBody setData(ListUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUsersResponseBodyData getData() {
        return this.data;
    }

    public ListUsersResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUsersResponseBodyDataUser extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LoginUserType")
        public Integer loginUserType;

        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Id")
        public Long id;

        public static ListUsersResponseBodyDataUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyDataUser self = new ListUsersResponseBodyDataUser();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyDataUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyDataUser setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUsersResponseBodyDataUser setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUsersResponseBodyDataUser setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUsersResponseBodyDataUser setLoginUserType(Integer loginUserType) {
            this.loginUserType = loginUserType;
            return this;
        }
        public Integer getLoginUserType() {
            return this.loginUserType;
        }

        public ListUsersResponseBodyDataUser setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListUsersResponseBodyDataUser setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListUsersResponseBodyDataUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListUsersResponseBodyDataUser setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListUsersResponseBodyData extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListUsersResponseBodyDataUser> user;

        public static ListUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyData self = new ListUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyData setUser(java.util.List<ListUsersResponseBodyDataUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersResponseBodyDataUser> getUser() {
            return this.user;
        }

    }

}
