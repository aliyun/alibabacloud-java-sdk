// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHoneypotNodeResponseBody body;

    public static DeleteHoneypotNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotNodeResponse self = new DeleteHoneypotNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHoneypotNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHoneypotNodeResponse setBody(DeleteHoneypotNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHoneypotNodeResponseBody getBody() {
        return this.body;
    }

}
