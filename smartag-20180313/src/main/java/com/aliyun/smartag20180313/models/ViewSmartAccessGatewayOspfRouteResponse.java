// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayOspfRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ViewSmartAccessGatewayOspfRouteResponseBody body;

    public static ViewSmartAccessGatewayOspfRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayOspfRouteResponse self = new ViewSmartAccessGatewayOspfRouteResponse();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayOspfRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewSmartAccessGatewayOspfRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewSmartAccessGatewayOspfRouteResponse setBody(ViewSmartAccessGatewayOspfRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewSmartAccessGatewayOspfRouteResponseBody getBody() {
        return this.body;
    }

}
