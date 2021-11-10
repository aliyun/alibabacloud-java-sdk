// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class MarketTaskInfoQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MarketTaskInfoQueryResponseBody body;

    public static MarketTaskInfoQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        MarketTaskInfoQueryResponse self = new MarketTaskInfoQueryResponse();
        return TeaModel.build(map, self);
    }

    public MarketTaskInfoQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarketTaskInfoQueryResponse setBody(MarketTaskInfoQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public MarketTaskInfoQueryResponseBody getBody() {
        return this.body;
    }

}
