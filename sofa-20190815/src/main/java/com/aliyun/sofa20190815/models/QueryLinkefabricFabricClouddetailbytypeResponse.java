// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricClouddetailbytypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricClouddetailbytypeResponseBody body;

    public static QueryLinkefabricFabricClouddetailbytypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricClouddetailbytypeResponse self = new QueryLinkefabricFabricClouddetailbytypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricClouddetailbytypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricClouddetailbytypeResponse setBody(QueryLinkefabricFabricClouddetailbytypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricClouddetailbytypeResponseBody getBody() {
        return this.body;
    }

}
