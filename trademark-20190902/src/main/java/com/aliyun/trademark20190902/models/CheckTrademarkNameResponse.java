// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckTrademarkNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckTrademarkNameResponseBody body;

    public static CheckTrademarkNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckTrademarkNameResponse self = new CheckTrademarkNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckTrademarkNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckTrademarkNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckTrademarkNameResponse setBody(CheckTrademarkNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTrademarkNameResponseBody getBody() {
        return this.body;
    }

}
