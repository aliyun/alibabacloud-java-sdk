// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateGradeProtectionReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGradeProtectionReportResponseBody body;

    public static CreateGradeProtectionReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGradeProtectionReportResponse self = new CreateGradeProtectionReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateGradeProtectionReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGradeProtectionReportResponse setBody(CreateGradeProtectionReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGradeProtectionReportResponseBody getBody() {
        return this.body;
    }

}
