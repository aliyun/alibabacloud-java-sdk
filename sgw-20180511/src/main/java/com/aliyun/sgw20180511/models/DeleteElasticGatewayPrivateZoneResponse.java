// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteElasticGatewayPrivateZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteElasticGatewayPrivateZoneResponseBody body;

    public static DeleteElasticGatewayPrivateZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticGatewayPrivateZoneResponse self = new DeleteElasticGatewayPrivateZoneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteElasticGatewayPrivateZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteElasticGatewayPrivateZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteElasticGatewayPrivateZoneResponse setBody(DeleteElasticGatewayPrivateZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteElasticGatewayPrivateZoneResponseBody getBody() {
        return this.body;
    }

}
