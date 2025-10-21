// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoDetectShotTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVideoDetectShotTaskResponseBody body;

    public static UpdateVideoDetectShotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoDetectShotTaskResponse self = new UpdateVideoDetectShotTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoDetectShotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoDetectShotTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVideoDetectShotTaskResponse setBody(UpdateVideoDetectShotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoDetectShotTaskResponseBody getBody() {
        return this.body;
    }

}
