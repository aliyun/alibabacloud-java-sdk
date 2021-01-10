// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasLoadbalanceListenerResponseBody body;

    public static QueryCasLoadbalanceListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceListenerResponse self = new QueryCasLoadbalanceListenerResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasLoadbalanceListenerResponse setBody(QueryCasLoadbalanceListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasLoadbalanceListenerResponseBody getBody() {
        return this.body;
    }

}
