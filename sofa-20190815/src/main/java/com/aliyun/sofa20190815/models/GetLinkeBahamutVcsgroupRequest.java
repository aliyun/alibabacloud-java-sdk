// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsgroupRequest extends TeaModel {
    @NameInMap("Search")
    public String search;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsgroupRequest self = new GetLinkeBahamutVcsgroupRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsgroupRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public GetLinkeBahamutVcsgroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
