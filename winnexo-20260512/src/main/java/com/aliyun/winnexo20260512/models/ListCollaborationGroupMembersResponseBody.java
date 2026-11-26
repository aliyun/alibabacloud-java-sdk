// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListCollaborationGroupMembersResponseBody extends TeaModel {
    /**
     * <p>The common business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERR.Robject.Auth.TenantAccessDenied</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;userId&quot;:&quot;5&quot;,&quot;displayName&quot;:&quot;Zhang San&quot;,&quot;role&quot;:&quot;OWNER&quot;,&quot;isActive&quot;:true}]</p>
     */
    @NameInMap("items")
    public java.util.List<ListCollaborationGroupMembersResponseBodyItems> items;

    /**
     * <p>The common error description.</p>
     * 
     * <strong>example:</strong>
     * <p>No permission to access tenant 2147483647. The user does not belong to this tenant</p>
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
     * <p>The page size.</p>
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
     * <p>The total number of records after filtering.</p>
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
         * <p>The display name. This field is empty if not set.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST001</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The enabling status of the tenant account. Only active members are returned, so this value is always true. It does not represent the employment status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isActive")
        public Boolean isActive;

        /**
         * <p>The role of the workspace member.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The platform user ID.</p>
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
