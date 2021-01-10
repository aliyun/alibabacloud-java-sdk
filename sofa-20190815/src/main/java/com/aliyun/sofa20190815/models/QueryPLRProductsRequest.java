// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryPLRProductsRequest extends TeaModel {
    @NameInMap("Refresh")
    public Boolean refresh;

    public static QueryPLRProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPLRProductsRequest self = new QueryPLRProductsRequest();
        return TeaModel.build(map, self);
    }

    public QueryPLRProductsRequest setRefresh(Boolean refresh) {
        this.refresh = refresh;
        return this;
    }
    public Boolean getRefresh() {
        return this.refresh;
    }

}
