// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GradeProtectionReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GradeProtectionReportResponseBody body;

    public static GradeProtectionReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GradeProtectionReportResponse self = new GradeProtectionReportResponse();
        return TeaModel.build(map, self);
    }

    public GradeProtectionReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GradeProtectionReportResponse setBody(GradeProtectionReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GradeProtectionReportResponseBody getBody() {
        return this.body;
    }

}
