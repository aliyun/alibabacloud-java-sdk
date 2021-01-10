// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSClusterGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDWSClusterGroupResponseBody body;

    public static QueryDWSClusterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSClusterGroupResponse self = new QueryDWSClusterGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryDWSClusterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDWSClusterGroupResponse setBody(QueryDWSClusterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDWSClusterGroupResponseBody getBody() {
        return this.body;
    }

}
