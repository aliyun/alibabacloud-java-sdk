// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUserRolesRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeTenantUserRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUserRolesRequest self = new DescribeTenantUserRolesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUserRolesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
