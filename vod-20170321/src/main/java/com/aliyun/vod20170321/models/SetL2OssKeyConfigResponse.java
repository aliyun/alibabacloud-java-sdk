// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetL2OssKeyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetL2OssKeyConfigResponseBody body;

    public static SetL2OssKeyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetL2OssKeyConfigResponse self = new SetL2OssKeyConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetL2OssKeyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetL2OssKeyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetL2OssKeyConfigResponse setBody(SetL2OssKeyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetL2OssKeyConfigResponseBody getBody() {
        return this.body;
    }

}
