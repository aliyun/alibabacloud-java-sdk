// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateSmartAccessGatewayVersionResponse setBody(UpdateSmartAccessGatewayVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAccessGatewayVersionResponseBody getBody() {
        return this.body;
    }

}
