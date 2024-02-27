// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectTrafficQosQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExpressConnectTrafficQosQueueResponseBody body;

    public static DeleteExpressConnectTrafficQosQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectTrafficQosQueueResponse self = new DeleteExpressConnectTrafficQosQueueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectTrafficQosQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpressConnectTrafficQosQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExpressConnectTrafficQosQueueResponse setBody(DeleteExpressConnectTrafficQosQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpressConnectTrafficQosQueueResponseBody getBody() {
        return this.body;
    }

}
