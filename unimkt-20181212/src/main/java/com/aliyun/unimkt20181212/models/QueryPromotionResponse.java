// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryPromotionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPromotionResponseBody body;

    public static QueryPromotionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPromotionResponse self = new QueryPromotionResponse();
        return TeaModel.build(map, self);
    }

    public QueryPromotionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPromotionResponse setBody(QueryPromotionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPromotionResponseBody getBody() {
        return this.body;
    }

}
