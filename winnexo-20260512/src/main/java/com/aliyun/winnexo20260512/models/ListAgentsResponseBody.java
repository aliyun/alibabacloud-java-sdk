// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAgentsResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>租户全量数字员工列表（含停用，按名称字母序）</p>
     */
    @NameInMap("items")
    public java.util.List<ListAgentsResponseBodyItems> items;

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

    public static ListAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsResponseBody self = new ListAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentsResponseBody setItems(java.util.List<ListAgentsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAgentsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAgentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentsResponseBodyItems extends TeaModel {
        /**
         * <p>使用权限授权模式：SPECIFIED_USERS=指定用户 / ALL_USERS=所有用户；未设置时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("authMode")
        public String authMode;

        /**
         * <p>数字员工显示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>启用/停用状态</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isActive")
        public Boolean isActive;

        /**
         * <p>数字员工名称（唯一标识）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operatingObjectName")
        public String operatingObjectName;

        public static ListAgentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsResponseBodyItems self = new ListAgentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAgentsResponseBodyItems setAuthMode(String authMode) {
            this.authMode = authMode;
            return this;
        }
        public String getAuthMode() {
            return this.authMode;
        }

        public ListAgentsResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAgentsResponseBodyItems setIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Boolean getIsActive() {
            return this.isActive;
        }

        public ListAgentsResponseBodyItems setOperatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

    }

}
