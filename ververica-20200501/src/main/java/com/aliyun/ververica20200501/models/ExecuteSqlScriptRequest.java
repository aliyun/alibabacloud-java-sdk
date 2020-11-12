// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ExecuteSqlScriptRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteSqlScriptBody body;

    public static ExecuteSqlScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlScriptRequest self = new ExecuteSqlScriptRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlScriptRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSqlScriptRequest setBody(ExecuteSqlScriptBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSqlScriptBody getBody() {
        return this.body;
    }

}
