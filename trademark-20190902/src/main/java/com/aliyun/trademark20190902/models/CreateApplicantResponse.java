// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CreateApplicantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicantResponseBody body;

    public static CreateApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicantResponse self = new CreateApplicantResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicantResponse setBody(CreateApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicantResponseBody getBody() {
        return this.body;
    }

}
