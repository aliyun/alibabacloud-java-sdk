// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckTrademarkIconResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckTrademarkIconResponseBody body;

    public static CheckTrademarkIconResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckTrademarkIconResponse self = new CheckTrademarkIconResponse();
        return TeaModel.build(map, self);
    }

    public CheckTrademarkIconResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckTrademarkIconResponse setBody(CheckTrademarkIconResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTrademarkIconResponseBody getBody() {
        return this.body;
    }

}
