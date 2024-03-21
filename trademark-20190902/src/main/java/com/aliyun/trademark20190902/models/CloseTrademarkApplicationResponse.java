// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CloseTrademarkApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseTrademarkApplicationResponseBody body;

    public static CloseTrademarkApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseTrademarkApplicationResponse self = new CloseTrademarkApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CloseTrademarkApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseTrademarkApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseTrademarkApplicationResponse setBody(CloseTrademarkApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

}
