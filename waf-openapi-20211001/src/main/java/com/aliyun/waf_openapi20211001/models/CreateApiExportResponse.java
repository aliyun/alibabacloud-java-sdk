// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateApiExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApiExportResponseBody body;

    public static CreateApiExportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiExportResponse self = new CreateApiExportResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApiExportResponse setBody(CreateApiExportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiExportResponseBody getBody() {
        return this.body;
    }

}
