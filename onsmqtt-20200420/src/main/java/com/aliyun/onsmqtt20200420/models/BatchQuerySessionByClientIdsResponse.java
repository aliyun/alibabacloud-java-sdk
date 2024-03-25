// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class BatchQuerySessionByClientIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchQuerySessionByClientIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQuerySessionByClientIdsResponse setBody(BatchQuerySessionByClientIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQuerySessionByClientIdsResponseBody getBody() {
        return this.body;
    }

}
