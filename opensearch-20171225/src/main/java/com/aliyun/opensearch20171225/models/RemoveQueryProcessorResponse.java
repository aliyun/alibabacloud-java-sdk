// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveQueryProcessorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public RemoveQueryProcessorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveQueryProcessorResponse setBody(RemoveQueryProcessorResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveQueryProcessorResponseBody getBody() {
        return this.body;
    }

}
