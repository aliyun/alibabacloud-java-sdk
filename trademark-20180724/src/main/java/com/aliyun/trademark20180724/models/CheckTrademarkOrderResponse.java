// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckTrademarkOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckTrademarkOrderResponseBody body;

    public static CheckTrademarkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckTrademarkOrderResponse self = new CheckTrademarkOrderResponse();
        return TeaModel.build(map, self);
    }

    public CheckTrademarkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckTrademarkOrderResponse setBody(CheckTrademarkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTrademarkOrderResponseBody getBody() {
        return this.body;
    }

}
