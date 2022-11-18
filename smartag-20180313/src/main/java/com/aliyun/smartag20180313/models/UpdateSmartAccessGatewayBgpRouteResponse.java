// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayBgpRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartAccessGatewayBgpRouteResponseBody body;

    public static UpdateSmartAccessGatewayBgpRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayBgpRouteResponse self = new UpdateSmartAccessGatewayBgpRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayBgpRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAccessGatewayBgpRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAccessGatewayBgpRouteResponse setBody(UpdateSmartAccessGatewayBgpRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAccessGatewayBgpRouteResponseBody getBody() {
        return this.body;
    }

}
