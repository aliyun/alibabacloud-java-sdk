// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitVideoDetectShotTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoDetectShotTaskResponseBody body;

    public static SubmitVideoDetectShotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoDetectShotTaskResponse self = new SubmitVideoDetectShotTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoDetectShotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoDetectShotTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoDetectShotTaskResponse setBody(SubmitVideoDetectShotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoDetectShotTaskResponseBody getBody() {
        return this.body;
    }

}
