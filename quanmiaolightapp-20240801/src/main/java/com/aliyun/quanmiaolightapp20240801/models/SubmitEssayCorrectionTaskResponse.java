// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitEssayCorrectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitEssayCorrectionTaskResponseBody body;

    public static SubmitEssayCorrectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitEssayCorrectionTaskResponse self = new SubmitEssayCorrectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitEssayCorrectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitEssayCorrectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitEssayCorrectionTaskResponse setBody(SubmitEssayCorrectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitEssayCorrectionTaskResponseBody getBody() {
        return this.body;
    }

}
