// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DescirbeCombineTrademarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescirbeCombineTrademarkResponseBody body;

    public static DescirbeCombineTrademarkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescirbeCombineTrademarkResponse self = new DescirbeCombineTrademarkResponse();
        return TeaModel.build(map, self);
    }

    public DescirbeCombineTrademarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescirbeCombineTrademarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescirbeCombineTrademarkResponse setBody(DescirbeCombineTrademarkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescirbeCombineTrademarkResponseBody getBody() {
        return this.body;
    }

}
