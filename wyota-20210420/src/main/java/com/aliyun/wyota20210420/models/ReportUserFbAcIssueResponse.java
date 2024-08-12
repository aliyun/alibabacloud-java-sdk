// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportUserFbAcIssueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportUserFbAcIssueResponseBody body;

    public static ReportUserFbAcIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportUserFbAcIssueResponse self = new ReportUserFbAcIssueResponse();
        return TeaModel.build(map, self);
    }

    public ReportUserFbAcIssueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportUserFbAcIssueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportUserFbAcIssueResponse setBody(ReportUserFbAcIssueResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportUserFbAcIssueResponseBody getBody() {
        return this.body;
    }

}
