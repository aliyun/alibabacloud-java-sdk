// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAifgUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAifgUrlResponseBody body;

    public static GetAifgUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAifgUrlResponse self = new GetAifgUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAifgUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAifgUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAifgUrlResponse setBody(GetAifgUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAifgUrlResponseBody getBody() {
        return this.body;
    }

}
