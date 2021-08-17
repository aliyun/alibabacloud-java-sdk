// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOrderInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOrderInfoResponseBody body;

    public static GetOrderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderInfoResponse self = new GetOrderInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderInfoResponse setBody(GetOrderInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderInfoResponseBody getBody() {
        return this.body;
    }

}
