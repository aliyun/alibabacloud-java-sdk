// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetMqConsumerTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqConsumerTagResponseBody body;

    public static GetMqConsumerTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqConsumerTagResponse self = new GetMqConsumerTagResponse();
        return TeaModel.build(map, self);
    }

    public GetMqConsumerTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqConsumerTagResponse setBody(GetMqConsumerTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqConsumerTagResponseBody getBody() {
        return this.body;
    }

}
