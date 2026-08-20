// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The MCP card list.</p>
     */
    @NameInMap("items")
    public java.util.List<ListRolesResponseBodyItems> items;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
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
         * <p>The description of the to-do card type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The role code.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("roleCode")
        public String roleCode;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("roleName")
        public String roleName;

        /**
         * <p>Indicates whether the enable/disable operation is allowed. Super administrators and application users cannot be switched.</p>
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
