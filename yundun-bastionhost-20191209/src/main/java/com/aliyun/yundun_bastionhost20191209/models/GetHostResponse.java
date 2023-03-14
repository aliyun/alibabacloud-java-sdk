// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHostResponseBody body;

    public static GetHostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHostResponse self = new GetHostResponse();
        return TeaModel.build(map, self);
    }

    public GetHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHostResponse setBody(GetHostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHostResponseBody getBody() {
        return this.body;
    }

}
