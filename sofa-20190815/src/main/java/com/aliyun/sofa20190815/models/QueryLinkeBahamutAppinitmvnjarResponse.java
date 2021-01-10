// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppinitmvnjarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppinitmvnjarResponseBody body;

    public static QueryLinkeBahamutAppinitmvnjarResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppinitmvnjarResponse self = new QueryLinkeBahamutAppinitmvnjarResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppinitmvnjarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppinitmvnjarResponse setBody(QueryLinkeBahamutAppinitmvnjarResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppinitmvnjarResponseBody getBody() {
        return this.body;
    }

}
