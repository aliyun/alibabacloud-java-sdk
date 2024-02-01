// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpnGatewayDiagnoseResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpnGatewayDiagnoseResultResponseBody body;

    public static GetVpnGatewayDiagnoseResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpnGatewayDiagnoseResultResponse self = new GetVpnGatewayDiagnoseResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVpnGatewayDiagnoseResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpnGatewayDiagnoseResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpnGatewayDiagnoseResultResponse setBody(GetVpnGatewayDiagnoseResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpnGatewayDiagnoseResultResponseBody getBody() {
        return this.body;
    }

}
