// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteAlgorithmVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlgorithmVersionResponseBody body;

    public static DeleteAlgorithmVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlgorithmVersionResponse self = new DeleteAlgorithmVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlgorithmVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlgorithmVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlgorithmVersionResponse setBody(DeleteAlgorithmVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlgorithmVersionResponseBody getBody() {
        return this.body;
    }

}
