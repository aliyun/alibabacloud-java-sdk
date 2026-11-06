// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListCollaborationGroupsResponseBody extends TeaModel {
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
     * <p>[{&quot;collaborationGroupId&quot;:&quot;cg_9401&quot;,&quot;name&quot;:&quot;产品协作空间&quot;,&quot;status&quot;:&quot;ACTIVE&quot;,&quot;currentUserRole&quot;:&quot;OWNER&quot;}]</p>
     */
    @NameInMap("items")
    public java.util.List<ListCollaborationGroupsResponseBodyItems> items;

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
     * <p>满足查询条件的有效空间总数，不是当前页记录数。</p>
     * 
     * <strong>example:</strong>
     * <p>39</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListCollaborationGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCollaborationGroupsResponseBody self = new ListCollaborationGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCollaborationGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCollaborationGroupsResponseBody setItems(java.util.List<ListCollaborationGroupsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListCollaborationGroupsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListCollaborationGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCollaborationGroupsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListCollaborationGroupsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCollaborationGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCollaborationGroupsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListCollaborationGroupsResponseBodyItems extends TeaModel {
        /**
         * <p>协作空间ID，可用于查询空间成员、查询节点详情及预览对话文件。</p>
         * 
         * <strong>example:</strong>
         * <p>cg_9401</p>
         */
        @NameInMap("collaborationGroupId")
        public String collaborationGroupId;

        /**
         * <p>当前调用用户在空间内的角色：ADMIN为管理员，MEMBER为普通成员。</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("currentUserRole")
        public String currentUserRole;

        /**
         * <p>协作空间显示名称。</p>
         * 
         * <strong>example:</strong>
         * <p>工作流待办测试</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>协作空间状态，当前接口只返回ACTIVE。</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        public static ListCollaborationGroupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListCollaborationGroupsResponseBodyItems self = new ListCollaborationGroupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListCollaborationGroupsResponseBodyItems setCollaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        public ListCollaborationGroupsResponseBodyItems setCurrentUserRole(String currentUserRole) {
            this.currentUserRole = currentUserRole;
            return this;
        }
        public String getCurrentUserRole() {
            return this.currentUserRole;
        }

        public ListCollaborationGroupsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCollaborationGroupsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
