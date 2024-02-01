// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DiagnoseVpnGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DiagnoseVpnGatewayResponseBody body;

    public static DiagnoseVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseVpnGatewayResponse self = new DiagnoseVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DiagnoseVpnGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiagnoseVpnGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DiagnoseVpnGatewayResponse setBody(DiagnoseVpnGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DiagnoseVpnGatewayResponseBody getBody() {
        return this.body;
    }

}
