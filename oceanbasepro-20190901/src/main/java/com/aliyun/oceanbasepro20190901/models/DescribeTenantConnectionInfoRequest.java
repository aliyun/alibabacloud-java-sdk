// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantConnectionInfoRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeTenantConnectionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantConnectionInfoRequest self = new DescribeTenantConnectionInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantConnectionInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
