// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class VerifyPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyPlaybookResponseBody body;

    public static VerifyPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyPlaybookResponse self = new VerifyPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public VerifyPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyPlaybookResponse setBody(VerifyPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyPlaybookResponseBody getBody() {
        return this.body;
    }

}
