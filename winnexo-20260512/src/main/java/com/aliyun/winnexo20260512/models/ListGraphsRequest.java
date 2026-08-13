// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphsRequest extends TeaModel {
    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListGraphsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGraphsRequest self = new ListGraphsRequest();
        return TeaModel.build(map, self);
    }

    public ListGraphsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
