// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteJobTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteJobTemplateResponseBody body;

    public static DeleteJobTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobTemplateResponse self = new DeleteJobTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteJobTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteJobTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteJobTemplateResponse setBody(DeleteJobTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteJobTemplateResponseBody getBody() {
        return this.body;
    }

}
