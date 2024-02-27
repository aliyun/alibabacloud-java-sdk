// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelReportShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelReportShareResponseBody body;

    public static CancelReportShareResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelReportShareResponse self = new CancelReportShareResponse();
        return TeaModel.build(map, self);
    }

    public CancelReportShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelReportShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelReportShareResponse setBody(CancelReportShareResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelReportShareResponseBody getBody() {
        return this.body;
    }

}
