// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddShareReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddShareReportResponseBody body;

    public static AddShareReportResponse build(java.util.Map<String, ?> map) throws Exception {
        AddShareReportResponse self = new AddShareReportResponse();
        return TeaModel.build(map, self);
    }

    public AddShareReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddShareReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddShareReportResponse setBody(AddShareReportResponseBody body) {
        this.body = body;
        return this;
    }
    public AddShareReportResponseBody getBody() {
        return this.body;
    }

}
