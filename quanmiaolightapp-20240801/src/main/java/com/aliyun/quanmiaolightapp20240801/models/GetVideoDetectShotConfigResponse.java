// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetVideoDetectShotConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoDetectShotConfigResponseBody body;

    public static GetVideoDetectShotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDetectShotConfigResponse self = new GetVideoDetectShotConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoDetectShotConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoDetectShotConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoDetectShotConfigResponse setBody(GetVideoDetectShotConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoDetectShotConfigResponseBody getBody() {
        return this.body;
    }

}
