// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetStsTokenRequest extends TeaModel {
    @NameInMap("TenantId")
    public Long tenantId;

    public static GetStsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStsTokenRequest self = new GetStsTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetStsTokenRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
