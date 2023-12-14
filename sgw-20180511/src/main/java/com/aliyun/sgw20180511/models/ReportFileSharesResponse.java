// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReportFileSharesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReportFileSharesResponseBody body;

    public static ReportFileSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportFileSharesResponse self = new ReportFileSharesResponse();
        return TeaModel.build(map, self);
    }

    public ReportFileSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportFileSharesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportFileSharesResponse setBody(ReportFileSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportFileSharesResponseBody getBody() {
        return this.body;
    }

}
