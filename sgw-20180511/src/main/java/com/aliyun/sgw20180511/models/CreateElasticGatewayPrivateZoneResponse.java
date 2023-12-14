// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateElasticGatewayPrivateZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateElasticGatewayPrivateZoneResponseBody body;

    public static CreateElasticGatewayPrivateZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticGatewayPrivateZoneResponse self = new CreateElasticGatewayPrivateZoneResponse();
        return TeaModel.build(map, self);
    }

    public CreateElasticGatewayPrivateZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateElasticGatewayPrivateZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateElasticGatewayPrivateZoneResponse setBody(CreateElasticGatewayPrivateZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateElasticGatewayPrivateZoneResponseBody getBody() {
        return this.body;
    }

}
