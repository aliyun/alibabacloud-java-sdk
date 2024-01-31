// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHoneypotResponseBody body;

    public static DeleteHoneypotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotResponse self = new DeleteHoneypotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHoneypotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHoneypotResponse setBody(DeleteHoneypotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHoneypotResponseBody getBody() {
        return this.body;
    }

}
