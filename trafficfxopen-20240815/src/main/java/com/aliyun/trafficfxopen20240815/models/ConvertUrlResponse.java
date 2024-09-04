// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trafficfxopen20240815.models;

import com.aliyun.tea.*;

public class ConvertUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertUrlResponseBody body;

    public static ConvertUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertUrlResponse self = new ConvertUrlResponse();
        return TeaModel.build(map, self);
    }

    public ConvertUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertUrlResponse setBody(ConvertUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertUrlResponseBody getBody() {
        return this.body;
    }

}
