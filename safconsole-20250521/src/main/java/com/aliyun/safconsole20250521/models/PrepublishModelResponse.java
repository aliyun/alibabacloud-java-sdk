// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class PrepublishModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrepublishModelResponseBody body;

    public static PrepublishModelResponse build(java.util.Map<String, ?> map) throws Exception {
        PrepublishModelResponse self = new PrepublishModelResponse();
        return TeaModel.build(map, self);
    }

    public PrepublishModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrepublishModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrepublishModelResponse setBody(PrepublishModelResponseBody body) {
        this.body = body;
        return this;
    }
    public PrepublishModelResponseBody getBody() {
        return this.body;
    }

}
