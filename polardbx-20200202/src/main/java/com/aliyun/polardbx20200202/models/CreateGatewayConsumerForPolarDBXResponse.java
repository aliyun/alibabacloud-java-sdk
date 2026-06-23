// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateGatewayConsumerForPolarDBXResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayConsumerForPolarDBXResponseBody body;

    public static CreateGatewayConsumerForPolarDBXResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayConsumerForPolarDBXResponse self = new CreateGatewayConsumerForPolarDBXResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayConsumerForPolarDBXResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayConsumerForPolarDBXResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayConsumerForPolarDBXResponse setBody(CreateGatewayConsumerForPolarDBXResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayConsumerForPolarDBXResponseBody getBody() {
        return this.body;
    }

}
