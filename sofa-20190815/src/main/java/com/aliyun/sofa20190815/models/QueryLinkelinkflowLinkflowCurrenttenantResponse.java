// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowCurrenttenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody body;

    public static QueryLinkelinkflowLinkflowCurrenttenantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowCurrenttenantResponse self = new QueryLinkelinkflowLinkflowCurrenttenantResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkelinkflowLinkflowCurrenttenantResponse setBody(QueryLinkelinkflowLinkflowCurrenttenantResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkelinkflowLinkflowCurrenttenantResponseBody getBody() {
        return this.body;
    }

}
