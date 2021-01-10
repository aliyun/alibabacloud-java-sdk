// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutMyvcsgroupsRequest extends TeaModel {
    @NameInMap("Search")
    public String search;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutMyvcsgroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutMyvcsgroupsRequest self = new QueryLinkeBahamutMyvcsgroupsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutMyvcsgroupsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public QueryLinkeBahamutMyvcsgroupsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
