// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendImageListRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("Query")
    public String query;

    public static GetTrendImageListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrendImageListRequest self = new GetTrendImageListRequest();
        return TeaModel.build(map, self);
    }

    public GetTrendImageListRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetTrendImageListRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
