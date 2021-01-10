// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkelinkflowLinkflowTaskResponseBody body;

    public static QueryLinkelinkflowLinkflowTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowTaskResponse self = new QueryLinkelinkflowLinkflowTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkelinkflowLinkflowTaskResponse setBody(QueryLinkelinkflowLinkflowTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkelinkflowLinkflowTaskResponseBody getBody() {
        return this.body;
    }

}
