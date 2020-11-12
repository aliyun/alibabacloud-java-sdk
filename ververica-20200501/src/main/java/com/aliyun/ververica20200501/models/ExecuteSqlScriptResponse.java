// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ExecuteSqlScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteSqlScriptResponseBody body;

    public static ExecuteSqlScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlScriptResponse self = new ExecuteSqlScriptResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSqlScriptResponse setBody(ExecuteSqlScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSqlScriptResponseBody getBody() {
        return this.body;
    }

}
