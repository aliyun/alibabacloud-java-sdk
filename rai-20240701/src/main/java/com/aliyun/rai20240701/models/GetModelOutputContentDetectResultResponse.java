// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetModelOutputContentDetectResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelOutputContentDetectResultResponseBody body;

    public static GetModelOutputContentDetectResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelOutputContentDetectResultResponse self = new GetModelOutputContentDetectResultResponse();
        return TeaModel.build(map, self);
    }

    public GetModelOutputContentDetectResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelOutputContentDetectResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelOutputContentDetectResultResponse setBody(GetModelOutputContentDetectResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelOutputContentDetectResultResponseBody getBody() {
        return this.body;
    }

}
