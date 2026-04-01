// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class AbortPlaybookExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbortPlaybookExecutionResponseBody body;

    public static AbortPlaybookExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortPlaybookExecutionResponse self = new AbortPlaybookExecutionResponse();
        return TeaModel.build(map, self);
    }

    public AbortPlaybookExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortPlaybookExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbortPlaybookExecutionResponse setBody(AbortPlaybookExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortPlaybookExecutionResponseBody getBody() {
        return this.body;
    }

}
