// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportAppOtaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportAppOtaInfoResponseBody body;

    public static ReportAppOtaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportAppOtaInfoResponse self = new ReportAppOtaInfoResponse();
        return TeaModel.build(map, self);
    }

    public ReportAppOtaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportAppOtaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportAppOtaInfoResponse setBody(ReportAppOtaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportAppOtaInfoResponseBody getBody() {
        return this.body;
    }

}
