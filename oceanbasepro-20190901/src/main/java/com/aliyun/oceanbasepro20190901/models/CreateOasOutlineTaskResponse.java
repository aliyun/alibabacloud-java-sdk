// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOasOutlineTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOasOutlineTaskResponseBody body;

    public static CreateOasOutlineTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOasOutlineTaskResponse self = new CreateOasOutlineTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOasOutlineTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOasOutlineTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOasOutlineTaskResponse setBody(CreateOasOutlineTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOasOutlineTaskResponseBody getBody() {
        return this.body;
    }

}
