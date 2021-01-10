// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapiguardsguardapilistguardRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static QueryLinkeBahamutWebapiguardsguardapilistguardRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapiguardsguardapilistguardRequest self = new QueryLinkeBahamutWebapiguardsguardapilistguardRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapiguardsguardapilistguardRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
