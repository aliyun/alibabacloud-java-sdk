// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAppResourcePermissionRecordsResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>当前页授权记录</p>
     */
    @NameInMap("items")
    public java.util.List<ListAppResourcePermissionRecordsResponseBodyItems> items;

    /**
     * <p>错误描述；成功时为空</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页条数</p>
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
     * <p>记录总数</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAppResourcePermissionRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppResourcePermissionRecordsResponseBody self = new ListAppResourcePermissionRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppResourcePermissionRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppResourcePermissionRecordsResponseBody setItems(java.util.List<ListAppResourcePermissionRecordsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAppResourcePermissionRecordsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAppResourcePermissionRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppResourcePermissionRecordsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAppResourcePermissionRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppResourcePermissionRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppResourcePermissionRecordsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAppResourcePermissionRecordsResponseBodyItems extends TeaModel {
        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>到期时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31T23:59:59+08:00</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <p>授权人平台用户 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("grantedBy")
        public String grantedBy;

        /**
         * <p>主体 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("granteeId")
        public String granteeId;

        /**
         * <p>主体名称</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("granteeName")
        public String granteeName;

        /**
         * <p>跨租户 USER 所属租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("granteeTenantId")
        public String granteeTenantId;

        /**
         * <p>主体类型</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("granteeType")
        public String granteeType;

        /**
         * <p>权限点</p>
         * 
         * <strong>example:</strong>
         * <p>APP/VIEW</p>
         */
        @NameInMap("permission")
        public String permission;

        /**
         * <p>权限记录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("permissionId")
        public Long permissionId;

        /**
         * <p>资源键</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo.resource_1</p>
         */
        @NameInMap("resourceKey")
        public String resourceKey;

        /**
         * <p>资源类型</p>
         * 
         * <strong>example:</strong>
         * <p>APP_RESOURCE</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static ListAppResourcePermissionRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppResourcePermissionRecordsResponseBodyItems self = new ListAppResourcePermissionRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setGrantedBy(String grantedBy) {
            this.grantedBy = grantedBy;
            return this;
        }
        public String getGrantedBy() {
            return this.grantedBy;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setGranteeId(String granteeId) {
            this.granteeId = granteeId;
            return this;
        }
        public String getGranteeId() {
            return this.granteeId;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setGranteeName(String granteeName) {
            this.granteeName = granteeName;
            return this;
        }
        public String getGranteeName() {
            return this.granteeName;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setGranteeTenantId(String granteeTenantId) {
            this.granteeTenantId = granteeTenantId;
            return this;
        }
        public String getGranteeTenantId() {
            return this.granteeTenantId;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setGranteeType(String granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public String getGranteeType() {
            return this.granteeType;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setPermissionId(Long permissionId) {
            this.permissionId = permissionId;
            return this;
        }
        public Long getPermissionId() {
            return this.permissionId;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAppResourcePermissionRecordsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
