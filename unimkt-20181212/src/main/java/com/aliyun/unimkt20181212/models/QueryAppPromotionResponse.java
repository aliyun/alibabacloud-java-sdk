// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryAppPromotionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppPromotionResponseBody body;

    public static QueryAppPromotionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppPromotionResponse self = new QueryAppPromotionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppPromotionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppPromotionResponse setBody(QueryAppPromotionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppPromotionResponseBody getBody() {
        return this.body;
    }

}
