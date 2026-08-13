// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>系统内置角色列表（固定 7 个）</p>
     */
    @NameInMap("items")
    public java.util.List<ListRolesResponseBodyItems> items;

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

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRolesResponseBody setItems(java.util.List<ListRolesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListRolesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRolesResponseBodyItems extends TeaModel {
        /**
         * <p>角色说明（按请求 Accept-Language 国际化）</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>角色标识码，用于 createUser/updateUser 的 roleCodes 参数</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("roleCode")
        public String roleCode;

        /**
         * <p>角色显示名称（按请求 Accept-Language 国际化）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("roleName")
        public String roleName;

        /**
         * <p>是否允许启用/停用操作（超级管理员和应用用户不可切换）</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("toggleable")
        public Boolean toggleable;

        public static ListRolesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyItems self = new ListRolesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRolesResponseBodyItems setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public ListRolesResponseBodyItems setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListRolesResponseBodyItems setToggleable(Boolean toggleable) {
            this.toggleable = toggleable;
            return this;
        }
        public Boolean getToggleable() {
            return this.toggleable;
        }

    }

}
