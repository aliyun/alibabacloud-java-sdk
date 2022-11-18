// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayDnsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ViewSmartAccessGatewayDnsResponseBody body;

    public static ViewSmartAccessGatewayDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayDnsResponse self = new ViewSmartAccessGatewayDnsResponse();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayDnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewSmartAccessGatewayDnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewSmartAccessGatewayDnsResponse setBody(ViewSmartAccessGatewayDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewSmartAccessGatewayDnsResponseBody getBody() {
        return this.body;
    }

}
