// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ExecuteChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteChangeSetResponseBody body;

    public static ExecuteChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteChangeSetResponse self = new ExecuteChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteChangeSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteChangeSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteChangeSetResponse setBody(ExecuteChangeSetResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteChangeSetResponseBody getBody() {
        return this.body;
    }

}
