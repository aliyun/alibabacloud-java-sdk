// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowGetuserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkelinkflowLinkflowGetuserResponseBody body;

    public static QueryLinkelinkflowLinkflowGetuserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowGetuserResponse self = new QueryLinkelinkflowLinkflowGetuserResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowGetuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkelinkflowLinkflowGetuserResponse setBody(QueryLinkelinkflowLinkflowGetuserResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkelinkflowLinkflowGetuserResponseBody getBody() {
        return this.body;
    }

}
