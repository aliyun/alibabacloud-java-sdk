// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CloseCreatedByResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloseCreatedByResponseBody body;

    public static CloseCreatedByResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseCreatedByResponse self = new CloseCreatedByResponse();
        return TeaModel.build(map, self);
    }

    public CloseCreatedByResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseCreatedByResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseCreatedByResponse setBody(CloseCreatedByResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseCreatedByResponseBody getBody() {
        return this.body;
    }

}
