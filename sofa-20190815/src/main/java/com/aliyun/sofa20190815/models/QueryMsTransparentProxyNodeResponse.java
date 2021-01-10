// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsTransparentProxyNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsTransparentProxyNodeResponseBody body;

    public static QueryMsTransparentProxyNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsTransparentProxyNodeResponse self = new QueryMsTransparentProxyNodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsTransparentProxyNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsTransparentProxyNodeResponse setBody(QueryMsTransparentProxyNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsTransparentProxyNodeResponseBody getBody() {
        return this.body;
    }

}
