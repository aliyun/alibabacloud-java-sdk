// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayBgpRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ViewSmartAccessGatewayBgpRouteResponseBody body;

    public static ViewSmartAccessGatewayBgpRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayBgpRouteResponse self = new ViewSmartAccessGatewayBgpRouteResponse();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayBgpRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewSmartAccessGatewayBgpRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewSmartAccessGatewayBgpRouteResponse setBody(ViewSmartAccessGatewayBgpRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewSmartAccessGatewayBgpRouteResponseBody getBody() {
        return this.body;
    }

}
