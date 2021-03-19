// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class LogicalDeleteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LogicalDeleteResourceResponseBody body;

    public static LogicalDeleteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        LogicalDeleteResourceResponse self = new LogicalDeleteResourceResponse();
        return TeaModel.build(map, self);
    }

    public LogicalDeleteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogicalDeleteResourceResponse setBody(LogicalDeleteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public LogicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

}
