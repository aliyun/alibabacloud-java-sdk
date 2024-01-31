// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CancelImportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelImportResponseBody body;

    public static CancelImportResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelImportResponse self = new CancelImportResponse();
        return TeaModel.build(map, self);
    }

    public CancelImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelImportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelImportResponse setBody(CancelImportResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelImportResponseBody getBody() {
        return this.body;
    }

}
