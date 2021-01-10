// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaSinglecoveragetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaSinglecoveragetaskResponseBody body;

    public static QueryLinkeLinkaSinglecoveragetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaSinglecoveragetaskResponse self = new QueryLinkeLinkaSinglecoveragetaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaSinglecoveragetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaSinglecoveragetaskResponse setBody(QueryLinkeLinkaSinglecoveragetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaSinglecoveragetaskResponseBody getBody() {
        return this.body;
    }

}
