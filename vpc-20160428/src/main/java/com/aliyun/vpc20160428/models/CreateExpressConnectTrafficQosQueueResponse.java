// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExpressConnectTrafficQosQueueResponseBody body;

    public static CreateExpressConnectTrafficQosQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectTrafficQosQueueResponse self = new CreateExpressConnectTrafficQosQueueResponse();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectTrafficQosQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExpressConnectTrafficQosQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExpressConnectTrafficQosQueueResponse setBody(CreateExpressConnectTrafficQosQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExpressConnectTrafficQosQueueResponseBody getBody() {
        return this.body;
    }

}
