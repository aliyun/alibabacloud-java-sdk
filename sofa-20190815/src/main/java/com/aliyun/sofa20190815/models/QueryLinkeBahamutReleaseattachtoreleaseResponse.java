// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleaseattachtoreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutReleaseattachtoreleaseResponseBody body;

    public static QueryLinkeBahamutReleaseattachtoreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleaseattachtoreleaseResponse self = new QueryLinkeBahamutReleaseattachtoreleaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleaseattachtoreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutReleaseattachtoreleaseResponse setBody(QueryLinkeBahamutReleaseattachtoreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutReleaseattachtoreleaseResponseBody getBody() {
        return this.body;
    }

}
