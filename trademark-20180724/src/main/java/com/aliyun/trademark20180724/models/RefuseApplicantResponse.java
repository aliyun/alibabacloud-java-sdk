// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RefuseApplicantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefuseApplicantResponseBody body;

    public static RefuseApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseApplicantResponse self = new RefuseApplicantResponse();
        return TeaModel.build(map, self);
    }

    public RefuseApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefuseApplicantResponse setBody(RefuseApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public RefuseApplicantResponseBody getBody() {
        return this.body;
    }

}
