// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnionChannelResponseBody body;

    public static QueryUnionChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionChannelResponse self = new QueryUnionChannelResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnionChannelResponse setBody(QueryUnionChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnionChannelResponseBody getBody() {
        return this.body;
    }

}
