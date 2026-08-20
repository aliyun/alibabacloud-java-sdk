// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetInstanceExpireTimeRequest extends TeaModel {
    /**
     * <p>The effective tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetInstanceExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceExpireTimeRequest self = new GetInstanceExpireTimeRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceExpireTimeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
