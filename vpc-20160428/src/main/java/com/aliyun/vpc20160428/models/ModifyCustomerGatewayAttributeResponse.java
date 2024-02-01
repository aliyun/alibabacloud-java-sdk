// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCustomerGatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustomerGatewayAttributeResponseBody body;

    public static ModifyCustomerGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomerGatewayAttributeResponse self = new ModifyCustomerGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomerGatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomerGatewayAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomerGatewayAttributeResponse setBody(ModifyCustomerGatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomerGatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
