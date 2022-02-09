// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReportSummaryInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportSummaryInfoResponseBody body;

    public static ReportSummaryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportSummaryInfoResponse self = new ReportSummaryInfoResponse();
        return TeaModel.build(map, self);
    }

    public ReportSummaryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportSummaryInfoResponse setBody(ReportSummaryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportSummaryInfoResponseBody getBody() {
        return this.body;
    }

}
