// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDSTTraceHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDSTTraceHistoryResponseBody body;

    public static DeleteDSTTraceHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSTTraceHistoryResponse self = new DeleteDSTTraceHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDSTTraceHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDSTTraceHistoryResponse setBody(DeleteDSTTraceHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDSTTraceHistoryResponseBody getBody() {
        return this.body;
    }

}
