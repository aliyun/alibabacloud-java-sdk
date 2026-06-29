// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SingleTenant extends TeaModel {
    /**
     * <p>Tenant description</p>
     * 
     * <strong>example:</strong>
     * <p>该租户用来测试</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Tenant status</p>
     * 
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Tenant ID</p>
     * 
     * <strong>example:</strong>
     * <p>GA***134</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>Tenant name</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    /**
     * <p>Tenant UUID</p>
     * 
     * <strong>example:</strong>
     * <p>paiworkspace-0001</p>
     */
    @NameInMap("UUID")
    public String UUID;

    public static SingleTenant build(java.util.Map<String, ?> map) throws Exception {
        SingleTenant self = new SingleTenant();
        return TeaModel.build(map, self);
    }

    public SingleTenant setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SingleTenant setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SingleTenant setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SingleTenant setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public SingleTenant setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

}
