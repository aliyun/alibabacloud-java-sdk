// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqConsumerJStackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqSofamqConsumerJStackResponseBody body;

    public static GetMqSofamqConsumerJStackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqConsumerJStackResponse self = new GetMqSofamqConsumerJStackResponse();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqConsumerJStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqSofamqConsumerJStackResponse setBody(GetMqSofamqConsumerJStackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqSofamqConsumerJStackResponseBody getBody() {
        return this.body;
    }

}
