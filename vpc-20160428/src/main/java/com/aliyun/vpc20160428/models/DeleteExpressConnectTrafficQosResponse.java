// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectTrafficQosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExpressConnectTrafficQosResponseBody body;

    public static DeleteExpressConnectTrafficQosResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectTrafficQosResponse self = new DeleteExpressConnectTrafficQosResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectTrafficQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpressConnectTrafficQosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExpressConnectTrafficQosResponse setBody(DeleteExpressConnectTrafficQosResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpressConnectTrafficQosResponseBody getBody() {
        return this.body;
    }

}
