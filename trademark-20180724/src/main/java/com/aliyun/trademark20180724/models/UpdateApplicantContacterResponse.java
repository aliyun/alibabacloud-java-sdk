// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateApplicantContacterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicantContacterResponseBody body;

    public static UpdateApplicantContacterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicantContacterResponse self = new UpdateApplicantContacterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicantContacterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicantContacterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicantContacterResponse setBody(UpdateApplicantContacterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicantContacterResponseBody getBody() {
        return this.body;
    }

}
