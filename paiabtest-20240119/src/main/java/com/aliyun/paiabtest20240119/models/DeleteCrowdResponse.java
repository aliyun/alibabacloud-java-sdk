// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteCrowdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCrowdResponseBody body;

    public static DeleteCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCrowdResponse self = new DeleteCrowdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCrowdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCrowdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCrowdResponse setBody(DeleteCrowdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCrowdResponseBody getBody() {
        return this.body;
    }

}
