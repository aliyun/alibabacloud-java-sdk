// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetEssayCorrectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEssayCorrectionTaskResponseBody body;

    public static GetEssayCorrectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEssayCorrectionTaskResponse self = new GetEssayCorrectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetEssayCorrectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEssayCorrectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEssayCorrectionTaskResponse setBody(GetEssayCorrectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEssayCorrectionTaskResponseBody getBody() {
        return this.body;
    }

}
