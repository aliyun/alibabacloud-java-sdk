// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayPortRouteProtocolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ViewSmartAccessGatewayPortRouteProtocolResponseBody body;

    public static ViewSmartAccessGatewayPortRouteProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayPortRouteProtocolResponse self = new ViewSmartAccessGatewayPortRouteProtocolResponse();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayPortRouteProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewSmartAccessGatewayPortRouteProtocolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewSmartAccessGatewayPortRouteProtocolResponse setBody(ViewSmartAccessGatewayPortRouteProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewSmartAccessGatewayPortRouteProtocolResponseBody getBody() {
        return this.body;
    }

}
