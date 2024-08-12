// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportUserFbIssueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportUserFbIssueResponseBody body;

    public static ReportUserFbIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportUserFbIssueResponse self = new ReportUserFbIssueResponse();
        return TeaModel.build(map, self);
    }

    public ReportUserFbIssueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportUserFbIssueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportUserFbIssueResponse setBody(ReportUserFbIssueResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportUserFbIssueResponseBody getBody() {
        return this.body;
    }

}
