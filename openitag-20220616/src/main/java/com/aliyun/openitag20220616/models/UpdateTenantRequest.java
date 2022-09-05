// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UpdateTenantRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

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
