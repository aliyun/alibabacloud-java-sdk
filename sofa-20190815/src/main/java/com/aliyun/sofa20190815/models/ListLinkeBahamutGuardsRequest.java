// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutGuardsRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static ListLinkeBahamutGuardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutGuardsRequest self = new ListLinkeBahamutGuardsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutGuardsRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
