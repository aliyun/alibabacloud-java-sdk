// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public ListUsersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsersResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListUsersResponseBody setData(ListUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUsersResponseBodyData getData() {
        return this.data;
    }

    public ListUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUsersResponseBodyDataUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2951869706989****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <strong>example:</strong>
         * <p>2020-03-11T16:54Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LoginUserType")
        public Integer loginUserType;

        /**
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>2020-03-11T16:54Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListUsersResponseBodyDataUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyDataUser self = new ListUsersResponseBodyDataUser();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyDataUser setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListUsersResponseBodyDataUser setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUsersResponseBodyDataUser setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUsersResponseBodyDataUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyDataUser setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUsersResponseBodyDataUser setLoginUserType(Integer loginUserType) {
            this.loginUserType = loginUserType;
            return this;
        }
        public Integer getLoginUserType() {
            return this.loginUserType;
        }

        public ListUsersResponseBodyDataUser setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListUsersResponseBodyDataUser setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUsersResponseBodyDataUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
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
