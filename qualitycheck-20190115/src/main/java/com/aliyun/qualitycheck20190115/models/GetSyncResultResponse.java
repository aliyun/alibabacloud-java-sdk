// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSyncResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSyncResultResponseBody body;

    public static GetSyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSyncResultResponse self = new GetSyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetSyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSyncResultResponse setBody(GetSyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSyncResultResponseBody getBody() {
        return this.body;
    }

}
