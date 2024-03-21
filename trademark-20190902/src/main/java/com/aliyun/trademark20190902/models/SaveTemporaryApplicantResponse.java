// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SaveTemporaryApplicantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTemporaryApplicantResponseBody body;

    public static SaveTemporaryApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTemporaryApplicantResponse self = new SaveTemporaryApplicantResponse();
        return TeaModel.build(map, self);
    }

    public SaveTemporaryApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTemporaryApplicantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTemporaryApplicantResponse setBody(SaveTemporaryApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTemporaryApplicantResponseBody getBody() {
        return this.body;
    }

}
