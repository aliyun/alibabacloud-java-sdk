// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsgroupsownedRequest extends TeaModel {
    @NameInMap("Search")
    public String search;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsgroupsownedRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsgroupsownedRequest self = new GetLinkeBahamutVcsgroupsownedRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsgroupsownedRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public GetLinkeBahamutVcsgroupsownedRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
