// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSTopologyVersionsResponseBody body;

    public static QueryTSTopologyVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyVersionsResponse self = new QueryTSTopologyVersionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSTopologyVersionsResponse setBody(QueryTSTopologyVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSTopologyVersionsResponseBody getBody() {
        return this.body;
    }

}
