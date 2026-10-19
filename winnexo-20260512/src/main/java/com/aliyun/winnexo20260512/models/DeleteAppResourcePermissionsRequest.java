// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteAppResourcePermissionsRequest extends TeaModel {
    /**
     * <p>撤权范围</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<DeleteAppResourcePermissionsRequestItems> items;

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
         * <p>GRANTEE 主体 ID 列表</p>
         */
        @NameInMap("granteeIds")
        public java.util.List<String> granteeIds;

        /**
         * <p>GRANTEE USER 所属租户；同资源租户可省略，跨租户 USER 必填</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("granteeTenantId")
        public String granteeTenantId;

        /**
         * <p>GRANTEE 主体类型</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("granteeType")
        public String granteeType;

        /**
         * <p>RESOURCE 是否包含点分后代资源；省略为 false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("includeDescendants")
        public Boolean includeDescendants;

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

        /**
         * <p>删除范围：按资源或按主体</p>
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
