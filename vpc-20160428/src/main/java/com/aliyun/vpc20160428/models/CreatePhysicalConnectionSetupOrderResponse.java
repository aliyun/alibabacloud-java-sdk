// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionSetupOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePhysicalConnectionSetupOrderResponseBody body;

    public static CreatePhysicalConnectionSetupOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionSetupOrderResponse self = new CreatePhysicalConnectionSetupOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionSetupOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhysicalConnectionSetupOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePhysicalConnectionSetupOrderResponse setBody(CreatePhysicalConnectionSetupOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhysicalConnectionSetupOrderResponseBody getBody() {
        return this.body;
    }

}
