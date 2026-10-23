// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteAppResourcePermissionsRequest extends TeaModel {
    /**
     * <p>The scope of the permissions to be revoked.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<DeleteAppResourcePermissionsRequestItems> items;

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

    public static DeleteAppResourcePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResourcePermissionsRequest self = new DeleteAppResourcePermissionsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppResourcePermissionsRequest setItems(java.util.List<DeleteAppResourcePermissionsRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DeleteAppResourcePermissionsRequestItems> getItems() {
        return this.items;
    }

    public DeleteAppResourcePermissionsRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public DeleteAppResourcePermissionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class DeleteAppResourcePermissionsRequestItems extends TeaModel {
        /**
         * <p>The list of grantee principal IDs.</p>
         */
        @NameInMap("granteeIds")
        public java.util.List<String> granteeIds;

        /**
         * <p>The ID of the tenant to which the grantee user belongs. This parameter is optional if the user and the resource belong to the same tenant, and is required for cross-tenant users.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("granteeTenantId")
        public String granteeTenantId;

        /**
         * <p>The grantee principal type.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("granteeType")
        public String granteeType;

        /**
         * <p>Specifies whether to include dot-separated descendant resources for the RESOURCE. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("includeDescendants")
        public Boolean includeDescendants;

        /**
         * <p>The dot-separated resource key whose first segment is the application key of the APP.</p>
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

        /**
         * <p>The deletion scope: by resource or by principal.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RESOURCE</p>
         */
        @NameInMap("scope")
        public String scope;

        public static DeleteAppResourcePermissionsRequestItems build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppResourcePermissionsRequestItems self = new DeleteAppResourcePermissionsRequestItems();
            return TeaModel.build(map, self);
        }

        public DeleteAppResourcePermissionsRequestItems setGranteeIds(java.util.List<String> granteeIds) {
            this.granteeIds = granteeIds;
            return this;
        }
        public java.util.List<String> getGranteeIds() {
            return this.granteeIds;
        }

        public DeleteAppResourcePermissionsRequestItems setGranteeTenantId(String granteeTenantId) {
            this.granteeTenantId = granteeTenantId;
            return this;
        }
        public String getGranteeTenantId() {
            return this.granteeTenantId;
        }

        public DeleteAppResourcePermissionsRequestItems setGranteeType(String granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public String getGranteeType() {
            return this.granteeType;
        }

        public DeleteAppResourcePermissionsRequestItems setIncludeDescendants(Boolean includeDescendants) {
            this.includeDescendants = includeDescendants;
            return this;
        }
        public Boolean getIncludeDescendants() {
            return this.includeDescendants;
        }

        public DeleteAppResourcePermissionsRequestItems setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public DeleteAppResourcePermissionsRequestItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DeleteAppResourcePermissionsRequestItems setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
