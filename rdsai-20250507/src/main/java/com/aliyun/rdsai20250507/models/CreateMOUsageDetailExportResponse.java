// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateMOUsageDetailExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMOUsageDetailExportResponseBody body;

    public static CreateMOUsageDetailExportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMOUsageDetailExportResponse self = new CreateMOUsageDetailExportResponse();
        return TeaModel.build(map, self);
    }

    public CreateMOUsageDetailExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMOUsageDetailExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMOUsageDetailExportResponse setBody(CreateMOUsageDetailExportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMOUsageDetailExportResponseBody getBody() {
        return this.body;
    }

}
