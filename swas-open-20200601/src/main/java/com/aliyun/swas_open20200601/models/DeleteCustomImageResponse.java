// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteCustomImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomImageResponseBody body;

    public static DeleteCustomImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomImageResponse self = new DeleteCustomImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomImageResponse setBody(DeleteCustomImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomImageResponseBody getBody() {
        return this.body;
    }

}
