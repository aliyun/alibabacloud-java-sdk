// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDSTTraceCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDSTTraceCollectionResponseBody body;

    public static DeleteDSTTraceCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSTTraceCollectionResponse self = new DeleteDSTTraceCollectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDSTTraceCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDSTTraceCollectionResponse setBody(DeleteDSTTraceCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDSTTraceCollectionResponseBody getBody() {
        return this.body;
    }

}
