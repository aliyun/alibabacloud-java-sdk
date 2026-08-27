// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUserGroupsRequest extends TeaModel {
    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this parameter explicitly by using <code>--tenant-id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListUserGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsRequest self = new ListUserGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
