// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class IntegratedReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IntegratedReportResponseBody body;

    public static IntegratedReportResponse build(java.util.Map<String, ?> map) throws Exception {
        IntegratedReportResponse self = new IntegratedReportResponse();
        return TeaModel.build(map, self);
    }

    public IntegratedReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntegratedReportResponse setBody(IntegratedReportResponseBody body) {
        this.body = body;
        return this;
    }
    public IntegratedReportResponseBody getBody() {
        return this.body;
    }

}
