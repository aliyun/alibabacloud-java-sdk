// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class QueryMotionShopVideoDetectResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMotionShopVideoDetectResultResponseBody body;

    public static QueryMotionShopVideoDetectResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMotionShopVideoDetectResultResponse self = new QueryMotionShopVideoDetectResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryMotionShopVideoDetectResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMotionShopVideoDetectResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMotionShopVideoDetectResultResponse setBody(QueryMotionShopVideoDetectResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMotionShopVideoDetectResultResponseBody getBody() {
        return this.body;
    }

}
