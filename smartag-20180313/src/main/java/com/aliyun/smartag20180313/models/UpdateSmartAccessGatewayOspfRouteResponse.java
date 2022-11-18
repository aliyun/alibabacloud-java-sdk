// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayOspfRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartAccessGatewayOspfRouteResponseBody body;

    public static UpdateSmartAccessGatewayOspfRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayOspfRouteResponse self = new UpdateSmartAccessGatewayOspfRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayOspfRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAccessGatewayOspfRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAccessGatewayOspfRouteResponse setBody(UpdateSmartAccessGatewayOspfRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAccessGatewayOspfRouteResponseBody getBody() {
        return this.body;
    }

}
