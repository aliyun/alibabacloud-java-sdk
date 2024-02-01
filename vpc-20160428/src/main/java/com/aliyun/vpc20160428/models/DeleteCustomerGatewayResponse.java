// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCustomerGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomerGatewayResponseBody body;

    public static DeleteCustomerGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomerGatewayResponse self = new DeleteCustomerGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomerGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomerGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomerGatewayResponse setBody(DeleteCustomerGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomerGatewayResponseBody getBody() {
        return this.body;
    }

}
