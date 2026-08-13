// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersResponseBody extends TeaModel {
    /**
     * <p>授权模式：SPECIFIED_USERS / ALL_USERS</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("authMode")
    public String authMode;

    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>已授权对象列表</p>
     */
    @NameInMap("items")
    public java.util.List<ListAuthorizedUsersResponseBodyItems> items;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>授权记录总数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAuthorizedUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersResponseBody self = new ListAuthorizedUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersResponseBody setAuthMode(String authMode) {
        this.authMode = authMode;
        return this;
    }
    public String getAuthMode() {
        return this.authMode;
    }

    public ListAuthorizedUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuthorizedUsersResponseBody setItems(java.util.List<ListAuthorizedUsersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAuthorizedUsersResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAuthorizedUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorizedUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedUsersResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAuthorizedUsersResponseBodyItems extends TeaModel {
        /**
         * <p>授权截止时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("expireDate")
        public Long expireDate;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>最后修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>授权人用户 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("grantedBy")
        public Long grantedBy;

        /**
         * <p>被授权对象 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleGranteeId</p>
         */
        @NameInMap("granteeId")
        public String granteeId;

        /**
         * <p>被授权对象类型：USER / USER_GROUP</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("granteeType")
        public String granteeType;

        /**
         * <p>授权记录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>用户组成员数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("memberCount")
        public Long memberCount;

        /**
         * <p>已授权的权限列表</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        /**
         * <p>用户组 ID（granteeType=USER_GROUP 时有值）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleUserGroupId</p>
         */
        @NameInMap("userGroupId")
        public String userGroupId;

        /**
         * <p>用户组名</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("userGroupName")
        public String userGroupName;

        /**
         * <p>用户 ID（granteeType=USER 时有值）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("userId")
        public Long userId;

        /**
         * <p>用户名</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("userName")
        public String userName;

        public static ListAuthorizedUsersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedUsersResponseBodyItems self = new ListAuthorizedUsersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedUsersResponseBodyItems setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public ListAuthorizedUsersResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAuthorizedUsersResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAuthorizedUsersResponseBodyItems setGrantedBy(Long grantedBy) {
            this.grantedBy = grantedBy;
            return this;
        }
        public Long getGrantedBy() {
            return this.grantedBy;
        }

        public ListAuthorizedUsersResponseBodyItems setGranteeId(String granteeId) {
            this.granteeId = granteeId;
            return this;
        }
        public String getGranteeId() {
            return this.granteeId;
        }

        public ListAuthorizedUsersResponseBodyItems setGranteeType(String granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public String getGranteeType() {
            return this.granteeType;
        }

        public ListAuthorizedUsersResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAuthorizedUsersResponseBodyItems setMemberCount(Long memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Long getMemberCount() {
            return this.memberCount;
        }

        public ListAuthorizedUsersResponseBodyItems setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        public ListAuthorizedUsersResponseBodyItems setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ListAuthorizedUsersResponseBodyItems setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public ListAuthorizedUsersResponseBodyItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListAuthorizedUsersResponseBodyItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
