// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayAdminPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartAccessGatewayAdminPasswordResponseBody body;

    public static UpdateSmartAccessGatewayAdminPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayAdminPasswordResponse self = new UpdateSmartAccessGatewayAdminPasswordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayAdminPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAccessGatewayAdminPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAccessGatewayAdminPasswordResponse setBody(UpdateSmartAccessGatewayAdminPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAccessGatewayAdminPasswordResponseBody getBody() {
        return this.body;
    }

}
