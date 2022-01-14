// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tianchi20210604.models;

import com.aliyun.tea.*;

public class AilabSaasUpdateTenantRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("TenantId")
    public Long tenantId;

    public static AilabSaasUpdateTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        AilabSaasUpdateTenantRequest self = new AilabSaasUpdateTenantRequest();
        return TeaModel.build(map, self);
    }

    public AilabSaasUpdateTenantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AilabSaasUpdateTenantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AilabSaasUpdateTenantRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
