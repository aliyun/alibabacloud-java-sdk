// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListCollaborationGroupsResponseBody extends TeaModel {
    /**
     * <p>The common business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERR.Robject.Auth.TenantAccessDenied</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of items on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;collaborationGroupId&quot;:&quot;cg_9401&quot;,&quot;name&quot;:&quot;Product Collaboration Space&quot;,&quot;status&quot;:&quot;ACTIVE&quot;,&quot;currentUserRole&quot;:&quot;OWNER&quot;}]</p>
     */
    @NameInMap("items")
    public java.util.List<ListCollaborationGroupsResponseBodyItems> items;

    /**
     * <p>The common error description.</p>
     * 
     * <strong>example:</strong>
     * <p>Access denied to tenant 2147483647. The user does not belong to this tenant</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c9cf6cb3-3f5c-4994-a8a1-c93379a6f5cf</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of filtered records.</p>
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
         * <p>The collaboration space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_9401</p>
         */
        @NameInMap("collaborationGroupId")
        public String collaborationGroupId;

        /**
         * <p>The role of the current user in the space.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("currentUserRole")
        public String currentUserRole;

        /**
         * <p>The name of the space.</p>
         * 
         * <strong>example:</strong>
         * <p>Workflow To-do Test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The space status. Currently, only ACTIVE is returned.</p>
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
