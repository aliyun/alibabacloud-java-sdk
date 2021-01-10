// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWorkitemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutWorkitemsResponseBody body;

    public static QueryLinkeBahamutWorkitemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWorkitemsResponse self = new QueryLinkeBahamutWorkitemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWorkitemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutWorkitemsResponse setBody(QueryLinkeBahamutWorkitemsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutWorkitemsResponseBody getBody() {
        return this.body;
    }

}
