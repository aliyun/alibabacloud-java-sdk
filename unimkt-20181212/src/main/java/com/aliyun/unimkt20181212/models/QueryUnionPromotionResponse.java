// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionPromotionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnionPromotionResponseBody body;

    public static QueryUnionPromotionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionPromotionResponse self = new QueryUnionPromotionResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionPromotionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnionPromotionResponse setBody(QueryUnionPromotionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnionPromotionResponseBody getBody() {
        return this.body;
    }

}
