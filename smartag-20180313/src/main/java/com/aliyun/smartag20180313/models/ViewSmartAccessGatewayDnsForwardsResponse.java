// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayDnsForwardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ViewSmartAccessGatewayDnsForwardsResponseBody body;

    public static ViewSmartAccessGatewayDnsForwardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayDnsForwardsResponse self = new ViewSmartAccessGatewayDnsForwardsResponse();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayDnsForwardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewSmartAccessGatewayDnsForwardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewSmartAccessGatewayDnsForwardsResponse setBody(ViewSmartAccessGatewayDnsForwardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewSmartAccessGatewayDnsForwardsResponseBody getBody() {
        return this.body;
    }

}
