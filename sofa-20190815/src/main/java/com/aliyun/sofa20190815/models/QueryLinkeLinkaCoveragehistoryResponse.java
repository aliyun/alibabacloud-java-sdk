// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaCoveragehistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaCoveragehistoryResponseBody body;

    public static QueryLinkeLinkaCoveragehistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaCoveragehistoryResponse self = new QueryLinkeLinkaCoveragehistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaCoveragehistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaCoveragehistoryResponse setBody(QueryLinkeLinkaCoveragehistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaCoveragehistoryResponseBody getBody() {
        return this.body;
    }

}
