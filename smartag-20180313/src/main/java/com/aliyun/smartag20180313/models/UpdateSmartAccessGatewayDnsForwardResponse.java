// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayDnsForwardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartAccessGatewayDnsForwardResponseBody body;

    public static UpdateSmartAccessGatewayDnsForwardResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayDnsForwardResponse self = new UpdateSmartAccessGatewayDnsForwardResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayDnsForwardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAccessGatewayDnsForwardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAccessGatewayDnsForwardResponse setBody(UpdateSmartAccessGatewayDnsForwardResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAccessGatewayDnsForwardResponseBody getBody() {
        return this.body;
    }

}
