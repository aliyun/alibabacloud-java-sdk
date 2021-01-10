// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsTransparentProxyLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsTransparentProxyLogResponseBody body;

    public static QueryMsTransparentProxyLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsTransparentProxyLogResponse self = new QueryMsTransparentProxyLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsTransparentProxyLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsTransparentProxyLogResponse setBody(QueryMsTransparentProxyLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsTransparentProxyLogResponseBody getBody() {
        return this.body;
    }

}
