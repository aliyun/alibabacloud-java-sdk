// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListCollaborationGroupMembersResponseBody extends TeaModel {
    /**
     * <p>公共业务状态码，由后端Code字段映射；错误时用于识别失败原因。</p>
     * 
     * <strong>example:</strong>
     * <p>ERR.Robject.Auth.TenantAccessDenied</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>当前页记录列表；没有匹配记录时返回空数组。</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;userId&quot;:&quot;5&quot;,&quot;displayName&quot;:&quot;张三&quot;,&quot;role&quot;:&quot;OWNER&quot;,&quot;isActive&quot;:true}]</p>
     */
    @NameInMap("items")
    public java.util.List<ListCollaborationGroupMembersResponseBodyItems> items;

    /**
     * <p>公共错误说明，由后端Message字段映射；错误时描述失败原因。</p>
     * 
     * <strong>example:</strong>
     * <p>无权访问租户 2147483647，用户不属于该租户</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>当前返回页的页码，从1开始。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>当前分页设置的每页记录数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>请求追踪ID，由后端RequestId字段映射，用于排查调用失败。</p>
     * 
     * <strong>example:</strong>
     * <p>c9cf6cb3-3f5c-4994-a8a1-c93379a6f5cf</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>满足查询条件的记录总数，不是当前页记录数。</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListCollaborationGroupMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCollaborationGroupMembersResponseBody self = new ListCollaborationGroupMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCollaborationGroupMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCollaborationGroupMembersResponseBody setItems(java.util.List<ListCollaborationGroupMembersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListCollaborationGroupMembersResponseBodyItems> getItems() {
        return this.items;
    }

    public ListCollaborationGroupMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCollaborationGroupMembersResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListCollaborationGroupMembersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCollaborationGroupMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCollaborationGroupMembersResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListCollaborationGroupMembersResponseBodyItems extends TeaModel {
        /**
         * <p>成员显示名称；未设置时为空。</p>
         * 
         * <strong>example:</strong>
         * <p>TEST001</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>租户账号是否启用。本接口只返回有效且账号启用的成员，值为true；不代表HR在职状态。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isActive")
        public Boolean isActive;

        /**
         * <p>成员在空间内的角色：ADMIN为管理员，MEMBER为普通成员。</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>平台用户ID，字符串形式，可用作转交待办的目标用户ID。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListCollaborationGroupMembersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListCollaborationGroupMembersResponseBodyItems self = new ListCollaborationGroupMembersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListCollaborationGroupMembersResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListCollaborationGroupMembersResponseBodyItems setIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Boolean getIsActive() {
            return this.isActive;
        }

        public ListCollaborationGroupMembersResponseBodyItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListCollaborationGroupMembersResponseBodyItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
