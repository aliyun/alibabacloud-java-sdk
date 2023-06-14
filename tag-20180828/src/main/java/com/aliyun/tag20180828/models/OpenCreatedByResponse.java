// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class OpenCreatedByResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenCreatedByResponseBody body;

    public static OpenCreatedByResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCreatedByResponse self = new OpenCreatedByResponse();
        return TeaModel.build(map, self);
    }

    public OpenCreatedByResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenCreatedByResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenCreatedByResponse setBody(OpenCreatedByResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenCreatedByResponseBody getBody() {
        return this.body;
    }

}
