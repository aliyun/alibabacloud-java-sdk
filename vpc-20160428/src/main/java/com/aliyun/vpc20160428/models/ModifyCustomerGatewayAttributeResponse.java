// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCustomerGatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyCustomerGatewayAttributeResponse setBody(ModifyCustomerGatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomerGatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
