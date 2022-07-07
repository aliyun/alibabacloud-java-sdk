// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAppResponseBody body;

    public static RemoveAppResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppResponse self = new RemoveAppResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAppResponse setBody(RemoveAppResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAppResponseBody getBody() {
        return this.body;
    }

}
