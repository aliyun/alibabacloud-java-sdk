// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExpressCloudConnectionResponseBody body;

    public static CreateExpressCloudConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressCloudConnectionResponse self = new CreateExpressCloudConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateExpressCloudConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExpressCloudConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExpressCloudConnectionResponse setBody(CreateExpressCloudConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExpressCloudConnectionResponseBody getBody() {
        return this.body;
    }

}
