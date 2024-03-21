// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class RemoveApplicantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveApplicantResponseBody body;

    public static RemoveApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicantResponse self = new RemoveApplicantResponse();
        return TeaModel.build(map, self);
    }

    public RemoveApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveApplicantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveApplicantResponse setBody(RemoveApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveApplicantResponseBody getBody() {
        return this.body;
    }

}
