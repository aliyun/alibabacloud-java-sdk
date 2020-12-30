// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateExpressCloudConnectionResponse setBody(CreateExpressCloudConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExpressCloudConnectionResponseBody getBody() {
        return this.body;
    }

}
