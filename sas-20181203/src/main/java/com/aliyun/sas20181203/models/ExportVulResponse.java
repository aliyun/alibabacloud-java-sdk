// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportVulResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportVulResponseBody body;

    public static ExportVulResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportVulResponse self = new ExportVulResponse();
        return TeaModel.build(map, self);
    }

    public ExportVulResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportVulResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportVulResponse setBody(ExportVulResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportVulResponseBody getBody() {
        return this.body;
    }

}
