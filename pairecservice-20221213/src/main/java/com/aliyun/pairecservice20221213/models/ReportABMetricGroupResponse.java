// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ReportABMetricGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportABMetricGroupResponseBody body;

    public static ReportABMetricGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportABMetricGroupResponse self = new ReportABMetricGroupResponse();
        return TeaModel.build(map, self);
    }

    public ReportABMetricGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportABMetricGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportABMetricGroupResponse setBody(ReportABMetricGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportABMetricGroupResponseBody getBody() {
        return this.body;
    }

}
