// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class DeleteModelInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelInstanceResponseBody body;

    public static DeleteModelInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelInstanceResponse self = new DeleteModelInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelInstanceResponse setBody(DeleteModelInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelInstanceResponseBody getBody() {
        return this.body;
    }

}
