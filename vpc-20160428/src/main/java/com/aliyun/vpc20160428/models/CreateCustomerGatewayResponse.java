// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCustomerGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomerGatewayResponseBody body;

    public static CreateCustomerGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerGatewayResponse self = new CreateCustomerGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomerGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomerGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomerGatewayResponse setBody(CreateCustomerGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomerGatewayResponseBody getBody() {
        return this.body;
    }

}
