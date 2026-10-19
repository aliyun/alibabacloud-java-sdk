// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RegisterAppResourcePermissionsRequest extends TeaModel {
    /**
     * <p>批量授权项</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<RegisterAppResourcePermissionsRequestItems> items;

    /**
     * <p>资源所属租户 ID；省略为调用人当前租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("resourceTenantId")
    public String resourceTenantId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static RegisterAppResourcePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAppResourcePermissionsRequest self = new RegisterAppResourcePermissionsRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAppResourcePermissionsRequest setItems(java.util.List<RegisterAppResourcePermissionsRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<RegisterAppResourcePermissionsRequestItems> getItems() {
        return this.items;
    }

    public RegisterAppResourcePermissionsRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public RegisterAppResourcePermissionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class RegisterAppResourcePermissionsRequestItemsGrantees extends TeaModel {
        /**
         * <p>主体 ID；ALL_USERS 省略</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("granteeId")
        public String granteeId;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("granteeType")
        public String granteeType;

        public static RegisterAppResourcePermissionsRequestItemsGrantees build(java.util.Map<String, ?> map) throws Exception {
            RegisterAppResourcePermissionsRequestItemsGrantees self = new RegisterAppResourcePermissionsRequestItemsGrantees();
            return TeaModel.build(map, self);
        }

        public RegisterAppResourcePermissionsRequestItemsGrantees setGranteeId(String granteeId) {
            this.granteeId = granteeId;
            return this;
        }
        public String getGranteeId() {
            return this.granteeId;
        }

        public RegisterAppResourcePermissionsRequestItemsGrantees setGranteeTenantId(String granteeTenantId) {
            this.granteeTenantId = granteeTenantId;
            return this;
        }
        public String getGranteeTenantId() {
            return this.granteeTenantId;
        }

        public RegisterAppResourcePermissionsRequestItemsGrantees setGranteeType(String granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public String getGranteeType() {
            return this.granteeType;
        }

    }

    public static class RegisterAppResourcePermissionsRequestItems extends TeaModel {
        /**
         * <p>带时区的到期时间；省略表示永久</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31T23:59:59+08:00</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <p>被授权主体</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("grantees")
        public java.util.List<RegisterAppResourcePermissionsRequestItemsGrantees> grantees;

        /**
         * <p>授权权限点</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        /**
         * <p>首段为 APP 应用键的点分资源键</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo.resource_1</p>
         */
        @NameInMap("resourceKey")
        public String resourceKey;

        /**
         * <p>固定为 APP_RESOURCE</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_RESOURCE</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static RegisterAppResourcePermissionsRequestItems build(java.util.Map<String, ?> map) throws Exception {
            RegisterAppResourcePermissionsRequestItems self = new RegisterAppResourcePermissionsRequestItems();
            return TeaModel.build(map, self);
        }

        public RegisterAppResourcePermissionsRequestItems setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public RegisterAppResourcePermissionsRequestItems setGrantees(java.util.List<RegisterAppResourcePermissionsRequestItemsGrantees> grantees) {
            this.grantees = grantees;
            return this;
        }
        public java.util.List<RegisterAppResourcePermissionsRequestItemsGrantees> getGrantees() {
            return this.grantees;
        }

        public RegisterAppResourcePermissionsRequestItems setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        public RegisterAppResourcePermissionsRequestItems setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public RegisterAppResourcePermissionsRequestItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
