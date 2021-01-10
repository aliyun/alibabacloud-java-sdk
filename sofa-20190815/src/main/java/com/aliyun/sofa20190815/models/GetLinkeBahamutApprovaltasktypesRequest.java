// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApprovaltasktypesRequest extends TeaModel {
    @NameInMap("FilterType")
    public String filterType;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static GetLinkeBahamutApprovaltasktypesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApprovaltasktypesRequest self = new GetLinkeBahamutApprovaltasktypesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApprovaltasktypesRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public GetLinkeBahamutApprovaltasktypesRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
