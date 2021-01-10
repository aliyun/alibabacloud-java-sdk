// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCloudtenantapplevelRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutCloudtenantapplevelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCloudtenantapplevelRequest self = new QueryLinkeBahamutCloudtenantapplevelRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCloudtenantapplevelRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
