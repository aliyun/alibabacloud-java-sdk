// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotPersonTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAiotPersonTableResponseBody body;

    public static UpdateAiotPersonTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotPersonTableResponse self = new UpdateAiotPersonTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiotPersonTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiotPersonTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAiotPersonTableResponse setBody(UpdateAiotPersonTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiotPersonTableResponseBody getBody() {
        return this.body;
    }

}
