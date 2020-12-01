// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryResourceStaticsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public QueryResourceStaticsQuery query;

    public static QueryResourceStaticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceStaticsRequest self = new QueryResourceStaticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceStaticsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResourceStaticsRequest setQuery(QueryResourceStaticsQuery query) {
        this.query = query;
        return this;
    }
    public QueryResourceStaticsQuery getQuery() {
        return this.query;
    }

}
