// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddSmartAccessGatewayDnsForwardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSmartAccessGatewayDnsForwardResponseBody body;

    public static AddSmartAccessGatewayDnsForwardResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSmartAccessGatewayDnsForwardResponse self = new AddSmartAccessGatewayDnsForwardResponse();
        return TeaModel.build(map, self);
    }

    public AddSmartAccessGatewayDnsForwardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSmartAccessGatewayDnsForwardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSmartAccessGatewayDnsForwardResponse setBody(AddSmartAccessGatewayDnsForwardResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSmartAccessGatewayDnsForwardResponseBody getBody() {
        return this.body;
    }

}
