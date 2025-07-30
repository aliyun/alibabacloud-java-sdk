// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetMiningTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMiningTaskResultResponseBody body;

    public static GetMiningTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMiningTaskResultResponse self = new GetMiningTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetMiningTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMiningTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMiningTaskResultResponse setBody(GetMiningTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMiningTaskResultResponseBody getBody() {
        return this.body;
    }

}
