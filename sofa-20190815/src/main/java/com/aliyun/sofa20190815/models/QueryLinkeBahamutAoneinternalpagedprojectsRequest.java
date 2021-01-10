// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternalpagedprojectsRequest extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Q")
    public String q;

    public static QueryLinkeBahamutAoneinternalpagedprojectsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternalpagedprojectsRequest self = new QueryLinkeBahamutAoneinternalpagedprojectsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternalpagedprojectsRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public QueryLinkeBahamutAoneinternalpagedprojectsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutAoneinternalpagedprojectsRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

}
