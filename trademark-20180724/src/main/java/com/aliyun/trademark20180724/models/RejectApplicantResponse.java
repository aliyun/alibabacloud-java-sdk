// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RejectApplicantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RejectApplicantResponseBody body;

    public static RejectApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectApplicantResponse self = new RejectApplicantResponse();
        return TeaModel.build(map, self);
    }

    public RejectApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectApplicantResponse setBody(RejectApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectApplicantResponseBody getBody() {
        return this.body;
    }

}
