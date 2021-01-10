// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutMetacenterarchdomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutMetacenterarchdomainResponseBody body;

    public static QueryLinkeBahamutMetacenterarchdomainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutMetacenterarchdomainResponse self = new QueryLinkeBahamutMetacenterarchdomainResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutMetacenterarchdomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutMetacenterarchdomainResponse setBody(QueryLinkeBahamutMetacenterarchdomainResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutMetacenterarchdomainResponseBody getBody() {
        return this.body;
    }

}
