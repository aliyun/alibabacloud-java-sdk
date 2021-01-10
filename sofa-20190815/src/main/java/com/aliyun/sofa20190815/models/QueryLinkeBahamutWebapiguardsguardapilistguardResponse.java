// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapiguardsguardapilistguardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutWebapiguardsguardapilistguardResponseBody body;

    public static QueryLinkeBahamutWebapiguardsguardapilistguardResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapiguardsguardapilistguardResponse self = new QueryLinkeBahamutWebapiguardsguardapilistguardResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapiguardsguardapilistguardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutWebapiguardsguardapilistguardResponse setBody(QueryLinkeBahamutWebapiguardsguardapilistguardResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutWebapiguardsguardapilistguardResponseBody getBody() {
        return this.body;
    }

}
