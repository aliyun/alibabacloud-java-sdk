// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutApptodotaskquerybyreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutApptodotaskquerybyreleaseResponseBody body;

    public static QueryLinkeBahamutApptodotaskquerybyreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutApptodotaskquerybyreleaseResponse self = new QueryLinkeBahamutApptodotaskquerybyreleaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutApptodotaskquerybyreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutApptodotaskquerybyreleaseResponse setBody(QueryLinkeBahamutApptodotaskquerybyreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutApptodotaskquerybyreleaseResponseBody getBody() {
        return this.body;
    }

}
