// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteSavepointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSavepointResponseBody body;

    public static DeleteSavepointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSavepointResponse self = new DeleteSavepointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSavepointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSavepointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSavepointResponse setBody(DeleteSavepointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSavepointResponseBody getBody() {
        return this.body;
    }

}
