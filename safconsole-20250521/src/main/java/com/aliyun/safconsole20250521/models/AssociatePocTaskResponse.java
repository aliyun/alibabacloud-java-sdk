// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class AssociatePocTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociatePocTaskResponseBody body;

    public static AssociatePocTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociatePocTaskResponse self = new AssociatePocTaskResponse();
        return TeaModel.build(map, self);
    }

    public AssociatePocTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociatePocTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociatePocTaskResponse setBody(AssociatePocTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociatePocTaskResponseBody getBody() {
        return this.body;
    }

}
