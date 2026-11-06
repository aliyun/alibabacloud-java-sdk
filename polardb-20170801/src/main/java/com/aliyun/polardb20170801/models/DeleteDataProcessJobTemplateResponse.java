// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDataProcessJobTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataProcessJobTemplateResponseBody body;

    public static DeleteDataProcessJobTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataProcessJobTemplateResponse self = new DeleteDataProcessJobTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataProcessJobTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataProcessJobTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataProcessJobTemplateResponse setBody(DeleteDataProcessJobTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataProcessJobTemplateResponseBody getBody() {
        return this.body;
    }

}
