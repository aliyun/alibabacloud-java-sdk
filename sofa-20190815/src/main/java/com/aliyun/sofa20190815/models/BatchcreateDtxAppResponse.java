// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateDtxAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchcreateDtxAppResponseBody body;

    public static BatchcreateDtxAppResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDtxAppResponse self = new BatchcreateDtxAppResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateDtxAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchcreateDtxAppResponse setBody(BatchcreateDtxAppResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchcreateDtxAppResponseBody getBody() {
        return this.body;
    }

}
