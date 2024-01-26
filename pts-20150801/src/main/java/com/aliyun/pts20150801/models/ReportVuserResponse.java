// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class ReportVuserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportVuserResponseBody body;

    public static ReportVuserResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportVuserResponse self = new ReportVuserResponse();
        return TeaModel.build(map, self);
    }

    public ReportVuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportVuserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportVuserResponse setBody(ReportVuserResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportVuserResponseBody getBody() {
        return this.body;
    }

}
