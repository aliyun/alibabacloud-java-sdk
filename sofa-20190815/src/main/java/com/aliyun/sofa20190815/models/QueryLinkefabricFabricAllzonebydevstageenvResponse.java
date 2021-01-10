// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricAllzonebydevstageenvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricAllzonebydevstageenvResponseBody body;

    public static QueryLinkefabricFabricAllzonebydevstageenvResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricAllzonebydevstageenvResponse self = new QueryLinkefabricFabricAllzonebydevstageenvResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricAllzonebydevstageenvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricAllzonebydevstageenvResponse setBody(QueryLinkefabricFabricAllzonebydevstageenvResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricAllzonebydevstageenvResponseBody getBody() {
        return this.body;
    }

}
