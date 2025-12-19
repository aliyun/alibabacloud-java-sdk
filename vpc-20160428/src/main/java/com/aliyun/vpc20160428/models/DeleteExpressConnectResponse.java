// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExpressConnectResponseBody body;

    public static DeleteExpressConnectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectResponse self = new DeleteExpressConnectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpressConnectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExpressConnectResponse setBody(DeleteExpressConnectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpressConnectResponseBody getBody() {
        return this.body;
    }

}
