// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetVideoDetectShotTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoDetectShotTaskResponseBody body;

    public static GetVideoDetectShotTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDetectShotTaskResponse self = new GetVideoDetectShotTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoDetectShotTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoDetectShotTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoDetectShotTaskResponse setBody(GetVideoDetectShotTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoDetectShotTaskResponseBody getBody() {
        return this.body;
    }

}
