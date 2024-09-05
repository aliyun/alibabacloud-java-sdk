// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderByEventReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTaskOrderByEventReportResponseBody body;

    public static CreateTaskOrderByEventReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskOrderByEventReportResponse self = new CreateTaskOrderByEventReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskOrderByEventReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskOrderByEventReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTaskOrderByEventReportResponse setBody(CreateTaskOrderByEventReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskOrderByEventReportResponseBody getBody() {
        return this.body;
    }

}
