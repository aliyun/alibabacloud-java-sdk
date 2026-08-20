// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckHealthRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>692318833855074</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CheckHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckHealthRequest self = new CheckHealthRequest();
        return TeaModel.build(map, self);
    }

    public CheckHealthRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
