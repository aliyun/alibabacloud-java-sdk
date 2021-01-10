// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAppstacksRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static ListLinkeBahamutAppstacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAppstacksRequest self = new ListLinkeBahamutAppstacksRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAppstacksRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
