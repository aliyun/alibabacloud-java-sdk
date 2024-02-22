// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteSubCrowdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSubCrowdResponseBody body;

    public static DeleteSubCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubCrowdResponse self = new DeleteSubCrowdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubCrowdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubCrowdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubCrowdResponse setBody(DeleteSubCrowdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubCrowdResponseBody getBody() {
        return this.body;
    }

}
