// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportWarningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportWarningResponseBody body;

    public static ExportWarningResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportWarningResponse self = new ExportWarningResponse();
        return TeaModel.build(map, self);
    }

    public ExportWarningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportWarningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportWarningResponse setBody(ExportWarningResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportWarningResponseBody getBody() {
        return this.body;
    }

}
