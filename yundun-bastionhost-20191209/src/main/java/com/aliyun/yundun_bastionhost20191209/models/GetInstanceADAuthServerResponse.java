// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceADAuthServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceADAuthServerResponseBody body;

    public static GetInstanceADAuthServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceADAuthServerResponse self = new GetInstanceADAuthServerResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceADAuthServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceADAuthServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceADAuthServerResponse setBody(GetInstanceADAuthServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceADAuthServerResponseBody getBody() {
        return this.body;
    }

}
