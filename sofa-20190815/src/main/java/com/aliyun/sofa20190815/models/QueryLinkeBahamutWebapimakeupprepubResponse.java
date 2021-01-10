// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapimakeupprepubResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutWebapimakeupprepubResponseBody body;

    public static QueryLinkeBahamutWebapimakeupprepubResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapimakeupprepubResponse self = new QueryLinkeBahamutWebapimakeupprepubResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapimakeupprepubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutWebapimakeupprepubResponse setBody(QueryLinkeBahamutWebapimakeupprepubResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutWebapimakeupprepubResponseBody getBody() {
        return this.body;
    }

}
