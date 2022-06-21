// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStyleTopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStyleTopResponseBody body;

    public static GetStyleTopResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStyleTopResponse self = new GetStyleTopResponse();
        return TeaModel.build(map, self);
    }

    public GetStyleTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStyleTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStyleTopResponse setBody(GetStyleTopResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStyleTopResponseBody getBody() {
        return this.body;
    }

}
