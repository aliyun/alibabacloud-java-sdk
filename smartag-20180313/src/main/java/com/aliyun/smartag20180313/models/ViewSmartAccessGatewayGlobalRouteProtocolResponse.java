// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayGlobalRouteProtocolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ViewSmartAccessGatewayGlobalRouteProtocolResponseBody body;

    public static ViewSmartAccessGatewayGlobalRouteProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayGlobalRouteProtocolResponse self = new ViewSmartAccessGatewayGlobalRouteProtocolResponse();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolResponse setBody(ViewSmartAccessGatewayGlobalRouteProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewSmartAccessGatewayGlobalRouteProtocolResponseBody getBody() {
        return this.body;
    }

}
