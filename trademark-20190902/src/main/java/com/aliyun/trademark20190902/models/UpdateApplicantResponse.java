// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class UpdateApplicantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicantResponseBody body;

    public static UpdateApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicantResponse self = new UpdateApplicantResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicantResponse setBody(UpdateApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicantResponseBody getBody() {
        return this.body;
    }

}
