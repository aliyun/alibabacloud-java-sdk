// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateQueryProcessorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQueryProcessorResponseBody body;

    public static CreateQueryProcessorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQueryProcessorResponse self = new CreateQueryProcessorResponse();
        return TeaModel.build(map, self);
    }

    public CreateQueryProcessorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQueryProcessorResponse setBody(CreateQueryProcessorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQueryProcessorResponseBody getBody() {
        return this.body;
    }

}
