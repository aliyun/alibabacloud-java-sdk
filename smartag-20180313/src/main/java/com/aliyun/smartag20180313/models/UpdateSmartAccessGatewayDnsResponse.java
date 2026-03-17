// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayDnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSmartAccessGatewayDnsResponseBody body;

    public static UpdateSmartAccessGatewayDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayDnsResponse self = new UpdateSmartAccessGatewayDnsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayDnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAccessGatewayDnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAccessGatewayDnsResponse setBody(UpdateSmartAccessGatewayDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAccessGatewayDnsResponseBody getBody() {
        return this.body;
    }

}
