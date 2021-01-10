// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSTopologyInstanceResponseBody body;

    public static QueryTSTopologyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyInstanceResponse self = new QueryTSTopologyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSTopologyInstanceResponse setBody(QueryTSTopologyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSTopologyInstanceResponseBody getBody() {
        return this.body;
    }

}
