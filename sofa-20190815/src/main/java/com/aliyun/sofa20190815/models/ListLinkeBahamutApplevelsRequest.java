// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutApplevelsRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static ListLinkeBahamutApplevelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutApplevelsRequest self = new ListLinkeBahamutApplevelsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutApplevelsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
