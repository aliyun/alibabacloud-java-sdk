// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CancelBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelBlockResponseBody body;

    public static CancelBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelBlockResponse self = new CancelBlockResponse();
        return TeaModel.build(map, self);
    }

    public CancelBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelBlockResponse setBody(CancelBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelBlockResponseBody getBody() {
        return this.body;
    }

}
