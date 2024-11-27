// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateExportConfigJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExportConfigJobResponseBody body;

    public static CreateExportConfigJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExportConfigJobResponse self = new CreateExportConfigJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateExportConfigJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExportConfigJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExportConfigJobResponse setBody(CreateExportConfigJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExportConfigJobResponseBody getBody() {
        return this.body;
    }

}
