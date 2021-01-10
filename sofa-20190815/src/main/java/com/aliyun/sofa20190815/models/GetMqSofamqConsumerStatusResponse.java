// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqConsumerStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqSofamqConsumerStatusResponseBody body;

    public static GetMqSofamqConsumerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqConsumerStatusResponse self = new GetMqSofamqConsumerStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqConsumerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqSofamqConsumerStatusResponse setBody(GetMqSofamqConsumerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqSofamqConsumerStatusResponseBody getBody() {
        return this.body;
    }

}
