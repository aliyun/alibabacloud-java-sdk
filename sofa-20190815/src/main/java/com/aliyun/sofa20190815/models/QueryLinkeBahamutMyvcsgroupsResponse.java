// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutMyvcsgroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutMyvcsgroupsResponseBody body;

    public static QueryLinkeBahamutMyvcsgroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutMyvcsgroupsResponse self = new QueryLinkeBahamutMyvcsgroupsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutMyvcsgroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutMyvcsgroupsResponse setBody(QueryLinkeBahamutMyvcsgroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutMyvcsgroupsResponseBody getBody() {
        return this.body;
    }

}
