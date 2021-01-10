// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutArchdomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutArchdomainsResponseBody body;

    public static QueryLinkeBahamutArchdomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutArchdomainsResponse self = new QueryLinkeBahamutArchdomainsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutArchdomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutArchdomainsResponse setBody(QueryLinkeBahamutArchdomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutArchdomainsResponseBody getBody() {
        return this.body;
    }

}
