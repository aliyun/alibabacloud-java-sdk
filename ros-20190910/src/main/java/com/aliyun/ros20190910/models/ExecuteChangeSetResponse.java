// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ExecuteChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ExecuteChangeSetResponse setBody(ExecuteChangeSetResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteChangeSetResponseBody getBody() {
        return this.body;
    }

}
