// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConfirmApplicantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmApplicantResponseBody body;

    public static ConfirmApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmApplicantResponse self = new ConfirmApplicantResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmApplicantResponse setBody(ConfirmApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmApplicantResponseBody getBody() {
        return this.body;
    }

}
