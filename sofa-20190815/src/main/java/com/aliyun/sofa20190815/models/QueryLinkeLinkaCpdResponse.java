// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaCpdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaCpdResponseBody body;

    public static QueryLinkeLinkaCpdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaCpdResponse self = new QueryLinkeLinkaCpdResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaCpdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaCpdResponse setBody(QueryLinkeLinkaCpdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaCpdResponseBody getBody() {
        return this.body;
    }

}
