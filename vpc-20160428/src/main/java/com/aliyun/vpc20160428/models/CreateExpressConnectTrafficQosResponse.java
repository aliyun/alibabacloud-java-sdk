// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExpressConnectTrafficQosResponseBody body;

    public static CreateExpressConnectTrafficQosResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectTrafficQosResponse self = new CreateExpressConnectTrafficQosResponse();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectTrafficQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExpressConnectTrafficQosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExpressConnectTrafficQosResponse setBody(CreateExpressConnectTrafficQosResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExpressConnectTrafficQosResponseBody getBody() {
        return this.body;
    }

}
