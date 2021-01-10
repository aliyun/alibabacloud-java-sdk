// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveQueryProcessorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveQueryProcessorResponseBody body;

    public static RemoveQueryProcessorResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveQueryProcessorResponse self = new RemoveQueryProcessorResponse();
        return TeaModel.build(map, self);
    }

    public RemoveQueryProcessorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveQueryProcessorResponse setBody(RemoveQueryProcessorResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveQueryProcessorResponseBody getBody() {
        return this.body;
    }

}
