// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UpdateTenantRequest extends TeaModel {
    /**
     * <p>Tenant description.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Tenant name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试任务202208101424</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    public static UpdateTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantRequest self = new UpdateTenantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
