// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RevertPlaybookReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevertPlaybookReleaseResponseBody body;

    public static RevertPlaybookReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        RevertPlaybookReleaseResponse self = new RevertPlaybookReleaseResponse();
        return TeaModel.build(map, self);
    }

    public RevertPlaybookReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevertPlaybookReleaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevertPlaybookReleaseResponse setBody(RevertPlaybookReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public RevertPlaybookReleaseResponseBody getBody() {
        return this.body;
    }

}
