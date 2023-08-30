// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCommandResponseBody body;

    public static DeleteCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommandResponse self = new DeleteCommandResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCommandResponse setBody(DeleteCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCommandResponseBody getBody() {
        return this.body;
    }

}
