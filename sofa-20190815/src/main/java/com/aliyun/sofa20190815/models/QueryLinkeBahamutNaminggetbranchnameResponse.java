// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutNaminggetbranchnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutNaminggetbranchnameResponseBody body;

    public static QueryLinkeBahamutNaminggetbranchnameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutNaminggetbranchnameResponse self = new QueryLinkeBahamutNaminggetbranchnameResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutNaminggetbranchnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutNaminggetbranchnameResponse setBody(QueryLinkeBahamutNaminggetbranchnameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutNaminggetbranchnameResponseBody getBody() {
        return this.body;
    }

}
