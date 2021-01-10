// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapiguardapilistguardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutWebapiguardapilistguardResponseBody body;

    public static QueryLinkeBahamutWebapiguardapilistguardResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapiguardapilistguardResponse self = new QueryLinkeBahamutWebapiguardapilistguardResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapiguardapilistguardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutWebapiguardapilistguardResponse setBody(QueryLinkeBahamutWebapiguardapilistguardResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutWebapiguardapilistguardResponseBody getBody() {
        return this.body;
    }

}
