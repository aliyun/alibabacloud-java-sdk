// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CreateTrademarkOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrademarkOrderResponseBody body;

    public static CreateTrademarkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrademarkOrderResponse self = new CreateTrademarkOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrademarkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrademarkOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrademarkOrderResponse setBody(CreateTrademarkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrademarkOrderResponseBody getBody() {
        return this.body;
    }

}
