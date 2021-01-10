// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkelinkflowLinkflowProcessResponseBody body;

    public static QueryLinkelinkflowLinkflowProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowProcessResponse self = new QueryLinkelinkflowLinkflowProcessResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkelinkflowLinkflowProcessResponse setBody(QueryLinkelinkflowLinkflowProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkelinkflowLinkflowProcessResponseBody getBody() {
        return this.body;
    }

}
