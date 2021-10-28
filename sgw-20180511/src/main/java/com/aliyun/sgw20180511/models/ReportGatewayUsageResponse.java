// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReportGatewayUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportGatewayUsageResponseBody body;

    public static ReportGatewayUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportGatewayUsageResponse self = new ReportGatewayUsageResponse();
        return TeaModel.build(map, self);
    }

    public ReportGatewayUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportGatewayUsageResponse setBody(ReportGatewayUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportGatewayUsageResponseBody getBody() {
        return this.body;
    }

}
