// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteQosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteQosResponseBody body;

    public static DeleteQosResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosResponse self = new DeleteQosResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQosResponse setBody(DeleteQosResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQosResponseBody getBody() {
        return this.body;
    }

}
