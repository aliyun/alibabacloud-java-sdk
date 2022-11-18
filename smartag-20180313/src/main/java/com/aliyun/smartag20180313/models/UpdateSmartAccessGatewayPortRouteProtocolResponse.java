// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayPortRouteProtocolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartAccessGatewayPortRouteProtocolResponseBody body;

    public static UpdateSmartAccessGatewayPortRouteProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayPortRouteProtocolResponse self = new UpdateSmartAccessGatewayPortRouteProtocolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayPortRouteProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolResponse setBody(UpdateSmartAccessGatewayPortRouteProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAccessGatewayPortRouteProtocolResponseBody getBody() {
        return this.body;
    }

}
