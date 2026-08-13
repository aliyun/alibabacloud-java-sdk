// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckHealthRequest extends TeaModel {
    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
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
