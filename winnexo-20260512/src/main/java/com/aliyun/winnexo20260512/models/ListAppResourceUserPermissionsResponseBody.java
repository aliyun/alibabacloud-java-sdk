// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAppResourceUserPermissionsResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The resources and permissions on the current page.</p>
     */
    @NameInMap("items")
    public java.util.List<ListAppResourceUserPermissionsResponseBodyItems> items;

    /**
     * <p>The error description. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of resources.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAppResourceUserPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppResourceUserPermissionsResponseBody self = new ListAppResourceUserPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppResourceUserPermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppResourceUserPermissionsResponseBody setItems(java.util.List<ListAppResourceUserPermissionsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAppResourceUserPermissionsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAppResourceUserPermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppResourceUserPermissionsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAppResourceUserPermissionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppResourceUserPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppResourceUserPermissionsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAppResourceUserPermissionsResponseBodyItems extends TeaModel {
        /**
         * <p>The stored and valid permission points.</p>
         */
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        /**
         * <p>The resource key.</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo.resource_1</p>
         */
        @NameInMap("resourceKey")
        public String resourceKey;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_RESOURCE</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static ListAppResourceUserPermissionsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppResourceUserPermissionsResponseBodyItems self = new ListAppResourceUserPermissionsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAppResourceUserPermissionsResponseBodyItems setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        public ListAppResourceUserPermissionsResponseBodyItems setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public ListAppResourceUserPermissionsResponseBodyItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
