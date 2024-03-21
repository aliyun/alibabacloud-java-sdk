// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class BindApplicantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindApplicantResponseBody body;

    public static BindApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        BindApplicantResponse self = new BindApplicantResponse();
        return TeaModel.build(map, self);
    }

    public BindApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindApplicantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindApplicantResponse setBody(BindApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public BindApplicantResponseBody getBody() {
        return this.body;
    }

}
