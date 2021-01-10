// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateMqSofamqRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMqSofamqRouterResponseBody body;

    public static CreateMqSofamqRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMqSofamqRouterResponse self = new CreateMqSofamqRouterResponse();
        return TeaModel.build(map, self);
    }

    public CreateMqSofamqRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMqSofamqRouterResponse setBody(CreateMqSofamqRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMqSofamqRouterResponseBody getBody() {
        return this.body;
    }

}
