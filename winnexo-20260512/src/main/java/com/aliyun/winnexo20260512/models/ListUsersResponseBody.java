// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>成员列表</p>
     */
    @NameInMap("items")
    public java.util.List<ListUsersResponseBodyItems> items;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>当前页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页数量</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>符合条件的总记录数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

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

    public ListUsersResponseBody setItems(java.util.List<ListUsersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListUsersResponseBodyItems> getItems() {
        return this.items;
    }

    public ListUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListUsersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListUsersResponseBodyItems extends TeaModel {
        /**
         * <p>WINNEXO 登录账号</p>
         * 
         * <strong>example:</strong>
         * <p>exampleAccountId</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>用户显示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>加入租户时间</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>启用/停用状态</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isActive")
        public Boolean isActive;

        /**
         * <p>最后登录时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("lastLoginTime")
        public String lastLoginTime;

        /**
         * <p>用户拥有的系统角色 code 列表</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("roleCodes")
        public java.util.List<String> roleCodes;

        /**
         * <p>用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("userId")
        public Long userId;

        public static ListUsersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyItems self = new ListUsersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyItems setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListUsersResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUsersResponseBodyItems setIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Boolean getIsActive() {
            return this.isActive;
        }

        public ListUsersResponseBodyItems setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public ListUsersResponseBodyItems setRoleCodes(java.util.List<String> roleCodes) {
            this.roleCodes = roleCodes;
            return this;
        }
        public java.util.List<String> getRoleCodes() {
            return this.roleCodes;
        }

        public ListUsersResponseBodyItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
