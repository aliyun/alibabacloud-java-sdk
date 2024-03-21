// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ComplementTrademarkApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ComplementTrademarkApplicationResponseBody body;

    public static ComplementTrademarkApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ComplementTrademarkApplicationResponse self = new ComplementTrademarkApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ComplementTrademarkApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ComplementTrademarkApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ComplementTrademarkApplicationResponse setBody(ComplementTrademarkApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ComplementTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

}
