// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteSlbAPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSlbAPResponseBody body;

    public static DeleteSlbAPResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSlbAPResponse self = new DeleteSlbAPResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSlbAPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSlbAPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSlbAPResponse setBody(DeleteSlbAPResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSlbAPResponseBody getBody() {
        return this.body;
    }

}
