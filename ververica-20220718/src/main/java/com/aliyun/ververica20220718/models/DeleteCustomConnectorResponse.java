// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteCustomConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomConnectorResponseBody body;

    public static DeleteCustomConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomConnectorResponse self = new DeleteCustomConnectorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomConnectorResponse setBody(DeleteCustomConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomConnectorResponseBody getBody() {
        return this.body;
    }

}
