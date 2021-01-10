// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutSearchcountRequest extends TeaModel {
    @NameInMap("BahamutTenant")
    public String bahamutTenant;

    @NameInMap("Search")
    public String search;

    public static GetLinkeBahamutSearchcountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutSearchcountRequest self = new GetLinkeBahamutSearchcountRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutSearchcountRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public GetLinkeBahamutSearchcountRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}
