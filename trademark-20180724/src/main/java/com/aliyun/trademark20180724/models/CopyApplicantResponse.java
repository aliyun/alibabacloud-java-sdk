// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CopyApplicantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CopyApplicantResponse setBody(CopyApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyApplicantResponseBody getBody() {
        return this.body;
    }

}
