// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSmartAccessGatewayVersionResponseBody body;

    public static UpdateSmartAccessGatewayVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayVersionResponse self = new UpdateSmartAccessGatewayVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAccessGatewayVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAccessGatewayVersionResponse setBody(UpdateSmartAccessGatewayVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAccessGatewayVersionResponseBody getBody() {
        return this.body;
    }

}
