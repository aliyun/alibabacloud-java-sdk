// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWorkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutWorkitemResponseBody body;

    public static QueryLinkeBahamutWorkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWorkitemResponse self = new QueryLinkeBahamutWorkitemResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWorkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutWorkitemResponse setBody(QueryLinkeBahamutWorkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutWorkitemResponseBody getBody() {
        return this.body;
    }

}
