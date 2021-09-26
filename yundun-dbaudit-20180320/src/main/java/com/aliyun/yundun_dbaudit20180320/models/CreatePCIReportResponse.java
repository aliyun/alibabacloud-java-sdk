// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreatePCIReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePCIReportResponseBody body;

    public static CreatePCIReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePCIReportResponse self = new CreatePCIReportResponse();
        return TeaModel.build(map, self);
    }

    public CreatePCIReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePCIReportResponse setBody(CreatePCIReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePCIReportResponseBody getBody() {
        return this.body;
    }

}
