// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoDetectShotConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVideoDetectShotConfigResponseBody body;

    public static UpdateVideoDetectShotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoDetectShotConfigResponse self = new UpdateVideoDetectShotConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoDetectShotConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoDetectShotConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVideoDetectShotConfigResponse setBody(UpdateVideoDetectShotConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoDetectShotConfigResponseBody getBody() {
        return this.body;
    }

}
