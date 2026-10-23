// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RegisterAppResourcePermissionsRequest extends TeaModel {
    /**
     * <p>The batch authorization items.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<RegisterAppResourcePermissionsRequestItems> items;

    /**
     * <p>The ID of the tenant to which the resource belongs. If not specified, the current tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("resourceTenantId")
    public String resourceTenantId;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
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
         * <p>The principal ID. Omit this parameter for ALL_USERS.</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("granteeId")
        public String granteeId;

        /**
         * <p>The tenant to which the cross-tenant USER belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("granteeTenantId")
        public String granteeTenantId;

        /**
         * <p>The principal type.</p>
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
         * <p>The expiration time with the time zone. If not specified, the permissions never expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31T23:59:59+08:00</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <p>The authorized principals.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("grantees")
        public java.util.List<RegisterAppResourcePermissionsRequestItemsGrantees> grantees;

        /**
         * <p>The granted permissions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        /**
         * <p>The dot-separated resource key, where the first segment is the APP application key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo.resource_1</p>
         */
        @NameInMap("resourceKey")
        public String resourceKey;

        /**
         * <p>The resource type. Set the value to APP_RESOURCE.</p>
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
