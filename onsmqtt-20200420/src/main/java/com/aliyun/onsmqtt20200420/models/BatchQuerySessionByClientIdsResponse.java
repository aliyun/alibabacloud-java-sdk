// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class BatchQuerySessionByClientIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchQuerySessionByClientIdsResponseBody body;

    public static BatchQuerySessionByClientIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQuerySessionByClientIdsResponse self = new BatchQuerySessionByClientIdsResponse();
        return TeaModel.build(map, self);
    }

    public BatchQuerySessionByClientIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQuerySessionByClientIdsResponse setBody(BatchQuerySessionByClientIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQuerySessionByClientIdsResponseBody getBody() {
        return this.body;
    }

}
