// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DiagnoseVpnConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DiagnoseVpnConnectionsResponseBody body;

    public static DiagnoseVpnConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseVpnConnectionsResponse self = new DiagnoseVpnConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DiagnoseVpnConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiagnoseVpnConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DiagnoseVpnConnectionsResponse setBody(DiagnoseVpnConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DiagnoseVpnConnectionsResponseBody getBody() {
        return this.body;
    }

}
