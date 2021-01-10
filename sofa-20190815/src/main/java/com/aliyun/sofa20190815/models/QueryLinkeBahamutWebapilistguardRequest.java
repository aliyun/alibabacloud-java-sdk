// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapilistguardRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static QueryLinkeBahamutWebapilistguardRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapilistguardRequest self = new QueryLinkeBahamutWebapilistguardRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapilistguardRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
