// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DebugPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DebugPlaybookResponseBody body;

    public static DebugPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        DebugPlaybookResponse self = new DebugPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public DebugPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DebugPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DebugPlaybookResponse setBody(DebugPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public DebugPlaybookResponseBody getBody() {
        return this.body;
    }

}
