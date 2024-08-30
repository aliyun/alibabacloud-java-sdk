// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlgorithmResponseBody body;

    public static DeleteAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlgorithmResponse self = new DeleteAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlgorithmResponse setBody(DeleteAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlgorithmResponseBody getBody() {
        return this.body;
    }

}
