// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReportGatewayInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportGatewayInfoResponseBody body;

    public static ReportGatewayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportGatewayInfoResponse self = new ReportGatewayInfoResponse();
        return TeaModel.build(map, self);
    }

    public ReportGatewayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportGatewayInfoResponse setBody(ReportGatewayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportGatewayInfoResponseBody getBody() {
        return this.body;
    }

}
