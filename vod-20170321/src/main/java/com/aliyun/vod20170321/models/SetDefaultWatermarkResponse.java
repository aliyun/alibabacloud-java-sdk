// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultWatermarkResponseBody body;

    public static SetDefaultWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultWatermarkResponse self = new SetDefaultWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultWatermarkResponse setBody(SetDefaultWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultWatermarkResponseBody getBody() {
        return this.body;
    }

}
