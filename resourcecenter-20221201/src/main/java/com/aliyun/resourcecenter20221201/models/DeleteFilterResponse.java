// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFilterResponseBody body;

    public static DeleteFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilterResponse self = new DeleteFilterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFilterResponse setBody(DeleteFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFilterResponseBody getBody() {
        return this.body;
    }

}
