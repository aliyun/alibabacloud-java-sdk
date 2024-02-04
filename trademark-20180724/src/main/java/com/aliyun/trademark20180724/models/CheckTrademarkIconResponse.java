// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckTrademarkIconResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CheckTrademarkIconResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckTrademarkIconResponse setBody(CheckTrademarkIconResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTrademarkIconResponseBody getBody() {
        return this.body;
    }

}
