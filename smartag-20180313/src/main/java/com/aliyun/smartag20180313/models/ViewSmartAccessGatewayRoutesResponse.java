// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayRoutesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ViewSmartAccessGatewayRoutesResponseBody body;

    public static ViewSmartAccessGatewayRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayRoutesResponse self = new ViewSmartAccessGatewayRoutesResponse();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewSmartAccessGatewayRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewSmartAccessGatewayRoutesResponse setBody(ViewSmartAccessGatewayRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewSmartAccessGatewayRoutesResponseBody getBody() {
        return this.body;
    }

}
