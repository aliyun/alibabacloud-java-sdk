// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class IterateModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IterateModelResponseBody body;

    public static IterateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        IterateModelResponse self = new IterateModelResponse();
        return TeaModel.build(map, self);
    }

    public IterateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IterateModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IterateModelResponse setBody(IterateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public IterateModelResponseBody getBody() {
        return this.body;
    }

}
