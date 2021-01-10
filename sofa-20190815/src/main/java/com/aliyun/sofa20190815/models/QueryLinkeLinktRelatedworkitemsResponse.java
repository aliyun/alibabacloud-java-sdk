// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktRelatedworkitemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktRelatedworkitemsResponseBody body;

    public static QueryLinkeLinktRelatedworkitemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktRelatedworkitemsResponse self = new QueryLinkeLinktRelatedworkitemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktRelatedworkitemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktRelatedworkitemsResponse setBody(QueryLinkeLinktRelatedworkitemsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktRelatedworkitemsResponseBody getBody() {
        return this.body;
    }

}
