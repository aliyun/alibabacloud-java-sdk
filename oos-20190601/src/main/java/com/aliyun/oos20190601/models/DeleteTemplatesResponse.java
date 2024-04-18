// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTemplatesResponseBody body;

    public static DeleteTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplatesResponse self = new DeleteTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTemplatesResponse setBody(DeleteTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTemplatesResponseBody getBody() {
        return this.body;
    }

}
