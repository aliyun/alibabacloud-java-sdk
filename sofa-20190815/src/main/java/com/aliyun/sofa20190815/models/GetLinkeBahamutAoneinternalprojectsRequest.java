// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternalprojectsRequest extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Q")
    public String q;

    public static GetLinkeBahamutAoneinternalprojectsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternalprojectsRequest self = new GetLinkeBahamutAoneinternalprojectsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternalprojectsRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public GetLinkeBahamutAoneinternalprojectsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutAoneinternalprojectsRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

}
