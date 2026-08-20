// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAvailableConfigsRequest extends TeaModel {
    /**
     * <p>The tenant ID. This is a common parameter. Pass it explicitly through --tenant-id in winnexo-cli.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAvailableConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableConfigsRequest self = new ListAvailableConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableConfigsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
