// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetModelInputContentDetectResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelInputContentDetectResultResponseBody body;

    public static GetModelInputContentDetectResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelInputContentDetectResultResponse self = new GetModelInputContentDetectResultResponse();
        return TeaModel.build(map, self);
    }

    public GetModelInputContentDetectResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelInputContentDetectResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelInputContentDetectResultResponse setBody(GetModelInputContentDetectResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelInputContentDetectResultResponseBody getBody() {
        return this.body;
    }

}
