// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppInfoResponseBody body;

    public static CreateAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInfoResponse self = new CreateAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppInfoResponse setBody(CreateAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppInfoResponseBody getBody() {
        return this.body;
    }

}
