// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateIntegratedReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIntegratedReportResponseBody body;

    public static CreateIntegratedReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegratedReportResponse self = new CreateIntegratedReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntegratedReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntegratedReportResponse setBody(CreateIntegratedReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntegratedReportResponseBody getBody() {
        return this.body;
    }

}
