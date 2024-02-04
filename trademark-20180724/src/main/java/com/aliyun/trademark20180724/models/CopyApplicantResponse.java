// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CopyApplicantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyApplicantResponseBody body;

    public static CopyApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyApplicantResponse self = new CopyApplicantResponse();
        return TeaModel.build(map, self);
    }

    public CopyApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyApplicantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyApplicantResponse setBody(CopyApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyApplicantResponseBody getBody() {
        return this.body;
    }

}
