// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteTagOptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTagOptionResponseBody body;

    public static DeleteTagOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagOptionResponse self = new DeleteTagOptionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTagOptionResponse setBody(DeleteTagOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagOptionResponseBody getBody() {
        return this.body;
    }

}
