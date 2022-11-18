// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteQosPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteQosPolicyResponseBody body;

    public static DeleteQosPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosPolicyResponse self = new DeleteQosPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQosPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQosPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQosPolicyResponse setBody(DeleteQosPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQosPolicyResponseBody getBody() {
        return this.body;
    }

}
