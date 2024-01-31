// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportRecordResponseBody body;

    public static ExportRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordResponse self = new ExportRecordResponse();
        return TeaModel.build(map, self);
    }

    public ExportRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportRecordResponse setBody(ExportRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportRecordResponseBody getBody() {
        return this.body;
    }

}
