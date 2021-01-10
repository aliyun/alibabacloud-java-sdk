// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryOneconsoleIndexesRequest extends TeaModel {
    @NameInMap("Host")
    public String host;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MaxMatch")
    public Long maxMatch;

    public static QueryOneconsoleIndexesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOneconsoleIndexesRequest self = new QueryOneconsoleIndexesRequest();
        return TeaModel.build(map, self);
    }

    public QueryOneconsoleIndexesRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public QueryOneconsoleIndexesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryOneconsoleIndexesRequest setMaxMatch(Long maxMatch) {
        this.maxMatch = maxMatch;
        return this;
    }
    public Long getMaxMatch() {
        return this.maxMatch;
    }

}
