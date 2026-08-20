// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetUserCreditUsageRequest extends TeaModel {
    /**
     * <p>The ID of the tenant to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetUserCreditUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserCreditUsageRequest self = new GetUserCreditUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetUserCreditUsageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
