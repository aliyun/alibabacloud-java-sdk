// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeletePxfsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePxfsResponseBody body;

    public static DeletePxfsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePxfsResponse self = new DeletePxfsResponse();
        return TeaModel.build(map, self);
    }

    public DeletePxfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePxfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePxfsResponse setBody(DeletePxfsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePxfsResponseBody getBody() {
        return this.body;
    }

}
