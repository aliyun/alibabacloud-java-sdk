// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSTopologyResponseBody body;

    public static QueryTSTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyResponse self = new QueryTSTopologyResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSTopologyResponse setBody(QueryTSTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSTopologyResponseBody getBody() {
        return this.body;
    }

}
