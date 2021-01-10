// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppqueryappisexistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppqueryappisexistResponseBody body;

    public static QueryLinkeBahamutAppqueryappisexistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppqueryappisexistResponse self = new QueryLinkeBahamutAppqueryappisexistResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppqueryappisexistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppqueryappisexistResponse setBody(QueryLinkeBahamutAppqueryappisexistResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppqueryappisexistResponseBody getBody() {
        return this.body;
    }

}
