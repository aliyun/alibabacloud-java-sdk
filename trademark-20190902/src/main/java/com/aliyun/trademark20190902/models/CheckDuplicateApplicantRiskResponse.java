// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckDuplicateApplicantRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDuplicateApplicantRiskResponseBody body;

    public static CheckDuplicateApplicantRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDuplicateApplicantRiskResponse self = new CheckDuplicateApplicantRiskResponse();
        return TeaModel.build(map, self);
    }

    public CheckDuplicateApplicantRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDuplicateApplicantRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDuplicateApplicantRiskResponse setBody(CheckDuplicateApplicantRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDuplicateApplicantRiskResponseBody getBody() {
        return this.body;
    }

}
