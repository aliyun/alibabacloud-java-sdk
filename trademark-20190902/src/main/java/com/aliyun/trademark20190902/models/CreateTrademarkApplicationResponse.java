// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CreateTrademarkApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrademarkApplicationResponseBody body;

    public static CreateTrademarkApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrademarkApplicationResponse self = new CreateTrademarkApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrademarkApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrademarkApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrademarkApplicationResponse setBody(CreateTrademarkApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

}
