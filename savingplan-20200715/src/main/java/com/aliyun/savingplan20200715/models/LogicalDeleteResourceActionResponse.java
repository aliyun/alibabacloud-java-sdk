// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class LogicalDeleteResourceActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LogicalDeleteResourceActionResponseBody body;

    public static LogicalDeleteResourceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        LogicalDeleteResourceActionResponse self = new LogicalDeleteResourceActionResponse();
        return TeaModel.build(map, self);
    }

    public LogicalDeleteResourceActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogicalDeleteResourceActionResponse setBody(LogicalDeleteResourceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public LogicalDeleteResourceActionResponseBody getBody() {
        return this.body;
    }

}
