// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDSTTraceHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDSTTraceHistoryResponseBody body;

    public static CreateDSTTraceHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDSTTraceHistoryResponse self = new CreateDSTTraceHistoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateDSTTraceHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDSTTraceHistoryResponse setBody(CreateDSTTraceHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDSTTraceHistoryResponseBody getBody() {
        return this.body;
    }

}
