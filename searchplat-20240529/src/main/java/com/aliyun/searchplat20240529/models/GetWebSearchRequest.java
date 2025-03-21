// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetWebSearchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("top_k")
    public Long topK;

    @NameInMap("way")
    public String way;

    public static GetWebSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebSearchRequest self = new GetWebSearchRequest();
        return TeaModel.build(map, self);
    }

    public GetWebSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetWebSearchRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public GetWebSearchRequest setWay(String way) {
        this.way = way;
        return this;
    }
    public String getWay() {
        return this.way;
    }

}
